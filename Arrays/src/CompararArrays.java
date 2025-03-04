import java.util.Arrays;

public class CompararArrays {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] numeros2 = new int[10];
        boolean sonIguales;
        int comparar;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100 + 1);
        }
        for(int i = 0; i < numeros.length; i++) {
            numeros2[i] = (int)(Math.random() * 100 + 1);
        }
        sonIguales = Arrays.equals(numeros, numeros2);
        System.out.println("¿Son iguales? " + sonIguales);
        // devuelve 0 si son iguales y -1 si son diferentes
        comparar = Arrays.compare(numeros2, numeros2);
        System.out.println("¿Son iguales con compare? " + comparar);
    }
}
