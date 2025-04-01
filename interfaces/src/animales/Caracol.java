package animales;

public class Caracol extends Animal {
    private String ubicacion;

    public Caracol(double peso, double altura, int edad, String ubicacion) {
        super(peso, altura, edad);
        this.ubicacion = ubicacion;
    }

    public void mostrarUbicacion() {
        System.out.println("Ubicacion: " + ubicacion);
    }

    @Override
    public String toString() {
        return "animales.Caracol{" +
                "ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
