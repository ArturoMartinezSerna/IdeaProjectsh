public class Imagen extends ArchivoMultimedia{
    private String calidadImagen;

    public Imagen(int espacioMemoria, String nombreArchivo, String extension, String autor, String fechaCreacion, String fechaModificacion, String calidadImagen) {
        super(espacioMemoria, nombreArchivo, extension, autor, fechaCreacion, fechaModificacion);
        this.calidadImagen = calidadImagen;
    }

    @Override
    public String toString() {
        return super.toString() + "\nImagen{" +
                "calidadImagen='" + calidadImagen + '\'' +
                '}';
    }
}
