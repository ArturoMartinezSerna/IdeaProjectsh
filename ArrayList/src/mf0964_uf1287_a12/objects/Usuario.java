package mf0964_uf1287_a12.objects;

public class Usuario {
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String movil;
    private String email;


    public Usuario(String dni, String nombre, String apellido, int edad, String movil, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.movil = movil;
        this.email = email;
    }

    public String dni() {
        return dni;
    }
    public void setDni(String dni) {
        dni = dni;
    }
    public String Nombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        nombre = nombre;
    }
    public String apellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        apellido = apellido;
    }
    public int edad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String movil() {
        return movil;
    }
    public void setMovil(String movil) {
        this.movil = movil;
    }
    public String email() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario: " + "\n  Dni: " + dni + "\n  Nombre: " + nombre + " " + apellido + "\n  Edad: " + edad + "\n  Movil: " + movil + "\n  Email: " + email;
    }
}
