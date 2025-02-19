import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("indique un número entero");
        int numero = in.nextInt();
        String salida = numero % 2 == 0 ? "El número es par" : "El número es impar";
        System.out.println(salida);
    }
}