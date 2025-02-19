import javax.swing.*;

public class Ventanas {
    public static void main(String[] args) {
        int aforo;
        String aforoString;
        String mensaje;
        String precioEntradaString;
        double precioEntrada;
        String entradasVendidasString;
        int entradasVendidasInt;

        // Preguntamos nombre
        mensaje = JOptionPane.showInputDialog("Ingresa tu nombre");
        // Preguntamos el aforo del local
        aforoString = JOptionPane.showInputDialog("Ingrese el aforo del concierto:");
        // Pedimos las entradas vendidas
        entradasVendidasString = JOptionPane.showInputDialog("Ingresa las entradas vendidas del concierto:");
        // Pedimos el precio de cada entrada
        precioEntradaString = JOptionPane.showInputDialog("Ingresa el precio de la entrada del concierto:");

        // Convertimos las variables
        aforo = Integer.parseInt(aforoString);
        precioEntrada = Double.parseDouble(precioEntradaString);
        entradasVendidasInt = Integer.parseInt(entradasVendidasString);

        // Calculamos el total de la recaudacion
        if(entradasVendidasInt < aforo*0.2)
            System.out.println("El concierto se cancela");
        else {
            if(entradasVendidasInt < aforo/2) {
                System.out.println("Se ejecuta el descuento del 25%");
                precioEntrada *= 0.75;
            }
            System.out.println("El concierto se ejecuta, y recaudamos " + precioEntrada * entradasVendidasInt);
            JOptionPane.showMessageDialog(null, "El concierto se ejecuta, y recaudamos " + (precioEntrada * entradasVendidasInt));
        }


    }
}
