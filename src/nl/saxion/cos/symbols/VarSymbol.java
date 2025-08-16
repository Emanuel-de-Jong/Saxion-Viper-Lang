package nl.saxion.cos.symbols;

import nl.saxion.cos.enums.DataType;
import nl.saxion.cos.enums.Access;

public class VarSymbol extends Symbol {

    DataType type;


    public VarSymbol(String name, Access access,
                     DataType type) {
        super(name, access);
        this.type = type;
    }

    public VarSymbol(String name, DataType type) {
        super(name, Access.NONE);
        this.type = type;
    }


    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

}
