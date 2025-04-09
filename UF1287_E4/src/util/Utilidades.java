package util;

import javax.swing.*;
import java.text.DecimalFormat;

public class Utilidades {

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

    public static String formatoEuros(double euros) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(euros) + "€";
    }

}
