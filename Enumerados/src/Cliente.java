public class Cliente {

    private String nombre;
    private Sexo sexoCliente;
    enum Sexo {HOMBRE, MUJER}

    // Constructor

    public Cliente(String nombre, Sexo sexoCliente) {
        this.nombre = nombre;
        this.sexoCliente = sexoCliente;
    }

    //getter y setter

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Sexo getSexoCliente() {
        return sexoCliente;
    }
    public void setSexoCliente(Sexo sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public String toString() {
        return nombre + " " + sexoCliente;
    }
}
