package animales;

public class Leon extends Animal implements Sonido{
    public Leon(double peso, double altura, int edad) {
        super(peso, altura, edad);
    }

    @Override
    public void voz() {
        System.out.println("Gruuu");
    }

    // Reimplementar en una subclase un metodo de la interfaz
    @Override
    public void durmiendo() {
        System.out.println("Guu");
    }
}
