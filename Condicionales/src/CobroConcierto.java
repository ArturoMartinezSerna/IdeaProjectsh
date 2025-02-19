import javax.swing.*;
import java.util.Scanner;

public class CobroConcierto {

    public static void main(String[] args) {
        /*
         * Salida por pantalla de otra manera
         */
        String mensaje = JOptionPane.showInputDialog("Ingrese el mensaje");
        System.out.println(mensaje);
        int aforo;
        double precio;
        int entradasVendidas;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de aforo: ");
        aforo = entrada.nextInt();
        System.out.println("Ingrese el valor de precio: ");
        precio = entrada.nextDouble();
        System.out.println("Ingrese el numero de entradas vendidas: ");
        entradasVendidas = entrada.nextInt();

        if(entradasVendidas < (aforo*2 / 10)) {
            System.out.println("El concierto se cancela");
        }
        else {
            if(entradasVendidas < (aforo / 2)) {
                System.out.println("Entradas a 25% de descuento de precio");
                precio *= 0.75;
            }
            System.out.println("Se recaudan " + (precio * entradasVendidas) + " €");
        }

    }

}
