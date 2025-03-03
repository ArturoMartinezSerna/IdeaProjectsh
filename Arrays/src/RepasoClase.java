/*
 * Las tablas empiezan con indice 0
 * Segun el tipo declarado tiene uno u otro valor por defecto
 * numerico -> 0; Objeto -> String; char -> caracter vacío ascii; boolean-> false
 *
 * Sintaxis:
 * tipo[] identificador = new tipo[longitud];
 * con el campo length del atributo, cogemos la longitud del array primitivo
 */

import javax.swing.*;
import java.util.Arrays;

public class RepasoClase {
    public static void main(String[] args) {

        /* Ejemplo: solicita al usuario 10 nombres e ingresarlos al array nombres
         * String[] nombres;
         * nombres = solicitarNombres();
         * mostrarNombres(nombres);
         */
        mostrarToString(solicitarNombres());
        while(condicion())
            System.out.println("Dentro del while");
        System.out.println("Fuera del while");

        mostrarNombres(solicitarNombres());
    }

    /*
     * Las funciones nos permiten crear codigo para reutilizar
     */
    private static String[] solicitarNombres() {
        String[] nombres = new String[10];

        for(int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog(null, "Ingrese el " + i + " nombre");
        }
        return nombres;
    }

    private static void mostrarNombres(String[] nombres) {

        for(int i = 0; i < nombres.length; i++) {
            JOptionPane.showMessageDialog(null, "El " + i + " nombre es: " + nombres[i]);
        }
    }

    private static boolean condicion() {
        boolean resultado = Math.random() < 0.99;
        System.out.print(resultado + ", ");
        return resultado;
    }

    // Hay un metodo que muestra todos los elementos del array
    static void mostrarToString(String[] nombres) {
        // JOptionPane.showMessageDialog(null, nombres);
        JOptionPane.showMessageDialog(null, Arrays.toString(nombres));
    }
}
