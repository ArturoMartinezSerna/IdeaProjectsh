import java.util.Scanner;

public class condicionalesIfElseAnidados {
    public static void main(String[] args) {
        /**
         * solicita 3 numeros e indica el orden de mayor a menor
         */
        int numero1, numero2, numero3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        numero3 = entrada.nextInt();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.print(numero1 + " > ");
            if(numero2 > numero3){
                System.out.println(numero2 + " > " + numero3);
            }
            else
                System.out.println(numero3 + " > " + numero2);
        }
        else if(numero2 > numero1 && numero2 > numero3){
            System.out.print(numero2 + " > ");
            if(numero1 > numero3){
                System.out.println(numero1 + " > " + numero3);
            }
            else
                System.out.println(numero3 + " > " + numero1);
        }
        else {
            System.out.print(numero3 + " > ");
            if(numero1 > numero2){
                System.out.println(numero1 + " > " + numero2);
            }
            else
                System.out.println(numero2 + " > " + numero1);
        }
    }
}
