package animales;

public class Animal {
    private double peso;
    private double altura;
    private int edad;

    public Animal(double peso, double altura, int edad) {
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    // Getters y Setters
    public double peso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}
    public double altura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}
    public int edad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
}
