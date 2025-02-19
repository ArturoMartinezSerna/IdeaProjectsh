import javax.swing.*;

public class Ejemplo2For {
    /*
     * Solicita 10 números enteros por pantalla y calcula la media
     */

    public static void main(String[] args) {
        double media;
        final int ITERACIONES = 10;
        int suma = 0;
        for(int i = 0; i < ITERACIONES; i++) {
            suma += pideInt("Por favor, introduzca el " + (i+1) + " número:");
        }
        media = (double)suma / ITERACIONES;
        JOptionPane.showMessageDialog(null, "La media de las " + ITERACIONES + " números es " + media);

    }

    private static int pideInt(String mensaje) {
        String edadText;
        int edad = 0;
        boolean centinela;
        do {
            centinela = false;
            try {
                edadText = JOptionPane.showInputDialog(null, mensaje);
                edad = Integer.parseInt(edadText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un numero entero");
                centinela = true;
            }
        } while(centinela);
        return edad;
    }
}
