package objetos;

import util.Utilidades;

import java.util.ArrayList;

public class MaquinaExpendedora {

    private ArrayList<Refresco> listaRefrescos;
    private ArrayList<Refresco> refrescosVendidos;
    double dineroRecaudado;

    public MaquinaExpendedora() {
        Refresco[] valoresEnum = Refresco.values();

        listaRefrescos = new ArrayList<>();
        for(Refresco ref : valoresEnum) {
            listaRefrescos.add(ref);
        }

        refrescosVendidos = new ArrayList<>();
        dineroRecaudado = 0;
    }

    public String toStringRefrescos() {
        String output = "";

        for(int i = 0; i < listaRefrescos.size(); i++) {
            output += (i+1) + " -> " + listaRefrescos.get(i).toString() + "\n";
        }
        return output;
    }

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

    public void mostrarEstadisticas() {
        int totalRefrescosVendidos = refrescosVendidos.size();
        double totalDineroRecaudado = dineroRecaudado;

        String output = "";

        output += "Total de refrescos vendidos: " + totalRefrescosVendidos + "\nTotal de dinero recaudado: " + Utilidades.formatearNumero(totalDineroRecaudado) + "\n\nRefrescos vendidos:\n" + toStringRefrescosVendidos();
        Utilidades.MostrarPorPantalla(output);
    }

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
