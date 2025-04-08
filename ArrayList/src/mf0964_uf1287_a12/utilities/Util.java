package mf0964_uf1287_a12.utilities;

import javax.swing.*;

public class Util {

    public static int pideInt(String peticion) {
        int valor;
        boolean introduccionIncorrecta;

        do {
            introduccionIncorrecta = false;
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog(null, peticion));
            } catch (NumberFormatException e) {
                introduccionIncorrecta = true;
                JOptionPane.showMessageDialog(null, "Por favor, introduzca un número entero");
                valor = 0;
            }
        } while (introduccionIncorrecta);
        return valor;
    }


    public static boolean isFormatoDni(String dni) {
        if(dni.length() != 9)
            return false;
        for(int i = 0; i <= dni.length() - 2; i++) {
            if(!Character.isDigit(dni.charAt(i)))
                return false;
        }
        if(!Character.isLetter(dni.charAt(dni.length() - 1)))
            return false;

        return true;
    }

    public static boolean isLetraDni(String dni) {
        String letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = dni.charAt(dni.length() - 1);
        int numeroDni = Integer.parseInt(dni.substring(0, dni.length() - 1));

        return letrasValidas.charAt(numeroDni % 23) == letra;
    }


    public static boolean isFormatoMovil(String movil) {
        for(int i = 0; i < movil.length(); i++) {
            if(!Character.isDigit(movil.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEdadValida(int edad) {
        return edad >= 18 && edad <= 65;
    }

    public static boolean isEmailValido(String email, String confirmacion) {
        System.out.println(confirmacion.equals(email));
        return email.equals(confirmacion);
    }
}
