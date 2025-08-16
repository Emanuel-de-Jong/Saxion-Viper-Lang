package nl.saxion.cos.enums;

import java.util.ArrayList;
import java.util.List;

public enum DataType {

    NONE,
    INT,
    FLOAT,
    STRING,
    ADDRESS,
    BOOL;

    public static final List<DataType> PRIMITIVES = new ArrayList<>() {{
        add(INT);
        add(FLOAT);
        add(BOOL);
    }};

    private String descriptor;

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getDescriptor() {
        return descriptor;
    }

}
