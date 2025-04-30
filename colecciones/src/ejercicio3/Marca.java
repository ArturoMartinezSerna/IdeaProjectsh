package ejercicio3;

import javax.swing.*;

public enum Marca {
    OPEL, CITROEN, FORD, KIA, AUDI, SEAT, BMW, TESLA;

    final static String MENU_MARCA = """
                Elija una marca:
                1.- OPEL
                2.- CITROEN
                3.- FORD
                4.- KIA
                5.- AUDI
                6.- SEAT
                7.- BMW
        """;
    static String[] opciones = {"OPEL", "CITROEN", "FORD", "KIA", "AUDI", "SEAT", "BMW", "TESLA"};

    public static Marca pideMarca() {
        int opcion = JOptionPane.showOptionDialog(
                null,
                MENU_MARCA,
                "Recoleccion de la marca",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
        return Marca.valueOf(opciones[opcion]);
    }
}
