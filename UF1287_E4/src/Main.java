import javax.swing.*;
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
        int opcionPrincipal;
        int opcionMesa;
        Pedido pedido;

        // Mientras el trabajador no salga de la aplicación pulsando 0
        do {
            // Mostramos el menú principal y recogemos la opcion seleccionada
            opcionPrincipal = mostrarMenuPrincipal();
            if(opcionPrincipal == 1) { // Si la opcion es 1, el usuario esta atendiendo una nueva mesa
                pedido = new Pedido(pedirNumeroMesa()); // Creamos el pedido de la mesa, y le pedimos el numero de mesa
                do {
                    opcionMesa = mostrarMenuMesa(); // Mostramos el menú de la mesa seleccionada

                    // Dependiendo de la opción seleccionada
                    switch (opcionMesa) {
                        case 1: {
                            Producto productoElegido = eligeEntreProductos(); // Mostramos la lista de productos y damos a elegir el que quiere añadir
                            pedido.agregarProducto(productoElegido); // Lo añadimos al pedido
                        }
                        break;
                        case 2: {
                            Producto productoElegido = eligeEntreProductos(); // Mostramos la lista de productos y damos a elegir el que quiere eliminar
                            pedido.eliminarProducto(productoElegido); // Lo borramos del pedido
                        }
                        break;
                        case 3: {
                            pedido.mostrarCuenta(); // Mostramos la cuenta del pedido, incluyendo todos los Productos del pedido
                        }
                        break;
                        case 4: {
                            double cuenta = pedido.mostrarCuenta(); // Mostramos la cuenta del pedido, incluyendo los productos, y lo guardamos en la variable cuenta.
                            pagarCuenta(cuenta); // Procedemos a pagar la cuenta
                            mandarPedidoACocina(); // Tras pagar la cuenta, mandamos el pedido a cocina para que lo preparen
                        }
                    }
                    // Si la opcion es 0, cancela el pedido y sale.
                    // Si la opcion es 4, el pedido ya está en cocina y solo queda que la cocina prepare el pedido y se le entregue al cliente.
                } while (opcionMesa != 4 && opcionMesa != 0);
            }
            // Repetimos atender a otra mesa, hasta que se pulse 0 (salir de la aplicación)
        } while(opcionPrincipal != 0);
        mostrarDespedida(); // Nos despedimos del usuario, dándole ánimos porque la hostelería es un trabajo duro
    }

    /** Muestra el menú principal*/
    private static int mostrarMenuPrincipal() {
        final String MENSAJE = """
                1.- Atender una nueva mesa
                0.- Salir.
                Introduzca opción: 
                """;
        return util.Utilidades.pideEntero(MENSAJE);
    }

    /**Muestra el menú de atención a una mesa seleccionada*/
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

    /** Pide y devuelve el número de una mesa */
    private static int pedirNumeroMesa() {
        final String MENSAJE = "Por favor, introduzca el número de la mesa a la que añadir el pedido: ";
        return util.Utilidades.pideEntero(MENSAJE);
    }

    /** Muestra los productos que hay en el menú, y devuelve el producto seleccionado */
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
            case 1: // Pides el numero entero de menus, y dependiendo de si es el 1, 2, 3, 4 o 5, pues creas un MENU1 o MENU2...
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

    /** Entra a pagar la cuenta. No hay forma de salir de aquí hasta que se pague, porque el usuario no debe irse sin pagar */
    private static void pagarCuenta(double cuenta) {
        final String MENSAJE = "Por favor, introduzca el dinero: ";
        double dineroUsuario;


        do {
            dineroUsuario = util.Utilidades.pideDouble(MENSAJE);
        } while(cuenta > dineroUsuario);
        JOptionPane.showMessageDialog(null, "El usuario ha pagado satisfactoriamente! El cambio es: " + util.Utilidades.formatoEuros(dineroUsuario - cuenta) );
    }

    /** Aquí se mandaría el pedido a cocina, llamando a los metodos que creariamos para ello */
    private static void mandarPedidoACocina() {
        JOptionPane.showMessageDialog(null, "Enviado el pedido a cocina!");
    }

    /** Nos despedimos del usuario, dándole ánimos porque tenemos que cuidar a nuestros empleados */
    private static void mostrarDespedida() {
        JOptionPane.showMessageDialog(null, "Gracias por trabajar con nosotros! Mañana más. Asegúrate de descansar! <3");
    }
}