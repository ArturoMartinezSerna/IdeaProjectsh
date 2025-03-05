/*
 * El ayuntamiento de tu localidad te ha encargado una aplicación que ayude
 * a realizar encuestas estadísticas para conocer el nivel adquisitivo de los habitantes
 * del municipio. Para ello, tendrás que preguntar el sueldo a cada persona encuestada.
 * A priori, no conoces el número de encuestados. Para finalizar la entrada de datos,
 * introduce un sueldo con valor −1.
 * Una vez terminada la entrada de datos, muestra
 *
 * la siguiente información:
 *      Todos los sueldos introducidos ordenados de forma decreciente.
 *      El sueldo máximo y mínimo. La media de los sueldos.
 */

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class EstadisticasAyuntamiento {

    public static void main(String[] args) {
        double sueldos[];
        DecimalFormat df;
        double sueldoIntroducido;
        double sumaSueldos = 0;
        Scanner in = new Scanner(System.in);

        sueldos = new double[0];

        System.out.println("Introduzca [-1] para salir...");
        do{
            double[] sueldosTemporal = new double[sueldos.length + 1];
            System.arraycopy(sueldos, 0, sueldosTemporal, 0, sueldos.length);

            System.out.println("Intruduzca el sueldo del empleado " + (sueldos.length + 1));
            sueldoIntroducido = in.nextDouble();
            if(sueldoIntroducido != -1) {
                sueldosTemporal[sueldosTemporal.length - 1] = sueldoIntroducido;
                sueldos = sueldosTemporal;
            }
        }while(sueldoIntroducido != -1);

        Arrays.sort(sueldos);
        System.out.println("Mostrando los sueldos de todos los empleados de mayor a menor:");
        for(int i = sueldos.length - 1; i >= 0; i--){
            System.out.println(sueldos[i]);
        }

        System.out.println("El sueldo del habitante que mas cobra es: " + sueldos[sueldos.length - 1]);
        System.out.println("El sueldo del habitante que menos cobra es: " + sueldos[0]);

        // Sumamos los sueldos
        for(double s : sueldos) {
            sumaSueldos += s;
        }
        System.out.println("La suma de los sueldos de los habitantes es: " + sumaSueldos);

        // La media de los sueldos es:
        df = new DecimalFormat("0.000");
        System.out.printf("La media es: %.2f", sumaSueldos / sueldos.length);
        System.out.println();
        System.out.println("La media de los sueldos de los habitantes es: " + df.format(sumaSueldos / sueldos.length));

        // Redondea
        System.out.println("La media es: " + Math.round(sumaSueldos / sueldos.length * 1000.0) / 1000.0);
    }
}
