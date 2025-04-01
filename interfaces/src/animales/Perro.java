package animales;

public class Perro extends Animal implements Sonido {
    private String raza;

    public Perro(double peso, double altura, int edad, String raza) {
        super(peso, altura, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void voz() {
        System.out.println("WAN WAN WAN WAN WAN");
    }

    public void mostrarRaza() {
        System.out.println("La raza es: " + raza);
    }

    @Override
    public String toString() {
        return "animales.Perro{" +
                "raza='" + raza + '\'' +
                '}';
    }
}
