/**
 * Clase Personal
 *
 * Atributos:
 * nombre, apellidos: texto
 * id: entero
 * nHijos: entero
 * puesto: Puesto
 */

public class Personal {
    public static int nextId = 0;
    private String nombre, apellido;
    private int id;
    private int nHijos;
    public Puesto puesto;

    public Personal(String nombre, String apellido, int nHijos, String codigoPuesto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = nextId++;
        this.nHijos = nHijos;
        this.puesto = Puesto.getPuesto(codigoPuesto);
    }
    public String nombre() {return nombre;}
    public String apellido() {
        return apellido;
    }
    public int id() {
        return id;
    }
    public int nHijos() {
        return nHijos;
    }
    public Puesto puesto() {
        return puesto;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id=" + id +
                ", nHijos=" + nHijos +
                ", puesto=" + puesto +
                '}';
    }
}
