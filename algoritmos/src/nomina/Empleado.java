package nomina;

public class Empleado {
    String apellido;
    String nombre;
    int puesto;
    int horasTrabajadas;
    double sueldoHora;
    int numHijos;
    double salarioBruto;
    double salarioNeto;

    final int MAXIMO_HORAS_NO_EXTRA = 169;
    final int MAXIMO_HORAS_BONUS_1 = 11;


    public Empleado(String apellido, String nombre, int puesto, int horasTrabajadas, double sueldoHora, int numHijos) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.puesto = puesto;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoHora = sueldoHora;
        this.numHijos = numHijos;

        salarioBruto = calcularSalarioBruto();
    }

    public double deducir(double porcentajeImponible) {
        return (salarioBruto * porcentajeImponible*100)/10000;
    }

    private double calcularSalarioBruto() {
        if(horasTrabajadas <= MAXIMO_HORAS_NO_EXTRA)
            salarioBruto = horasTrabajadas * sueldoHora;
        else {
            salarioBruto = MAXIMO_HORAS_NO_EXTRA * sueldoHora;
            horasTrabajadas -= MAXIMO_HORAS_NO_EXTRA;
            if(horasTrabajadas <= MAXIMO_HORAS_BONUS_1)
                salarioBruto += horasTrabajadas * sueldoHora * 1.5;
            else {
                salarioBruto += MAXIMO_HORAS_BONUS_1 * sueldoHora * 1.5;
                horasTrabajadas -= MAXIMO_HORAS_BONUS_1;
                salarioBruto += horasTrabajadas * sueldoHora * 1.6;
            }
        }
        return salarioBruto;
    }
}
