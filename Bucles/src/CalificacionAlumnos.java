import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Pide 5 calificaciones de alumnos e indica si hay algun suspenso
 */
public class CalificacionAlumnos {

    public static void main(String[] args) {
        final int CALIFICACIONES = 5;
        int calificacion;
        boolean haySuspenso = false;
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= CALIFICACIONES; i++) {
            boolean centinela;
            do {
                centinela = false;
                System.out.println("Ingrese la calificacion del alumno: ");
                try {
                    calificacion = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println("Por favor, introduzca un número entero");
                    centinela = true;
                    calificacion = -1;
                    sc.nextLine();
                }
            } while (centinela);
            if(calificacion < 5) {
                haySuspenso = true;
                //break; // Rompe el bucle. Innecesario si queremos pedir siempre las 5 calificaciones
            }
        }
        if(haySuspenso) {
            System.out.println("En alguna calificacion hay algun suspenso");
        }
        else
            System.out.println("En ninguna calificacion hay ningun suspenso");
    }
}
