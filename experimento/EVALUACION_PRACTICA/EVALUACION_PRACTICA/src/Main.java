import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
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
        int opcion;
        double resultado = 0;
        do {
            calculadora.mostrarMenu();
            opcion = Validaciones.pideInt(MENU_PRINCIPAL);

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
                    JOptionPane.showMessageDialog(null, "Por favor, introduzca un número entre 0 y 6"); break;
            }
        } while(opcion != 0);

    }
}