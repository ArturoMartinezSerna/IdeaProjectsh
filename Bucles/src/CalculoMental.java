/*
 * Desarrollar un juego que ayude a mejorar el cálculo mental de la suma.
 * El jugador tendrá que introducir la solución de la suma de dos números
 * aleatorios comprendidos entre el 1 al 100.
 * Mientras la respuesta sea correcta, el juego continuará, e irá contando cuántas
 * respuestas correctas lleva el jugador.
 * Al escribir una errónea, se saldrá del juego, y mostrará el número de respuestas
 * correctas.
 *
 */

import javax.swing.*;
import java.util.InputMismatchException;

public class CalculoMental {
    public static void main(String[] args) {
        int numCorrectas = 0;
        int num1, num2, operando;
        double resultado;
        boolean isRespuestaCorrecta;

        do {
            num1 = (int)(Math.random()*100 + 1);
            num2 = (int)(Math.random()*100 + 1);
            operando = (int)(Math.random()*2 + 1);

            resultado = calculaResultado(num1, num2, operando);

            isRespuestaCorrecta = resultado == pideDouble(getEnunciado(num1, num2, operando));
            if(isRespuestaCorrecta)
                numCorrectas++;
        } while(isRespuestaCorrecta);

        JOptionPane.showMessageDialog(null, getRespondidasCorrectas(numCorrectas));

    }

    private static double calculaResultado(double num1, double num2, int operando) {
        switch(operando) {
            case 1: return num1 + num2;
            case 2: return num1 - num2;
            case 3: return num1 * num2;
            case 4: return num1 / num2;
            case 5: return num2 % num2;
            case 6: return Math.pow(num1, num2);
            default: {
                System.out.println("Error");
                return 0;
            }
        }
    }

    private static String getEnunciado(double num1, double num2, int operando) {
        final String PETICION = "Introduzca el resultado de: ";
        char signo;

        signo = convierteOperando(operando);

        return PETICION + num1 + " " + signo + " " + num2;
    }
        private static char convierteOperando(int operando) {
            switch(operando) {
                case 1: return '+';
                case 2: return '-';
                case 3: return '*';
                case 4: return '/';
                case 5: return '%';
                case 6: return '^';
                default: return '?';
            }
        }

    private static double pideDouble(String mensaje) {
        String numeroText;
        boolean centinela;
        double numero = 0;

        do {
            centinela = false;
            numeroText = JOptionPane.showInputDialog(mensaje);
            try {
                numero = Double.parseDouble(numeroText);
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Por favor, introduzca un número doble");
                centinela = true;
            }
        } while(centinela);

        return numero;
    }

    private static String getRespondidasCorrectas(int respondidasCorrectas) {
        return "El número de respuestas correctas fue de: " + respondidasCorrectas;
    }
}