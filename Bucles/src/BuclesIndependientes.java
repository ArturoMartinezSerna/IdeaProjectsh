public class BuclesIndependientes {

    /*
     * La anidación de bucles trata de tener un bucle dentro de otro
     */

    public static void main(String[] args) {

        for (int i = 1; i < 3; i++) {
            for(int j = 1; j < 5; j++){
                System.out.println("El valor de i es: " + i + " y el valor de j es: " + j);
            }
        }

    }

}
