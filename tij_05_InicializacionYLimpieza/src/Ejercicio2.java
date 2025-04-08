public class Ejercicio2 {
    //TIP Exercise 2: (2) Create a class with a String field that is initialized at the point of definition, and another one that is initialized by the constructor. What is the difference between the two approaches?
    public static void main(String[] args) {
        Clase clase = new Clase();
        Clase clase2 = new Clase("Pedro");

        System.out.println(clase.nombre);
        System.out.println(clase2.nombre);
        System.out.println(new Clase(1).nombre);
    }

    static class Clase {
        String nombre = "Paco";

        Clase() {
            nombre = "";
        }
        Clase(String nombre) {
            this.nombre = nombre;
        }
        Clase(int numero) {

        }
    }
}
