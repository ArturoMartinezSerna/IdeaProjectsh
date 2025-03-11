/*
 * Enunciado:
 * Crea una aplicación que permita al usuario seleccionar en la compra de 3 artículos:
 * 1.- Impresora Láser
 * 2.- Impresora Ink
 * 3.- Impresora Multifunción
 * 4.- Salir
 * El valor de la impresora 1 es de: 155€, la segunda de 60€ y la 3 de 250€
 * En el momento en que el usuario indique la impresora, se pregunta la
 * la cantidad de impresoras a comprar (puede comprar más de una a la vez)
 * y puede también comprar diferentes.
 *
 */

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        int opcion;
        double total = 0.0;
        // Repite el menú hasta que se pulse la opción 4
        do {
            // Mostramos el menú principal, y recogemos la opción seleccionada
            opcion = muestraMenuPrincipal();

            // Añadimos al total según qué opción haya sido seleccionada
            switch (opcion) {
                case 1: total += pideImpresora("Láser", 155);
                break;
                case 2: total += pideImpresora("Ink", 60);
                break;
                case 3: total += pideImpresora("Multifunción", 250);
                break;
                case 4: mostrarDespedida(total);
            }
        } while(opcion != 4);
    }

    /**
     * Muestra el menú principal
     * @return opcion seleccionada
     */
    private static int muestraMenuPrincipal() {
        // Almacenamos el menú en una constante
        final String MENU_PRINCIPAL = "Indique el tipo de artículo que desea comprar:"
                + "\n1.- Impresora Láser\n2.- Impresora Ink\n3.- Impresora Multifunción\n4.- Salir";
        // devolvemos el número entero que el usuario introduce tras mostrar el menú principal
        return pideNumeroEntero(MENU_PRINCIPAL);
    }

    /**
     * Pide un número entero al usuario, mostrando peticion por pantalla.
     * Además, valida que el número introducido sea entero
     * @param peticion El mensaje a mostrar al usuario
     * @return El número entero que pedimos
     */
    private static int pideNumeroEntero(String peticion) {
        int numero = 0; // El número que queremos pedir
        String respuestaUsuario;
        boolean centinela; // Guarda un booleano que repite el bucle mientras haya errores

        do {
            centinela = false; // Al principio, no hay errores de introduccion
            try {
                // Recogemos el valor String que introduce el usuario
                respuestaUsuario = JOptionPane.showInputDialog(null, peticion);
                // Pasamos ese String al número entero que queremos recibir
                numero = Integer.parseInt(respuestaUsuario);
            } catch (NumberFormatException e) { // Si el número introducido no es entero
                // salta el mensaje de error
                JOptionPane.showMessageDialog(null, "Error! Ingrese un numero entero");
                // Forzamos a que se repita la introducción, repitiendo el bucle
                centinela = true;
            }
        } while(centinela);
        return numero;
    }

    /**
     * Pide la cantidad de impresoras que se desea comprar, y calcula el precio total
     * @param tipoImpresora Es el String que indica de qué tipo es la impresora.
     *                      Sólo sirve para personalizar el mensaje que se envía al usuario
     * @param precio Es el precio de la impresora dependiendo de su tipo
     * @return El precio de la suma de todas las impresoras
     */
    private static double pideImpresora(String tipoImpresora, double precio) {
        int numeroImpresoras; // Almacena el número de impresoras que vamos a comprar

        // Recibimos el número de impresoras de tipo tipoImpresora que vamos a comprar
        numeroImpresoras = pideNumeroEntero("Por favor, introduzca el número de impresoras " + tipoImpresora + " que desea comprar:");

        // Devolvemos el precio total de las impresoras compradas
        return numeroImpresoras * precio;
    }

    /**
     * Se despide del usuario y muestra el total en una factura
     * @param total el total de todos los artículos
     */
    private static void mostrarDespedida(double total) {
        // Crea un patrón de formato de 2 decimales y un símbolo del € después
        DecimalFormat df = new DecimalFormat("0.00€");

        // Muestra por pantalla la despedida
        JOptionPane.showMessageDialog(null, "***** Gracias por utiizar nuestro servicio! *****\n\n...Creando factura...");

        // Muestra por pantalla la factura
        JOptionPane.showMessageDialog(null, "El precio total de todos sus artículos asciende a: " + df.format(total));
    }
}