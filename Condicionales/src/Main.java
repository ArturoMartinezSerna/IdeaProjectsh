/*
 * Clase sobre Condicional simple if
 * Sintaxis: if (condicion) {
 *             Bloque de instrucciones
 *           }
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        byte edad;
        Scanner in = new Scanner(System.in);
        System.out.println("Indique su edad -> ");
        edad = in.nextByte();
        if (edad >= 18) {
            //Bloque de instrucciones en caso de cumplirse la condicion
            System.out.println("Eres mayor de edad");
            edad++;
            System.out.println("El año que viene tendrás " + edad);
        }
        // Se recomienda usar {} pero no es obligatorio si hay solo una sentencia
        if (edad >= 18) {
            byte mayoriaEdad = 18;
            System.out.println("Hello world!");
        }
        else
            System.out.println("Eres menor de edad");
        //mayoriaEdad++; //esta variable no existe fuera del bloque if
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica un número");
        int numero = teclado.nextInt();
        if(numero < 0)
            System.out.println("El numero es negativo");

        /******* CONDICION IF - ELSE ***************
         * SINTAXIS: if(condicion) {
         *              bloques de codigo
         *           }
         *           else {
         *              otros bloques de codigo
         *           }
         */
        if(numero%2 == 0) {
            System.out.println("El numero es par");
        }
        else
            System.out.println("El numero es impar");
    }
}