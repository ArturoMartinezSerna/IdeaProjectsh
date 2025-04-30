package ejercicio3;

import ejercicio2.Utilidades;

import javax.swing.*;
import java.util.ArrayList;

public class Coche {

    private static int nextId = 0;
    private int id;
    private Marca marca;
    private String modelo;
    private String color;
    private String matricula;
    private int anio;
    private double kilometraje;

    public Coche(Marca marca, String modelo, String color, String matricula, int anio, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.id = nextId++;
    }

    public static Coche pideCoche() {
        Marca marca = Marca.pideMarca();
        String modelo = JOptionPane.showInputDialog("Introduzca el modelo del coche: ");
        String color = JOptionPane.showInputDialog("Introduzca el color del coche: ");
        String matricula = JOptionPane.showInputDialog("Introduzca la matricula del coche: ");
        int anio = Utilidades.pideInt("Introduzca el año de matriculación del coche:");
        double kilometraje = Utilidades.pideDouble("Introduzca el kilometraje del coche:");

        return new Coche(marca, modelo, color, matricula, anio, kilometraje);
    }

    public void cambiaMarca() {
        Marca nuevaMarca = Marca.pideMarca();
        this.marca = nuevaMarca;
    }
    public void cambiaModelo() {
        String nuevoModelo = Utilidades.pideString("Introduzca el nuevo modelo del coche: ");
        this.modelo = nuevoModelo;
    }
    public void cambiaColor() {
        String nuevoColor = Utilidades.pideString("Introduzca el nuevo color del coche: ");
        this.color = nuevoColor;
    }
    public void cambiaMatricula() {
        String nuevaMatricula = Utilidades.pideString("Introduzca la nueva matricula del coche: ");
        this.matricula = nuevaMatricula;
    }
    public void cambiaAnio() {
        int nuevoAnio = Utilidades.pideInt("Introduzca la nueva fecha de matriculación del vehículo");
        this.anio = nuevoAnio;
    }
    public void cambiaKilometraje() {
        double kilometraje = Utilidades.pideDouble("Introduzca el nuevo kilometraje del vehículo: ");
        this.kilometraje = kilometraje;
    }

    public static Coche buscaCoche(ArrayList<Coche> coches) {
        int idBuscar = Utilidades.pideInt("Introduzca el ID del coche a buscar:");
        for(Coche coche : coches) {
            if(coche.id() == idBuscar) {
                return coche;
            }
        }
        return null;
    }

    public int id() {
        return id;
    }

    @Override
    public String toString() {
        return "Coche de id: " + id +
                " marca='" + marca + '\'' +
                " modelo='" + modelo + '\'' +
                " color='" + color + '\'' +
                " matricula='" + matricula + '\'' +
                " anio=" + anio +
                " kilometraje=" + kilometraje;
    }
}
