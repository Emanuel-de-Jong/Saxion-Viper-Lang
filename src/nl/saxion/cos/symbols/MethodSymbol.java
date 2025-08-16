package nl.saxion.cos.symbols;

import nl.saxion.cos.enums.DataType;
import nl.saxion.cos.enums.Access;

import java.util.ArrayList;
import java.util.List;

public class MethodSymbol extends Symbol {

    DataType returnType;
    List<DataType> paramTypes;
    List<String> code;
    boolean isStatic;
    int stack;
    int locals;


    public MethodSymbol(String name, Access access, DataType returnType, List<DataType> parameterTypes) {
        super(name, access);
        this.returnType = returnType;
        this.paramTypes = parameterTypes;
    }

    public MethodSymbol(String name, Access access, DataType returnType, List<DataType> parameterTypes,
                        List<String> code) {
        this(name, access, returnType, parameterTypes);
        this.code = code;
    }

    public MethodSymbol(String name, Access access, DataType returnType, List<DataType> parameterTypes,
                        boolean isStatic) {
        this(name, access, returnType, parameterTypes);
        this.isStatic = isStatic;
    }

    public MethodSymbol(String name, Access access, DataType returnType, List<DataType> parameterTypes,
                        List<String> code, boolean isStatic) {
        this(name, access, returnType, parameterTypes, code);
        this.isStatic = isStatic;
    }


    //todo; replace temp with types
    public List<String> write() {
        List<String> out = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".method ")
                .append(access)
                .append(" ")
                .append(name)
                .append("(");
        for (DataType parameter : paramTypes) {
            stringBuilder.append("TEMP" + parameter + " ");
        }
        stringBuilder.append(")")
                .append("TEMP");
        out.add(stringBuilder.toString());

        out.addAll(code);

        out.add(".end method");
        return out;
    }


    public DataType getReturnType() {
        return returnType;
    }

    public void setReturnType(DataType returnType) {
        this.returnType = returnType;
    }

    public List<DataType> getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(List<DataType> paramTypes) {
        this.paramTypes = paramTypes;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

}
