package nomina;

import javax.swing.*;

public class Utilidades {

    public static String pideString(String peticion) {
        return JOptionPane.showInputDialog(null, peticion);
    }

    public static int pideInt(String peticion) {
        return Integer.parseInt(pideString(peticion));
    }
}
