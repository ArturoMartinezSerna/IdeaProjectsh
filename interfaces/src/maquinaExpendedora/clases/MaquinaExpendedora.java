package maquinaExpendedora.clases;

import javax.swing.*;

public class MaquinaExpendedora implements OperacionesMaquina {
    private final Golosina[][] productos = new Golosina[4][4];
    private int[][] stock = new int[4][4];
    private double totalVentas = 0;

    public MaquinaExpendedora() {
        inicializarProductos();
        rellenarMaquina(5);
    }

    // Inicializa la maquina expendedora con el tipo de Golosina en cada posicion
    private void inicializarProductos() {
        String[][] nombres = {
                {"KitKat", "Chicles de fresa", "Chicles de melocoton", "Lacasitos"},
                {"KinderBueno", "Manzana", "Pera", "Mandarina"},
                {"Chocolate", "Donnas", "Piruletas", "Bastones de caramelo"},
                {"Galletas Oreo", "Chips Ahoy", "M&Ms", "Patatas fritas"}
            };
        double[][] precios = {
                {1.1, 1.2, 1.3, 1.4},
                {1.5, 1.6, 1.7, 1.8},
                {1.9, 2.0, 2.1, 2.2},
                {2.3, 2.4, 2.5, 2.6}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                productos[i][j] = new Golosina(precios[i][j], nombres[i][j]);
            }
        }
    }

    // Rellena completamente la maquina expendedora, con la cantidad a rellenar en cada uno
    private void rellenarMaquina(int cantidadProductos) {
        for(int i = 0; i < stock.length; i++) {
            for(int j = 0; j < stock[i].length; j++) {
                stock[i][j] = cantidadProductos;
            }
        }
    }

    @Override
    public void apagarMaquina() {
        JOptionPane.showMessageDialog(null, "Total recaudado: " + String.format("%.2f", totalVentas) + "€");
    }

    @Override
    public void pedirGolosina() {
        String opcionT;

        StringBuilder sb = mostrarGolosinas();
        sb.append("\n Indica tu opción:");
        opcionT = JOptionPane.showInputDialog(null, sb.toString());
        try {
            int opcion = Integer.parseInt(opcionT);
            int fila = opcion / 10;
            int columna = opcion % 10;
            if(fila >= 0 && columna >= 0 && columna < 4 && fila < 4) {
                if(stock[fila][columna] > 0) {
                    Golosina g = productos[fila][columna];
                    double precio = g.getPrecio();
                    // Pedimos al usuario con cuanto nos va a pagar
                    String dineroStr = JOptionPane.showInputDialog("Precio del producto: " + precio + "€ Introduce el dinero:");
                    double dinero = Double.parseDouble(dineroStr);
                    // Validamos el dinero ingresado...
                    if (dinero >= precio) {
                        double cambio = dinero - precio;
                        stock[fila][columna]--;
                        totalVentas += precio;
                        JOptionPane.showMessageDialog(null, "Disfruta de tu " + g.getNombre() + "\n Tu cambio es: " + String.format("%.2f", cambio) + "€");
                    } else {
                        JOptionPane.showMessageDialog(null, "Dinero insuficiente para comprar la golosina");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Golosina agotada");
                }
            }
        } catch (NumberFormatException e) {

        }
    }

    @Override
    public void rellenarStock() {
        // El tecnico que rellena el stock tiene una contraseña para poder abrirla
        String pass = JOptionPane.showInputDialog("Ingrese su contraseña");
        if(pass == null) return;
        if(pass.equals("chuches")) {
            rellenarMaquina(5);
            JOptionPane.showMessageDialog(null, "Máquina repuesta");
        }
        else {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
        }
    }

    @Override
    public StringBuilder mostrarGolosinas() {
        StringBuilder sb = new StringBuilder("Golosinas disponibles: \n");
        for(int i = 0; i < stock.length; i++) {
            for(int j = 0; j < stock[i].length; j++) {
                sb.append(i).append(j).append(" - ").append(productos[i][j].mostrarProducto()).append("||Stock: ").append(stock[i][j]).append("\n");
            }
        }
        return sb;
    }
}
