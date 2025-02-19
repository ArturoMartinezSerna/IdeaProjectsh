import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {

    public static int pideNumero(String mensaje) {
        Scanner in = new Scanner(System.in);
        int numero;
        boolean centinela;
        System.out.println(mensaje);

        do {
            centinela = false;
            try {
                numero = in.nextInt();
                return numero;
            } catch (InputMismatchException e) {
                System.err.println("El numero debe ser numerico. Intente de nuevo.");
                centinela = true;
                in.nextLine();
            }
        }while(centinela);
        return 0;
    }

}
