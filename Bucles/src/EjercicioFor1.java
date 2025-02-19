public class EjercicioFor1 {
    /*
     * Escribe un bucle for que diga "ECO" 10 veces
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println("ECO " + i + " iteracion!");
        }
        /* ****Otro ejemplo****
         * Mostrar todos los años de forma decreciente desde 2025 al 2000
         */
        for(int i = 2025; i >= 2000; i--) {
            System.out.println("Año: " + i);
        }
    }

}
