import java.util.InputMismatchException;
import java.util.Scanner;

public class CondicionalesCifras {

    /**
     * Solicitar un número al usuario e indicar cuántas cifras tiene
     * Delimitar el número entre 0 y 99999
     */

    public static void main(String[] args) {

        int numero;

        numero = pideNumero();

        if(0 <= numero && numero < 10) {
            System.out.println("El numero " + numero + " tiene 1 cifra");
        }
        if(10 <= numero && numero < 100) {
            System.out.println("El numero " + numero + " tiene 2 cifras");
        }
        if(100 <= numero && numero < 1000) {
            System.out.println("El numero " + numero + " tiene 3 cifras");
        }
        if(1000 <= numero && numero < 10000) {
            System.out.println("El numero " + numero + " tiene 4 cifras");
        }
        if(10000 <= numero && numero < 100000) {
            System.out.println("El numero " + numero + " tiene 5 cifras");
        }


    }

    private static int pideNumero() {
        Scanner in = new Scanner(System.in);
        int numero;
        boolean centinela;
        do {
            centinela = false;
            try {
                System.out.println("Ingrese el numero: ");
                numero = in.nextInt();
                if (numero < 0 || numero > 99999) {
                    throw new Exception("Por favor, introduzca un número entre 0 y 99999");
                }
                else
                    return numero;

            } catch (InputMismatchException e) {
                System.err.println("Por favor, introduzca un número, no una letra");
                in.nextLine();
                centinela = true;
            } catch (Exception e) {
                System.err.println(e.getMessage());
                in.nextLine();
                centinela = true;
            }
        }while(centinela);
        return 0;
    }
}
