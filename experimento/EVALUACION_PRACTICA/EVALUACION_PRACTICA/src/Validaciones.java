import javax.swing.*;

public class Validaciones {
    public static int pideInt(String mensaje) {
        int numero = 0;
        boolean isNumeroValido = false;
        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                isNumeroValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, introduzca un número");
            }
        } while(!isNumeroValido);
        return numero;
    }

    public static double pideDouble(String mensaje) {
        double numero = 0;
        boolean isNumeroValido = false;
        do {
            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
                isNumeroValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, introduzca un número");
            }
        } while(!isNumeroValido);
        return numero;
    }
}
