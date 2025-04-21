package ejercicio1;
//TIP Vamos a crear un proyecto donde:

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Creamos una clase Alumnos con los atributos:
 * nombre, apellidos, curso, notaMedia, Materia (tiene que ser Enum)
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        while(mostrarMenu(alumnos) != 0) {

        };

    }
    // CREAMOS LA COLECCION DE MANERA GLOBAL para que todos los metodos puedan acceder a ella

    /**
     * Creamos un menu con las opciones de:
     * Alta, Baja, Modificacion, Mostrar todos
     */
    public static int mostrarMenu(ArrayList<Alumno> alumnos) {
        final String menu = "1.- Alta\n2.- Baja\n3.- Modificacion\n4.- Mostrar todos\n0.- Salir.\nElige una opción: ";
        int opcion;


        opcion = pideEntero(menu);
        switch (opcion) {
            case 1 -> anadirAlumno(alumnos);
            case 2 -> eliminarAlumno(alumnos);
            case 3 -> modificarAlumno(alumnos);
            case 4 -> mostrarPantalla(informacionAlumnos(alumnos));
            case 0 -> mostrarPantalla("Saliendo del sistema");
            default -> mostrarPantalla("Opción no válida. Introduce una opción entre 0 y 4");
        }
        return opcion;
    }

    private static void anadirAlumno(ArrayList<Alumno> alumnos) {
        Alumno nuevoAlumno = pideNuevoAlumno();
        alumnos.add(nuevoAlumno);
    }

    private static void eliminarAlumno(ArrayList<Alumno> alumnos) {
        int idEliminar = pideEntero("Introduce el ID del alumno a eliminar: ");
        eliminarAlumno(alumnos, idEliminar);
    }

        private static void eliminarAlumno2(ArrayList<Alumno> alumnos, int idAlumno) {
                for(int i = 0; i < alumnos.size(); i++) {
                    if(idAlumno == alumnos.get(i).getIdAlumno())
                        alumnos.remove(alumnos.get(i));
                }
        }

        private static void eliminarAlumno(ArrayList<Alumno> alumnos, int idAlumno) {
            boolean eliminado = false;
            Iterator<Alumno> it = alumnos.iterator();
            while(it.hasNext()) {
                Alumno a = it.next();
                if(a.getIdAlumno() == idAlumno) {
                    eliminado = true;
                    it.remove();
                    mostrarPantalla("El alumno de id " + idAlumno + " fue eliminado correctamente.");
                }
            }
            if(!eliminado)
                mostrarPantalla("El ID del alumno no existe");
        }

    private static void modificarAlumno(ArrayList<Alumno> alumnos) {
        final String OPCIONES_MODIFICAR = "1.- Nombre\n2.- Apellido\n3.- Curso\n4.- Nota media\n5.- Materia";
        String salida = informacionAlumnos(alumnos);
        int idModificar = pideEntero(salida + "\nIngrese el ID del alumno a modificar:");
        Alumno modificado = buscarAlumno(alumnos, idModificar);
        if(modificado != null) {
            int queModificar = pideEntero(modificado.toString() + "\nIngrese el campo del alumno a modificar:\n" + OPCIONES_MODIFICAR);

            switch(queModificar) {
                case 1 -> modificado.setNombre(pideString("Introduce el nuevo nombre:"));
                case 2 -> modificado.setApellido(pideString("Introduce el nuevo apellido:"));
                case 3 -> modificado.setCurso(pideString("Introduce el nuevo curso:"));
                case 4 -> modificado.setNotaMedia(pideDoble("Introduce la nueva nota media:"));
                case 5 -> modificado.setMateria(pideMateria());
                default -> mostrarPantalla("Introdujiste una opción inválida. Cancelando...");
            }
        }
        else {
            mostrarPantalla("El ID del alumno no existe");
        }
    }

        private static Alumno buscarAlumno(ArrayList<Alumno> alumnos, int idAlumno) {
            for(Alumno a : alumnos) {
                if(a.getIdAlumno() == idAlumno)
                    return a;
            }
            return null;
        }

    private static String informacionAlumnos(ArrayList<Alumno> alumnos) {
        StringBuilder output = new StringBuilder();
        for(Alumno a : alumnos) {
            output.append(a.toString());
        }
        return output.toString();
    }

    private static Alumno pideNuevoAlumno() {
        String nombre = pideString("Ingrese el nombre del alumno: ");
        String apellido = pideString("Ingrese el apellido del alumno: ");
        String curso = pideString("Ingrese el curso del alumno: ");
        Alumno.Materia materia = pideMateria();
        double notaMedia = pideDoble("Ingrese la nota media del alumno: ");

        return new Alumno(nombre, apellido, curso, notaMedia, materia);
    }

            private static Alumno.Materia pideMateria() {
                Alumno.Materia[] opciones = Alumno.Materia.values();

                int respuesta = JOptionPane.showOptionDialog(
                        null,
                        "Selecciona la materia del alumno",
                        "Materias",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]
                );
                return opciones[respuesta];
            }
            private static String pideString(String peticion) {

                String devolucion;

                devolucion = JOptionPane.showInputDialog(null, peticion);

                return devolucion;
            }
            private static int pideEntero(String peticion) {

                int devolucion;
                String devolucionT;

                devolucionT = JOptionPane.showInputDialog(null, peticion);
                devolucion = Integer.parseInt(devolucionT);

                return devolucion;
            }
            private static double pideDoble(String peticion) {

                double devolucion;
                String devolucionT;

                devolucionT = JOptionPane.showInputDialog(null, peticion);
                devolucion = Double.parseDouble(devolucionT);

                return devolucion;
            }
            private static void mostrarPantalla(String mensaje) {
                JOptionPane.showMessageDialog(null, mensaje);
            }
}
