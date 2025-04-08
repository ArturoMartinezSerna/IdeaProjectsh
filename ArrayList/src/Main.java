import socios.OrdenarPorFecha;
import socios.OrdenarPorId;
import socios.OrdenarPorNombre;
import socios.Socio;

import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        explicacionAL();
    }

    public static void explicacionAL() {
        //Declaracion de un ArrayList
        ArrayList<String> alumnos = new ArrayList<>();

        alumnos.add("Alumno1");
        alumnos.add("Alumno2");
        alumnos.add("Alumno3");
        alumnos.add("Alumno4");
        alumnos.add("Alumno5");
        alumnos.add("Alumno6");
        System.out.println("Alumnos: " + alumnos);
        mostrarAlumnos(alumnos);

        // Borrar un elemento
        alumnos.remove(1);
        alumnos.remove("Alumno5");
        mostrarAlumnosIndex(alumnos);

        // Modificar el valor de una variable
        alumnos.set(1, "Arturo");
        mostrarAlumnosIndex(alumnos);

        // Conocer la longitud del array
        int longitud = alumnos.size();
        System.out.println("Nº de alumnos: " + longitud);

        Collections.sort(alumnos);
        mostrarAlumnos(alumnos);

        boolean busquedaArturo = alumnos.contains("Arturo");
        System.out.println("Se encontro a Arturo? " + busquedaArturo);
        // Borramos un elemento "Arturo"
        alumnos = borrarArturo(alumnos);
        mostrarAlumnos(alumnos);

        busquedaArturo = alumnos.contains("Arturo");
        System.out.println("Se encontro a Arturo? " + busquedaArturo);

        // Buscar la primera ocurrencia de algun parametro
        int indice = alumnos.indexOf("Alba");
        System.out.println("Se encontro a Alba? " + indice);
        alumnos.add("Alba");
        indice = alumnos.indexOf("Alba");
        System.out.println("Se encontro a Alba en posicion " + indice);

        alumnos.clear();
        System.out.println("La lista de alumnos esta vacia");
        mostrarAlumnos(alumnos);

        // Como saber si hay contenido en un ArrayList
        boolean vacio = alumnos.isEmpty();
        vacio = alumnos.size() == 0;
        System.out.println("Esta vacio? " + vacio);

        alumnos.add("Juanma");
        alumnos.add("Alba");
        alumnos.add("Arturo");
        alumnos.add("Anuta");
        alumnos.add("Raul");
        alumnos.add(1, "Sandra");
        mostrarAlumnos(alumnos);

        // Clonar el array
        ArrayList<String> alumnos2 = (ArrayList) alumnos.clone();
        Collections.sort(alumnos2);
        System.out.println("Ordenamos la lista2");
        mostrarAlumnos(alumnos2);
        System.out.println("La lista1 sigue desordenada");
        mostrarAlumnos(alumnos);


    }

    private static void mostrarAlumnos(ArrayList<String> alumnos) {
        for(String alumno: alumnos) {
            System.out.println("Nombre: " + alumno.toUpperCase());
        }
    }

    private static void mostrarAlumnosIndex(ArrayList<String> alumnos) {
        for(int i = 0; i < alumnos.size(); i++) {
            System.out.println("Nombre: " + alumnos.get(i).toUpperCase());
        }
    }

    private static ArrayList<String> borrarArturo(ArrayList<String> alumnos) {
        for(int i = 0; i < alumnos.size(); i++) {
            if(alumnos.get(i).equals("Arturo")) {
                alumnos.remove(i);
            }
        }
        return alumnos;
    }
}