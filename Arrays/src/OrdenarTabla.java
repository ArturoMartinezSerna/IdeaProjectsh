/*
 * Ordenar una tabla de distintos tipos
 *
 */

import java.util.Arrays;

public class OrdenarTabla {

    public static void main(String[] args) {
        String[] palabras = {"tractor", "bombilla", "cigüeña", "botón", "mesa", "esquiador", "gorila", "barco", "ciclista", "botella", "Baúl", "Toro", "Reloj", "alfombra", "nube", "puerta", "roca", "mar", "pelota"};
        int[] numeros = {34, 1, 56, 2, 44, 76, 21, 35, 90, 34, 67, 65, 32};

        ordenarTexto(palabras);
        System.out.println("******************************");
        ordenarNumeros(numeros);

    }
    // Primero las mayusculas, luego las minusculas
    static void ordenarTexto(String[] palabras) {
        System.out.println(Arrays.toString(palabras));
        Arrays.sort(palabras);
        System.out.println(Arrays.toString(palabras));
    }

    static void ordenarNumeros(int[] numeros) {
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
