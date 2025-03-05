import java.util.Arrays;
import java.util.Scanner;

public class InsertarTablaOrdenadaSolitos {


    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numerosTemporal = new int[numeros.length + 1];
        // indice indica la posicion en la tabla si el numero está en ella, o el indice abs(posicion) + 1 pero en negativo si no se encuentra
        int indice;
        int nuevoNumero;
        Scanner in = new Scanner(System.in);

        System.out.println("Indica el numero que vas a insertar:");
        nuevoNumero = in.nextInt();

        indice = Arrays.binarySearch(numeros, nuevoNumero);
        System.out.println("INDICE: " + indice);
        if(indice < 0)
            indice = -indice - 1;
        System.arraycopy(numeros, 0, numerosTemporal, 0, indice);
        numerosTemporal[indice] = nuevoNumero;
        System.arraycopy(numeros, indice, numerosTemporal, indice + 1, numeros.length - indice);

        System.out.println(Arrays.toString(numerosTemporal));
    }
}
