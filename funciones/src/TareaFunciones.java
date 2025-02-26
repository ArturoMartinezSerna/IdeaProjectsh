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
                    case 2 -> convertirGradosCelsius(pideIntJOption("Ingrese el número de grados Farenheit a convertir:"));
                    case 3 -> pasarAMilimetros(pideIntJOption("Ingrese el número de metros a convertir:"), pideIntJOption("Ingrese el número de centimetros a convertir:"));
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
        final String menu = "Ingrese una opcion: ->\n1 -> Convertir moneda\n2 -> Convertir grados Farenheit a celsius\n3 -> Pasar metros y centimetros a milimetros\n4 -> Convertir libras a kilogramos\n5-> Calcula el tiempo de llegada restante\n6-> Convierte segundos a dias, horas, minutos y segundos\n0 -> Salir";

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
        double euros;
        boolean esDolarCanadiense;
        Object mensaje[] = {"Canadiense", "Americano"};

        dolares = pideDoubleJOption("Introduzca la cantidad de dólares a convertir a euro:");
        esDolarCanadiense = JOptionPane.showConfirmDialog(null , "¿El dolar recibido es canadiense?") == 0;

        if(esDolarCanadiense)
            euros = dolares * 0.70*0.95;
        else
            euros = dolares*0.95;
        euros = (double)((int)(euros*100))/100;
        JOptionPane.showMessageDialog(null, "La cantidad de " + dolares + " dolares convertidos a euro es: " + euros);
    }

    /*
     * 2-> Implementa una función convertirGradosCelsius() que reciba en ºF y los convierta a grados Celsius
     */
    private static void convertirGradosCelsius(int farenheit) {
        double celsius = (farenheit - 32)*0.555;

        JOptionPane.showMessageDialog(null, "El equivalente a " + farenheit + " grados farenheit es: " + celsius + "ºC");
    }

    /*
     * 3-> Implementa una función pasarAMilimetros() donde recibas en metros, centimetros y los conviertas a milimetros
     */
    private static void pasarAMilimetros(int metros, int centimetros) {
        final String respuesta = "El equivalente a " + metros + " metros y " + centimetros + " centimetros es: " + (metros*1000+centimetros*100) + "mm";
        JOptionPane.showMessageDialog(null, respuesta);
    }

    /*
     * 4-> Sabemos que las personas americanas se pesan en libras. Indica el peso en libras y conviértelo en kilogramos
     */
    private static void convertirLibrasAKilogramos() {
        double libras;
        double kilogramos;

        libras = pideDoubleJOption("Introduzca el peso de la persona en libras:");
        kilogramos = libras * 0.453592;
        JOptionPane.showMessageDialog(null ,libras + " libras equivalen a: " + kilogramos + " kilogramos");
    }

    /*
     *  5-> Indica el tiempo que falta para llegar a su destino, tomando en cuenta el tipo de vía en que transita
     *     (autovía o carretera nacional) y los kilómetros desde el punto en el que se encuentra.
     */
    private static void calculaTiempoLlegada() {
        double kilometros;
        boolean esAutovia;
        int velocidad;
        int segundosRestantes;

        kilometros = pideDoubleJOption("Indique la cantidad de kilómetros hasta llegar a su destino:");
        esAutovia = JOptionPane.showConfirmDialog(null, "¿Está yendo usted por autovía?") == 0;
        velocidad = esAutovia ? 120 : 90;

        segundosRestantes = (int)(kilometros / velocidad * 3600);

        JOptionPane.showMessageDialog(null ,segundosRestantes/3600 + " horas" + (segundosRestantes%3600)/60 + " minutos" + (segundosRestantes%60) + " segundos");
    }

    /*
     * 6-> Indica los segundos, y conviértelo en días, horas, minutos y segundos
     */
    private static void convierteSegundosADiasHorasMinutosSegundos() {
        int segundos, dias, horas, minutos;

        segundos = pideIntJOption("Introduzca el número de segundos a convertir en Dias, horas, minutos y segundos");
        dias = segundos/(24*3600);
        segundos %= 24*3600;
        horas = segundos/3600;
        segundos %= 3600;
        minutos = segundos/60;
        segundos %= 60;

        JOptionPane.showMessageDialog(null , "Los segundos introducidos equivalen a: " + dias + " dias, " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }

    private static void mostrarDespedida() {
        JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa");
    }
}
