import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Esta clase contiene el pedido completo que realiza una mesa.
 * Contiene tanto un valor mesa a la que corresponde el pedido, como métodos esenciales para dicho pedido
 */
public class Pedido {
    private ArrayList<Producto> productos; // Los productos que piden los usuarios. Cada Producto es una comida o bebida.
    int mesa; // El número de mesa a la que refiere el producto.

    // Constructor
    public Pedido(int mesa) {
        productos = new ArrayList<Producto>();
        this.mesa = mesa;
    }

    /**
     * Este metodo añade un producto al Array de productos que ha pedido esta mesa
     * @param producto es el producto a añadir
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Este metodo elimina un producto al Array de productos que ha pedido esta mesa
     * @param producto es el producto a eliminar
     */
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    /**
     * Muestra todos los productos y calcula el total de la cuenta que debera pagarse por este pedido
     */
    public double mostrarCuenta() {
        DecimalFormat df = new DecimalFormat("0.00");
        double cuenta = 0;
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("MESA: ").append(mesa).append("\n");
        for(Producto producto: productos) {
            mensaje.append(producto.name() + "... Precio: " + util.Utilidades.formatoEuros(producto.precio) + "\n");
            cuenta += producto.precio;
        }
        JOptionPane.showMessageDialog(null, mensaje.append("\nCuenta del pedido: " + util.Utilidades.formatoEuros(cuenta)));
        return cuenta;
    }
}
