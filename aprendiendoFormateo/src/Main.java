import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double numero = 0.9876;
        DecimalFormat df = new DecimalFormat("0.00");
        String cadena;

        System.out.println("DecimalFormat.format(numero): " + df.format(numero));
        System.out.printf("Printf numero: %.2f", numero);
        System.out.println("");
        cadena = String.format("%.2f", numero);
        System.out.println("cadena con String.format: " + cadena);
    }
}