package socios;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        crearSocios();
    }

    private static void crearSocios() {
        Socio s1 = new Socio(0, "Fran", "11/10/2000");
        Socio s2 = new Socio(1, "Laura", "13/02/2002");
        Socio s3 = new Socio(5, "Alba", "17/11/2000");
        System.out.println(s1.compareTo(s2));
        System.out.println(s3);
        Socio s4 = new Socio(2, "Juanma", "19/11/2000");
        Socio s5 = new Socio(6, "Juan", "20/11/2000");
        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(s1);
        socios.add(s2);
        socios.add(s3);
        socios.add(s4);
        socios.add(s5);
        System.out.println(socios);
        Collections.sort(socios); // Con un parametro, ordena con compareTo
        System.out.println("*********** SOCIOS ORDENADOS por Nombre ***********");
        for (Socio socio : socios) {
            System.out.println(socio);
        }

        Socio socio1 = new Socio(1, "Alba", "01/06/1998");
        Socio socio2 = new Socio(2, "Arturo", "01/06/1198");
        Socio socio3 = new Socio(4, "Laura", "01/06/1938");
        Socio socio4 = new Socio(3, "Pedro", "01/06/2018");
        ArrayList<Socio> socios2 = new ArrayList<>();
        socios2.add(socio1);
        socios2.add(socio2);
        socios2.add(socio3);
        socios2.add(socio4);

        OrdenarPorId ordenaId = new OrdenarPorId();
        OrdenarPorNombre ordenaNombre = new OrdenarPorNombre();
        OrdenarPorFecha ordenaFecha = new OrdenarPorFecha();

        Collections.sort(socios2, ordenaId); // Con dos parametros, ordena con Compare
        System.out.println("SOCIOS ORDENADOS POR ID");
        mostrarSocios(socios2);
        Collections.sort(socios2, ordenaNombre);
        System.out.println("SOCIOS ORDENADOS POR Nombre");
        mostrarSocios(socios2);
        Collections.sort(socios2, ordenaFecha);
        System.out.println("SOCIOS ORDENADOS POR fecha");
        mostrarSocios(socios2);
    }

    private static void mostrarSocios(ArrayList<Socio> alumnos) {
        for(Socio alumno: alumnos) {
            System.out.println("Nombre: " + alumno.nombre().toUpperCase());
        }
    }

}
