import modelos.Persona;

public class Main {
    public static void main(String[] args) {

        // docs.oracle.com/javase/8/docs/api/
        // Clase object --> toString y otros metodos
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        p1.setNombre("Alumno");
        p2.setNombre("Alumno");
        p1.setEdad(18);
        p2.setEdad(18);
        // Los metodos de la clase object
        //equals --> boolean
        if(p1.equals(p2)) {
            System.out.println("Persona y alumno apuntan a la misma posicion de memoria");
        } else {
            System.out.println("Persona y alumno son diferentes");
        }

        System.out.println(p1.equals(p2));

        // Hacer un metodo equals que sobreescribe. compare la edad

        System.out.println(p1.getClass());
        System.out.println(p1.getClass().getName());
        System.out.println(p1.getClass().getSimpleName());
    }
}