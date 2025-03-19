public class Main {

    public static void main(String[] args) {

        // Creado nuestro primer objeto.. Instanciamos la clase Persona
        // Objeto es una instancia de una clase
        Persona p1 = new Persona("Manolo", (byte)18, 1.59);
        // La variable p1 es la referencia al objeto Persona, ubicado en el heap
        System.out.println(p1); // Muestra la referencia
        // p2 ocupa el mismo espacio de memoria y la misma referencia
        Persona p2 = p1;
        /*
         * p1 y p2 utilizan la misma referencia de memoria.Copias la referencia?
         *  ok. Pero no has copiado el objeto
         *  p2.nombre = "Daniel";
         *  System.out.println(p2.nombre);
         *  System.out.println(p1.nombre);
         * p = null; --> mata la referencia
         */
        Persona p3 = null;
        System.out.println(p3.nombre);
    }

}

class Persona {
    // Definición de los atributos de la clase
    String nombre;
    byte edad;
    double estatura;

    // Métodos constructores
    public Persona(String nombre, byte edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {}


}