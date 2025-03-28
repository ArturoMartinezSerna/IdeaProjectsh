package clases_abstractas;

/**
 * Crear la clase abstracta Instrumento, que almacena en una tabla las notas musicales de una melodia (dentro de una misma octava). El metodo add() añade nuevas notas musicales. La clase tambien dispone del metodo abstracto interpretar() que , en cada sub-clase que herede de Instrumento, mostrará por consola las notas musicales segun las interprete. Utilizar enums para definir las notas musicales.
 */

public class Main {
    public static void main(String[] args) {
        NotaMusical[] cancion = {NotaMusical.DO,NotaMusical.RE,NotaMusical.MI,NotaMusical.FA,NotaMusical.SOL,NotaMusical.LA,NotaMusical.SI,NotaMusical.DO};

        Piano piano = new Piano();
        piano.addNotaAMelodia(NotaMusical.DO);
        piano.addNotaAMelodia(NotaMusical.RE);
        piano.addNotaAMelodia(NotaMusical.MI);
        piano.addNotaAMelodia(NotaMusical.FA);
        piano.addNotaAMelodia(NotaMusical.SOL);
        piano.addNotaAMelodia(NotaMusical.LA);
        piano.addNotaAMelodia(NotaMusical.SI);
        piano.addNotaAMelodia(NotaMusical.DO);
        Campana campana = new Campana();

        // Con un bucle puedo añadir cada nota de la cancion al piano.
        for(NotaMusical notaMusical: cancion){
            piano.addNotaAMelodia(notaMusical);
        }
        for(NotaMusical notaMusical: cancion){
            campana.addNotaAMelodia(notaMusical);
        }
        piano.interpretar();
        campana.interpretar();
    }
}
