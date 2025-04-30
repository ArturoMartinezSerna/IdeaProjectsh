//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Socio socio = new Socio();
        socio.nombre = "Jose";
        int numero = 10;
        cambiaSocio(socio);
        System.out.println(socio.nombre);
        cambiaNumero(numero);
        System.out.println(numero);
    }

    private static void cambiaSocio(Socio socio){
        Socio socio2 = socio;
        socio2.nombre = "Juan";
    }

    private static void cambiaNumero(int numero){
        int numero2 = numero;
        numero2 = 20;
    }
}