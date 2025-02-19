import javax.swing.*;

public class AdivinaElNumero {
    public static void main(String[] args) {
        int numeroSecreto = (int)(Math.random()*10);
        String numero = JOptionPane.showInputDialog("Introduzca un número");
        int numeroUser;
        int numeroIntentos = 0;

        try {
            numeroUser = Integer.parseInt(numero);
            numeroIntentos++;
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El numero no es valido");
            numeroUser = -1;
        }
        while(numeroUser != numeroSecreto && numeroUser != -1) {
            if(numeroUser > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "El numero secreto es menor");
            }
            else {
                JOptionPane.showMessageDialog(null, "El numero secreto es mayor");
            }
            try {
                numero = JOptionPane.showInputDialog("Intento " + numeroIntentos + " Introduzca un número");
                numeroUser = Integer.parseInt(numero);
                numeroIntentos++;
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El numero no es valido");
                numeroUser = -1;
            }
        }

        if(numeroUser == numeroSecreto) {
            JOptionPane.showMessageDialog(null, "Felicidades! Has ganado!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Te rendiste! Gané yo!");
        }
    }
}
