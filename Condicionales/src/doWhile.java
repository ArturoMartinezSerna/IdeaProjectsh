import javax.swing.*;

public class doWhile {

    public static void main(String[] args) {

        int numero1;
        int numero2;
        int opcion;
        String mensaje;

        do {
            opcion = muestraMenuPideOpcion(1, 7);
                switch (opcion) {
                    case 1 -> {
                        numero1 = pideInt("Por favor, ingrese el numero 1");
                        numero2 = pideInt("Por favor, ingrese el numero 2");
                        mensaje = getMensajeSuma(numero1, numero2);
                    }
                    case 2 ->{
                        numero1 = pideInt("Por favor, ingrese el numero 1");
                        numero2 = pideInt("Por favor, ingrese el numero 2");
                        mensaje = getMensajeResta(numero1, numero2);
                    }
                    case 3 -> {
                        numero1 = pideInt("Por favor, ingrese el numero 1");
                        numero2 = pideInt("Por favor, ingrese el numero 2");
                        mensaje = getMensajeMultiplicacion(numero1, numero2);
                    }
                    case 4 -> {
                        numero1 = pideInt("Por favor, ingrese el numero 1");
                        numero2 = pideInt("Por favor, ingrese el numero 2");
                        mensaje = getMensajeDivision(numero1, numero2);
                    }
                    case 5 ->{
                        numero1 = pideInt("Por favor, ingrese el numero 1");
                        numero2 = pideInt("Por favor, ingrese el numero 2");
                        mensaje = getMensajeModulo(numero1, numero2);
                    }
                    case 6 -> {
                        numero1 = pideInt("Por favor, ingrese el numero 1");
                        numero2 = pideInt("Por favor, ingrese el numero 2");
                        mensaje = getMensajeExponente(numero1, numero2);
                    }
                    case 7 -> mensaje = getMensajeDespedida();
                    default -> mensaje = "Ha ocurrido un error en el programa";
                    }
            JOptionPane.showMessageDialog(null, mensaje);
        } while(opcion != 7);


    }

    private static String getMensajeDespedida() {
        return getAdios();
    }

    private static String getAdios() {
        return "Adios";
    }

    private static String getMensajeExponente(int numero1, int numero2) {
        return "El resultado del exponente " + numero1 + " ^ " + numero2 + " = " + (Math.pow(numero1, numero2));
    }

    private static String getMensajeModulo(int numero1, int numero2) {
        return "El resultado del modulo " + numero1 + " % " + numero2 + " = " + (numero1 % numero2);
    }

    private static String getMensajeDivision(int numero1, int numero2) {
        return "El resultado de dividir " + numero1 + " / " + numero2 + " = " + (numero1 / numero2);
    }

    private static String getMensajeMultiplicacion(int numero1, int numero2) {
        return "El resultado de multiplicar " + numero1 + " * " + numero2 + " = " + (numero1 * numero2);
    }

    private static String getMensajeResta(int numero1, int numero2) {
        return "El resultado de restar " + numero1 + " - " + numero2 + " = " + (numero1 - numero2);
    }

    private static String getMensajeSuma(int numero1, int numero2) {
        return "El resultado de sumar " + numero1 + " + " + numero2 + " = " + (numero1 + numero2);
    }

    private static int pideInt(String mensaje) {
        boolean centinela;
        String numeroText;
        int numero = 0;

        do {
            centinela = false;
            numeroText = JOptionPane.showInputDialog(mensaje);
            try {
                numero = Integer.parseInt(numeroText);
            } catch(NumberFormatException e) {
                centinela = true;
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un numero entero");
            }
        }while(centinela);
        return numero;
    }

    private static int muestraMenuPideOpcion(int min, int max) {
        String opcionText;
        int opcion = 0;
        boolean centinela;
        do {
            opcionText = JOptionPane.showInputDialog(menuPrincipal());
            centinela = false;
            try {
                opcion = Integer.parseInt(opcionText);
                if (opcion < min || opcion > max) {
                    throw new Exception("Por favor, introduzca un número entre " + min + " y " + max);
                }
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un numero entero");
                centinela = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                centinela = true;
            }
        } while(centinela);
        return opcion;
    }

    private static String menuPrincipal() {
        return ("Indique una opcion de la operacion \n[1] Sumar\n [2] Restar\n [3] Multiplicar\n [4] Dividir\n [5] Modulo\n [6]Exponente\n[7] Salir");
    }
}
