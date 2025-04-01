package animales;

public class Main {
    public static void main(String[] args) {
        Animal lorenzo = new Perro(12.0, 800.19, 7, "Chihuahua");
        Caracol marcelo = new Caracol(0.5, 15.0, 1, "Islas Caimán");

        System.out.println(lorenzo);
        ((Perro)(lorenzo)).voz();
        System.out.println(marcelo);
        marcelo.mostrarUbicacion();
        System.out.println(Sonido.version);

        //animales.Sonido.version = 5 --> Error porque animales.Sonido.version es final, estatico y publico por defecto

        Sonido.bostezo(); // Solo los podemos llamar desde la interfaz
    }
}