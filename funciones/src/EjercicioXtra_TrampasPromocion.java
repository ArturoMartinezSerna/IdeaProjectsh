public class EjercicioXtra_TrampasPromocion {

    public static void main(String[] args) {
        // Bullying!!!
        // Todo es int hasta que se demuestre lo contrario!
        short s, t, u;
        s = 1;
        t = 2;
        // u = s + t; Error de Bullying!!!
        u = (short) (s + t);
    }
}
