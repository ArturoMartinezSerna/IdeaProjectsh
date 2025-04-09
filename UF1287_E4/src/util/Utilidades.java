package util;

import javax.swing.*;
import java.text.DecimalFormat;

/** Esta clase contiene métodos que serán útiles para todos los paquetes de nuestro proyecto*/
public class Utilidades {

    /** Este metodo pide con JOption un número entero, mostrando por pantalla el parametro que recibe peticion*/
    public static int pideEntero(String peticion) {
        String opcionSeleccionadaT;
        int entero;
        boolean opcionInvalida;
        do {
            opcionInvalida = false;
            opcionSeleccionadaT = JOptionPane.showInputDialog(null, peticion);
            try {
                entero = Integer.parseInt(opcionSeleccionadaT);
            } catch (NumberFormatException e) {
                opcionInvalida = true;
                JOptionPane.showMessageDialog(null, "Por favor, introduzca un numero entero");
                entero = 0;
            }
        } while(opcionInvalida);
        return entero;
    }

    /** Este metodo pide con JOption un número doble, mostrando por pantalla el parametro que recibe peticion*/
    public static double pideDouble(String peticion) {
        String opcionSeleccionadaT;
        double doble;
        boolean opcionInvalida;
        do {
            opcionInvalida = false;
            opcionSeleccionadaT = JOptionPane.showInputDialog(null, peticion);
            try {
                doble = Double.parseDouble(opcionSeleccionadaT);
            } catch (NumberFormatException e) {
                opcionInvalida = true;
                JOptionPane.showInputDialog(null, "Por favor, introduzca un numero");
                doble = 0;
            }
        } while(opcionInvalida);
        return doble;
    }

    /** Este metodo convierte el parametro doble recibido euros, en un String de formato euros, con dos decimales y el símbolo de €*/
    public static String formatoEuros(double euros) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(euros) + "€";
    }

}
