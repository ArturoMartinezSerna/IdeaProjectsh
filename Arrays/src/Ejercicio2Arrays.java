/*
 * Hacemos una tabla de 20 palabras aleatorias que me invento
 */

import javax.swing.*;
import java.util.Arrays;

public class Ejercicio2Arrays {

    public static void main(String[] args) {

        juego(palabrasCreadas());

    }



    private static String[] palabrasCreadas() {
        String[] palabras = {"Tractor", "bombilla", "cigüeña", "botón", "mesa", "esquiador", "gorila", "barco", "ciclista", "botella", "baúl", "toro", "reloj", "alfombra", "nube", "puerta", "roca", "mar", "pelota"};
        return palabras;
    }

    /*
     * Creamos un juego que seleccione aleatoriamente una de las palabras.
     * Te preguntará cual es tu palabra, y te dará 3 oportunidades.
     * Si no aciertas, sale del juego
     */
    private static void juego(String[] palabras) {
        int vidasRestantes = 3;
        int indice = (int) (Math.random() * palabras.length);
        String palabraFinal = palabras[indice];
        String palabraUsuario;
        do {
            palabraUsuario = JOptionPane.showInputDialog(null, "\nIntroduzca una palabra entre:\n" + Arrays.toString(palabras));
            if(palabraUsuario.equals(palabras[indice])) {
                JOptionPane.showMessageDialog(null, "Felicidades! La palabra era: " + palabraFinal);
                break;
            }
            else {
                JOptionPane.showMessageDialog(null, "Oh, no... La palabra es: " + palabraFinal);
                vidasRestantes--;
            }
        } while (vidasRestantes > 0);
        if(vidasRestantes == 0) {
            JOptionPane.showMessageDialog(null, "Oh, no! Perdiste la partida!");
        }
    }
}
