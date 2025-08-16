package nl.saxion.cos;

import nl.saxion.cos.enums.Access;
import nl.saxion.cos.enums.DataType;
import nl.saxion.cos.symbols.Symbol;
import nl.saxion.cos.symbols.SymbolTable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

public class CodeGenerator extends ViperBaseVisitor<List<String>> {

    private final ViperClass currentClass;
    private final ViperClass mainClass;
    private final ParseTreeProperty<SymbolTable> scopes;
    private final ParseTreeProperty<DataType> types;
    private final ParseTreeProperty<Symbol> symbols;
    private final String baseClassName;

    public CodeGenerator(ViperClass code, ParseTreeProperty<SymbolTable> scopes, ParseTreeProperty<DataType> types,
                         ParseTreeProperty<Symbol> symbols, String baseClassName) {
        this.currentClass = code;
        this.mainClass = code;
        this.scopes = scopes;
        this.types = types;
        this.symbols = symbols;
        this.baseClassName = baseClassName;
    }

    @Override
    public List<String> visitProgram(ViperParser.ProgramContext ctx) {
        ArrayList<DataType> params = new ArrayList<>();
        DataType param = DataType.ADDRESS;
        param.setDescriptor("[Ljava/lang/String;");
        params.add(param);
        List<String> mainCode = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            mainCode.addAll(visit(child));
        }
        DataType returnType = DataType.NONE;
        returnType.setDescriptor("V");
        currentClass.addMethod(Access.PUBLIC, "main", params, returnType, mainCode, true);
        return null;
    }

    @Override
    public List<String> visitVMethod(ViperParser.VMethodContext ctx) {
        List<DataType> parameters = new ArrayList<>();
        for (int i = 1; i < ctx.vType().size(); i++) {
            parameters.add(types.get(ctx.vType(i)));
        }
        List<String> methodCode = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            methodCode.addAll(visit(child));
        }
        currentClass.addMethod(Access.from(ctx.vAccess().getText()), ctx.vName.getText(), parameters,
                types.get(ctx.vReturnType), methodCode);
        return null;
    }

    @Override
    public List<String> visitExMulOp(ViperParser.ExMulOpContext ctx) {
        List<String> outCode = new ArrayList<>();

        DataType lType = types.get(ctx.vLeft);
        DataType rType = types.get(ctx.vRight);

        List<String> leftCode = visit(ctx.vLeft);
        List<String> rightCode = visit(ctx.vRight);

        DataType mulType = null;
        if (lType == DataType.FLOAT && rType == DataType.FLOAT) {
            outCode.addAll(leftCode);
            outCode.addAll(rightCode);
            mulType = DataType.FLOAT;
        } else if (lType == DataType.INT && rType == DataType.INT) {
            outCode.addAll(leftCode);
            outCode.addAll(rightCode);
            mulType = DataType.INT;
        } else if (lType == DataType.FLOAT && rType == DataType.INT) {
            outCode.addAll(leftCode);
            outCode.addAll(rightCode);
            outCode.add("i2f");
            mulType = DataType.FLOAT;
        } else if (lType == DataType.INT && rType == DataType.FLOAT) {
            outCode.addAll(leftCode);
            outCode.add("i2f");
            outCode.addAll(rightCode);
            mulType = DataType.FLOAT;
        }

        char typeChar = mulType == DataType.INT ? 'i' : 'f';
        switch (ctx.vOp.getText()) {
            case "*": {
                outCode.add(typeChar + "mul");
                break;
            }
            case "/": {
                outCode.add(typeChar + "div");
                break;
            }
            case "%": {
                outCode.add(typeChar + "rem");
                break;
            }
        }

        return outCode;
    }

    @Override
    public List<String> visitExNegOp(ViperParser.ExNegOpContext ctx) {
        List<String> outCode = new ArrayList<>();
        outCode.addAll(visit(ctx.vExpression()));
        if (types.get(ctx.vExpression()) == DataType.INT) {
            outCode.add("ineg");
        } else if (types.get(ctx.vExpression()) == DataType.FLOAT) {
            outCode.add("fneg");
        }
        visit(ctx.vExpression());
        return outCode;
    }

    @Override
    public List<String> visitExNegBoolOp(ViperParser.ExNegBoolOpContext ctx) {
        List<String> outCode = new ArrayList<>();
        outCode.addAll(visit(ctx.vExpression()));

        currentClass.add("iconst_1");
        currentClass.add("ixor");
        return outCode;
    }

    @Override
    public List<String> visitExAddOp(ViperParser.ExAddOpContext ctx) {

        List<String> outCode = new ArrayList<>();

        DataType lType = types.get(ctx.vLeft);
        DataType rType = types.get(ctx.vRight);

        List<String> leftCode = visit(ctx.vLeft);
        List<String> rightCode = visit(ctx.vRight);

        DataType addType = null;
        if (lType == DataType.FLOAT && rType == DataType.FLOAT) {
            outCode.addAll(leftCode);
            outCode.addAll(rightCode);
            addType = DataType.FLOAT;
        } else if (lType == DataType.INT && rType == DataType.INT) {
            outCode.addAll(leftCode);
            outCode.addAll(rightCode);
            addType = DataType.INT;
        } else if (lType == DataType.FLOAT && rType == DataType.INT) {
            outCode.addAll(leftCode);
            outCode.addAll(rightCode);
            outCode.add("i2f");
            addType = DataType.FLOAT;
        } else if (lType == DataType.INT && rType == DataType.FLOAT) {
            outCode.addAll(leftCode);
            outCode.add("i2f");
            outCode.addAll(rightCode);
            addType = DataType.FLOAT;
        }

        boolean isAddition = ctx.vOp.getText().equals("+");
        if (addType == DataType.FLOAT) {
            if (isAddition) outCode.add("fadd");
            else outCode.add("fsub");
        } else if (addType == DataType.INT) {
            if (isAddition) outCode.add("iadd");
            else outCode.add("isub");
        }

        return outCode;
    }

    @Override
    public List<String> visitExBitShiftOp(ViperParser.ExBitShiftOpContext ctx) {
        List<String> outCode = new ArrayList<>();
        outCode.addAll(visit(ctx.vLeft));
        outCode.addAll(visit(ctx.vRight));

        switch (ctx.vOp.getText()) {
            case ">>": {
                outCode.add("ishr");
                break;
            }
            case "<<": {
                outCode.add("ishl");
                break;
            }
        }

        return outCode;
    }

//    @Override
//    // TODO: support boolean
//    public List<String> visitExCmprLe(ViperParser.ExCmprLeContext ctx) {
//        List<String> outCode = new ArrayList<>();
//
//        List<String> leftCode = visit(ctx.vLeft);
//        List<String> rightCode = visit(ctx.vRight);
//
//        DataType lType = types.get(ctx.vLeft);
//        DataType rType = types.get(ctx.vRight);
//
//        DataType cmpType = null;
//        if (lType == DataType.FLOAT && rType == DataType.FLOAT) {
//            outCode.addAll(leftCode);
//            outCode.addAll(rightCode);
//            cmpType = DataType.FLOAT;
//        } else if (lType == DataType.INT && rType == DataType.INT) {
//            outCode.addAll(leftCode);
//            outCode.addAll(rightCode);
//            cmpType = DataType.INT;
//        } else if (lType == DataType.FLOAT && rType == DataType.INT) {
//            outCode.addAll(leftCode);
//            outCode.addAll(rightCode);
//            outCode.add("i2f");
//            cmpType = DataType.FLOAT;
//        } else if (lType == DataType.INT && rType == DataType.FLOAT) {
//            outCode.addAll(leftCode);
//            outCode.add("i2f");
//            outCode.addAll(rightCode);
//            cmpType = DataType.FLOAT;
//        }
//
//        String op = ctx.vOp.getText();
//        if (cmpType == DataType.FLOAT) {
//            outCode.add("fcmpg");
//
//            switch (op) {
//                case "<":
//                    outCode.add("ldc -1");
//                    outCode.add("if_icmpeq");
//                    break;
//                case "<=":
//                    outCode.add("ldc 0");
//                    outCode.add("if_icmple");
//                    break;
//                case ">":
//                    outCode.add("ldc 1");
//                    outCode.add("if_icmpeq");
//                    break;
//                case ">=":
//                    outCode.add("ldc 0");
//                    outCode.add("if_icmpge");
//                    break;
//            }
//        } else if (cmpType == DataType.INT) {
//            switch (op) {
//                case "<":
//                    outCode.add("if_icmplt");
//                    break;
//                case "<=":
//                    outCode.add("if_icmple");
//                    break;
//                case ">":
//                    outCode.add("if_icmpgt");
//                    break;
//                case ">=":
//                    outCode.add("if_icmpge");
//                    break;
//            }
//        }
//
//        String thenLabel = currentClass.createLabel("then");
//        currentClass.append(" " + thenLabel);
//        currentClass.add("ldc 0");
//        String endLabel = currentClass.createLabel("then");
//        currentClass.add("goto " + endLabel);
//        currentClass.addLabel(thenLabel);
//        currentClass.add("ldc 1");
//        currentClass.addLabel(endLabel);
//
//        return DataType.BOOL;
//    }
//
//    @Override
//    // TODO: support boolean
//    public List<String> visitExCmprEq(ViperParser.ExCmprEqContext ctx) {
//        DataType lType = visit(ctx.vLeft);
//        DataType rType = visit(ctx.vRight);
//
//        DataType cmpType = null;
//        if (lType == DataType.FLOAT && rType == DataType.FLOAT) {
//            cmpType = DataType.FLOAT;
//        } else if (lType == DataType.INT && rType == DataType.INT) {
//            cmpType = DataType.INT;
//        }
//
//        if (cmpType == DataType.FLOAT) {
//            currentClass.add("fcmpg");
//            currentClass.add("ldc 0");
//
//        }
//
//        String op = ctx.vOp.getText();
//        switch (op) {
//            case "==":
//                currentClass.add("if_icmpeq");
//                break;
//            case "!=":
//                currentClass.add("if_icmpne");
//                break;
//        }
//
//        String thenLabel = currentClass.createLabel("then");
//        currentClass.append(" " + thenLabel);
//        currentClass.add("ldc 0");
//        String endLabel = currentClass.createLabel("then");
//        currentClass.add("goto " + endLabel);
//        currentClass.addLabel(thenLabel);
//        currentClass.add("ldc 1");
//        currentClass.addLabel(endLabel);
//
//        return DataType.BOOL;
//    }
//
//    @Override
//    public DataType visitExBitOp(ViperParser.ExBitOpContext ctx) {
//        visit(ctx.vLeft);
//        visit(ctx.vRight);
//        System.out.println(ctx.vOp.getText());
//        switch (ctx.vOp.getText()) {
//            case "&": {
//                currentClass.add("iadd");
//                break;
//            }
//            case "^": {
//                currentClass.add("ixor");
//                break;
//            }
//            case "|": {
//                currentClass.add("ior");
//                break;
//            }
//        }
//
//        return DataType.INT;
//    }
//
//    @Override
//    public DataType visitVReturn(ViperParser.VReturnContext ctx) {
//        DataType dataType = DataType.NONE;
//        if (ctx.vExpression() == null) {
//            currentClass.add("return");
//        } else {
//            dataType = visit(ctx.vExpression());
//
//            switch (dataType) {
//                case INT:
//                case BOOL:
//                    currentClass.add("ireturn");
//                    break;
//                case FLOAT:
//                    currentClass.add("freturn");
//                    break;
//                case STRING:
//                    currentClass.add("areturn");
//                    break;
//            }
//        }
//
//        return dataType;
//    }
//
//    @Override
//    public DataType visitVWhile(ViperParser.VWhileContext ctx) {
//        String whileLabel = currentClass.createLabel("while");
//        String endLabel = currentClass.createLabel("end");
//        currentClass.addLabel(whileLabel);
//        visit(ctx.vExpression());
//        currentClass.add("ifeq " + endLabel);
//        visit(ctx.vBlock());
//        currentClass.add("goto " + whileLabel);
//        currentClass.addLabel(endLabel);
//        return DataType.NONE;
//    }
//
//    @Override
//    public DataType visitVIf(ViperParser.VIfContext ctx) {
//
//        List<ViperParser.VExpressionContext> expressions = ctx.vExpression();
//        List<ViperParser.VBlockContext> codeBlocks = ctx.vBlock();
//        String endLabel = currentClass.createLabel("end");
//
//        for (int i = 0; i < expressions.size(); i++) {
//            visit(expressions.get(i));
//            String thenLabel = currentClass.createLabel("then");
//            currentClass.add("ifeq " + thenLabel);
//            visit(codeBlocks.get(i));
//            currentClass.add("goto " + endLabel);
//            currentClass.addLabel(thenLabel);
//        }
//        if (expressions.size() < codeBlocks.size()) {
//            visit(codeBlocks.get(codeBlocks.size() - 1));
//        }
//        currentClass.addLabel(endLabel);
//
//
//        return DataType.NONE;
//    }
//
//    @Override
//    public DataType visitExTernary(ViperParser.ExTernaryContext ctx) {
//        //else and then are the other way arround bc ifeq compares to 0
//        String elseLabel = currentClass.createLabel("else");
//        String endLabel = currentClass.createLabel("end");
//        visit(ctx.condition);
//        currentClass.add("ifeq " + elseLabel);
//        visit(ctx.vThen);
//        currentClass.add("goto " + endLabel);
//        currentClass.addLabel(elseLabel);
//        visit(ctx.vElse);
//        currentClass.addLabel(endLabel);
//
//        // TODO: not always a boolean.
//        return DataType.BOOL;
//    }
//
//    @Override
//    public DataType visitExFloatLiteral(ViperParser.ExFloatLiteralContext ctx) {
//        currentClass.add("ldc " + ctx.getText());
//        return DataType.FLOAT;
//    }
//
//    @Override
//    public DataType visitExIntLiteral(ViperParser.ExIntLiteralContext ctx) {
//        currentClass.add("ldc " + ctx.getText());
//        return DataType.INT;
//    }
//
//    @Override
//    public DataType visitExStringLiteral(ViperParser.ExStringLiteralContext ctx) {
//        currentClass.add("ldc " + ctx.getText());
//        return DataType.STRING;
//    }
//
//    @Override
//    public DataType visitExBoolLiteral(ViperParser.ExBoolLiteralContext ctx) {
//        currentClass.add("ldc " + (ctx.getText().equalsIgnoreCase("true") ? 1 : 0));
//        return DataType.BOOL;
//    }
//
//    @Override
//    public DataType visitTypeString(ViperParser.TypeStringContext ctx) {
//        return DataType.STRING;
//    }
//
//    @Override
//    public DataType visitTypeBool(ViperParser.TypeBoolContext ctx) {
//        return DataType.BOOL;
//    }
//
//    @Override
//    public DataType visitTypeFloat(ViperParser.TypeFloatContext ctx) {
//        return DataType.FLOAT;
//    }
//
//    @Override
//    public DataType visitTypeInt(ViperParser.TypeIntContext ctx) {
//        return DataType.INT;
//    }

}
