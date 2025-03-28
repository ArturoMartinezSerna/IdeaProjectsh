package modelos;

public class Persona {
    protected enum Sexo {MASCULINO, FEMENINO}
    // Atributos de superclase
    private String nombre;
    private String apellidos;
    private int edad;
    private Sexo sexo;

    public Persona() {

    }

    public Persona(String nombre, String apellidos, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "Persona: " +
                "\nnombre=" + nombre +
                "\napellidos=" + apellidos +
                "\nedad=" + edad +
                "\nsexo=" + sexo;
    }

    public boolean equals2(Object obj) {
        Persona p1 = (Persona) obj;
        if(!p1.getNombre().equals(nombre))
            return false;
        if(!p1.getApellidos().equals(apellidos))
            return false;
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        Persona p1 = (Persona) obj;
        return p1.getEdad() == edad;
    }
}
