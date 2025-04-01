package futbolistas;

public class Entrenador extends Trabajador implements AumentoDeSueldo {

    public Entrenador(String dni, String nombre, int edad) {
        super(dni, nombre, edad);
        this.sueldo = 2000;
    }

    @Override
    public void aumentarSueldo() {
        System.out.println("Aumentando sueldo del entrenador");
        this.sueldo *= 1.2;
    }
}
