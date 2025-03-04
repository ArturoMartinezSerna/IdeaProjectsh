import java.util.Arrays;
import java.util.Scanner;

public class InsertarTablaOrdenada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int indice = 0;
        int numeroInsertar;
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numerosTemp = new int[numeros.length + 1];

        Arrays.sort(numeros);
        numeroInsertar = sc.nextInt();
        System.out.println("Introduce un número a insertar en la tabla");
        // Buscamos ese numero insertado con binarySearch()
        if(Arrays.binarySearch(numeros, numeroInsertar) < 0) { // Si no existe
            indice =-Arrays.binarySearch(numeros, numeroInsertar) - 1;
        }

        System.out.println(indice);
        // Esto no funciona para arrays que permitan repetir sus miembros

        System.arraycopy(numeros, 0, numerosTemp, 0, indice);
        System.out.println(Arrays.toString(numerosTemp));
    }

}
