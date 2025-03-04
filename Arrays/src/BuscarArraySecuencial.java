/*
 * Vamos comparando un elemento con cada uno de los elementos del array
 * hasta que lo encontremos.
 */

import java.util.Arrays;

public class BuscarArraySecuencial {

    public static void main(String[] args) {

        int posicion;

        int[] array = new int[10];
        String[] palabras = {"Tractor", "Bombilla", "Cigueña", "Boton", "Mesa"};
        for(int i = 1; i <= array.length; i++){
            array[i-1] = i;
        }

        System.out.println("El valor 4 está en la posicion: " + buscarPosicionSecuencial(array, 4));
        System.out.println("La palabra Tractor está en la posicion: " + buscarPosicionSecuencial(palabras, "Tractor"));
        System.out.println("La palabra Mesa está en la posicion: " + buscarPosicionSecuencial(palabras, "Mesa"));
        double[] precios = {45.65, 45.34, 24.24, 243.65, 34.5};
        // Para buscar en una tabla le pasamos al metodo binarySearch() la tabla ordenada
        Arrays.sort(precios);
        // Si devuelve >=0, ha encontrado el indice del elemento
        posicion = Arrays.binarySearch(precios, 45.5);
        if(posicion >= 0){
            System.out.println("Se encontro el precio en la posicion: " + posicion);
        }
        else
            System.out.println("No se encontro el precio. Puedes insertarlo en la posicion " + (-posicion - 1));
        // El metodo binarySearch solo busca en arrays ordenados, y devuelve la posicion donde
        // encuentra el numero, o negativo la posicion donde acaba su puntero
    }

    static int buscarPosicionSecuencial(int[] array, int valorBuscado){
        for(int i = 0; i < array.length; i++){
            if(array[i] == valorBuscado){
                return i;
            }
        }
        return -1;
    }

    static int buscarPosicionSecuencial(String[] array, String palabraBuscada){
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(palabraBuscada)){
                return i;
            }
        }
        return -1;
    }

}
