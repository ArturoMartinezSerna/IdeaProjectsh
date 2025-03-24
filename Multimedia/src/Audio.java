public class Audio extends ArchivoMultimedia{
    private int calidadAudio;

    public Audio(int espacioMemoria, String nombreArchivo, String extension, String autor, String fechaCreacion, String fechaModificacion, int calidadAudio) {
        super(espacioMemoria, nombreArchivo, extension, autor, fechaCreacion, fechaModificacion);
        this.calidadAudio = calidadAudio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAudio{" +
                "calidadAudio=" + calidadAudio +
                '}';
    }
}
