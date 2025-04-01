package futbolistas;

public class Trabajador {
    String dni;
    String nombre;
    int edad;
    double sueldo;

    public Trabajador(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return "\nDNI:" + dni + "\nNombre: " + nombre + "\nEdad: " + edad;
    }

    @Override
    public boolean equals(Object trabajador) {
        return (this.dni.equals(((Trabajador) trabajador).dni));
    }
}
