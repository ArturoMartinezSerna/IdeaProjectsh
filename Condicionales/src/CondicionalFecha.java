import java.util.InputMismatchException;
import java.util.Scanner;

public class CondicionalFecha {
    public static void main(String[] args) {
        /**
         * Solicitar por teclado una fecha (día, mes y año) e indicar si la fecha
         * es correcta -> 31-02-2025 -> fecha incorrecta
         *
         * 1.- Creamos el Scanner y las variables
         * 2.- Solicitamos dia, mes y año y los guardamos
         *
         */
        boolean centinela;
        int dia;
        int mes;
        int ano;

        do {
            try {
                centinela = false;
                dia = pideNumero("Por favor, introduzca el dia");
                mes = pideNumero("Por favor, introduzca el mes");
                ano = pideNumero("Por favor, introduzca el año");
                if(evaluaFecha(dia, mes, ano))
                    System.out.println("La fecha " + dia + "/" + mes + "/" + ano + " es correcta");
            }catch(Exception e) {
                System.err.println(e.getMessage());
                centinela = true;
            }
        } while(centinela);
    }

    private static boolean evaluaFecha(int dia, int mes,int ano) throws Exception{

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if(dia <= 0 || dia > 31) {
                throw new Exception("Introduzca un número entre 1 y 31 para el mes " + mes);
            }
        }else if (mes == 2) {
            if(dia <= 0 || dia > 28) {
                throw new Exception("Introduzca un número entre 1 y 28 para el mes " + mes);
            }

        }else if(dia <= 0 || dia > 30) {
                throw new Exception("Introduzca un número entre 1 y 30 para el mes " + mes);
        }
        return true;
    }

    private static int pideNumero(String peticion) {
        Scanner in = new Scanner(System.in);
        boolean centinela;
        int numero;
        do {
            centinela = false;
            System.out.println(peticion);
            try {
                numero = in.nextInt();
                return numero;
            }catch(InputMismatchException e) {
                System.err.println("Por favor ingrese un numero");
                in.nextLine();
                centinela = true;
            }
        } while(centinela);
        return 0;
    }
}
