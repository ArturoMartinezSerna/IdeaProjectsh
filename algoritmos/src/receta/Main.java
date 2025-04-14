package receta;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nombreCarne;
        int cantidadCarne;
        int tipoCoccion;

        nombreCarne = pideTipoCarne();
        cantidadCarne = Utilidades.pideNumero("Introduzca la cantidad de carne a cocinar:");
        tipoCoccion = pideTipoCoccion();

        

    }

    private static String pideTipoCarne() {
        String tipoCarne;
        tipoCarne = JOptionPane.showInputDialog(null, "Introduzca el tipo de carne:");
        return tipoCarne;
    }
    private static int pideTipoCoccion() {
        String tipoCoccion;
        tipoCoccion = JOptionPane.showInputDialog(null, "Introduzca el tipo de coccion:");
        return Integer.parseInt(tipoCoccion);
    }
}
