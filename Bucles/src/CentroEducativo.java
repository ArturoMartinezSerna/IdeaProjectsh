/*
 * Implementar una aplicacion para calcular datos estadísticos de las edades de los alumnos de un centro educativo. Se introducirán datos hasta que uno de ellos sea negativo.
 *
 * Como resultado, mostrar:
 * - La suma de todas las edades
 * - La media de las edades
 * - El número de alumnos
 * - Cuántos son mayores de edad
 */

import javax.swing.*;

public class CentroEducativo {
    public static void main(String[] args) {
        int suma = 0;
        double media;
        int numAlumnos = 0;
        int alumnosMayor18 = 0;
        int edadActual;
        String output = "";
        String despedida = "Gracias por usar nuestra app! =)";

        edadActual = pideEdadAlumno("Por favor, introduzca la edad del alumno:");

        while(edadActual >= 0) {
            suma += edadActual;
            numAlumnos++;
            if(edadActual >= 18) {
                alumnosMayor18++;
            }
            edadActual = pideEdadAlumno("Por favor, introduzca la edad del alumno:");
        }
        media = (double)suma / numAlumnos;
        output += "La suma de todas las edades es: " + suma + "\nLa media de las edades es: " + media + "\nEl número de alumnos es de: " + numAlumnos + "\nEl número de alumnos mayores de edad es de: " + alumnosMayor18;
        JOptionPane.showMessageDialog(null, output);
        JOptionPane.showMessageDialog(null, despedida);
    }

    private static int pideEdadAlumno(String mensaje) {
        String edadText;
        boolean centinela;
        int edad = 0;

        do {
            centinela = false;
            try {
                edadText = JOptionPane.showInputDialog(mensaje);
                edad = Integer.parseInt(edadText);
            } catch (NumberFormatException e) {
                centinela = true;
            }
        } while(centinela);


        return edad;
    }
}
