import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejemplo1For {
    /* *
     * Solicitar al usuario un número, y mostrar todos los números desde el 1 al número ingresado
     *
     * Escribe un programa que muestre todos los múltiplos de 7 menores que 100
     */
    public static void main(String[] args) {
        int numero;
        System.out.println("Ingrese un numero");
        numero = new Scanner(System.in).nextInt();

        for(int i = 1; i < numero; i++) {
            System.out.print(i + "-");
        }
        System.out.println(numero);

        for(int i = 0; i < 100; i+=7)
            System.out.print(i + "-");
    }
}
