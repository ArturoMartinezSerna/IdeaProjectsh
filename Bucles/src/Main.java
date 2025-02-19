import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int numero1, numero2;
        String numero1Text, numero2Text;
        String mensaje = "";

        numero1Text = JOptionPane.showInputDialog("Introduzca el primer numero ");

        numero2Text = JOptionPane.showInputDialog("Introduzca el segundo numero ");

        try {
            numero1 = Integer.parseInt(numero1Text);
            numero2 = Integer.parseInt(numero2Text);
        } catch (NumberFormatException e) {
            mensaje = "Por favor, introduzca sólo números";
            numero1 = 0;
            numero2 = 0;
        }
        if(mensaje.equals("")) {
            String opcion = JOptionPane.showInputDialog("Introduzca la opcion:" +
                    "\n[1]-> Math.max" +
                    "\n[2]-> Math.min" +
                    "\n[3]-> Math.sqrt \n" +
                    "[4]-> Math.pow()\n" +
                    "[5]-> Math.abs \n" +
                    "[6]-> Math.random) \n" +
                    "[0]-> Finalizar");
                switch (opcion) {
                    case "1" ->
                            mensaje = "Math.max(" + numero1Text + ", " + numero2Text + ") = " + Math.max(numero1, numero2);
                    case "2" ->
                            mensaje = "Math.min(" + numero1Text + ", " + numero2Text + ") = " + Math.min(numero1, numero2);
                    case "3" -> mensaje = "Math.sqrt(" + numero1Text + ")=" + Math.sqrt(numero1)
                            + "\nMath.sqrt(" + numero2Text + ")=" + Math.sqrt(numero2);
                    case "4" ->
                            mensaje = "Math.pow(" + numero1Text + ", " + numero2Text + ")=" + Math.pow(numero1, numero2);
                    case "5" -> mensaje = "Math.abs(" + numero1Text + ")=" + Math.abs(numero1)
                            + "\nMath.abs(" + numero2Text + ")=" + Math.abs(numero2);
                    case "6" -> mensaje = "Math.random=" + (int) (Math.random() * 100);
                    case "0" -> mensaje = "Gracias por utilizar nuestra app!";
                    default -> mensaje = "Opcion no valida";
                }

            JOptionPane.showMessageDialog(null, mensaje);
        }

    }

    private static int pideOpcion(int minimo, int maximo) {
        String numeroText;
        int numero = 0;
        boolean centinela;

        do {
            centinela = false;
            try {
                numeroText = JOptionPane.showInputDialog("Introduzca la opción:");
                numero = Integer.parseInt(numeroText);
                if(numero < minimo || numero > maximo) {
                    throw new Exception("Por favor, introduzca un número entre " + minimo + " y " + maximo);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, introduzca un número");
                centinela = true;
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                centinela = true;
            }
        } while(centinela);
        return numero;
    }
}