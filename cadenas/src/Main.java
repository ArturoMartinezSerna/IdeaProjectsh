/*
 * Las cadenas son objetos que se comportan como arrays. Su primer indice en las tablas es 0.
 *  Al ser un objeto, en vez de ser un campo length, se llama a un metodo length()
 *
 * Character.isLetterOrDigit -> Alfanumericos
 * Character.isLowerCase -> verifica que es una letra minuscula
 * Character.isUpperCase
 * Character.isSpaceChar -> verifica que el caracter sea un espacio
 * Character.isWhitespace -> igual que el anterior, pero tambien vale para saltos de linea por ejemplo. \n, \t, \r
 * Character.isLetter -> verifica que sea una letra
 * Character.isDigit -> verifica que sea un digito
 * String.charAt(posicion)
 *
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palindromo = "Amad a la dama";
        String miCadena = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
        int longitudMiCadena = miCadena.length();
        System.out.println("La longitud de mi cadena es: " + longitudMiCadena);
        // Metodo para extraer una posicion o caracter de una cadena: charAt(posicion)
        char letra = miCadena.charAt(0);
        System.out.println(letra);
        String comprobar = "";
        for(int i = palindromo.length() - 1; i >= 0; i--){
            comprobar += palindromo.charAt(i);
        }
        System.out.println(comprobar);

        System.out.println(comprobar.toUpperCase());

        // Toma 2 telefonos en String y comprueba que comience por 6-7-8-9
        // Comprueba un nombre (una cadena de texto que no contenga numeros)
        // Mas adelante veremos expresiones regulares (RegEx)
        String movil, nombre, email;
        Scanner in = new Scanner(System.in);
        System.out.println("Indique su nombre");
        nombre = in.nextLine();
        System.out.println("Indique su numero de telefono");
        movil = in.nextLine();
        System.out.println("Introduzca su email:");
        email = in.nextLine();
        boolean esNombreValido = isLetrasOEspacios(nombre);
        boolean esMovilValido = isEmpieza6_9(movil.charAt(0))&& isLongitud9(movil);
        boolean isEmailValido = tieneArrobaPunto(email);
        System.out.println("El nombre es valido: " + esNombreValido);
        System.out.println("El movil es valido: " + esMovilValido);
        System.out.println("El email es valido: " + isEmailValido);
    }

    private static boolean isLetrasOEspacios(String texto) {
        boolean resultado = true;

        for(int i = 0; i < texto.length(); i++){
            if(isLetrasOEspacios(texto.charAt(i)))
                continue;
            else
                return false;
        }
        return resultado;
    }
    private static boolean isLetrasOEspacios(char letra) {
        return letra == ' ' || (letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z');
    }

    private static boolean isEmpieza6_9(char letra) {
        return letra >= '6' && letra <= '9';
    }

    private static boolean isLongitud9(String movil) {
        return movil.length() == 9;
    }

    /*
     * Validar un e-mail: (letras@letras.letras)
     */
    private static boolean tieneArrobaPunto(String email) {
        boolean hayArroba = false;
        boolean hayPunto = false;
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                hayArroba = true;
            }
            if(email.charAt(i) == '.')
                hayPunto = true;
        }
        return hayArroba && hayPunto;
    }

    /*
     Character.isLetter(letra)
     Character.isSpaceChar(letra)
     */
}