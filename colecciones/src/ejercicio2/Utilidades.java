package ejercicio2;

import javax.swing.*;

public class Utilidades {


    public static String pideString(String peticion) {
        String output;

        output = JOptionPane.showInputDialog(peticion);

        return output;
    }

    public static int pideInt(String peticion) {
        int output;

        output = Integer.parseInt(JOptionPane.showInputDialog(peticion));

        return output;
    }

    public static double pideDouble(String peticion) {
        double output;

        output = Double.parseDouble(JOptionPane.showInputDialog(peticion));

        return output;
    }

    public static void mostrarPantalla(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }


}
