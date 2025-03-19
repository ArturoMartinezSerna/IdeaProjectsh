public enum Tallas {
    // VALORES DE LAS CONSTANTES DEL ENUM
    MINI("S"), MEDIANA("M"), GRANDE("L"), MUYGRANDE("XL");

    // ATRIBUTOS
    private String abreviatura;

    // CONSTRUCTOR
    Tallas(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    // METODOS
    public String getAbreviatura() {return abreviatura;}

}
