package nl.saxion.cos.symbols;

import nl.saxion.cos.enums.Access;

public abstract class Symbol {

    int index;
    String name;
    Access access;


    public Symbol(String name, Access access) {
        this.name = name;
        this.access = access;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

}
