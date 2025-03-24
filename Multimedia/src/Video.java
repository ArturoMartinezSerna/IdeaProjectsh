public class Video extends ArchivoMultimedia{
    String[] subtitulos;

    public Video(int espacioMemoria, String nombreArchivo, String extension, String autor, String fechaCreacion, String fechaModificacion, String[] subtitulos) {
        super(espacioMemoria, nombreArchivo, extension, autor, fechaCreacion, fechaModificacion);
        this.subtitulos = subtitulos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nImagen{" +
                "subtitulos='" + subtitulos + '\'' +
                '}';
    }
}
