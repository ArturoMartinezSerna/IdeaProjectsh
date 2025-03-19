import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente("Paco", Cliente.Sexo.HOMBRE);
        System.out.println(c.toString());
        Cliente c2 = new Cliente("Maria", Cliente.Sexo.valueOf("MUJER"));
        System.out.println(c2);

        System.out.println("Indique la talla: MINI, MEDIANA, GRANDE, MUYGRANDE");
        String talla = new Scanner(System.in).nextLine().toUpperCase();

        Tallas laTalla = Tallas.valueOf(talla);
        System.out.println("La talla seleccionada es: " + laTalla.getAbreviatura());

        int libro = 25;
        TipoIVA iva = TipoIVA.IVAGENERAL;
        double precioMasIva = libro * iva.getPorcentajeIVA();
        System.out.println("El libro cuesta: " + precioMasIva);
    }
}