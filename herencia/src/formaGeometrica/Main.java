package formaGeometrica;

public class Main {

    public static void main(String[] args) {
        FormaGeometrica f = new Triangulo(12, 12);
        FormaGeometrica f2 = new Rectangulo(12, 12);

        System.out.println("Area del triangulo: " + f.calcularArea());
        System.out.println("Area del rectangulo: " + f2.calcularArea());
    }

}
