package nl.saxion.cos;

import nl.saxion.cos.enums.DataType;
import nl.saxion.cos.symbols.Symbol;
import nl.saxion.cos.symbols.SymbolTable;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.List;

public class CodeGeneratorOld extends ViperBaseVisitor<DataType> {

    private final ViperClass code;
    private final ParseTreeProperty<SymbolTable> scopes;
    private final ParseTreeProperty<DataType> types;
    private final ParseTreeProperty<Symbol> symbols;
    private final String baseClassName;

    public CodeGeneratorOld(ViperClass code, ParseTreeProperty<SymbolTable> scopes, ParseTreeProperty<DataType> types,
                            ParseTreeProperty<Symbol> symbols, String baseClassName) {
        this.code = code;
        this.scopes = scopes;
        this.types = types;
        this.symbols = symbols;
        this.baseClassName = baseClassName;
    }

    @Override
    public DataType visitProgram(ViperParser.ProgramContext ctx) {
        code.add(".bytecode 49.0")
                .add(".class public " + baseClassName)
                .add(".super java/lang/Object")
                .add()
                .add(".method public static main([Ljava/lang/String;)V")
                .add(".limit stack 99")
                .add(".limit locals 99")
                .add();
        visitChildren(ctx);
        code.add()
                .add("return")
                .add(".end method");
        return DataType.NONE;

    }

    @Override
    public DataType visitVMethod(ViperParser.VMethodContext ctx) {
        code.add(".method " +
                ctx.vAccess().getText() + " " +
                (ctx.vStatic != null ? ctx.vStatic.getText() + " " : "") +
                ctx.vReturnType.getText() + " " +
                ctx.vName.getText() +
                "(");
        List<ViperParser.VTypeContext> parameters = ctx.vType();
        parameters.remove(0); // Remove return type
        for (ViperParser.VTypeContext parameter : parameters) {
            DataType type = visit(parameter);
            switch (type) {
                case INT:
                case BOOL:
                    code.append("I");
                    break;
                case FLOAT:
                    code.append("F");
                    break;
                case STRING:
                    code.append("A");
                    break;
            }
        }
        code.append(")V");

        visit(ctx.vBlock());

        code.add(".end method");
        return DataType.NONE;
    }

    @Override
    public DataType visitExMulOp(ViperParser.ExMulOpContext ctx) {
        DataType lType = visit(ctx.vLeft);
        DataType rType = visit(ctx.vRight);

        DataType mulType = null;
        if (lType == DataType.FLOAT && rType == DataType.FLOAT) {
            mulType = DataType.FLOAT;
        } else if (lType == DataType.INT && rType == DataType.INT) {
            mulType = DataType.INT;
        } else if (lType == DataType.FLOAT && rType == DataType.INT) {
            code.add("i2f");
            mulType = DataType.FLOAT;
        } else if (lType == DataType.INT && rType == DataType.FLOAT) {
            code.addPrev("i2f");
            mulType = DataType.FLOAT;
        }

        char typeChar = mulType == DataType.INT ? 'i' : 'f';
        switch (ctx.vOp.getText()) {
            case "*": {
                code.add(typeChar + "mul");
                break;
            }
            case "/": {
                code.add(typeChar + "div");
                break;
            }
            case "%": {
                code.add(typeChar + "rem");
                break;
            }
        }

        return mulType;
    }

    @Override
    public DataType visitExNegOp(ViperParser.ExNegOpContext ctx) {
        visit(ctx.vExpression());
        code.add("ineg");
        return DataType.INT;
    }

    @Override
    public DataType visitExNegBoolOp(ViperParser.ExNegBoolOpContext ctx) {
        visit(ctx.vExpression());
        code.add("iconst_1");
        code.add("ixor");
        return DataType.INT;
    }

    @Override
    public DataType visitExAddOp(ViperParser.ExAddOpContext ctx) {
        DataType lType = visit(ctx.vLeft);
        DataType rType = visit(ctx.vRight);

        DataType addType = null;
        if (lType == DataType.FLOAT && rType == DataType.FLOAT) {
            addType = DataType.FLOAT;
        } else if (lType == DataType.INT && rType == DataType.INT) {
            addType = DataType.INT;
        } else if (lType == DataType.FLOAT && rType == DataType.INT) {
            code.add("i2f");
            addType = DataType.FLOAT;
        } else if (lType == DataType.INT && rType == DataType.FLOAT) {
            code.addPrev("i2f");
            addType = DataType.FLOAT;
        }

        boolean isAddition = ctx.vOp.getText().equals("+");
        if (addType == DataType.FLOAT) {
            if (isAddition) code.add("fadd");
            else code.add("fsub");
        } else if (addType == DataType.INT) {
            if (isAddition) code.add("iadd");
            else code.add("isub");
        }

        return addType;
    }

    @Override
    public DataType visitExBitShiftOp(ViperParser.ExBitShiftOpContext ctx) {
        visit(ctx.vLeft);
        visit(ctx.vRight);

        switch (ctx.vOp.getText()) {
            case ">>": {
                code.add("ishr");
                break;
            }
            case "<<": {
                code.add("ishl");
                break;
            }
        }

        return DataType.INT;
    }

    @Override
    public DataType visitExCmprLe(ViperParser.ExCmprLeContext ctx) {
        DataType lType = visit(ctx.vLeft);
        DataType rType = visit(ctx.vRight);

        DataType cmpType = null;
        if (lType == DataType.FLOAT && rType == DataType.FLOAT) {
            cmpType = DataType.FLOAT;
        } else if (lType == DataType.INT && rType == DataType.INT) {
            cmpType = DataType.INT;
        }

        String op = ctx.vOp.getText();
        if (cmpType == DataType.FLOAT) {
            code.add("fcmpg");

            switch (op) {
                case "<":
                    code.add("ldc -1");
                    code.add("if_icmpeq");
                    break;
                case "<=":
                    code.add("ldc 0");
                    code.add("if_icmple");
                    break;
                case ">":
                    code.add("ldc 1");
                    code.add("if_icmpeq");
                    break;
                case ">=":
                    code.add("ldc 0");
                    code.add("if_icmpge");
                    break;
            }
        } else if (cmpType == DataType.INT) {
            switch (op) {
                case "<":
                    code.add("if_icmplt");
                    break;
                case "<=":
                    code.add("if_icmple");
                    break;
                case ">":
                    code.add("if_icmpgt");
                    break;
                case ">=":
                    code.add("if_icmpge");
                    break;
            }
        }

        String thenLabel = code.createLabel("then");
        code.append(" " + thenLabel);
        code.add("ldc 0");
        String endLabel = code.createLabel("then");
        code.add("goto " + endLabel);
        code.addLabel(thenLabel);
        code.add("ldc 1");
        code.addLabel(endLabel);

        return DataType.BOOL;
    }

    @Override
    public DataType visitExCmprEq(ViperParser.ExCmprEqContext ctx) {
        DataType lType = visit(ctx.vLeft);
        DataType rType = visit(ctx.vRight);

        DataType cmpType = null;
        if (lType == DataType.FLOAT && rType == DataType.FLOAT) {
            cmpType = DataType.FLOAT;
        } else if (lType == DataType.INT && rType == DataType.INT) {
            cmpType = DataType.INT;
        }

        if (cmpType == DataType.FLOAT) {
            code.add("fcmpg");
            code.add("ldc 0");

        }

        String op = ctx.vOp.getText();
        switch (op) {
            case "==":
                code.add("if_icmpeq");
                break;
            case "!=":
                code.add("if_icmpne");
                break;
        }

        String thenLabel = code.createLabel("then");
        code.append(" " + thenLabel);
        code.add("ldc 0");
        String endLabel = code.createLabel("then");
        code.add("goto " + endLabel);
        code.addLabel(thenLabel);
        code.add("ldc 1");
        code.addLabel(endLabel);

        return DataType.BOOL;
    }

    @Override
    public DataType visitExBitOp(ViperParser.ExBitOpContext ctx) {
        visit(ctx.vLeft);
        visit(ctx.vRight);
        System.out.println(ctx.vOp.getText());
        switch (ctx.vOp.getText()) {
            case "&": {
                code.add("iadd");
                break;
            }
            case "^": {
                code.add("ixor");
                break;
            }
            case "|": {
                code.add("ior");
                break;
            }
        }

        return DataType.INT;
    }

    @Override
    public DataType visitVReturn(ViperParser.VReturnContext ctx) {
        DataType dataType = DataType.NONE;
        if (ctx.vExpression() == null) {
            code.add("return");
        } else {
            dataType = visit(ctx.vExpression());

            switch (dataType) {
                case INT:
                case BOOL:
                    code.add("ireturn");
                    break;
                case FLOAT:
                    code.add("freturn");
                    break;
                case STRING:
                    code.add("areturn");
                    break;
            }
        }

        return dataType;
    }

    @Override
    public DataType visitVWhile(ViperParser.VWhileContext ctx) {
        String whileLabel = code.createLabel("while");
        String endLabel = code.createLabel("end");
        code.addLabel(whileLabel);
        visit(ctx.vExpression());
        code.add("ifeq " + endLabel);
        visit(ctx.vBlock());
        code.add("goto " + whileLabel);
        code.addLabel(endLabel);
        return DataType.NONE;
    }

    @Override
    public DataType visitVIf(ViperParser.VIfContext ctx) {

        List<ViperParser.VExpressionContext> expressions = ctx.vExpression();
        List<ViperParser.VBlockContext> codeBlocks = ctx.vBlock();
        String endLabel = code.createLabel("end");

        for (int i = 0; i < expressions.size(); i++) {
            visit(expressions.get(i));
            String thenLabel = code.createLabel("then");
            code.add("ifeq " + thenLabel);
            visit(codeBlocks.get(i));
            code.add("goto " + endLabel);
            code.addLabel(thenLabel);
        }
        if (expressions.size() < codeBlocks.size()) {
            visit(codeBlocks.get(codeBlocks.size() - 1));
        }
        code.addLabel(endLabel);


        return DataType.NONE;
    }

    @Override
    public DataType visitExTernary(ViperParser.ExTernaryContext ctx) {
        //else and then are the other way arround bc ifeq compares to 0
        String elseLabel = code.createLabel("else");
        String endLabel = code.createLabel("end");
        visit(ctx.condition);
        code.add("ifeq " + elseLabel);
        visit(ctx.vThen);
        code.add("goto " + endLabel);
        code.addLabel(elseLabel);
        visit(ctx.vElse);
        code.addLabel(endLabel);

        return DataType.BOOL;
    }

    @Override
    public DataType visitExFloatLiteral(ViperParser.ExFloatLiteralContext ctx) {
        code.add("ldc " + ctx.getText());
        return DataType.FLOAT;
    }

    @Override
    public DataType visitExIntLiteral(ViperParser.ExIntLiteralContext ctx) {
        code.add("ldc " + ctx.getText());
        return DataType.INT;
    }

    @Override
    public DataType visitExStringLiteral(ViperParser.ExStringLiteralContext ctx) {
        code.add("ldc " + ctx.getText());
        return DataType.STRING;
    }

    @Override
    public DataType visitExBoolLiteral(ViperParser.ExBoolLiteralContext ctx) {
        code.add("ldc " + (ctx.getText().equalsIgnoreCase("true") ? 1 : 0));
        return DataType.BOOL;
    }

    @Override
    public DataType visitTypeString(ViperParser.TypeStringContext ctx) {
        return DataType.STRING;
    }

    @Override
    public DataType visitTypeBool(ViperParser.TypeBoolContext ctx) {
        return DataType.BOOL;
    }

    @Override
    public DataType visitTypeFloat(ViperParser.TypeFloatContext ctx) {
        return DataType.FLOAT;
    }

    @Override
    public DataType visitTypeInt(ViperParser.TypeIntContext ctx) {
        return DataType.INT;
    }

}
