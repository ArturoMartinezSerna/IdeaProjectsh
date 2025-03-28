package formaGeometrica;

/**
 * Implementa la clase abstracta FormaGeometrica con los atributos base y altura
 * de tipo double, y el metodo abstracto double calcularArea();
 * Luego, implementa las clases Triangulo y rectangulo heredando de la clase FormaGeometrica
 */

public abstract class FormaGeometrica {

    double base;
    double altura;

    public FormaGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    abstract double calcularArea();

}
