import java.util.Scanner;

/*
 * La clausula return dentro de una funcion devuelve un valor
 *  que es del tipo declarado en el prototipo de la funcion
 *
 * Ej:
 * Esta funcion indica que la valor devuelve un tipo int
 * static int pedirEdad() {
 *  int edad = 1;
 *  return edad;
 * }
 */
public class ReturnFuncion {
    public static void main(String[] args) {
        //int edad = pedirEdad();
        //mostrarEdad(edad);
        mostrarEdad(pedirEdad());
        mostrarNombre(pedirNombre());

    }
    // Solicita la edad
    static int pedirEdad() {
        boolean centinela = false;
        int edad;

        do {
            System.out.println("Indica la edad");
            edad = new Scanner(System.in).nextInt();
            if(edad >= 0 && edad <= 120) {
                centinela = true;
            }
        } while(!centinela);
        return edad;
    }

    // Muestra la edad
    static void mostrarEdad(int edad) {
        System.out.println("Edad: " + edad);
    }

    // Crear la funcion pedirNombre
    private static String pedirNombre() {
        System.out.println("Ingrese el nombre");
        return new Scanner(System.in).nextLine();
    }

    // Crear la funcion mostrarNombre
    private static void mostrarNombre(String nombre) {
        System.out.println("Nombre: " + nombre);
    }
}
