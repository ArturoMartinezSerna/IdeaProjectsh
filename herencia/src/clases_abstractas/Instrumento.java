package clases_abstractas;

import java.util.Arrays;

public abstract class Instrumento {
    NotaMusical[] melodia; // Array que almacena las notas de la melodia

    public Instrumento(int longitud) {
        melodia = new NotaMusical[longitud];
    }

    public void addNotaAMelodia(NotaMusical notaMusical) {
        melodia = Arrays.copyOf(melodia, melodia.length+1);
        melodia[melodia.length-1] = notaMusical;
    }
    // Metodo abstracto
    protected abstract void interpretar();
    // Cada instrumento interpretara las notas segun su forma de tocar el instrumento
}
