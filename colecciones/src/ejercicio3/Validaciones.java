package ejercicio3;

import javax.swing.*;

public class Validaciones {

    public static boolean isNumeroValido(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, introduzca un número entero.");
            return false;
        }
    }


}
