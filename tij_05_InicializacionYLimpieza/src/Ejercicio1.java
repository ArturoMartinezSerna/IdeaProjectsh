public class Ejercicio1 {
    //TIP Hola mundo otra vez!

    // Exercise 1: (1) Create a class containing an uninitialized String reference. Demonstrate that this reference is initialized by Java to null.
    public static void main(String[] args) {
        Clase clase = new Clase();
        System.out.println("Nombre: " + clase.nombre);
    }

    static class Clase {
        String nombre;
    }
}
