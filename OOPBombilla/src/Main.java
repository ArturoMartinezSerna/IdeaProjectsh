import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bombilla salon = new Bombilla();
        Bombilla habitacion1 = new Bombilla();
        Bombilla habitacion2 = new Bombilla();
        Bombilla cocina = new Bombilla();
        Bombilla banio = new Bombilla();
        Bombilla terraza = new Bombilla();
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("¿Qué interruptor desea pulsar?");
            System.out.println("1. Salon " + "[" + salon.mostrarEstado() + "]");
            System.out.println("2. Habitacion Principal" + "[" + habitacion1.mostrarEstado() + "]");
            System.out.println("3. Habitacion Secundaria" + "[" + habitacion2.mostrarEstado() + "]");
            System.out.println("4. Cocina" + "[" + cocina.mostrarEstado() + "]");
            System.out.println("5. Banio" + "[" + banio.mostrarEstado() + "]");
            System.out.println("6. Terraza" + "[" + terraza.mostrarEstado() + "]");
            System.out.println("7. Interruptor general" + "[" + (Bombilla.interruptorGeneral
                    ? "Encendido" : "Apagado") + "]");
            System.out.print("Indique su opción -> ");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1 -> {salon.pulsarInterruptor();}
                case 2 -> {habitacion1.pulsarInterruptor();}
                case 3 -> {habitacion2.pulsarInterruptor();}
                case 4 -> {cocina.pulsarInterruptor();}
                case 5 -> {banio.pulsarInterruptor();}
                case 6 -> {terraza.pulsarInterruptor();}
                case 7 -> {Bombilla.interruptorGeneral = !Bombilla.interruptorGeneral;}
                case 0 -> {
                    System.out.println("Gracias por dejar de pulsar los interruptores!");
                }
                default -> System.out.println("Opción no valida");
            }
        } while(opcion != 0);
    }
}