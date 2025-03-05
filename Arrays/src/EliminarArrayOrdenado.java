import java.util.Arrays;
import java.util.Scanner;

public class EliminarArrayOrdenado {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numeroAEliminar;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero a eliminar del array");
        numeroAEliminar = sc.nextInt();
        System.out.println(Arrays.toString(numeros));
        numeros = eliminarNumero(numeros, numeroAEliminar);
        System.out.println(Arrays.toString(numeros));

    }

    private static int[] eliminarNumero(int[] numeros, int numero) {
        int indice;
        do {
            indice = Arrays.binarySearch(numeros, numero);
            if (indice >= 0) {
                numeros = borraPosicion(numeros, indice);
            }
        }while(indice >= 0);
        return numeros;
    }

        private static int[] borraPosicion(int[] numeros, int posicion) {
            int[] numerosT = new int[numeros.length - 1];
            System.arraycopy(numeros, 0, numerosT, 0, posicion);
            System.arraycopy(numeros, posicion + 1, numerosT, posicion, numeros.length - posicion - 1);

            return numerosT;
        }
}
