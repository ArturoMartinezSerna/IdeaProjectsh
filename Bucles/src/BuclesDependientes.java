import java.util.Scanner;

/*
 * El bucle generalmente el interno depende del valor del externo
 */
public class BuclesDependientes {
    public static void main(String[] args) {
        /*
         * Ejemplo: Solicitar un número y dibujamos un triangulo de n asteriscos tal que asi:
         * n=4
         * ****
         * ***
         * **
         * *
         */
        int longitud;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número para el triángulo:");
        longitud = sc.nextInt();

        System.out.println("Triangulo sin invertir:\n");
        for(int i = longitud; i >= 1; i--) {
            for(int j = i; j <= longitud; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nTriangulo invertido:\n");
        for(int i = 1; i <= longitud; i++) {
            for(int j = i; j <= longitud; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
