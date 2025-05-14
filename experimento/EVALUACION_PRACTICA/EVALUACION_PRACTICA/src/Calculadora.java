import javax.swing.*;

public class Calculadora {

    public Calculadora() {
    }

    public void mostrarMenu() {

    }

    public double suma() {
        double numero1 = Validaciones.pideDouble("Introduce el primer número:");
        double numero2 = Validaciones.pideDouble("Introduce el segundo número:");

        JOptionPane.showMessageDialog(null, numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        return numero1 + numero2;
    }

    public double resta() {
        double numero1 = Validaciones.pideDouble("Introduce el primer número:");
        double numero2 = Validaciones.pideDouble("Introduce el segundo número:");

        JOptionPane.showMessageDialog(null, numero1 + " - " + numero2 + " = " + (numero1 - numero2));
        return numero1 - numero2;
    }

    public double multiplicacion() {
        double numero1 = Validaciones.pideDouble("Introduce el primer número:");
        double numero2 = Validaciones.pideDouble("Introduce el segundo número:");

        JOptionPane.showMessageDialog(null, numero1 + " * " + numero2 + " = " + (numero1 * numero2));
        return numero1 * numero2;
    }

    public double division() {
        double numero1 = Validaciones.pideDouble("Introduce el primer número:");
        double numero2 = Validaciones.pideDouble("Introduce el segundo número:");

        JOptionPane.showMessageDialog(null, numero1 + " / " + numero2 + " = " + (numero1 / numero2));
        return numero1 / numero2;
    }

    public double resto() {
        double numero1 = Validaciones.pideDouble("Introduce el primer número:");
        double numero2 = Validaciones.pideDouble("Introduce el segundo número:");

        JOptionPane.showMessageDialog(null, numero1 + " % " + numero2 + " = " + (numero1 % numero2));
        return numero1 % numero2;
    }

    public double exponencial() {
        double numero1 = Validaciones.pideDouble("Introduce el primer número:");
        double numero2 = Validaciones.pideDouble("Introduce el segundo número:");


        double resultado = numero1 == 0 ? 0: 1;

        for(int i = 0; i < numero2; i++) {
            resultado *= numero1;
        }



        JOptionPane.showMessageDialog(null, numero1 + " ^ " + numero2 + " = " + (resultado));
        return resultado;
    }

    public void mostrarDespedida() {
        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestra calculadora");
    }
}
