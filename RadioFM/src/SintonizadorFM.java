public class SintonizadorFM {

    private double frecuencia;

    public SintonizadorFM(double frecuencia) { // debo validar que sea una frecuencia válida
        if (frecuencia<80) {
            this.frecuencia=80;
        }else if (frecuencia>108) {
            this.frecuencia=108;
        }else {
            this.frecuencia = frecuencia;
        }
    }

    public  SintonizadorFM() { //constructor sin atributos se inicializa en 80
        //this(80);//no tiene sentido
        this.frecuencia=80;
    }

    //la opcion favorito le pasa el valor de la frecuencia y
    //sobreescribe cualquier valor anterior que tenga
    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
        comprobarFrecuencia();

    }

    public double down() {
        this.frecuencia-=0.5; //bajamos la frecuencia en 0.5Mhz
        //debo comprobar que la frecuencia este entre 80 y 108 MHZ
        comprobarFrecuencia();
        return this.frecuencia;
    }
    public double up() {
        this.frecuencia+=0.5; //subimos la frecuencia en 0.5Mhz
        //debo comprobar que la frecuencia este entre 80 y 108 MHZ
        comprobarFrecuencia();
        return this.frecuencia;
    }

    public void display(){
        System.out.println("Sintonizando: " + this.frecuencia + " MHz");
    }


    private void comprobarFrecuencia() { //solo puedo acceder al método desde la misma clase
        if (this.frecuencia<80) {
            this.frecuencia=108;
        }else if (this.frecuencia>108) {
            this.frecuencia=80;
        }
    }





}