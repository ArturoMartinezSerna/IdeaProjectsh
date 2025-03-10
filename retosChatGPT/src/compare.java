import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        int num1, num2;
        Scanner in = new Scanner(System.in);
        int comparativa;
        System.out.print("Introduce el primer número: ");
        num1 = in.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = in.nextInt();
        comparativa = Integer.compare(num1, num2);
        if(comparativa == 0)
            System.out.println("Ambos números son iguales");
        else
            System.out.println(comparativa > 0 ? "El primer número es mayor" : "El segundo número es mayor");
    }
}
