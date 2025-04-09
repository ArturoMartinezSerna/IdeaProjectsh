import javax.swing.*;
import java.text.DecimalFormat;

//TIP Diseñar en Java con POO en donde el Camarero de un Bar pueda  tomar notas de los Menús que se sirven. Tenemos el MENU1 MENU2 MENU3 MENU4 MENU5
//
//El camarero en el pedido indicará :
//La mesa al que se hace referencia el pedido
//Los menús que piden los clientes
//El saldo del pedido
//Y cuando lo soliciten los clientes, la cuenta a pagar.
//
//Recomendaciones:  ENUM/ArraysList/Arrays para los productos, el que tu prefieras, POO, instanciar la clase Comandas con un Ejemplo. Comenta el código
//
// Valoración:
//2 puntos POO
//2 puntos ENUM- ArrayList-Arrays
//2 puntos instanciar correctamente la Clase
//1 puntos interfaces visuales (JOPTION )
//2 puntos Funciones y modularidad de la aplicación
//1 punto documentación
public class Main {
    public static void main(String[] args) {
        int opcion;
        Pedido pedido;

        while(mostrarMenuPrincipal() != 0) {
            pedido = new Pedido(pedirNumeroMesa());
            do {
                opcion = mostrarMenuMesa();

                switch (opcion) {
                    case 1: {
                        Producto productoElegido = eligeEntreProductos();
                        pedido.agregarProducto(productoElegido);
                    }
                    break;
                    case 2: {
                        Producto productoElegido = eligeEntreProductos();
                        pedido.eliminarProducto(productoElegido);
                    }
                    break;
                    case 3: {
                        pedido.mostrarCuenta();
                    }
                    break;
                    case 4: {
                        double cuenta = pedido.mostrarCuenta();
                        System.out.println("La cuenta es: " + cuenta);
                        pagarCuenta(cuenta);
                        mandarPedidoACocina();
                    }
                }
            } while (opcion != 4 && opcion != 0);
        }
        mostrarDespedida();
    }

    private static int mostrarMenuPrincipal() {
        final String MENSAJE = """
                1.- Atender una nueva mesa
                0.- Salir.
                Introduzca opción: 
                """;
        return util.Utilidades.pideEntero(MENSAJE);
    }

    private static int mostrarMenuMesa() {
        final String MENSAJE = """
                1.- Añadir un nuevo producto.
                2.- Eliminar un producto.
                3.- Mostrar productos pedidos.
                4.- Finalizar pedido.
                0.- Cancelar pedido.
                Introduzca opción: 
                """;
        return util.Utilidades.pideEntero(MENSAJE);
    }

    private static int pedirNumeroMesa() {
        final String MENSAJE = "Por favor, introduzca el número de la mesa a la que añadir el pedido: ";
        return util.Utilidades.pideEntero(MENSAJE);
    }

    private static Producto eligeEntreProductos() {
        final String MENSAJE = """
                Indique el menú a comprar:
                1.- MENU1 ---- 1€
                2.- MENU2 ---- 2€
                3.- MENU3 ---- 3€
                4.- MENU4 ---- 4€
                5.- MENU5 ---- 5€
                """;
        Producto productoElegido;
        final int OPCION_MINIMA = 1;
        final int OPCION_MAXIMA = 5;

        int indiceProductoElegido;

        do {
            indiceProductoElegido = util.Utilidades.pideEntero(MENSAJE);
        } while(indiceProductoElegido < OPCION_MINIMA || indiceProductoElegido > OPCION_MAXIMA);

        switch(indiceProductoElegido) {
            case 1:
                productoElegido = Producto.MENU1;
                break;
            case 2:
                productoElegido = Producto.MENU2;
                break;
            case 3:
                productoElegido = Producto.MENU3;
                break;
            case 4:
                productoElegido = Producto.MENU4;
                break;
            case 5:
                productoElegido = Producto.MENU5;
                break;
            default:
                productoElegido = null;
        }

        return productoElegido;
    }

    private static void pagarCuenta(double cuenta) {
        final String MENSAJE = "Por favor, introduzca el dinero: ";
        double dineroUsuario;


        do {
            dineroUsuario = util.Utilidades.pideDouble(MENSAJE);
        } while(cuenta > dineroUsuario);
        JOptionPane.showMessageDialog(null, "El usuario ha pagado satisfactoriamente! El cambio es: " + util.Utilidades.formatoEuros(dineroUsuario - cuenta) );
    }

    private static void mandarPedidoACocina() {
        JOptionPane.showMessageDialog(null, "Enviado el pedido a cocina!");
    }

    private static void mostrarDespedida() {
        JOptionPane.showMessageDialog(null, "Gracias por trabajar con nosotros! Mañana más. Asegúrate de descansar! <3");
    }
}