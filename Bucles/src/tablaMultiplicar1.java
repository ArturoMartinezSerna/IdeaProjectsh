import javax.swing.*;
import java.sql.SQLOutput;

public class tablaMultiplicar1 {
    /*
     * Pedir un número entre 1 y 10, y mostrar por pantalla la tabla de multiplicar de ese número.
     * Asegurarse de que el número pedido está comprendido entre 1 y 10. Si no está en ese rango, solicitarlo de nuevo
     */
    public static void main(String[] args) {
        int numero;
        String output = "";
        final int MINIMO = 1, MAXIMO = 10;
        numero = pideInt("Por favor, introduzca un número del que crear la tabla. (del 1 al 10)", MINIMO, MAXIMO);
        for(int i = 1; i <= 10; i++) {
            output = output + numero + " * " + i + " = " + (numero*i) + "\n";
        }
        JOptionPane.showMessageDialog(null, output);

        /*
         * SALIDAS ANTICIPADAS
         *
         * 1.- Interrumpir el bucle -> break
         * 2.- Saltar la iteracion actual, y continua el bucle -> continue
         */
        System.out.println("SALIDAS ANTICIPADAS");
        for(int i = 1; i <= 10; i++) {
            if(i == 6) {
                // break; acaba en 5
                continue; // salta el 6
            }
            System.out.print(numero + " * " + i + " = " + (numero*i) + "\n");

        }
    }

    private static int pideInt(String mensaje, int minimo, int maximo) {
        String edadText;
        int numero = 0;
        boolean centinela;
        do {
            centinela = false;
            try {
                edadText = JOptionPane.showInputDialog(null, mensaje);
                numero = Integer.parseInt(edadText);
                if(numero < minimo || numero > maximo)
                    throw new Exception("Por favor, introduzca un número entre " + minimo + " y " + maximo);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un numero entero");
                centinela = true;
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
                centinela = true;
            }
        } while(centinela);
        return numero;
    }
}
