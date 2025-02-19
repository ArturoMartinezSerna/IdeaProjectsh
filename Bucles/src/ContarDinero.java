import javax.swing.*;

/*
 * Escribir un programa que solicite al usuario las distintas cantidades de dinero de las que dispone.
 *      ejemplo: La cantidad de dinero que tiene en el banco, en la hucha, en el cajon, y en los bolsillos
 *  Al final, mostrará la suma de todo el dinero que dispone.
 *  Para acabar, escribe -1
 */
public class ContarDinero {
    public static void main(String[] args) {
        boolean centinela = true;
        double total = 0;
        int contadorPersonas = 0;

        while(centinela) {
            try {
                total += pideDineroBancoHuchaCajonBolsillos();
                contadorPersonas++;
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "El total de lo que tiene en sus " + contadorPersonas + " bancos, huchas, cajones y bolsillos es de: " + total);
                JOptionPane.showMessageDialog(null, e.getMessage());
                centinela = false;
            }
        }
    }

    private static double pideDineroBancoHuchaCajonBolsillos() throws Exception {
        double banco, hucha, cajon, bolsillos;
        banco = pideDouble("Por favor, introduzca el dinero en su cuenta bancaria");
        hucha = pideDouble("Por favor, introduzca el dinero en su hucha");
        cajon = pideDouble("Por favor, introduzca el dinero en su cajon");
        bolsillos = pideDouble("Por favor, introduzca el dinero en sus bolsillos");
        if(banco == -1 || hucha == -1 || cajon == -1 || bolsillos == -1) {
            throw new Exception("Gracias por utilizar nuestra app!! =)");
        }
        return banco + hucha + cajon + bolsillos;
    }

    private static double pideDouble(String peticion) {
        double numero = 0;
        boolean centinela;

        do {
            centinela = false;
            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog(peticion));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, introduzca un número");
                centinela = true;
            }
        } while(centinela);
        return numero;
    }
}
