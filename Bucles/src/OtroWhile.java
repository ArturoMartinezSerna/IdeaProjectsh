import javax.swing.*;

/*
 * Diseña un programa que por cada número ingresado por el usuario indique si es par, si es positivo, y su cuadrado. Para salir del programa, el usuario debe ingresar 0.
 */
public class OtroWhile {
    public static void main(String[] args) {
        String numT;
        boolean par, positivo;
        double num = 0;
        String mensaje = "";
        double cuadrado;

        numT = JOptionPane.showInputDialog("Introduzca un numero");

        try {
            num = Double.parseDouble(numT); // pasamos el numero a double
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El número no es válido");
            JOptionPane.showMessageDialog(null, "Cya!");

        }

        while(num != 0) {
            par = num % 2 == 0;
            positivo = num >= 0;
            cuadrado = Math.pow(num, 2);
            // Mostramos el resultado
            mensaje = "¿Es par? " + (par ? "SI" : "NO") +
                    "\n¿Es positivo? " + (positivo ? "SI" : "NO") +
                    "\nEl cuadrado es: " + cuadrado;
            JOptionPane.showMessageDialog(null, mensaje);
            numT = JOptionPane.showInputDialog("Introduzca un numero");
            try {
                num = Double.parseDouble(numT); // pasamos el numero a double
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El número no es válido");
                JOptionPane.showMessageDialog(null, "Cya!");
                num = 0;
            }
        }
    }
}
