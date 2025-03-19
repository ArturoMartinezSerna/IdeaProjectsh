import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        Scanner entrada = new Scanner(System.in);
        double frecuenciaInicial;
        System.out.println("Encendiendo la radio... indique la frecuencia inicial");
        frecuenciaInicial = entrada.nextDouble();
        SintonizadorFM sintonizarFm=new SintonizadorFM(frecuenciaInicial);
        int opcion = 0;
        do {
            System.out.println(" *** RADIO FM ***");
            System.out.println(" 1. Subir");
            System.out.println(" 2. Bajar");
            System.out.println(" 3. Indicar un favorito");
            System.out.println(" 4. Apagar la Radio");
            System.out.print  (" Indique su opcion->");

            try {
                opcion = entrada.nextInt();
            } catch(Exception e) {
                System.err.println("Opcion invalida");
                entrada.nextLine();
            }
            switch (opcion) {
                case 1-> {
                    sintonizarFm.up();
                    sintonizarFm.display();
                }
                case 2->{
                    sintonizarFm.down();
                    sintonizarFm.display();
                }
                case 3->{
                    System.out.print("Indica la Frecuencia Favorita");
                    sintonizarFm.setFrecuencia(entrada.nextDouble());
                    sintonizarFm.display();
                }
                case 4-> System.out.println("---Apagando---");
                default->
                        System.out.println("Opción no Válida");
            }

        }while(opcion!=4);
    }

}