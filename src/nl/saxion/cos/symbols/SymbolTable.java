package nl.saxion.cos.symbols;

import nl.saxion.cos.enums.DataType;
import nl.saxion.cos.enums.ScopeType;

import java.util.HashMap;

public class SymbolTable extends HashMap<String, Symbol> {

    private SymbolTable parent;
    private ScopeType scopeType;
    private ClassSymbol classSymbol;
    private int index = 0;


    public SymbolTable(ScopeType scopeType) {
        this.scopeType = scopeType;
    }

    public SymbolTable(ScopeType scopeType, SymbolTable parent) {
        this(scopeType);
        this.parent = parent;
    }


    public SymbolTable createChild(ScopeType scopeType) {
        return new SymbolTable(scopeType, this);
    }

    public void add(Symbol symbol) {
        if (symbol instanceof VarSymbol) {
            VarSymbol varSymbol = (VarSymbol) symbol;
            if (varSymbol.getType() != DataType.ADDRESS) {
                index++;
                varSymbol.setIndex(index);
            }
        } else if (symbol instanceof ClassSymbol) {
            classSymbol = (ClassSymbol) symbol;
        }
        put(symbol.getName(), symbol);
    }

    public <T extends Symbol> T lookup(String name) {
        Symbol symbol = get(name);
        if (symbol == null && parent != null)
            symbol = parent.lookup(name);

        if (symbol == null) return null;

        return (T) symbol;
    }


    public SymbolTable getParent() {
        return parent;
    }

    public void setParent(SymbolTable parent) {
        this.parent = parent;
    }

    public ScopeType getScopeType() {
        return scopeType;
    }

    public ClassSymbol getClassSymbol() {
        ClassSymbol result = classSymbol;
        if (result == null && parent != null)
            result = parent.getClassSymbol();

        return result;
    }

    public int getIndex() {
        return index;
    }

    public void addIndex() {
        index++;
    }

    public void subIndex() {
        index--;
    }

}
