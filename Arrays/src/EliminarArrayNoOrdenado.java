import java.util.Arrays;

public class EliminarArrayNoOrdenado {


    public static void main(String[] args) {

        String[] nombres = {"JuanMa", "Ana", "Alba", "Ruben", "Laura", "Arturo", "Irina", "Dani"};

        String nombreEliminar = "nuevoNombre";
        System.out.println("Array original: \n" + Arrays.toString(nombres));
        nombres = eliminarElemento(nombres, nombreEliminar);
        System.out.println("Nuevo: \n" + Arrays.toString(nombres));

    }

    private static int[] eliminarElemento(int[] array, int eliminado) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == eliminado) {
                array[i] = array[array.length - 1];
                array = Arrays.copyOf(array, array.length - 1);
            }
        }
        return array;
    }

    private static String[] eliminarElemento(String[] array, String eliminado) {
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(eliminado)) {
                array[i] = array[array.length - 1];
                return Arrays.copyOf(array, array.length - 1);
            }
        }
        return array;
    }
}
