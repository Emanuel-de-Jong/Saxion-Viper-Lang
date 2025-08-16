package nl.saxion.cos.symbols;

import nl.saxion.cos.enums.Access;

public class ClassSymbol extends Symbol {

    ClassSymbol parent;


    public ClassSymbol(String name, Access access, ClassSymbol parent) {
        super(name, access);
        this.parent = parent;
    }

    public ClassSymbol(String name, Access access) {
        this(name, access, null);
    }


    public ClassSymbol getParent() {
        return parent;
    }

    public void setParent(ClassSymbol parent) {
        this.parent = parent;
    }

}
