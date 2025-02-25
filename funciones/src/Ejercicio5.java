/*
 * Solicitar los siguientes datos al usuario
 * al final, mostrarlos de forma organizada
 * por pantalla.
 *
 * Nombre, Apellidos, Telefono, direccion, email
 *
 * Luego, lo mostraremos en pantalla en una sola línea
 * concatenando los datos.
 */

import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {

        String nombre;
        String apellidos;
        String telefono;
        String direccion;
        String email;
        byte edad;
        int dni;

        nombre = pideString("nombre");
        apellidos = pideString("apellidos");
        telefono = pideString("telefono");
        direccion = pideString("direccion");
        email = pideString("email");
        edad = leerNumero("edad");
        dni = leerNumero(); // Irá a la función que no espera ningún paso de parámetro

        //Mostrar por pantalla
        mostrarCampo("El nombre", nombre);
        mostrarCampo("Los apellidos", apellidos);
        mostrarCampo("El telefono", telefono);
        mostrarCampo("La direccion", direccion);
        mostrarCampo("El email", email);

    }

    private static String pideString(String peticion) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduza " + peticion + " del usuario:");
        return sc.nextLine();
    }

    private static void mostrarCampo(String campo, String valor) {
        System.out.println(campo + " del usuario es: " + valor);
    }

    // Sobrecarga de funciones... y la funcion va a ir segun el parametro que le pases
    private static void mostrarCampo(String campo) {
        System.out.println("Solo tenemos un campo! " + campo);
    }

    private static byte leerNumero(String peticion) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica " + peticion);
        return sc.nextByte(); //devuelve un numero
    }

    //Sobrecarga de funciones
    // Se puede dar el caso de llamar igual una funcion pero variar segun el paso de parametros. Dependiendo del paso de parametros, llamará al método que corresponda.

    static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica sólo el número del DNI");
        return sc.nextInt();
    }

    //Pensar otro ejemplo de sobrecarga de funciones
    // --> static int leerNumero(byte numero) <--
}
