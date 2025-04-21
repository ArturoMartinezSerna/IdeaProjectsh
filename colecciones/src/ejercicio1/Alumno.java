package ejercicio1;

public class Alumno {
    public enum Materia {
        FISICA, QUIMICA, MATEMATICAS, BIOLOGIA, LENGUA;
    }

    // Atributos encapsulados
    private String nombre;
    private String apellido;
    private String curso;
    private double notaMedia;
    Materia materia;
    private int idAlumno;
    static int nextId = 0;

    public Alumno(String nombre, String apellido, String curso, double notaMedia, Materia materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.notaMedia = notaMedia;
        this.materia = materia;
        this.idAlumno = nextId++;
    }

    public String nombre() {return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String apellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String curso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double notaMedia() {
        return notaMedia;
    }
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    public Materia materia() {
        return materia;
    }
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    public int getIdAlumno() {return idAlumno;}

    @Override
    public String toString() {
        return "Alumno de ID: " + idAlumno +
                " nombre='" + nombre + '\'' +
                " apellido='" + apellido + '\'' +
                " curso='" + curso + '\'' +
                " notaMedia=" + notaMedia +
                " materia=" + materia + "\n";
    }
}
