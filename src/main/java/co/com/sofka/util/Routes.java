package co.com.sofka.util;

public enum Routes {

        ONEWAYTRIP("Ida"),
        ROUNDTRIP("Ida y Vuelta"),
        MULTIDESTINATION("Multidestino");

        private final String value;

        public String getValue () {
            return value;
        }

        Routes (String value) {
            this.value = value;
        }
    }
