package Model;

public enum NumberType {

        HOME("Home"),
        Mobile("Mobile"),
        Work("Work");

        private final String numberType;
        NumberType(String numberType) {
            this.numberType = numberType;
        }
        public String getNumberType() {
            return numberType;
        }
    }