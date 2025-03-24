/*
 * Crear la clase vehiculo, que tiene como atributos:
 * Marca (Citröen, SEAT, Ford, Opel, BMW, Mercedes, Mazda)
 * Potencia
 * Color
 * Anio
 * TipoCombustible (Gasolina, Gasoil, Electrico, Hibrido)
 *
 * Cuando se escriba la Marca o TipoCombustible, usa los enum de marca o de tipo
 */
public class Main {
    public static void main(String[] args) {

        Vehiculo bmw = new Vehiculo(Vehiculo.Marca.BMW, Vehiculo.TipoCombustible.ELECTRICO, 123.45, "Azul", 1998);
        Vehiculo fordFocus = new Vehiculo(Vehiculo.Marca.FORD, Vehiculo.TipoCombustible.GASOIL, 123.45, "Cian", 2005);
        Vehiculo kia = new Vehiculo(Vehiculo.Marca.OPEL, Vehiculo.TipoCombustible.HIBRIDO, 123.45, "Azul Marino", 2006);

        System.out.println("\n\nVehiculo bmw: \n" + bmw);
        System.out.println("\n\nVehiculo fordFocus: \n" + fordFocus);
        System.out.println("\n\nVehiculo kia: \n" + kia);
        System.out.println("");
    }

    // En el constructor, podemos poner un enum de varios tipos distintos

}