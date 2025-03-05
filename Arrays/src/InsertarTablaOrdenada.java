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

        System.out.println("Introduce un número a insertar en la tabla");
        numeroInsertar = sc.nextInt();
        indice = Arrays.binarySearch(numeros, numeroInsertar);
        // Buscamos ese numero insertado con binarySearch()
        if(indice < 0) { // Si no existe
            indice =-Arrays.binarySearch(numeros, numeroInsertar) - 1;
        }
        System.out.println("Indice: " + indice);
        System.out.println("Tabla temporal creada: " + Arrays.toString(numerosTemp));

        System.arraycopy(numeros, 0, numerosTemp, 0, indice);
        System.out.println("Tabla copiando el primer tramo: -> " + Arrays.toString(numerosTemp));
        // Insertamos el nuevo numero en el hueco
        numerosTemp[indice] = numeroInsertar;
        System.out.println("Tabla insertando el nuevo numero: " + Arrays.toString(numerosTemp));
        // Copiamos los elementos desplazados tras el hueco
        System.arraycopy(numeros, indice, numerosTemp, indice+1, numeros.length - indice);
        // Copiamos a la tabla original
        numeros = numerosTemp;
        System.out.println("Tabla final con el segundo tramo: " + Arrays.toString(numeros));
    }

}
