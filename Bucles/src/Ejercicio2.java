import javax.swing.*;
import java.time.LocalDate;

public class Ejercicio2 {
    /*
     * Crear un menu que se repita hasta que el usuario elija la opcion salir. Tendrá 3 opciones:
     *
     * 1-> Hola que tal (Saludo)
     * 2-> Indicar la fecha de hoy
     * 3-> Salir
     */

    public static void main(String[] args) {
        final String MENU_PRINCIPAL = "Por favor, introduzca una opción: \n1-> Hola que tal (Saludo)\n2-> Indicar la fecha de hoy\n3-> Salir";
        int dia, mes, ano, opcion;
        LocalDate fecha = LocalDate.now();
        dia = fecha.getDayOfMonth();
        mes = fecha.getMonthValue();
        ano = fecha.getYear();

        do {
            opcion = pideInt(MENU_PRINCIPAL);
            switch(opcion) {
                case 1: JOptionPane.showMessageDialog(null, "Hola que tal"); break;
                case 2: JOptionPane.showMessageDialog(null, "La fecha de hoy es: " + dia + "-" + mes + "-" + ano);
                break;
            }
        } while(opcion != 3);
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
