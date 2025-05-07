package util;

import objetos.Refresco;

import javax.swing.*;

public class Utilidades {

    // Pide por pantalla un número entero hasta que se introduzca un número entero
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

    // Pide por pantalla un número double hasta que se introduzca un número double
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

    // Muestra el texto por pantalla con una ventana emergente nueva
    public static void MostrarPorPantalla(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    // Formatea, redondeando, el número introducido a dos decimales
    public static double formatearNumero(double numero) {
        return (int)(Math.round((numero)*100)) / 100.0;
    }

}
