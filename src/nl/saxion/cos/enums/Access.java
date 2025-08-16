package nl.saxion.cos.enums;

public enum Access {

    NONE,
    PUBLIC,
    PRIVATE,
    PROTECTED;

    public static Access from(String name) {
        switch (name.toUpperCase()) {
            case "PUBLIC":
                return PUBLIC;
            case "PRIVATE":
                return PRIVATE;
            case "PROTECTED":
                return PROTECTED;
        }
        return NONE;
    }

}
