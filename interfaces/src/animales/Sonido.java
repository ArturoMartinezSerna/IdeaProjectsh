package animales;

public interface Sonido {

    static int version = 1;
    void voz();

    // Metodo que se implementa directamente en la interfaz
    // puede haver override en el metodo que lo implemente

    default void durmiendo() {
        System.out.println("zzzz");
    }

    // Podemos crear metodos estaticos y por defecto son publicos
    // Solo se puede acceder a ellos a traves de la interfaz
    static void bostezo() {
        System.out.println("zzzz");
    }

    // Las interfaces tambien pueden tener metodos propios.
    // Pero son estaticos por defecto. Publicos tambien.
    // Podemos poner un metodo privado
    // Parece que no son estaticos por defecto.
    private static void holaMundo() {
        System.out.println("Hola mundo");
    }
}
