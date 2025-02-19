import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int factorial = 1;

        System.out.println("Introduzca un número del que calcular su factorial: ");
        numero = sc.nextInt();
        for(int i = numero; i >= 2; i--) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
