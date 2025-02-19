
/*
 * Muestra las tablas de multiplicar del 1 al 10
 */

public class TablasDeMultiplicar {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            System.out.println("**** TABLA DEL " + i + " ****");
            for(int j = 1; j <= 10; j++) {
                System.out.println("\t" + i + " * " + j + " = " + (i * j));
            }
        }


    }

}
