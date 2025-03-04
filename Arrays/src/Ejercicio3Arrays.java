import javax.swing.*;
import java.util.Arrays;

/*
 * Escribir una aplicacion que solicita al usuario cuantos numeros quiere
 * introducir. A continuacion, introducir por teclado la cantidad de numeros
 * y por ultimo, mostrarlo en orden inverso. El ultimo el primero y el primero
 * el ultimo
 */
public class Ejercicio3Arrays {

    public static void main(String[] args) {
        int[] array = invierteArray(solicitaArray());
        imprimirArray(array);
        ordenarTabla(array);
    }

    // 1.- Preguntar cuantos numeros quiero introducir. Devuelve int

    // 2.- Solicita los numeros y los guarda en un array
    private static int[] solicitaArray() {
        int solicitudes;
        int[] array;

        solicitudes = pideIntJOption("Introduzca cuantos números va a introducir:");
        array = new int[solicitudes];
        for(int i = 0; i < solicitudes; i++) {
            array[i] = pideIntJOption("Introduzca el numero " + i);
        }
        return array;
    }

        static int pideIntJOption(String peticion) {
            int numero;
            String numeroT;
            boolean centinela;

            do {
                centinela = false;
                try {
                    numeroT = JOptionPane.showInputDialog(peticion);
                    numero = Integer.parseInt(numeroT);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Introduzca un numero entero");
                    centinela = true;
                    numero = 0;
                }
            } while(centinela);
            return numero;
        }

    // 3.- Muestra el array de forma inversa
    private static int[] invierteArray(int[] array) {
        int[] aux = new int[array.length];

        for(int i = 0, j = aux.length-1; i < array.length; i++, j--){
            aux[j] = array[i];
        }

        return aux;
    }

    private static void imprimirArray(int[] array) {
        JOptionPane.showMessageDialog(null, Arrays.toString(array));
    }

    static void ordenarTabla(int[] array) {
        //Array.sort(nombreTabla)
        Arrays.sort(array);
        for(int n : array) { // Bucle forEach en java
            System.out.println(n);
        }
    }
}
