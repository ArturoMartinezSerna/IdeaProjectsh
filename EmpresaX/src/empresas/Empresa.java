package empresas;

public class Empresa {
    private String nombre;
    Sucursal sede;

    public Empresa(String nombre, Sucursal sede) {
        this.nombre = nombre;
        this.sede = sede;
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String nombre() {
        return nombre;
    }
}
