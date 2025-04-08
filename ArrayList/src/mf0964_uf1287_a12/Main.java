package mf0964_uf1287_a12;

// TIP: Hello world!
/*
 * Requisitos funcionales del backend en Java:
 *  Crear un modelo de datos basado en los campos del formulario:
 *  DNI Nombre Apellidos Edad Móvil Email (doble validación)
 * Implementar validaciones:
 *  El DNI debe tener un formato válido (8 números + letra).
 *  El email debe coincidir con la confirmación.
 *  La edad mínima es 18 y máxima 65 años no se crea el cliente.
 *  Plus-> Puedes validar el telefono también
 * Para probar el código en Java, da de alta al menos 3 clientes y Mostrar por consola un mensaje
 * de confirmación si toodo es correcto.
 *      Implementar el código usando clases y objetos, aplicando buenas prácticas de POO.
 * usar arrays o ArrayList
 */

// TODO: Usar un showOptionDialog

import mf0964_uf1287_a12.objects.Usuarios;
import mf0964_uf1287_a12.utilities.Util;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        int opcion;

        do {
            opcion = mostrarMenuPrincipal();
            switch(opcion) {
                case 1: {
                    do {
                        usuarios.pideUsuario();
                    }while(preguntarSiIntroducirOtro());
                }
                break;
                case 2: {
                    usuarios.mostrarUsuarios();
                }
                break;
                case 0: {
                    mostrarDespedida();
                }
                break;
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
            }
        } while(opcion != 0);
    }

    private static int mostrarMenuPrincipal() {
        final String MENU_PRINCIPAL = """
                **************************************
                * 1.- Introducir un nuevo usuario  *
                * 2.- Mostrar usuarios             *
                * 0.- Salir del programa           *
                **************************************
                """;
        return Util.pideInt(MENU_PRINCIPAL + "Introduzca la opcion:");
    }

    private static void mostrarDespedida() {
        final String DESPEDIDA = """
                ********************************************
                * Gracias por utilizar nuestra aplicación! *
                ********************************************
                """;
        JOptionPane.showMessageDialog(null, DESPEDIDA);
    }

    private static boolean preguntarSiIntroducirOtro() {
        String respuestaUsuario;
        boolean repetimosPregunta;

        do {
            respuestaUsuario = JOptionPane.showInputDialog(null, "Desea introducir otro usuario?");
            if (respuestaUsuario.equalsIgnoreCase("no") || (respuestaUsuario.equalsIgnoreCase("si")))
                repetimosPregunta = false;
            else {
                JOptionPane.showMessageDialog(null, "Introduzca \"Si\" o \"No\" para continuar");
                repetimosPregunta = true;
            }
        }while(repetimosPregunta);

        return respuestaUsuario.equalsIgnoreCase("si");
    }
}
