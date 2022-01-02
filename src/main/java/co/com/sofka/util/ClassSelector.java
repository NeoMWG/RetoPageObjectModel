package co.com.sofka.util;

public enum ClassSelector {

    ECO("Economica"),
    PRE_ECO("Premium economy"),
    EXEC("Ejecutiva/Business"),
    FIRST_CLASS("Primera Clase");

    private final String value;

    ClassSelector(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
