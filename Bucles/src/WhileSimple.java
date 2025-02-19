import javax.swing.*;

public class WhileSimple {
    public static void main(String[] args) {
        int i = 1;
        int cuentaAtras;
        while (i <= 3) {
            System.out.println("El valor de i es: " + i);
            i++;
        }

        cuentaAtras = 10;
        while(cuentaAtras >= 0) {
            System.out.println("El valor de cuentaAtras es: " + cuentaAtras);
            cuentaAtras--;
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
