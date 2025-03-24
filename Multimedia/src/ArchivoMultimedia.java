public class ArchivoMultimedia {
    private int espacioMemoria;
    private String nombreArchivo;
    private String extension;
    private String autor;
    private String fechaCreacion;
    private String fechaModificacion;

    public ArchivoMultimedia(int espacioMemoria, String nombreArchivo, String extension, String autor, String fechaCreacion, String fechaModificacion) {
        this.espacioMemoria = espacioMemoria;
        this.nombreArchivo = nombreArchivo;
        this.extension = extension;
        this.autor = autor;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public int getEspacioMemoria() {
        return espacioMemoria;
    }

    public void setEspacioMemoria(int espacioMemoria) {
        this.espacioMemoria = espacioMemoria;
    }

    protected static void visualizar() {
        System.out.println("El archivo es visualizado");
    }
    protected static void reproducir() {
        System.out.println("El archivo es reproducido");
    }

    @Override
    public String toString() {
        return "\nArchivoMultimedia{" +
                "\nespacioMemoria=" + espacioMemoria +
                "\n, nombreArchivo='" + nombreArchivo + '\'' +
                "\n, extension='" + extension + '\'' +
                "\n, autor='" + autor + '\'' +
                "\n, fechaCreacion='" + fechaCreacion + '\'' +
                "\n, fechaModificacion='" + fechaModificacion + '\'' +
                '}';
    }
}
