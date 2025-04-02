package socios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable {

    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }

    // GETTERS Y SETTERS
    public int id() {return id;}
    public void setId(int id) {this.id = id;}
    public String nombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public LocalDate fechaNacimiento() {return fechaNacimiento;}
    public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}

    public int calcularEdad() {
        int edad = 0;
        edad = (int)fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
        return edad;
    }

//    @Override
//    public int compareTo(Object o) {
//        Socio otroSocio = (Socio)o;
//        int resultado;
//
//        if(this.id < otroSocio.id()) {
//            resultado = -1;
//        } else if(this.id > otroSocio.id()) {
//            resultado = 1;
//        } else {
//            resultado = 0;
//        }
//        return resultado;
//    }


    @Override
    public int compareTo(Object o) {
        Socio otro = (Socio)o;
        return nombre.compareTo(otro.nombre); // Esto llama al compareTo de la clase String, que tambien implementa Comparable
    }

    @Override
    public String toString() {
        return "***Socio***" +
                "\n | id: " + id +
                "\n | nombre: " + nombre + '\'' +
                "\n | fechaNacimiento=" + fechaNacimiento.format(f);
    }
}