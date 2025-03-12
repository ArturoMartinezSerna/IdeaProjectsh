import java.util.Arrays;
import java.util.Scanner;

public class MetodosCadenas {
    public static void main(String[] args) {
        // Si tienes dos cadenas, puedes compararlas y verificar si son iguales
        String cadena1 = "En un lugar de la mancha, de cuyo nombre no quiero acordarme";
        String cadena2 = "En un lugar de la mancha";

        boolean comparar = cadena1.equals(cadena2);
        System.out.println("Son las cadenas iguales? " + comparar);
        int comparar2 = cadena2.compareTo(cadena1); // Devuelve 0 si son iguales
        if(comparar2 == 0){
            System.out.println("Las cadenas son iguales");
        }
        else {
            System.out.println("Las cadenas no son iguales");
        }
        String nombre1 = "Maria";
        String nombre2 = "MARIA";
        comparar2 = nombre1.compareToIgnoreCase(nombre2); // Ignora si es mayuscula o minuscula
        if(comparar2 == 0){
            System.out.println("Las cadenas son iguales");
        }
        else {
            System.out.println("Las cadenas no son iguales");
        }
        nombre1 = nombre1.toUpperCase();  // Lo pasa a mayusculas
        nombre2 = nombre2.toLowerCase(); // Lo pasa a minusculas
        comparar = cadena1.startsWith(cadena2);
        System.out.println("Empieza la cadena 1 en cadena2? " + comparar);
        comparar = cadena1.endsWith("acordarme");
        System.out.println("Acaba la cadena 1 en acordarme? " + comparar);
        String dni = "12345678Z";
        comparar = dni.endsWith("Z");
        System.out.println("El DNI acaba en Z? " + comparar);
        char letra = dni.charAt(dni.length()-1);
        System.out.println("La letra del DNI escrita es: " + letra);
        comparar = nombre1.equalsIgnoreCase(nombre2);
        String password = "1234";
        int pswdNumero = password.hashCode();
        System.out.println("La contraseña en hashcode de 1234 es: " + pswdNumero);
        int indice = cadena1.indexOf("mancha");
        System.out.println("La posicion de mancha en cadena1 es: " + indice);
        cadena1 = cadena1.replace('u', 'a'); // Reemplaza caracteres
        cadena1 = cadena1.replaceAll("mancha", "Mancha");
        char[] letras = cadena1.toCharArray();
        System.out.println(Arrays.toString(letras));
        String[] arrayCadena1 = cadena1.split(" "); // Si no se indica el separador, crea un array de cada posicion
        System.out.println(Arrays.toString(arrayCadena1));

        // Ejercicio
        // Escribe un nombre y apellidos, y extrae el apellido. Suponemos que el nombre no es compuesto
        Scanner in = new Scanner(System.in);
        String nombre = "Paco Perona";
        String apellido = nombre.split(" ")[nombre.split(" ").length-1];
        System.out.println(apellido);
        // Cómo convertir cualquier valor primitivo en un String
        int numero = 1;
        String numero5 = String.valueOf(numero);
        String booleano1 = String.valueOf(true);
        System.out.println(numero5 + booleano1);
        char ultimoNumero = numero5.charAt(numero5.length() - 1);
        // Si al validar un telefono necesitas saber que tiene 9 numeros y lo pides numerico
        int telefono = 123456789;
        String telefono1 = String.valueOf(telefono);
        // Si quieres extraer de una cadena, sabiendo el indice:
        String temporal = telefono1.substring(0, 4); // Trae 1 caracter empezando en la posicion 0
        System.out.println(temporal);

    }
}
