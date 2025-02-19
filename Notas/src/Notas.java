import java.text.DecimalFormat;
import java.util.Scanner;

public class Notas {
    /*
        Solicita 3 notas por pantalla, hace la media, y la muestra por pantalla
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int[] notas = new int[3];
        double media;

        for(int i = 0; i < notas.length; i++){
            notas[i] = Utilidades.pideNumero("Introduzca la " + (i+1) + " nota a hacer la media:");
        }
        media = (double)(notas[0] + notas[1] + notas[2]) / 3;
        System.out.println("La media de las notas " + notas[0] + " e " + notas[1] + " e " + notas[2]);
        System.out.println("La media es: " + df.format(media));
        //(❁´◡`❁)(❁´◡`❁)(❁´◡`❁)

    }
}
