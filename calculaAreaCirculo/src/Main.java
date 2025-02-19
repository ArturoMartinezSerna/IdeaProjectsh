import java.text.DecimalFormat;

public class Main {
    /*
        Calcula el área de un circulo dado su radio
        y la longitud de su circurferencia
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double radio;
        double area;
        double perimetro;

        radio = Utilidades.pideNumeroDouble("Por favor, introduzca el radio del círculo");
        area = Math.PI * Math.pow(radio, 2);
        perimetro = Math.PI * radio * 2;
        System.out.println("El área del círculo es: " + df.format(area));
        System.out.println("El perímetro del círculo es: " + df.format(perimetro));
    }
}