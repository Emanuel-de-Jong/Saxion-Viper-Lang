package nl.saxion.cos;

import nl.saxion.cos.enums.DataType;
import nl.saxion.cos.enums.ScopeType;
import nl.saxion.cos.exceptions.CompilerException;
import nl.saxion.cos.symbols.*;
import nl.saxion.cos.enums.Access;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

public class CodeChecker extends ViperBaseVisitor<DataType> {

    private final ParseTreeProperty<SymbolTable> scopes;
    private final ParseTreeProperty<DataType> types;
    private final ParseTreeProperty<Symbol> symbols;

    private SymbolTable currentScope = new SymbolTable(ScopeType.CLASS);
    private ScopeType childScopeType = ScopeType.NONE;


    public CodeChecker(ParseTreeProperty<SymbolTable> scopes, ParseTreeProperty<DataType> types,
                       ParseTreeProperty<Symbol> symbols) {
        this.scopes = scopes;
        this.types = types;
        this.symbols = symbols;
    }


    @Override
    public DataType visitProgram(ViperParser.ProgramContext ctx) {
        scopes.put(ctx, currentScope);
        visitChildren(ctx);
        return addType(ctx, DataType.NONE);
    }

    @Override
    public DataType visitVStatement(ViperParser.VStatementContext ctx) {
        scopes.put(ctx, currentScope);
        visitChildren(ctx);
        return addType(ctx, DataType.NONE);
    }

    @Override
    public DataType visitVMethodCall(ViperParser.VMethodCallContext ctx) {
        scopes.put(ctx, currentScope);

        String methodName = ctx.V_IDENTIFIER(ctx.V_IDENTIFIER().size() - 1).getText();
        MethodSymbol methodSymbol = currentScope.lookup(methodName);
        if (methodSymbol == null)
            throw new CompilerException("Method '" + methodName + "' is undefined!");
        symbols.put(ctx, methodSymbol);

        return addType(ctx, methodSymbol.getReturnType());
    }

    @Override
    public DataType visitVClass(ViperParser.VClassContext ctx) {
        scopes.put(ctx, currentScope);

        Access classAccess = Access.NONE;
        if (ctx.vAccess() != null)
            classAccess = Access.from(ctx.vAccess().getText());

        ClassSymbol classSymbol = new ClassSymbol(
                ctx.V_IDENTIFIER().getText(),
                classAccess);
        currentScope.add(classSymbol);
        symbols.put(ctx, classSymbol);

        visitChildren(ctx);

//        for (ViperParser.VDeclarationContext declarationCtx : ctx.vDeclaration()) {
//            visit(declarationCtx);
//        }
//
//        for (ViperParser.VMethodContext methodCtx : ctx.vMethod()) {
//            visit(methodCtx);
//        }

        return addType(ctx, DataType.NONE);
    }

    @Override
    public DataType visitVSwitch(ViperParser.VSwitchContext ctx) {
        scopes.put(ctx, currentScope);

        DataType type = visit(ctx.vExpression());
        if (type != DataType.INT && type != DataType.FLOAT)
            throw new CompilerException("Can't use '" + ctx.V_SWITCH_KW() + "' on types other than '" + DataType.INT +
                    "' and '" + DataType.FLOAT + "'!");

        for (var caseCtx : ctx.vCase()) {
            childScopeType = ScopeType.SWITCH;
            DataType caseType = visit(caseCtx);
            if (type != caseType)
                throw new CompilerException("'" + caseCtx.V_CASE_KW() + "' is of type '" + caseType +
                        "' instead of type '" + type + "'!");
        }

        return addType(ctx, type);
    }

    @Override
    public DataType visitVCase(ViperParser.VCaseContext ctx) {
        scopes.put(ctx, currentScope);

        visitChildren(ctx);

        return addType(ctx, visit(ctx.vExpression()));
    }

    @Override
    public DataType visitVIf(ViperParser.VIfContext ctx) {
        scopes.put(ctx, currentScope);

        List<ViperParser.VExpressionContext> expressions = ctx.vExpression();
        List<ViperParser.VBlockContext> codeBlocks = ctx.vBlock();
        for (int i = 0; i < expressions.size(); i++) {
            visit(expressions.get(i));

            childScopeType = ScopeType.IF;
            visit(codeBlocks.get(i));
        }

        if (expressions.size() < codeBlocks.size()) {
            childScopeType = ScopeType.IF;
            visit(codeBlocks.get(codeBlocks.size() - 1));
        }

        return addType(ctx, DataType.NONE);
    }

    @Override
    public DataType visitVWhile(ViperParser.VWhileContext ctx) {
        scopes.put(ctx, currentScope);

        visit(ctx.vExpression());

        childScopeType = ScopeType.WHILE;
        visit(ctx.vBlock());

        return addType(ctx, DataType.NONE);
    }

    @Override
    public DataType visitVBreak(ViperParser.VBreakContext ctx) {
        scopes.put(ctx, currentScope);

        if (currentScope.getScopeType() != ScopeType.IF &&
                currentScope.getScopeType() != ScopeType.SWITCH &&
                currentScope.getScopeType() != ScopeType.WHILE)
            throw new CompilerException("Can't use '" + ctx.V_BREAK_KW().getText() +
                    "' outside of an if, switch and while!");

        return addType(ctx, DataType.NONE);
    }

    @Override
    public DataType visitVContinue(ViperParser.VContinueContext ctx) {
        scopes.put(ctx, currentScope);

        if (currentScope.getScopeType() != ScopeType.WHILE)
            throw new CompilerException("Can't use '" + ctx.V_CONTINUE_KW().getText() + "' outside of a while loop!");

        return addType(ctx, DataType.NONE);
    }

    @Override
    public DataType visitVReturn(ViperParser.VReturnContext ctx) {
        scopes.put(ctx, currentScope);

        DataType type = visit(ctx.vExpression());
        ViperParser.VMethodContext methodContext = (ViperParser.VMethodContext) ctx.parent.parent.parent;
        DataType methodType = visit(methodContext.vType(0));
        if (type != methodType)
            throw new CompilerException("The value of '" + ctx.V_RETURN_KW() + "' is of type '" + type +
                    "' instead of the method type '" + methodType + "'!");

        return addType(ctx, type);
    }

    @Override
    public DataType visitVBlock(ViperParser.VBlockContext ctx) {
        scopes.put(ctx, currentScope);

        currentScope = currentScope.createChild(childScopeType == ScopeType.NONE ? ScopeType.BLOCK : childScopeType);
        childScopeType = ScopeType.NONE;

        visitChildren(ctx);
        currentScope = currentScope.getParent();


        return addType(ctx, DataType.NONE);
    }

    @Override
    public DataType visitVAssignment(ViperParser.VAssignmentContext ctx) {
        scopes.put(ctx, currentScope);

        String varName = ctx.vName.getText();
        VarSymbol varSymbol = currentScope.lookup(varName);
        if (varSymbol == null)
            throw new CompilerException("Variable '" + varName + "' is undefined!");
        symbols.put(ctx, varSymbol);

        DataType expressionType = visit(ctx.vValue);
        if (varSymbol.getType() != expressionType)
            throw new CompilerException("Assignment value for variable '" + varName + "' is of type '"
                    + expressionType + "' instead of type '" + varSymbol.getType() + "'!");

        return addType(ctx, varSymbol);
    }

    @Override
    public DataType visitDecNull(ViperParser.DecNullContext ctx) {
        scopes.put(ctx, currentScope);

        String varName = ctx.vName.getText();
        DataType varType = visit(ctx.vType());
        Access varAccess = Access.NONE;
        if (ctx.vAccess() != null)
            varAccess = Access.from(ctx.vAccess().getText());

        if (currentScope.lookup(varName) != null)
            throw new CompilerException("Variable '" + varName + "' already declared!");

        VarSymbol varSymbol = new VarSymbol(varName, varAccess, varType);
        currentScope.add(varSymbol);
        symbols.put(ctx, varSymbol);

        return addType(ctx, varSymbol);
    }

    @Override
    public DataType visitDecAssign(ViperParser.DecAssignContext ctx) {
        scopes.put(ctx, currentScope);

        String varName = ctx.vName.getText();
        DataType varType = visit(ctx.vType());
        Access varAccess = Access.NONE;
        if (ctx.vAccess() != null)
            varAccess = Access.from(ctx.vAccess().getText());

        if (currentScope.lookup(varName) != null)
            throw new CompilerException("Variable '" + varName + "' already declared!");

        VarSymbol varSymbol = new VarSymbol(varName, varAccess, varType);
        currentScope.add(varSymbol);
        symbols.put(ctx, varSymbol);

        return addType(ctx, varSymbol);
    }

    @Override
    public DataType visitVMethod(ViperParser.VMethodContext ctx) {
        scopes.put(ctx, currentScope);

        if (currentScope.getScopeType() != ScopeType.CLASS)
            throw new CompilerException("Methods can only be defined inside a class!");

        currentScope = currentScope.createChild(ScopeType.METHOD);

        List<DataType> paramTypes = new ArrayList<>();
        // 0 is skipped because the first vType is the vReturnType
        // and the first V_IDENTIFIER is the vName.
        for (int i = 1; i < ctx.vType().size(); i++) {
            String paramName = ctx.V_IDENTIFIER(i).getText();
            DataType paramType = visit(ctx.vType(i));
            VarSymbol varSymbol = new VarSymbol(paramName, paramType);
            currentScope.add(varSymbol);

            paramTypes.add(paramType);
        }

        Access funcAccess = Access.NONE;
        if (ctx.vAccess() != null)
            funcAccess = Access.from(ctx.vAccess().getText());

        DataType returnType = visit(ctx.vReturnType);
        MethodSymbol funcSymbol = new MethodSymbol(ctx.vName.getText(),
                funcAccess,
                returnType,
                paramTypes);
        symbols.put(ctx, funcSymbol);

        visitChildren(ctx.vBlock());

        currentScope = currentScope.getParent();

        return addType(ctx, returnType);
    }

    @Override
    public DataType visitVNewObject(ViperParser.VNewObjectContext ctx) {
        scopes.put(ctx, currentScope);

        visitChildren(ctx);

        return addType(ctx, DataType.ADDRESS);
    }

    @Override
    public DataType visitExParentheses(ViperParser.ExParenthesesContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, visit(ctx.vExpression()));
    }

    @Override
    public DataType visitExNewObject(ViperParser.ExNewObjectContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, visit(ctx.vNewObject()));
    }

    @Override
    public DataType visitExMethodCall(ViperParser.ExMethodCallContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, visit(ctx.vMethodCall()));
    }

    @Override
    public DataType visitExUnaryOp(ViperParser.ExUnaryOpContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, visit(ctx.vUnaryOperation()));
    }

    @Override
    public DataType visitExMulOp(ViperParser.ExMulOpContext ctx) {
        scopes.put(ctx, currentScope);

        DataType lType = visit(ctx.vLeft);
        DataType rType = visit(ctx.vRight);

        if ((lType != DataType.FLOAT && lType != DataType.INT) ||
                (rType != DataType.FLOAT && rType != DataType.INT))
            throw new CompilerException("Can't use operator '" + ctx.vOp.getText() + "' on types other than '" +
                    DataType.INT + "' and '" + DataType.FLOAT + "'!");

        DataType type = lType != rType ? DataType.FLOAT : lType;
        return addType(ctx, type);
    }

    @Override
    public DataType visitExNegOp(ViperParser.ExNegOpContext ctx) {
        scopes.put(ctx, currentScope);

        DataType type = visit(ctx.vExpression());
        if (type != DataType.INT && type != DataType.FLOAT)
            throw new CompilerException("Can't make types other than '" + DataType.INT + "' and '" + DataType.FLOAT +
                    "' negative!");

        return addType(ctx, type);
    }

    @Override
    public DataType visitExNegBoolOp(ViperParser.ExNegBoolOpContext ctx) {
        scopes.put(ctx, currentScope);

        DataType type = visit(ctx.vExpression());
        if (type != DataType.BOOL)
            throw new CompilerException("Can't flip types other than '" + DataType.BOOL + "'!");

        return addType(ctx, DataType.BOOL);
    }

    @Override
    public DataType visitExAddOp(ViperParser.ExAddOpContext ctx) {
        scopes.put(ctx, currentScope);

        DataType lType = visit(ctx.vLeft);
        DataType rType = visit(ctx.vRight);

        if ((lType != DataType.FLOAT && lType != DataType.INT) ||
                (rType != DataType.FLOAT && rType != DataType.INT))
            throw new CompilerException("Can't use operator '" + ctx.vOp.getText() + "' on types other than '" +
                    DataType.INT + "' and '" + DataType.FLOAT + "'!");

        DataType type = lType != rType ? DataType.FLOAT : lType;
        return addType(ctx, type);
    }

    @Override
    public DataType visitExBitShiftOp(ViperParser.ExBitShiftOpContext ctx) {
        scopes.put(ctx, currentScope);

        DataType lType = visit(ctx.vLeft);
        DataType rType = visit(ctx.vRight);

        if (lType != DataType.INT || rType != DataType.INT)
            throw new CompilerException("Can't use operator '" + ctx.vOp.getText() + "' on types other than '" +
                    DataType.INT + "'!");

        return addType(ctx, DataType.INT);
    }

    @Override
    public DataType visitExCmprLe(ViperParser.ExCmprLeContext ctx) {
        scopes.put(ctx, currentScope);

        DataType lType = visit(ctx.vLeft);
        DataType rType = visit(ctx.vRight);

        if (!DataType.PRIMITIVES.contains(lType) || !DataType.PRIMITIVES.contains(rType))
            throw new CompilerException("Can't use operator '" + ctx.vOp.getText() + "' on non primitive types!");

        if ((lType == DataType.BOOL || rType == DataType.BOOL) && lType != rType)
            throw new CompilerException("Can't use operator '" + ctx.vOp.getText() + "' with a '" + DataType.BOOL +
                    "' and non '" + DataType.BOOL + "'!");

        return addType(ctx, DataType.BOOL);
    }

    @Override
    public DataType visitExCmprEq(ViperParser.ExCmprEqContext ctx) {
        scopes.put(ctx, currentScope);

        DataType lType = visit(ctx.vLeft);
        DataType rType = visit(ctx.vRight);

        if (!DataType.PRIMITIVES.contains(lType) || !DataType.PRIMITIVES.contains(rType))
            throw new CompilerException("Can't use operator '" + ctx.vOp.getText() + "' on non primitive types!");

        if ((lType == DataType.BOOL || rType == DataType.BOOL) && lType != rType)
            throw new CompilerException("Can't use operator '" + ctx.vOp.getText() + "' with a '" + DataType.BOOL +
                    "' and non '" + DataType.BOOL + "'!");

        return addType(ctx, DataType.BOOL);
    }

    @Override
    public DataType visitExBitOp(ViperParser.ExBitOpContext ctx) {
        scopes.put(ctx, currentScope);

        DataType lType = visit(ctx.vLeft);
        DataType rType = visit(ctx.vRight);

        if (lType != DataType.INT || rType != DataType.INT)
            throw new CompilerException("Can't use operator '" + ctx.vOp.getText() + "' on types other than '" +
                    DataType.INT + "'!");

        return addType(ctx, DataType.INT);
    }

    @Override
    public DataType visitExLogAndOp(ViperParser.ExLogAndOpContext ctx) {
        scopes.put(ctx, currentScope);

        DataType lType = visit(ctx.vLeft);
        DataType rType = visit(ctx.vRight);

        if (lType != DataType.BOOL || rType != DataType.BOOL)
            throw new CompilerException("Can't use operator '" + ctx.vOp.getText() + "' on types other than '" +
                    DataType.BOOL + "'!");

        return addType(ctx, DataType.BOOL);
    }

    @Override
    public DataType visitExLogOrOp(ViperParser.ExLogOrOpContext ctx) {
        scopes.put(ctx, currentScope);

        DataType lType = visit(ctx.vLeft);
        DataType rType = visit(ctx.vRight);

        if (lType != DataType.BOOL || rType != DataType.BOOL)
            throw new CompilerException("Can't use operator '" + ctx.vOp.getText() + "' on types other than '" +
                    DataType.BOOL + "'!");

        return addType(ctx, DataType.BOOL);
    }

    @Override
    public DataType visitExTernary(ViperParser.ExTernaryContext ctx) {
        scopes.put(ctx, currentScope);

        visit(ctx.condition);
        visit(ctx.vThen);
        visit(ctx.vElse);

        return addType(ctx, DataType.NONE);
    }

    @Override
    public DataType visitExThisLiteral(ViperParser.ExThisLiteralContext ctx) {
        scopes.put(ctx, currentScope);

        if (currentScope.getScopeType() == ScopeType.NONE || currentScope.getScopeType() == ScopeType.CLASS)
            throw new CompilerException("Can't use '" + ctx.V_THIS_KW() + "' outside of a method!");

        ClassSymbol classSymbol = currentScope.getClassSymbol();
        if (classSymbol == null)
            throw new CompilerException("Class of '" + ctx.V_THIS_KW() + "' is undefined!");
        symbols.put(ctx, classSymbol);

        return addType(ctx, DataType.ADDRESS);
    }

    @Override
    public DataType visitExFloatLiteral(ViperParser.ExFloatLiteralContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, DataType.FLOAT);
    }

    @Override
    public DataType visitExIntLiteral(ViperParser.ExIntLiteralContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, DataType.INT);
    }

    @Override
    public DataType visitExBoolLiteral(ViperParser.ExBoolLiteralContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, DataType.BOOL);
    }

    @Override
    public DataType visitExStringLiteral(ViperParser.ExStringLiteralContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, DataType.STRING);
    }

    @Override
    public DataType visitExIdentifier(ViperParser.ExIdentifierContext ctx) {
        scopes.put(ctx, currentScope);

        String varName = ctx.V_IDENTIFIER().get(ctx.V_IDENTIFIER().size()-1).getText();
        VarSymbol varSymbol = currentScope.lookup(varName);
        if (varSymbol == null)
            throw new CompilerException("Variable '" + varName + "' is undefined!");
        symbols.put(ctx, varSymbol);

        return addType(ctx, varSymbol);
    }

    @Override
    public DataType visitVUnaryOperation(ViperParser.VUnaryOperationContext ctx) {
        scopes.put(ctx, currentScope);

        String varName = ctx.V_IDENTIFIER().getText();
        VarSymbol varSymbol = currentScope.lookup(varName);
        if (varSymbol == null)
            throw new CompilerException("Variable '" + varName + "' is undefined!");
        symbols.put(ctx, varSymbol);

        if (varSymbol.getType() != DataType.INT)
            throw new CompilerException("Can't use operator '" + ctx.vOp.getText() + "' on types other than '" +
                    DataType.INT + "'!");


        return addType(ctx, varSymbol.getType());
    }

    @Override
    public DataType visitTypeString(ViperParser.TypeStringContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, DataType.STRING);
    }

    @Override
    public DataType visitTypeBool(ViperParser.TypeBoolContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, DataType.BOOL);
    }

    @Override
    public DataType visitTypeFloat(ViperParser.TypeFloatContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, DataType.FLOAT);
    }

    @Override
    public DataType visitTypeInt(ViperParser.TypeIntContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, DataType.INT);
    }

    @Override
    public DataType visitTypeObject(ViperParser.TypeObjectContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, DataType.ADDRESS);
    }

    @Override
    public DataType visitAccessPublic(ViperParser.AccessPublicContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, DataType.NONE);
    }

    @Override
    public DataType visitAccessPrivate(ViperParser.AccessPrivateContext ctx) {
        scopes.put(ctx, currentScope);
        return addType(ctx, DataType.NONE);
    }


    private DataType addType(ParseTree ctx, DataType type) {
        types.put(ctx, type);
        return type;
    }

    private DataType addType(ParseTree ctx, VarSymbol varSymbol) {
        types.put(ctx, varSymbol.getType());
        return varSymbol.getType();
    }

}
