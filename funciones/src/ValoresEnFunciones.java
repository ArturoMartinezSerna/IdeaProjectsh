import java.util.Scanner;

public class ValoresEnFunciones {
    public static void main(String[] args) {
        // Solicita un número y verifica comparado con el mismo número multiplicado por 10, cuál de los dos valores es mayor.
        int numero1;
        int mayor;
        int numero2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Indica un número");
        numero1 = entrada.nextInt();
        mayor = mostrarMayor(numero1, numero1*10);
        System.out.println("El mayor es: " + mayor);
        // las funciones son para programar modularmente
        /*numero1 = (int)(Math.random() * 100 + 1);
        numero2 = crearRandom();        System.out.println("El mayor de dos números aleatorios es:" + mostrarMayor(numero1, numero2));
        */
        System.out.println("El mayor de dos números aleatorios es: " + mostrarMayor(crearRandom(), crearRandom()));
    }

    /**
     * Funcion que devuelve el mayor de dos numeros
     * @param num1
     * @param num2
     * @return un int mayor de los dos
     */
    static int mostrarMayor(int num1, int num2) {
        return num1 > num2 ? num1 : num2; // Devuelve el valor del mayor número
    }

    static int crearRandom() {
        return (int)(Math.random() * 100 + 1);
    }

    // funcion para mostrar en pantalla cualquier texto con salto de linea
    static void mostrarTexto(String texto) {
        System.out.println(texto);
    }
}
