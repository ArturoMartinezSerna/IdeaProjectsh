package maquinaExpendedora.clases;

public class Producto {
    private double precio;
    private String nombre;

    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public String mostrarProducto() {
        return nombre + "-" + precio + "€";
    }

    // GETTERS Y SETTERS
    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
}
