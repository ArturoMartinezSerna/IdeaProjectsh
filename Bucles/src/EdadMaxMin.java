import javax.swing.*;

public class EdadMaxMin {
    public static void main(String[] args) {
        /*
         * Solicita al usuario la edad de 2 personas e indica cual es mayor y cual es menor. Para salir, el usuario debe pulsar -1.
         */
        int edad1 = 0, edad2 = 0;
        String mensaje = "";

        while(edad1 != -1 || edad2 != -1) {
            edad1 = pideNumero("Por favor, introduzca la edad de la primera persona:");
            edad2 = pideNumero("Por favor, introduzca la edad de la segunda persona: ");

            if(!(edad1 == -1 && edad2 == -1))
                mensaje = edad1 > edad2 ? "La edad " + edad1 + " del primer usuario es mayor que " + edad2 + " perteneciente al segundo usuario" : "La edad " + edad2 + " del segundo usuario es mayor que " + edad1 + " perteneciente al primer usuario";

            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

    private static int pideNumero(String peticion) {
        String numeroText;
        int edad = 0;
        boolean centinela;

        do {
            centinela = false;
            numeroText = JOptionPane.showInputDialog(peticion);
            try {
                edad = Integer.parseInt(numeroText);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduzca una edad valida");
                centinela = true;
            }
        } while(centinela);
        return edad;
    }
}
