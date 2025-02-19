import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota igual a 4) y suspensos
 */
public class AlumnosAprobados {
    public static void main(String[] args) {
        int alumnosAprobados = 0, alumnosCondicionados = 0, alumnosSuspensos = 0;
        final int NUMERO_ALUMNOS = 6;
        Scanner entrada = new Scanner(System.in);
        int notaTemporal;

        for(int i = 0; i < NUMERO_ALUMNOS; i++) {
            boolean centinela;
            do {
                centinela = false;
                System.out.println("Ingrese la nota del alumno: ");
                try {
                    notaTemporal = entrada.nextInt();
                } catch(InputMismatchException e) {
                    System.err.println("Por favor, introduzca un número entero");
                    centinela = true;
                    notaTemporal = -1;
                    entrada.nextLine();
                }
            } while(centinela);
            if(notaTemporal == 4)
                alumnosCondicionados++;
            else if(notaTemporal < 4)
                alumnosSuspensos++;
            else
                alumnosAprobados++;
        }

        System.out.println("El número de alumnos aprobados es de: " + alumnosAprobados);
        System.out.println("El número de alumnos condicionados es de: " + alumnosCondicionados);
        System.out.println("El número de alumnos suspensos es de: " + alumnosSuspensos);
    }



}
