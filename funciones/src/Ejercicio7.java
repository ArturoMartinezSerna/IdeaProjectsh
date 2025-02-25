import javax.swing.*;
import java.util.Scanner;

public class Ejercicio7 {

    /* *
     * Crea una calculadora + - * / donde la funcion operación recibirá
     * los números y la operación a realizar, y muestre el resultado
     *
     * Crea otra función para el menú
     *
     */

    public static void main(String[] args) {

        ejecutaCalculadora();

    }

    private static void ejecutaCalculadora() {

        int opcion;
        char operacion;
        double resultado;
        double numero1, numero2;

        do {
            opcion = mostrarMenu();
            if(opcion != 0) {
                operacion = getOperador(opcion);
                numero1 = pideIntJOption("Introduzca el primer número de la operación");
                numero2 = pideIntJOption("Introduzca el segundo número de la operación");

                resultado = operacion(numero1, operacion, numero2);
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
            }
        } while(opcion != 0);

        JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa");
    }

        private static int mostrarMenu() {
            final String menu = "Ingrese una opcion: ->\n1 -> Sumar\n2 -> Restar\n3 -> Multiplicar\n4 -> Dividir\n0 -> Salir";

            return pideIntJOption(menu, 0, 4);
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

        private static char getOperador(int opcion) {
            switch (opcion) {
                case 1: return '+';
                case 2: return '-';
                case 3: return '*';
                case 4: return '/';
                default: return '0';
            }
        }

        private static double operacion(double a, char operacion, double b) {
            double resultado;

            switch (operacion) {
                case '+': resultado = a + b;
                break;
                case '-': resultado = a - b;
                break;
                case '*': resultado = a * b;
                break;
                case '/': resultado = a / b;
                break;
                default: resultado = 0;
                break;
            }
            return resultado;
        }






}
