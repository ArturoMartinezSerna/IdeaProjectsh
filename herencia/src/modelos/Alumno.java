package modelos;

import java.util.Arrays;

public class Alumno extends Persona {
    private double[] notas;
    private boolean tieneReligion;
    private String curso;
    private String tutor;

    // Metodo constructor

    public Alumno(String nombre, String apellidos, int edad, Persona.Sexo sexo, double[] notas, boolean tieneReligion, String curso, String tutor) {
        super(nombre, apellidos, edad, sexo);
        this.notas = notas;
        this.tieneReligion = tieneReligion;
        this.curso = curso;
        this.tutor = tutor;
    }

    public Alumno() {}

    // Getter y setter

    public double[] getNotas() {return notas;}
    public void setNotas(double[] notas){this.notas = notas;}
    public boolean isTieneReligion() {return tieneReligion;}
    public void setTieneReligion(boolean tieneReligion) {this.tieneReligion = tieneReligion;}
    public String getCurso() {return curso;}
    public void setCurso(String curso) {this.curso = curso;}
    public String getTutor() {return tutor;}
    public void setTutor(String tutor) {this.tutor = tutor;}

    @Override
    public String toString() {
        return super.toString() +
                "Alumno" +
                "\nnotas=" + Arrays.toString(notas) +
                "\ntieneReligion=" + tieneReligion +
                "\ncurso=" + curso +
                "\ntutor=" + tutor;
    }
}
