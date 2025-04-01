package futbolistas;

public class Futbolista extends Trabajador implements AumentoDeSueldo {
    int numeroGoles;

    public Futbolista(String dni, String nombre, int edad, int numeroGoles) {
        super(dni, nombre, edad);
        this.numeroGoles = numeroGoles;
        this.sueldo = 2000;
    }

    @Override
    public void aumentarSueldo() {
        System.out.println("Aumentando sueldo del futbolista");
        this.sueldo *= 1.1;
    }
}
