/*
 * Realizar una función que calcule y muestre el área y volumen de un cilindro según un menú.
 * El menú tendrá tres opciones: 1-> area 2-> volumen 0 -> salir
 * Los datos necesarios serán: radio y altura.
 * area = 2*PI*radio * (altura + radio)
 * volumen = PI*radio ^ 2 * altura
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        ejecutaMenu();
    }

    static void ejecutaMenu() {
        double area;
        double volumen;
        double radio = pideRadio();
        double altura = pideAltura();
        int opcion = mostrarMenu();


        switch (opcion) {
            case 1 -> {
                area=2*Math.PI*radio*(altura+radio);
                System.out.printf("El area del cilindro es: %.2f", area);
            }
            case 2 -> {
                volumen=Math.PI*Math.pow(radio, 2)*altura;
                System.out.printf("El volumen del cilindro es: %.2f", volumen);
            }
            case 0 -> System.out.println("Gracias por utilizar el programa");
            default -> System.out.println("Opcion no valida");
        }
    }

    static int mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Indique qué quiere calcular: ->\n1-> Área\n2-> Volumen\n0-> Salir");
        opcion = sc.nextInt();
        return opcion;
    }

    static double pideRadio() {
        Scanner sc = new Scanner(System.in);
        double radio;
        System.out.println("Indique el radio del cilindro:");
        radio = sc.nextDouble();
        return radio;
    }

    static double pideAltura() {
        Scanner sc = new Scanner(System.in);
        double altura;
        System.out.println("Indique la altura del cilindro:");
        altura = sc.nextDouble();
        return altura;
    }
}


