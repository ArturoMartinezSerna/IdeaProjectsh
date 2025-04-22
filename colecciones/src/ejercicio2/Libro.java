package ejercicio2;

public class Libro implements Comparable<Libro>{
    private int id;
    private String titulo;
    private String autor;
    private int paginas;
    private String ISBN;
    private int anioPublicacion;
    private String editorial;
    static int nextId = 0;

    public Libro(String titulo, String autor, int paginas, String ISBN, int anioPublicacion, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.ISBN = ISBN;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
        this.id = nextId++;
    }

    public int id() {
        return id;
    }
    public String titulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String autor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int paginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public String ISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public int anioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public String editorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro de id: " + id +
                " titulo='" + titulo + '\'' +
                " autor='" + autor + '\'' +
                " paginas=" + paginas +
                " ISBN='" + ISBN + '\'' +
                " anioPublicacion=" + anioPublicacion +
                " editorial='" + editorial + '\'';
    }

    @Override
    public int compareTo(Libro o) {
        return this.titulo.compareTo(o.titulo);
    }
}
