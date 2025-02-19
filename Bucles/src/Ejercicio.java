import javax.swing.*;

/*
 * edad = 18
 * incrementa la edad hasta que llegue a 40
 */
public class Ejercicio {
    public static void main(String[] args) {

        /*
        int edad = 18;;

        while(edad < 40) {
            edad++;
            System.out.println("Edad: " + edad);
        }

        System.out.println(edad);

         */

        /*
         * Mostrar 10 veces hola en pantalla
         *
        int contador = 0;

        do {
            System.out.println("Hola mundo!");
            contador++;
        } while (contador < 10);

         */

        /*
         * Solicitar la edad a 10 personas e ir contando cuales son mayores de 18 y cuales son menores de 18, al final mostrar los mayores y los menores
         */
        int mayores = 0;
        int menores = 0;
        int contadorPersonas = 0;
        int edadTemporal;
        do {
            edadTemporal = pideInt("Por favor, introduzca la edad de la persona:");
            contadorPersonas++;
            if(edadTemporal < 18)
                menores++;
            else
                mayores++;
        } while(contadorPersonas < 3);

        JOptionPane.showMessageDialog(null, "El número de mayores de edad es de: " + mayores + "\nEl número de menores de edad es de: " + menores);
    }

    private static int pideInt(String mensaje) {
        String edadText;
        int edad = 0;
        boolean centinela;
        do {
            centinela = false;
            try {
                edadText = JOptionPane.showInputDialog(null, mensaje);
                edad = Integer.parseInt(edadText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un numero entero");
                centinela = true;
            }
        } while(centinela);
        return edad;
    }
}
