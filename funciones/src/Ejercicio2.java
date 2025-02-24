import java.util.Scanner;

/*
 * Solicita dos números y mediante funciones determina cual es el mayor de los dos
 * Luego, muestra todos los números de forma decreciente que existen entre ellos.
 *
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int numeroMayor, numeroMenor;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numeroMayor = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numeroMenor = entrada.nextInt();
        if (!esMayor(numeroMayor, numeroMenor)) {
            int temporal = numeroMayor;
            numeroMayor = numeroMenor;
            numeroMenor = temporal;
        }

        System.out.println("El mayor numero es: " + numeroMayor);
        System.out.println("Los números entre medias son: ");
        mostrarNumerosInternos(numeroMayor, numeroMenor);

    }

    private static boolean esMayor(int num1, int num2) {
        return num1 > num2;
    }

    private static void mostrarNumerosInternos(int mayor, int menor) {
        for(int i = menor+1; i < mayor; i++) {
            System.out.print(i + " ");
        }
    }
}
