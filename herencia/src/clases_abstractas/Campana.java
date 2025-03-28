package clases_abstractas;

public class Campana extends Instrumento{

    public Campana() {
    super(0);
    }

    public void interpretar() {
        // Recorremos el array de notas de superclase y la vamos mostrando
        System.out.println("\nCAMPANA DICE:");
        for(NotaMusical notaMusical: melodia){
            System.out.print(notaMusical + "-");
        }
    }


}
