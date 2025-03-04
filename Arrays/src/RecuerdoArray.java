/*
 * for(int i = 0; i < tabla.length; i++) -> recorre array de forma ascendente
 * for(tipo valor : nombreArray)
 *
 * Crea una tabla de 10 elementos aleatorios y muestralos de forma ascendente
 * descendente, y con un forEach.
 */

import java.util.Arrays;

public class RecuerdoArray {

    public static void main(String[] args) {
        int[] array;

        array = ordenaTabla(inicializaArrayAleatorio(10));

        muestraArrayAscendente(array);
        muestraArrayDescendente(array);
        muestraArrayForEach(array);
    }

    private static int[] inicializaArrayAleatorio(int longitud) {
        int[] array = new int[longitud];
        for(int i = 0; i < longitud; i++) {
            array[i] = (int)(Math.random()*10 + 1);
        }
        return array;
    }

    private static void muestraArrayAscendente(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void muestraArrayDescendente(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void muestraArrayForEach(int[] array) {
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] ordenaTabla(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
