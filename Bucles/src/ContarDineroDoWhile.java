import javax.swing.*;

public class ContarDineroDoWhile {
    public static void main(String[] args) {
        double dinero = 0;
        String mensaje = "";
        String bolsa;
        double total = 0;

        do {
            bolsa = JOptionPane.showInputDialog("Ingrese el dinero que tiene");
            try {
                dinero = Double.parseDouble(bolsa);
                if(dinero >= 0)
                    total += dinero;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El dinero no es valido");
            }
        } while(dinero != -1);
        JOptionPane.showMessageDialog(null, "El total de dinero que tienes es " + total + "€");
    }
}
