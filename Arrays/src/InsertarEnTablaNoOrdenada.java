/*
 * Arrays.copyOf(Array nombreTabla, int longitudNuevoArray)
 */

import java.util.Arrays;
import java.util.Scanner;

public class InsertarEnTablaNoOrdenada {

    public static void main(String[] args) {
        int[] numeros = {5, 6, 7, 8, 9, 10};
        numeros = Arrays.copyOf(numeros, numeros.length + 1);
        int insercion;

        Scanner in = new Scanner(System.in);
        System.out.println("Mete un numero a insertar en la tabla:");

        insercion = in.nextInt();
        numeros[numeros.length-1] = insercion;
        System.out.println(Arrays.toString(numeros));

        //Inserta el numero 10 en el primer sitio del array y 45 en el ultimo sitio del array
        numeros = Arrays.copyOf(numeros, numeros.length + 2);
        for(int i = numeros.length - 2; i > 0; i--){
            numeros[i] = numeros[i-1];
        }
        numeros[0] = 10;
        numeros[numeros.length-1] = 45;
        System.out.println("El nuevo array es: " + Arrays.toString(numeros));
    }
}
