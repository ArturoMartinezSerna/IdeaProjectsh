/*
 * Ejercicio: Crea una tabla de 10 posiciones y almacena en cada posicion un número aleatorio
 * del 1 al 100. Luego, suma todos los valores y muestralo por pantalla
 */

import javax.swing.*;

public class Ejercicio1Arrays {

    public static void main(String[] args) {
        final int LONGITUD_NUMEROS = 10;
        int[] numeros;
        int suma;

        numeros = inicializaAleatorios(LONGITUD_NUMEROS);
        mostrarValores(numeros);
        suma = sumaValores(numeros);
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }

    private static int[] inicializaAleatorios(int longitud) {
        int[] numeros = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            numeros[i] = (int)(Math.random()*100 + 1);
        }
        return numeros;
    }

    private static void mostrarValores(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            JOptionPane.showMessageDialog(null, "Número: " + i + ": " + numeros[i]);
        }
    }

    private static int sumaValores(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }
}

