/*
 * El metodo fill inicializa un array segun un valor que se indique
 */

import java.util.Arrays;

public class InicializarArray {
    public static void main(String[] args) {
        String[] frutas = new String[10];
        int[] numeros = new int[10];

        System.out.println(Arrays.toString(frutas));
        Arrays.fill(frutas, "Kiwi");
        System.out.println(Arrays.toString(frutas));
        System.out.println(Arrays.toString(numeros));
        Arrays.fill(numeros, 100);
        System.out.println(Arrays.toString(numeros));
    }
}
