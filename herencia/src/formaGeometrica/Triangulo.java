package formaGeometrica;

public class Triangulo extends FormaGeometrica {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public double calcularArea() {
        return base*altura / 2;
    }
}
