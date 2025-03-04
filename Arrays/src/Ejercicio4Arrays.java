/*
 * Definir una función que tome como parámetros dos arrays,
 * el primero con 8 números de la primitiva, y el segundo con
 * los 8 numeros de la combinacion ganadora.
 * La funcion devolvera el numero de aciertos.
 *
 * Los numeros de la primitiva son del 0 al 49
 */

import javax.swing.*;
import java.util.Arrays;

public class Ejercicio4Arrays {


    public static void main(String[] args) {
        int[] combinacionGanadora;
        int[] miCombinacion;
        int contadorAciertos;
        combinacionGanadora = combinacionGanadora();
        System.out.println("La combinacion es: " + Arrays.toString(combinacionGanadora));
        miCombinacion = apuesta();
        JOptionPane.showMessageDialog(null, "Tu apuesta es: " + Arrays.toString(miCombinacion));
        JOptionPane.showMessageDialog(null, "La combinacion ganadora es: " + Arrays.toString(combinacionGanadora));
        contadorAciertos = cuentaAciertos(miCombinacion, combinacionGanadora);

        JOptionPane.showMessageDialog(null, "El numero de aciertos fue de: " + contadorAciertos);

    }

    static int[] combinacionGanadora() {
        int[] numeros = new int[6];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)(Math.random()*50);
        }
        // Ordenamos la tabla para hacer la busqueda con binarySearch()
        Arrays.sort(numeros);
        return numeros;
    }

    static int[] apuesta() {
        boolean centinela;
        int[] numeros = new int[6];
        for(int i = 0; i < numeros.length; i++){
            do {
                centinela = false;
                String numeroT = JOptionPane.showInputDialog(null, "Introduzca el " + (i+1) + " numero de su combinacion:");
                try {
                    numeros[i] = Integer.parseInt(numeroT);
                    if(numeros[i] <0 || numeros[i] >= 50){
                        throw new Exception("Por favor, introduzca un número entre 0 y 49");
                    }
                } catch(NumberFormatException e) {
                centinela = true;
                } catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    centinela = true;
                }
            } while(centinela);
        }
        Arrays.sort(numeros);
        return numeros;
    }

    static int cuentaAciertos(int[] apuesta, int[] combinacionGanadora) {
        int contadorAciertos = 0;
        for(int i = 0; i < combinacionGanadora.length; i++){
            if(Arrays.binarySearch(combinacionGanadora, apuesta[i]) >= 0){
                contadorAciertos++;
            }
        }
        return contadorAciertos;
    }
}
