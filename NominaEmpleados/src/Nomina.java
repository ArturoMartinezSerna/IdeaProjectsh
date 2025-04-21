public class Nomina {
    private final double D_DEUDA_SOCIAL = 3.46;
    private final double D_CONT_NO_COMUN = 6.15;
    private final double D_SEG_MED = 0.95;
    private final double D_FONDO_P = 4.44;
    private final double D_SEG_DES = 3.05;
    private final double D_PENSION_C = 3.81;
    private final double D_JUB_ANT = 6.02;

    private double nHoras;
    private double tarifa;
    private double salarioBruto;
    private Personal p;

    public Nomina(double nHoras, double tarifa, Personal p) {
        this.nHoras = nHoras;
        this.tarifa = tarifa;
        this.p = p;
    }
    public double tarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public double nHoras() {
        return nHoras;
    }
    public void setnHoras(double nHoras) {
        this.nHoras = nHoras;
    }
    public double calcularPrimaFamiliar() {
        double primaFamiliar = 0;
        if(this.p.nHijos() == 1) {
            primaFamiliar = 20;
        } else if(this.p.nHijos() == 2) {
            primaFamiliar = 50;
        } else if(this.p.nHijos() >= 3) {
            primaFamiliar = 70 + (this.p.nHijos() - 2)*20;
        }
        return primaFamiliar;
    }
    public void calcularSalarioBruto() {
        double salarioBruto = 0, horasNormales, horasExtra50, horasExtra60;

        if(this.nHoras < 169) {
            salarioBruto = (this.nHoras * this.tarifa);
        } else if(this.nHoras <= 180) {
            horasNormales = 169;
            horasExtra50 = this.nHoras - horasNormales;
            salarioBruto = (horasNormales * this.tarifa) + horasExtra50 * this.tarifa * 1.5;
        } else {
            horasNormales = 169;
            horasExtra50 = this.nHoras - horasNormales;
            horasExtra60 = this.nHoras - horasExtra50 - horasNormales;
            salarioBruto = (horasNormales*this.tarifa) + horasExtra60 * this.tarifa * 1.5 + horasExtra60 * this.tarifa * 1.6;
        }
        this.salarioBruto = salarioBruto;
    }
    public double deducir(Double porcentaje) {
        return porcentaje/100 * this.salarioBruto;
    }

    public void mostrarNomina() {
        double dedSocial, dedConComun, dedSegMed, dedFondoP, dedSegDes, dedPensionC, dedJubAnt;
        System.out.println(p.toString());
        System.out.println("Salario Bruto: " + this.salarioBruto);
        System.out.println("Cálculo de deducciones:");
        dedSocial = this.deducir(this.D_DEUDA_SOCIAL);
        System.out.println("Deduccion social ----> " + dedSocial);
        dedConComun = this.deducir(this.D_CONT_NO_COMUN);
        System.out.println("Deduccion concomun ---> " + dedConComun);
        dedSegMed = this.deducir(this.D_SEG_MED);
        System.out.println("Deduccion segme medio ---> " + dedSegMed);
        dedFondoP = this.deducir(this.D_FONDO_P);
        System.out.println("Deduccion fondo p ---> " + dedFondoP);
        dedSegDes = this.deducir(this.D_SEG_DES);
        System.out.println("Deduccion segdes ---> " + dedSegDes);
        dedPensionC = this.deducir(this.D_PENSION_C);
        System.out.println("Deduccion pensionc ---> " + dedPensionC);
        dedJubAnt = this.deducir(this.D_JUB_ANT);
        System.out.println("Deduccion jubant ---> " + dedJubAnt);
    }
}