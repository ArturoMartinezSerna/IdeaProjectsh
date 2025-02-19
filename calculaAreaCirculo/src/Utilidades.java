import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {

    public static double pideNumeroDouble(String mensaje) {
        Scanner in = new Scanner(System.in);
        double numero;
        boolean centinela;
        System.out.println(mensaje);

        do {
            centinela = false;
            try {
                numero = in.nextDouble();
                in.close();
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
