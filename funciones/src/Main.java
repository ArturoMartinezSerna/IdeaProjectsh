import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nombre = "Arturo";
        saludo();
        // paso de parámetros -> se incluye una variable y se le pasa a la funcion al llamarla
        otroSaludo("Bahamut");
        otroSaludo(nombre); //Usando la variable
        saludoConEdad("Bahamut", Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca su edad:")));
        saludoProximoCumple("Bahamut", (byte)26);
        // Ojo! los parámetros deben ir en el orden que indica la funcion

        String nombre2 = pedirNombre(); // Guardamos el dato recibido por la funcion en un String
        otroSaludo(nombre2); // Llama a la funcion y le pasa el parametro recibido por la funcion
        otroSaludo(pedirNombre());
    }

    // declarar la función
    private static void saludo() { // saludo() es el identificador de la funcion
        JOptionPane.showMessageDialog(null, "Hola mundo!");
    }

    // En esta funcion, le pasamos un valor String con el nombre
    private static void otroSaludo(String nombre) {
        JOptionPane.showMessageDialog(null, "Hola de nuevo, " + nombre + "!");
    }

    // En esta funcion, va a recibir dos parametros. el nombre y la edad
    private static void saludoConEdad(String nombre, int edad) {
        JOptionPane.showMessageDialog(null, "Hola de nuevo, " + nombre + ", Gran Dragón de " + edad + " eones de edad!");
    }

    // Crea una funcion que incremente en uno la edad que ha insertado el usuario, y dile que en su proximo cumpleaños tendrá esa edad
    private static void saludoProximoCumple(String nombre, byte edad) {
        // Mostramos edad actual
        saludoConEdad(nombre, edad);
        edad++; // Mostramos edad el año que viene
        JOptionPane.showMessageDialog(null, "El eón que viene cumplirás " + edad + " eones!");
    }

    // Esta funcion devuelve un valor tipo String .... return variable
    private static String pedirNombre() {
        //return "Arturo";
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        return nombre;
    }
}