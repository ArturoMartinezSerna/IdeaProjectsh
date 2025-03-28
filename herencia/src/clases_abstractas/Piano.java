package clases_abstractas;

public class Piano extends Instrumento{

    public Piano() {
        super(0);

    }
    public void interpretar() {
        // Recorremos el array de notas de superclase y la vamos mostrando
        System.out.println("\nPIANO DICE:");
        for(NotaMusical notaMusical: melodia){
            System.out.print(notaMusical + "-");
        }
    }
}
