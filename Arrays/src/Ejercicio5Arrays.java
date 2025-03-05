/*
 * Crea una tabla de valores aleatorios de 10 elementos del 0 al 100, y luego solicita un número
 * al usuario y elimina los elementos menores a dicho número
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5Arrays {

    public static void main(String[] args) {
        int[] aleatorios;
        int minimo;
        Scanner in = new Scanner(System.in);

        aleatorios = creaTablaAleatorios(10, 0, 100);

        System.out.println("Introduzca el número. Borraremos los números menores a dicho número");
        minimo = in.nextInt();
        System.out.println("Array original:\n" + Arrays.toString(aleatorios));
        aleatorios = borraMenores(aleatorios, minimo);
        System.out.println("Array borrados los menores de " + minimo + ": \n" + Arrays.toString(aleatorios));
    }

    private static int[] borraMenores(int[] array, int numero) {
        int contadorEliminados = 0;
        int longitudArrayOriginal = array.length;

        for(int i = 0; i < longitudArrayOriginal - contadorEliminados; i++){ // Conforme se eliminen valores, la longitud del array cambiará
            if (array[i] < numero) {
                // Sustituimos la posicion actual por la ultima del array
                array[i] = array[array.length - 1];

                // Eliminamos la ultima posicion de la tabla
                array = Arrays.copyOf(array, array.length - 1);

                // Reducimos en 1 el contador i para que si la ultima posicion era menor que el numero, vuelva a iterarlo
                i--;

                // Marcamos que hemos eliminado un elemento para que el bucle for no itere las posiciones que hemos eliminado
                contadorEliminados++;
            }
        }
        // Terminado de borrar los elementos, devolvemos el array
        return array;
    }

    private static int[] creaTablaAleatorios(int longitud, int minimo, int maximo) {
        int[] array = new int[longitud];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*maximo + minimo);
        }
        return array;
    }
}
