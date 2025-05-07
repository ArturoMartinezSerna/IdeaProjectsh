package objetos;

import util.Utilidades;

import java.util.ArrayList;

public class MaquinaExpendedora {

    private ArrayList<Refresco> listaRefrescos; // La lista de refrescos disponibles para su venta
    private ArrayList<Refresco> refrescosVendidos; // Los refrescos vendidos a lo largo de la ejecucion del programa
    double dineroRecaudado; // El dinero recaudado a lo largo de la ejecucion del programa

    // Constructor
    public MaquinaExpendedora() {
        Refresco[] valoresEnum = Refresco.values(); // Cogemos el array de posibles Refrescos

        // Inicializamos los refrescos disponibles con el ENUM
        listaRefrescos = new ArrayList<>();
        for(Refresco ref : valoresEnum) {
            listaRefrescos.add(ref);
        }

        // Inicializamos los refrescos vendidos a 0 y el dinero recaudado a 0
        refrescosVendidos = new ArrayList<>();
        dineroRecaudado = 0;
    }

    // Devuelve un String que es la lista de refrescos
    public String toStringRefrescos() {
        String output = "";

        for(int i = 0; i < listaRefrescos.size(); i++) {
            output += (i+1) + " -> " + listaRefrescos.get(i).toString() + "\n";
        }
        return output;
    }

    // Realiza la venta de un refresco. Si se introduce dinero suficiente, se vende y se añade a refrescos vendidos, y si no, muestra un mensaje por pantalla
    public void venderRefresco(int refrescoSeleccionado) {
        double dinero = Utilidades.pideDouble("Introduzca el dinero a pagar");
        Refresco refrescoComprado = listaRefrescos.get(refrescoSeleccionado);

        if(dinero >= refrescoComprado.getPrecio()) {
            refrescosVendidos.add(listaRefrescos.get(refrescoSeleccionado));
            dineroRecaudado += refrescoComprado.getPrecio();
            Utilidades.MostrarPorPantalla("Compra de su " + refrescoComprado.name() + " realizada. Su cambio es: " + Utilidades.formatearNumero(dinero - refrescoComprado.getPrecio()));
        } else {
            Utilidades.MostrarPorPantalla("Dinero insuficiente para realizar la compra");
        }
    }

    // Muestra las estadísticas de cantidad de refrescos vendidos, el dinero recaudado, y el tipo y cantidad de cada refresco vendido
    public void mostrarEstadisticas() {
        int totalRefrescosVendidos = refrescosVendidos.size();
        double totalDineroRecaudado = dineroRecaudado;

        String output = "";

        output += "Total de refrescos vendidos: " + totalRefrescosVendidos + "\nTotal de dinero recaudado: " + Utilidades.formatearNumero(totalDineroRecaudado) + "\n\nRefrescos vendidos:\n" + toStringRefrescosVendidos();
        Utilidades.MostrarPorPantalla(output);
    }

    // Devuelve un String de cada tipo de Refresco, y cantidad vendida de cada uno
    public String toStringRefrescosVendidos() {
        String output = "";
        int[] cantidadesRefrescos = new int[listaRefrescos.size()];
        for(int i = 0; i < cantidadesRefrescos.length; i++) {
            cantidadesRefrescos[i] = 0;
        }
        for(Refresco ref : refrescosVendidos) {
            cantidadesRefrescos[ref.ordinal()]++;
        }
        for(int i = 0; i < cantidadesRefrescos.length; i++) {
            output += listaRefrescos.get(i).name() + ": " + cantidadesRefrescos[i] + "\n";
        }
        return output;
    }

}
