package util;

import objetos.Refresco;

import javax.swing.*;

public class Utilidades {

    public static String pideString(String texto) {
        String output;

        output = JOptionPane.showInputDialog(texto);

        return output;
    }

    public static int pideInt(String texto) {
        int output = 0;
        boolean introduccionCorrecta;

        do {
            try {
                introduccionCorrecta = true;
                output = Integer.parseInt(JOptionPane.showInputDialog(texto));
            } catch(NumberFormatException e) {
                introduccionCorrecta = false;
                MostrarPorPantalla("Por favor, introduzca un número entero");
            }
        } while(!introduccionCorrecta);
        return output;
    }

    public static double pideDouble(String texto) {
        double output = 0;
        boolean introduccionCorrecta;

        do {
            try {
                introduccionCorrecta = true;
                output = Double.parseDouble(JOptionPane.showInputDialog(texto));
            } catch(NumberFormatException e) {
                introduccionCorrecta = false;
                MostrarPorPantalla("Por favor, introduzca un número entero");
            }
        } while(!introduccionCorrecta);
        return output;
    }

    public static void MostrarPorPantalla(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public static double formatearNumero(double numero) {
        return (int)(Math.round((numero)*100)) / 100.0;
    }

//    public static Refresco pideRefresco() {
//        Refresco[] valoresEnum = Refresco.values();
//        int refrescoSeleccionado;
//
//        refrescoSeleccionado = JOptionPane.showOptionDialog(null, "Introduzca el refresco", "Seleccionando refresco", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, valoresEnum, valoresEnum[0]);
//
//        return valoresEnum[refrescoSeleccionado];
//    }
}
