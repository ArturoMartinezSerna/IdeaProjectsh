import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {

    /*
     * Diseña una función que solicite un número y muestre las veces que se le pase por parametro, la palabra ECO....
     *
     * Ejemplo: el usuario indica 5
     *  ECO ECO ECO ECO ECO
     */

    public static void main(String[] args) {
        int numero;
        String nombre;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el número de ecos a recibir:");
        numero = in.nextInt();
        muestraEco(numero);
        nombre = pedirNombre();



    }

    private static void muestraEco(int numero) {
        for(int i = 0; i < numero; i++) {
            System.out.println("ECO");
        }

    }

    // Esta funcion devuelve un valor tipo String .... return variable
    private static String pedirNombre() {
        //return "Arturo";
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        return nombre;
    }
}
