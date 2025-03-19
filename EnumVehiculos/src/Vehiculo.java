public class Vehiculo {
    public enum Marca {
        CITROEN, SEAT, FORD, OPEL, BMW, MERCEDES, MAZDA
    }
    public enum TipoCombustible {
        GASOLINA, GASOIL, ELECTRICO, HIBRIDO
    }

    Marca marca;
    TipoCombustible tipoCombustible;
    double potencia;
    String color;
    int anio;

    public Vehiculo(Marca marca, TipoCombustible tipoCombustible, double potencia, String color, int anio) {
        this.marca = marca;
        this.tipoCombustible = tipoCombustible;
        this.potencia = potencia;
        this.color = color;
        this.anio = anio;
    }

    public String toString() {
        return "Marca: " + marca + "\nTipo de combustible: " + tipoCombustible + "\nPotencia: " + potencia + "\nColor: " + color + "\nAnio: " + anio;
    }
}
