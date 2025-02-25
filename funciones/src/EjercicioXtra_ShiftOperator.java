public class EjercicioXtra_ShiftOperator {

    public static void main(String[] args) {
        int numeroHexa = 0xfffff;
        int numeroBinario = 0b10101001;

        System.out.println(Integer.toBinaryString(numeroHexa));
        numeroHexa = numeroHexa << 1;

        System.out.println(Integer.toBinaryString(numeroHexa));
        // Parece que esto mata al numero y lo deja en 0
        numeroHexa = numeroHexa << -1;
        System.out.println(Integer.toBinaryString(numeroHexa));
        numeroHexa = numeroHexa << -1;
        System.out.println(Integer.toBinaryString(numeroHexa));

        System.out.println("NUMERO BINARIO");
        System.out.println(Integer.toBinaryString(numeroBinario));
        numeroBinario = numeroBinario << 1;
        System.out.println(Integer.toBinaryString(numeroBinario));
        numeroBinario = numeroBinario >> 1;
        System.out.println(Integer.toBinaryString(numeroBinario));
    }
}
