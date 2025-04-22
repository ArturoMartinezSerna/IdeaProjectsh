package ejercicio2;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int opcionPrincipal = 0;
        ArrayList<Libro> libros = new ArrayList<Libro>();

        do {
            opcionPrincipal = mostrarMenuPrincipal();
            switch (opcionPrincipal) {
                case 1 -> aniadirLibro(libros);
                case 2 -> eliminarLibro(libros);
                case 3 -> modificarLibro(libros);
                case 4 -> JOptionPane.showMessageDialog(null, "**** Libros en la estantería: ****\n" + informacionLibros(libros));
            }
        } while(opcionPrincipal != 0);
    }

    private static int mostrarMenuPrincipal() {
        final String menu = """
                1.- Añadir un nuevo libro
                2.- Eliminar un libro
                3.- Modificar un libro
                4.- Mostrar todos los libros
                0.- Salir
                
                Introduzca opción:
                """;
        return Utilidades.pideInt(menu);
    }

    private static void aniadirLibro(ArrayList<Libro> libros) {
         libros.add(crearLibro());
    }
        private static Libro crearLibro() {
            String titulo = Utilidades.pideString("Introduzca el titulo");
            String autor = Utilidades.pideString("Introduzca el autor");
            int paginas = Utilidades.pideInt("Introduzca el número de paginas");
            String ISBN = Utilidades.pideString("Introduzca el ISBN");
            int anioPublicacion = Utilidades.pideInt("Introduzca el anio publicacion");
            String editorial = Utilidades.pideString("Introduzca la editorial");

            return new Libro(titulo, autor, paginas, ISBN, anioPublicacion, editorial);
        }

    private static void eliminarLibro(ArrayList<Libro> libros) {
        Libro libroEliminar = buscarLibro(libros, "Por favor, introduzca el ID del libro a eliminar:");

        if(libroEliminar == null)
            JOptionPane.showMessageDialog(null, "El libro no existe en la estanteria");
        else
            libros.remove(libroEliminar);
    }

    private static void modificarLibro(ArrayList<Libro> libros) {
        Libro libroModificar = buscarLibro(libros, "Por favor, introduzca el ID del libro a eliminar:");

        if(libroModificar == null)
            JOptionPane.showMessageDialog(null, "El libro no existe en la estanteria");
        else {
            mostrarMenuModificarLibro(libroModificar);
        }
    }

        private static void mostrarMenuModificarLibro(Libro libro) {
            final String MENU_MODIFICAR = """
                    1.- Titulo
                    2.- Autor
                    3.- Número de Páginas
                    4.- ISBN
                    5.- Año de publicación
                    6.- Editorial
                    0.- Finalizar modificación
                    """;
            int opcion;
            do {
                opcion = Utilidades.pideInt(libro.toString() + "\n" + MENU_MODIFICAR);
                switch(opcion) {
                    case 1 -> libro.setTitulo(Utilidades.pideString("Introduce el nuevo título del libro"));
                    case 2 -> libro.setAutor(Utilidades.pideString("Introduce el nuevo autor del libro"));
                    case 3 -> libro.setPaginas(Utilidades.pideInt("Introduce el nuevo número de páginas del libro"));
                    case 4 -> libro.setISBN(Utilidades.pideString("Introduce el nuevo ISBN del libro"));
                    case 5 -> libro.setAnioPublicacion(Utilidades.pideInt("Introduce el nuevo año de publicación del libro"));
                    case 6 -> libro.setEditorial(Utilidades.pideString("Introduce la nueva editorial del libro"));
                    case 0 -> JOptionPane.showMessageDialog(null, "...Guardando el libro modificado...");
                    default -> JOptionPane.showMessageDialog(null, "Introduce una opción entre 0 y 6");
                }
            } while(opcion != 0);
        }

        private static Libro buscarLibro(ArrayList<Libro> libros, String mensaje) {
            int idBusqueda = Utilidades.pideInt(informacionLibros(libros) + "\n" + mensaje);

            for(int i = 0; i < libros.size(); i++) {
                if(libros.get(i).id() == idBusqueda) {
                    return libros.get(i);
                }
            }
            return null;
        }

        private static String informacionLibros(ArrayList<Libro> libros) {
            String informacion = "";

            for(Libro libro : libros) {
                informacion += libro.toString() + "\n";
            }

            return informacion;
        }


}
