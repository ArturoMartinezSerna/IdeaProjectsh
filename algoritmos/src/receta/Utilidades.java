package receta;

import javax.swing.*;

public class Utilidades {
    public static int pideNumero(String peticion) {
        String numeroTexto;
        int numero;

        numeroTexto = JOptionPane.showInputDialog(null, peticion);
        numero = Integer.parseInt(numeroTexto);

        return numero;
    }
}
