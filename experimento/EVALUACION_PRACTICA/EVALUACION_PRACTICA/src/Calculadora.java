import javax.swing.*;

public class Calculadora {
    final String MENU_PRINCIPAL = """
                **** CALCULADORA ****
                1.- Suma
                2.- Resta
                3.- Multiplicar
                4.- Dividir
                5.- Resto
                6.- Exponencial
                0.- Salir
                
                Seleccione una opción:
                """;
    double resultado; // Esta variable guarda el resultado que pone en la calculadora

    public Calculadora() {
        resultado = 0;
    }

    // Muestra el menú de opciones de la calculadora y devuelve la opción que representa la operacion realizada
    public int mostrarMenu() {
        return Validaciones.pideInt("El resultado actual es: " + resultado + "\n\n" + MENU_PRINCIPAL);
    }

    // Ejecuta la suma de la calculadora
    public void suma() {
        double numero = Validaciones.pideDouble("Introduce el número a sumar:"); // Pedimos el número

        JOptionPane.showMessageDialog(null, resultado + " + " + numero + " = " + (resultado + numero)); // Mostramos el resultado de la operacion
        resultado += numero; // Modificamos el resultado que se guarda en la calculadora
    }

    // Ejecuta la resta de la calculadora
    public void resta() {
        double numero = Validaciones.pideDouble("Introduce el número a restar:"); // Pedimos el número

        JOptionPane.showMessageDialog(null, resultado + " - " + numero + " = " + (resultado - numero)); // Mostramos el resultado de la operacion
        resultado -= numero; // Modificamos el resultado que se guarda en la calculadora
    }

    // Ejecuta la multiplicacion de la calculadora
    public void multiplicacion() {
        double numero = Validaciones.pideDouble("Introduce el número a multiplicar:"); // Pedimos el número

        JOptionPane.showMessageDialog(null, resultado + " * " + numero + " = " + (resultado * numero)); // Mostramos el resultado de la operacion
        resultado *= numero; // Modificamos el resultado que se guarda en la calculadora
    }

    // Ejecuta la division de la calculadora
    public void division() {
        double numero = Validaciones.pideDoubleNoEsCero("Introduce el número por el que dividir:"); // Pedimos el número

        JOptionPane.showMessageDialog(null, resultado + " / " + numero + " = " + (resultado / numero)); // Mostramos el resultado de la operacion
        resultado /= numero; // Modificamos el resultado que se guarda en la calculadora
    }

    // Ejecuta el resto en la calculadora
    public void resto() {
        double numero = Validaciones.pideDouble("Introduce el número por el que dividir " + resultado + " para calcular el resto:"); // Pedimos el número

        JOptionPane.showMessageDialog(null, resultado + " % " + numero + " = " + (resultado % numero)); // Mostramos el resultado de la operacion
        resultado %= numero; // Modificamos el resultado que se guarda en la calculadora
    }

    // Ejecuta la funcion exponencial de la calculadora
    public void exponencial() {
        double numero = Validaciones.pideDouble("Introduce el número por el que elevar " + resultado + ":"); // Pedimos el número

        double elevacionTemporal = resultado == 0 ? 0: 1; // Si la base es 0, el resultado será cero. Si no, un número elevado a 0 es 1.

        for(int i = 0; i < numero; i++) {
            elevacionTemporal *= resultado;
        }
        JOptionPane.showMessageDialog(null, resultado + " ^ " + numero + " = " + (elevacionTemporal)); // Mostramos el resultado de la operacion
        resultado = elevacionTemporal; // Modificamos el resultado que se guarda en la calculadora
    }

    // Muestra una despedida básica en una nueva ventana
    public void mostrarDespedida() {
        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestra calculadora");
    }
}
