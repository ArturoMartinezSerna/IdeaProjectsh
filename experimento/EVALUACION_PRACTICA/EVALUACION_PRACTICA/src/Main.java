import javax.swing.*;

public class Main {

    static Calculadora calculadora;

    public static void main(String[] args) {
        calculadora = new Calculadora();
        int opcion;

        // Repite mientras la opcion no sea 0
        do {
            // Muestra el menú y devuelve la opción seleccionada
            opcion = calculadora.mostrarMenu();

            // Ejecuta el menú
            ejecutaMenu(opcion);
        } while(opcion != 0);
    }

    private static void ejecutaMenu(int opcion) {
        switch (opcion) {
            case 1: calculadora.suma();
                break;
            case 2: calculadora.resta();
                break;
            case 3: calculadora.multiplicacion();
                break;
            case 4: calculadora.division();
                break;
            case 5: calculadora.resto();
                break;
            case 6: calculadora.exponencial();
                break;
            case 0: calculadora.mostrarDespedida();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Por favor, introduzca un número entre 0 y 6");
        }
    }
}