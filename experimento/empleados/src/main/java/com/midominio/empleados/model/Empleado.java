package com.midominio.empleados.model;

import java.time.LocalDate;

public class Empleado {
    private static int contador = 0;
    private String nombre;
    private String apellido;
    private int nHijos;
    private String dni;
    private LocalDate fechaNacimiento;
    private String ultimaT;
    private int idEmpleado;
    private Puesto puesto;

    public Empleado() {

    }

    public enum Puesto {
        DIRECTOR, AGENTE, EMPLEADO
    }

    public Empleado(int contador, String nombre, String apellido, int nHijos, String dni, String fechaNacimiento, String ultimaT, Puesto puesto) {
        this.contador = contador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nHijos = nHijos;
        this.dni = dni;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
        this.ultimaT = ultimaT;
        this.puesto = puesto;
        this.idEmpleado = contador++;
    }

    public int idEmpleado() {
        return idEmpleado;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Empleado.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNHijos() {
        return nHijos;
    }

    public void setnHijos(int nHijos) {
        this.nHijos = nHijos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
    }

    public String getUltimaT() {
        return ultimaT;
    }

    public void setUltimaT(String ultimaT) {
        this.ultimaT = ultimaT;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
}
