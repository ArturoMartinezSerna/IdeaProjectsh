import javax.swing.*;

/**
 * ENUNCIADO:
 * Una empresa que se dedica a la venta de Aceite de Oliva necesita una aplicación en java para gestionar las facturas.
 * En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
 * Realizar un menú, con la siguiente estructura:
 * 1. Facturar
 * 2. Salir
 * En facturar, solicitar el código que pueden ser (01 de 1 litro, 02 de 3 litros y 03 de 5 litros)
 * Según el formato, los precios son:
 * 1 litro -> 9,99€
 * 3 litros -> 29,99€
 * 5 litros-> 49,95€
 * Según lo que haya facturado mostrar los datos suministrados, el total de la factura, y el IVA 4%
 */

public class Main {
    public static void main(String[] args) {
        int opcion;
        int opcionAceite;
        double totalFactura = 0;
        do {
            opcion = muestraMenuPrincipal();
            switch (opcion) {
                case 1: {
                    opcionAceite = muestraMenuAceite();
                    switch(opcionAceite) {
                        case 1: totalFactura += pideCalculaImporte("01");
                        break;
                        case 2: totalFactura += pideCalculaImporte("02");
                        break;
                        case 3: totalFactura += pideCalculaImporte("03");
                        break;
                        default: JOptionPane.showMessageDialog(null, "Opcion no valida");
                        }
                    }
                    break;
                case 2: ;
                break;
                default: JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while(opcion != 2);

        mostrarFactura(totalFactura);
    }

    /**
     * Este metodo muestra el menú principal, y devuelve la opción introducida
     * @return un número entero, que es la opción introducida
     */
    private static int muestraMenuPrincipal() {
        // Esta constante guarda lo que mostrará el menú
        final String MENU_PRINCIPAL = "Bienvenido a Venta de Aceite de Oliva\n1 -> Facturar\n2 -> Salir";

        // Devolvemos el resultado de introducir la opción
        return Utilidades.pideNumeroEntero(MENU_PRINCIPAL);
    }

    private static int muestraMenuAceite() {
        String MENU_ACEITE = "1 litro -> 9,99€\n 3 litros -> 29,99€ \n5 litros-> 49,95€";

        return Utilidades.pideNumeroEntero(MENU_ACEITE);
    }

    private static double pideCalculaImporte(String codigoArticulo) {
        int litros;
        double precio;
        switch(codigoArticulo) {
            case "01": precio = 9.99;
            break;
            case "02": precio = 29.99;
            break;
            case "03": precio = 49.95;
            break;
            default: precio = 0;
        }

        litros = Utilidades.pideNumeroEntero("Introduce la cantidad de articulos de codigo " + codigoArticulo);
        return litros*precio;
    }
    // Según lo que haya facturado mostrar los datos suministrados, el total de la factura, y el IVA 4%
    private static void mostrarFactura(double totalFactura) {
        final String MENSAJE_FACTURADA = "Facturada la factura: " + (int)(Math.random()*1000) + "\nEl valor total sin iva es: " + totalFactura
                + "\nIVA: ";
        double iva = (double)(totalFactura*4)/100;
        JOptionPane.showMessageDialog(null, MENSAJE_FACTURADA + iva + "\nEl valor total es: " + totalFactura*1.04);
    }
}

/*
public class Main {
    public static void main(String[] args) {

        int opcion;
        Factura[] facturas = new Factura[10];

        do {
            opcion = muestraMenuPrincipal();
            switch (opcion) {
                case 1: facturas[Factura.nextFactura] = new Factura();
                    facturas[Factura.nextFactura] = facturas[Factura.nextFactura].inicializaFactura();
                    Factura.nextFactura++;
                break;
                case 2: mostrarFacturas(facturas);
                break;
                default: JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while(opcion != 2);
        mostrarDespedida();
    }

    /**
     * Este metodo muestra el menú principal, y devuelve la opción introducida
     * @return un número entero, que es la opción introducida
     *//*
    private static int muestraMenuPrincipal() {
        // Esta constante guarda lo que mostrará el menú
        final String MENU_PRINCIPAL = "Bienvenido a Venta de Aceite de Oliva\n1 -> Facturar\n2 -> Salir";

        // Devolvemos el resultado de introducir la opción
        return Utilidades.pideNumeroEntero(MENU_PRINCIPAL);
    }
    private static void mostrarFacturas(Factura[] facturas) {
        for(int i = 0; i < Factura.nextFactura - 1; i++){
            JOptionPane.showMessageDialog(null, "Factura " + facturas[i].numeroFactura + "\n" + facturas[i].getFacturaString());
        }
    }
    private static void mostrarDespedida() {
        JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa");
    }


}

class Factura {
    final static int MAXIMO_LINEAS = 20; // TODO: Mejorable usando ArrayList
    static int nextFactura = 0;
    int numeroFactura;
    LineaFactura[] lineasFactura = new LineaFactura[MAXIMO_LINEAS];
    int nextLinea = 0;

    public Factura inicializaFactura() {
        Factura miFactura = new Factura();
        miFactura.numeroFactura = Factura.nextFactura++;
        int opcion;

        do {
            opcion = mostrarMenuFactura();
            switch (opcion) {
                case 1: lineasFactura[nextLinea] = LineaFactura.nuevaLinea("01");
                nextLinea++;
                break;
                case 2: lineasFactura[nextLinea] = LineaFactura.nuevaLinea("02");
                    nextLinea++;
                break;
                case 3: lineasFactura[nextLinea] = LineaFactura.nuevaLinea("03");
                    nextLinea++;
            }
        } while(opcion != 0);

        return miFactura;
    }

    private static int mostrarMenuFactura() {
        String MENU_FACTURAS = "Bienvenido a Venta de Aceite de Oliva \n1 -> Comprar aceite de 1 litro\n2 -> Comprar aceite de 3 litros\n3 -> Comprar aceite de 5 litros\n0 -> Salir";
        return Utilidades.pideNumeroEntero(MENU_FACTURAS);
    }


    //Devuelve las lineas de factura con un bucle for
    public String getFacturaString() {
        String devolver = "";
        System.out.println("Nextlinea: " + nextLinea);
        for(int i = 0; i < nextLinea; i++){
            devolver += lineasFactura[i].toString() + "\n";

        }
        return devolver;
    }
}

class LineaFactura {
    final static Articulo botella1litro = new Articulo("01", 9.99);
    final static Articulo botella3litros = new Articulo("02", 29.99);
    final static Articulo botella5litros = new Articulo("03", 49.95);

    static int cantidadLitrosVendidos;
    static Articulo articuloVendido;

    public LineaFactura(int cantidadLitrosVendidos, Articulo articuloVendido) {
        this.cantidadLitrosVendidos = cantidadLitrosVendidos;
        this.articuloVendido = articuloVendido;
    }

    public static LineaFactura nuevaLinea(String codigoArticulo) {
        cantidadLitrosVendidos = Utilidades.pideNumeroEntero("Introduzca la cantidad del artículo " + codigoArticulo);

        switch(codigoArticulo) {
            case "01": articuloVendido = botella1litro; break;
            case "02": articuloVendido = botella3litros; break;
            case "03": articuloVendido = botella5litros; break;
            default: JOptionPane.showMessageDialog(null, "Error en LineaFactura.nuevaLinea(codArticulo)");
        }
        return new LineaFactura(cantidadLitrosVendidos, articuloVendido);
    }


    //Da el total de multiplicar la cantidad de litros por el precio del aceite
    public double getTotal() {
        return articuloVendido.precioLitro * cantidadLitrosVendidos;
    }
}

class Articulo {
    String codigoArticulo;
    double precioLitro;

    public Articulo(String codigoArticulo, double precioLitro) {
        this.codigoArticulo = codigoArticulo;
        this.precioLitro = precioLitro;
    }
}
*/
class Utilidades {
    public static int pideNumeroEntero(String peticion) {
        int numero = 0;
        boolean numeroValido;
        do { // Repetimos peticion mientras no sea numero valido
            try {
                // Recogemos el String introducido por el usuario, lo parseamos a int, y guardamos el numero
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, peticion));

                // Si no salta la excepción, el número introducido fue válido
                numeroValido = true;
            } catch (NumberFormatException e) { // Si salta la excepcion de que el String introducido no es un número
                // Mostramos un mensaje de error
                JOptionPane.showMessageDialog(null, "Por favor, introduzca un número entero");
                // Hacemos que repita la peticion
                numeroValido = false;
            }
        } while(!numeroValido);
        return numero;
    }
}