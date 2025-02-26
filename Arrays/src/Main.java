import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] edad = new int[5];
        edad[0] = 18;
        edad[1] = 19;
        edad[2] = 20;
        edad[3] = 21;
        edad[4] = 22;

        // Tabla completa
        // edad[5] estaria fuera de indice
        // La tabla solo tiene 5 posiciones, no puedes insertar la sexta
        //edad[5]=18 fuera de rango
        for(int i = 0; i < edad.length; i++) { //nombreArray.length -> tamaño del array
            System.out.println(edad[i]);
        }
        System.out.println("Longitud:" + edad.length);

        String[] coches = {"Opel", "Ford", "BMW", "Citroen", "SEAT"};
        System.out.println(Arrays.toString(coches)); //Muestra los elementos del array

        for(int i = 0; i < edad.length; i++) {
            String edadT = JOptionPane.showInputDialog("Indica la Edad" + i);
            edad[i]=Integer.parseInt(edadT);
        }
        System.out.println(Arrays.toString(edad));

        //Inicializacion de un array
        int[] numeros = new int[10]; // Java auto-inicializa a 0 los enteros, bytes, shorts...
        String[] apellidos = new String[8]; // Y a null las referencias a objeto
        boolean[] decision = new boolean[6]; // y a false los booleanos
        numeros[7] = 18;
        apellidos[3] = "Díaz";
        decision[5] = true;
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(apellidos));
        System.out.println(Arrays.toString(decision));

        // Lee desde consola, los 10 numeros del array numeros
        // los 8 apellidos, y los 6 booleanos
        // y luego muestralos
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Indica el Numero " + i));
        }
        for(int i = 0; i < apellidos.length; i++) {
            apellidos[i] = JOptionPane.showInputDialog("Indica el texto " + i);
        }
        for(int i = 0; i < decision.length; i++) {
            decision[i] = JOptionPane.showInputDialog("Indica el booleano " + i).equals("true");
        }

        System.out.print("[");
        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("]");
        System.out.print("[");
        for(int i = 0; i < apellidos.length; i++) {
            System.out.print(apellidos[i] + " ");
        }
        System.out.println("]");
        System.out.print("[");
        for(int i = 0; i < decision.length; i++) {
            System.out.print(decision[i] + " ");
        }
        System.out.println("]");
    }

}