import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productos;
    int mesa;

    public Pedido(int mesa) {
        productos = new ArrayList<Producto>();
        this.mesa = mesa;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

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
