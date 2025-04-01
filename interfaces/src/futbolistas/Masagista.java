package futbolistas;

public class Masagista extends Trabajador{
    int codigoColegiado;
    int aniosExperiencia;

    public Masagista(String dni, String nombre, int edad, int codigoColegiado, int aniosExperiencia) {
        super(dni, nombre, edad);
        this.codigoColegiado = codigoColegiado;
        this.aniosExperiencia = aniosExperiencia;
        this.sueldo = 1950.59;
    }
}
