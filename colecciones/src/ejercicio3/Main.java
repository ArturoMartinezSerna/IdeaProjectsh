package ejercicio3;

import ejercicio2.Utilidades;
import jdk.jshell.execution.Util;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *  Las colecciones son parte de una librería de Java: Collections. Te permiten agregar objetos dentro de un conjunto.
 *
 *  List -> No ordena los datos y permite duplicados -> ArrayList, LinkedList
 *  Set -> Ordena los datos y no permite duplicados -> LinkedSet, HashSet
 *
 *  ArrayList tiene los metodos:
 *  remove, set, add, get, size, clear, isEmpty, contains
 *
 *  CRUD: Create, Read, Update, Delete
 *
 */

public class Main {

    public static void main(String[] args) {

        int opcionPrincipal;
        ArrayList<Coche> coches = new ArrayList<>();

        // Crea una funcion menu CRUD
        do {
            opcionPrincipal = pideOpcionPrincipal();
            switch(opcionPrincipal) {
                case 1: addCoche(coches); break;
                case 2: mostrarCoches(coches); break;
                case 3: buscarModificarCoche(coches); break;
                case 4: eliminarCoche(coches); break;
            }
        } while(opcionPrincipal != 0);
    }

    private static void addCoche(ArrayList<Coche> coches) {
        Coche coche = Coche.pideCoche();
        coches.add(coche);
    }

    private static void mostrarCoches(ArrayList<Coche> coches) {
        StringBuilder salida = new StringBuilder("Los coches son: \n");
        for(int i = 0; i < coches.size(); i++) {
            salida.append(coches.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, salida.toString());
    }

    private static void buscarModificarCoche(ArrayList<Coche> coches) {
        Coche cocheModificar = Coche.buscaCoche(coches);
        int opcionModificar;
        if(cocheModificar == null) {
            JOptionPane.showMessageDialog(null, "El coche no existe en el concesionario");
        }
        else {
            for (int i = 0; i < coches.size(); i++) {
                if (coches.get(i) == cocheModificar) {
                    do {
                        opcionModificar = modificarCoche(cocheModificar);
                    } while (opcionModificar != 0);
                    break;
                }
            }
        }
    }

        private static int modificarCoche(Coche cocheModificar) {
            final String MENU_MODIFICAR = """
                    Introduzca el campo que desea modificar:
                    1.- Marca
                    2.- Modelo
                    3.- Color
                    4.- Matricula
                    5.- Año de fabricación
                    6.- Kilometraje
                    0.- Salir
                    """;
            int opcionModificar = Utilidades.pideInt(cocheModificar.toString() + "\n" + MENU_MODIFICAR);
            switch(opcionModificar) {
                case 1: cocheModificar.cambiaMarca(); break;
                case 2: cocheModificar.cambiaModelo(); break;
                case 3: cocheModificar.cambiaColor(); break;
                case 4: cocheModificar.cambiaMatricula(); break;
                case 5: cocheModificar.cambiaAnio(); break;
                case 6: cocheModificar.cambiaKilometraje(); break;
            }

            return opcionModificar;
        }

    private static void eliminarCoche(ArrayList<Coche> coches) {
        Iterator it = coches.iterator();
        int idEliminar = Utilidades.pideInt("Introduzca el ID del coche a eliminar:");

        for(; it.hasNext(); ) {
            Coche coche = (Coche)it.next();
            if(coche.id() == idEliminar) {
                it.remove();
                JOptionPane.showMessageDialog(null, "El coche fue eliminado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "El ID del coche no existe");
    }

    private static int pideOpcionPrincipal() {
        final String MENU = """
                Elija una opción:
                1.- Añadir un coche
                2.- Ver los coches
                3.- Modificar un coche
                4.- Eliminar un coche
                0.- Salir
                """;
        String opcion;

        do {
            opcion = JOptionPane.showInputDialog(MENU);
        } while (!Validaciones.isNumeroValido(opcion));
        return Integer.parseInt(opcion);
    }
}


