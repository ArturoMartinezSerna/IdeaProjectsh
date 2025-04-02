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
        Collections.sort(socios);
        System.out.println("*********** SOCIOS ORDENADOS por Nombre ***********");
        for (Socio socio : socios) {
            System.out.println(socio);
        }
    }
}
