import java.util.Scanner;

public class CondicionalesIfElse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Hello World");
        /**
         * Solicitar dos números e indicar si son iguales o no
         */
        System.out.println("Introduzca el primer número");
        numero1 = entrada.nextInt();
        System.out.println("Introduzca el segundo número");
        numero2 = entrada.nextInt();
        if (numero1 == numero2) {
            System.out.println("Los números son iguales");
        }
        else{
            System.out.println("Los números son diferentes");
        }

        /**
         * De los dos números ingresados, indica cual es mayor
         */
        if(numero1 > numero2){
            System.out.println("El primer número introducido es el mayor");
        }
        else
            System.out.println(numero2 + " es el mayor");

        /************* IF - ELSE ANIDADOS ********/

        if(numero1 == numero2) {
            System.out.println("Los numeros son iguales");
        }
        else if(numero1 < numero2){
            System.out.println("El numero " + numero1 + " es menor que " + numero2);
        }
        else
            System.out.println("El numero " + numero1 + " es mayor que " + numero2);
    }
}
