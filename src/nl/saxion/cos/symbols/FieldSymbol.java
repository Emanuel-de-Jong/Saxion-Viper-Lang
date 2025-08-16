package nl.saxion.cos.symbols;

import nl.saxion.cos.enums.DataType;
import nl.saxion.cos.enums.Access;

public class FieldSymbol extends Symbol {

    DataType type;
    boolean isStatic;


    public FieldSymbol(String name, Access access, DataType type) {
        super(name, access);
        this.type = type;
    }

    public FieldSymbol(String name, Access access, DataType type, boolean isStatic) {
        this(name, access, type);
        this.isStatic = isStatic;
    }


    public String write() {
        return ".field " + (access != Access.NONE ? access + " " : "") + name + " " + type;
    }


    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

}
