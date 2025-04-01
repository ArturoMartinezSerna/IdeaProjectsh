package maquinaExpendedora;

import maquinaExpendedora.clases.MaquinaExpendedora;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MaquinaExpendedora maquina = new MaquinaExpendedora();
        boolean salir = false;
        do {
            String opcionS = JOptionPane.showInputDialog(null,
                    """
                            ****Máquina Expendedora****
                            1.- Pedir Golosinas
                            2.- Mostrar Golosinas
                            3.- Reponer Stock
                            4.- Apagar la máquina
                            
                            Introduce tu opción:
                            """
                    );
            if(opcionS == null) return;
            try {
                int opcion = Integer.parseInt(opcionS);
                switch (opcion) {
                    case 1 -> maquina.pedirGolosina();
                    case 2 -> JOptionPane.showMessageDialog(null, maquina.mostrarGolosinas());
                    case 3 -> maquina.rellenarStock();
                    case 4 -> {
                        maquina.apagarMaquina(); salir = true;
                    }
                    default -> JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
            } catch(Exception e) {

            }
        } while(!salir);
    }
}
