package futbolistas;

/*
 * Interfaz: Diseña la clase Fubtolista con los atributos
 * dni, nombre, edad, y numeroGoles. Implementa:
 * - Constructor y los metodos toString y equals basado en DNI
 * - Diseña la clase Entrenador con los atributos nombre, edad, dni
 * - Diseña la clase masajista con los atributos nombre, edad, dni, codigoColegiado, anioExperiencia
 *
 * Implementa la interfaz AumentoDeSueldo, la cual solo se aplica al futbolista y al entrenador
 */

public class Main {
    public static void main(String[] args) {
        Entrenador e1 = new Entrenador("20202020E", "entr1", 18);
        Futbolista f1 = new Futbolista("20202020e", "Messi", 18, 18);
        Masagista m1 = new Masagista("20202020e", "m1", 18, 29, 29);

        e1.aumentarSueldo();
        f1.aumentarSueldo();
        if(e1.equals(f1))
            System.out.println("f1 y e1 tienen el mismo DNI");
        else
            System.out.println("f1 y e1 NO tienen el mismo DNI");

        if(m1.equals(f1))
            System.out.println("f1 y m1 tienen el mismo DNI");
        else
            System.out.println("f1 y m1 NO tienen el mismo DNI");
    }
}
