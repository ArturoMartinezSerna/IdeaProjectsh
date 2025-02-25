/*
 * Solicita al usuario una letra, e indica si es vocal o no.
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Modificar el main para solo llamar una nueva funcion que se denomine mostrarResultado()
        //mostrarResultado() despues de refactor ejecutaEsVocal() a mostrarResultado()
        ejecutaEsVocal();

    }

    // Ejecuta la logica, y muestra por pantalla si lo que pide es vocal o no
    private static void ejecutaEsVocal() {
        if(esVocal(pideLetra()))
            System.out.println("La letra introducida es vocal");
        else
            System.out.println("La letra introducida no es vocal");
    }

    private static char pideLetra() {
        char letra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca una letra:");
        letra = entrada.nextLine().charAt(0);
        return letra;
    }

    private static boolean esVocal(char letra) {
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
            return true;
        else
            return false;
    }
}
