import javax.swing.*;

public class TareaFunciones {
    /*
     * 1-> Implementa una funcion convertirMoneda() que reciba una cantidad de dólares Canadienses o americanos y la convierta a euros
     * 2-> Implementa una función convertirGradosCelsius() que reciba en ºF y los convierta a grados Celsius
     * 3-> Implementa una función pasarAMilimetros() donde recibas en metros, centimetros y los conviertas a milimetros
     * 4-> Sabemos que las personas americanas se pesan en libras. Indica el peso en libras y conviértelo en kilogramos
     * 5-> Indica el tiempo que falta para llegar a su destino, tomando en cuenta el tipo de vía en que transita
     *     (autovía o carretera nacional) y los kilómetros desde el punto en el que se encuentra.
     * 6-> Indica los segundos, y conviértelo en días, horas, minutos y segundos
     */
    public static void main(String[] args) {

        run();

    }

    private static void run() {
        int opcion;

        // Repite el menú principal
        do {
            opcion = mostrarMenu();

            // Ejecuta el programa según la opción
            if(opcion != 0) {
                switch (opcion) {
                    case 1 -> convertirMoneda();
                    case 2 -> convertirGradosCelsius(pideIntJOption("Ingrese el número de grados Celsius:"));
                    case 3 -> pasarAMilimetros();
                    case 4 -> convertirLibrasAKilogramos();
                    case 5 -> calculaTiempoLlegada();
                    case 6 -> convierteSegundosADiasHorasMinutosSegundos();
                }
            }
        } while(opcion != 0);
        mostrarDespedida();
    }

    private static int mostrarMenu() {
        final int OPCION_MINIMA = 0;
        final int OPCION_MAXIMA = 6;
        final String menu = "Ingrese una opcion: ->\n1 -> Sumar\n2 -> Restar\n3 -> Multiplicar\n4 -> Dividir\n0 -> Salir";

        return pideIntJOption(menu, OPCION_MINIMA, OPCION_MAXIMA);
    }
    private static int pideIntJOption(String peticion, int min, int max) {
        int numero;
        boolean centinela;
        do {
            centinela = false;
            try {
                numero = pideIntJOption(peticion);

                if(numero < min || numero > max) {
                    throw new Exception("Por favor, ingrese un número entero entre " + min + " y " + max);
                }
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                numero = 0;
                centinela = true;
            }
        } while(centinela);

        return numero;
    }

    private static int pideIntJOption(String peticion) {
        String numeroTemporal;
        int numero;
        boolean centinela;

        do {
            centinela = false;
            try {
                numeroTemporal = JOptionPane.showInputDialog(null, peticion);
                numero = Integer.parseInt(numeroTemporal);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR: Ingresa un numero entero.\nInténtelo de nuevo");
                centinela = true;
                numero = 0;
            }
        }while (centinela) ;

        return numero;
    }

    private static double pideDoubleJOption(String peticion) {
        String numeroTemporal;
        double numero;
        boolean centinela;

        do {
            centinela = false;
            try {
                numeroTemporal = JOptionPane.showInputDialog(null, peticion);
                numero = Double.parseDouble(numeroTemporal);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR: Ingresa un numero doble.\nInténtelo de nuevo");
                centinela = true;
                numero = 0;
            }
        }while (centinela) ;

        return numero;
    }

    /*
     * 1-> Implementa una funcion convertirMoneda() que reciba una cantidad de dólares Canadienses o americanos y la convierta a euros
     */
    private static void convertirMoneda() {
        double dolares;
        boolean esDolarCanadiense;
        Object mensaje = ["Canadiense", "Americano"];
        //esDolarCanadiense = JOptionPane.showOptionDialog(null, mensaje, ) == 0 ? true : false;
    }

    /*
     * 2-> Implementa una función convertirGradosCelsius() que reciba en ºF y los convierta a grados Celsius
     */
    private static int convertirGradosCelsius(int farenheirt) {

        return 0;
    }

    /*
     * 3-> Implementa una función pasarAMilimetros() donde recibas en metros, centimetros y los conviertas a milimetros
     */
    private static void pasarAMilimetros() {
    }

    /*
     * 4-> Sabemos que las personas americanas se pesan en libras. Indica el peso en libras y conviértelo en kilogramos
     */
    private static void convertirLibrasAKilogramos() {
    }

    /*
     *  5-> Indica el tiempo que falta para llegar a su destino, tomando en cuenta el tipo de vía en que transita
     *     (autovía o carretera nacional) y los kilómetros desde el punto en el que se encuentra.
     */
    private static void calculaTiempoLlegada() {
    }

    /*
     * 6-> Indica los segundos, y conviértelo en días, horas, minutos y segundos
     */
    private static void convierteSegundosADiasHorasMinutosSegundos() {
    }

    private static void mostrarDespedida() {
        JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa");
    }
}
