package formaGeometrica;

public class Rectangulo extends FormaGeometrica {

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    public double calcularArea() {
        return base*altura;
    }
}
