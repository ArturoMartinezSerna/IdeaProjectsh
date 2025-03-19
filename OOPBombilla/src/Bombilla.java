public class Bombilla {
    static boolean interruptorGeneral = true;
    private boolean interruptor;

    public Bombilla() {}

    public void pulsarInterruptor() { interruptor = !interruptor;}

    public String mostrarEstado() {
        return interruptorGeneral && interruptor ? " Encendido " : " Apagado ";
    }
}
