import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String numero = "123456";
        int dni = Integer.parseInt(numero);
        int num = 7854;

        Integer num2 = Integer.valueOf(num);
        int prueba1 = num2;
        Integer prueba2 = prueba1;

        /*
         * Los Wrappers son tipos estaticos, asi que puedo usar sus metodos sin crear el objeto
         */

//        Character num4 = Character.toUpperCase('h');
//        boolean esDigito = Character.isDigit(num4);
//        boolean esLetra = Character.isLetter(num4);
//
//        System.out.println("Es digito? " + esDigito);
//        System.out.println("Es letra? " + esLetra);
//
//        try {
//            int dni2 = Integer.parseInt(numero);
//        }catch (NumberFormatException e) {
//            System.out.println("El numero no es valido");
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Intruduzca el día:");
//        int dia = sc.nextInt();
//        System.out.println("Intruduzca el mes:");
//        int mes = sc.nextInt();
//        System.out.println("Intruduzca el anio:");
//        int anio = sc.nextInt();
//        LocalDate fecha = LocalDate.of(anio, mes, dia); // formateamos la fecha a partir de datos numericos
//
//        System.out.println("Introduce la fecha completa -> AAAA-MM-DD");
//        String fechaNac = sc.next();
//
//        LocalDate fechaN = LocalDate.parse(fechaNac);
//        System.out.println("Fecha de nacimiento: " + fechaN);
//

//        LocalDate hoy = LocalDate.now();
//        System.out.println("Hoy es: " + hoy);
//        LocalDateTime fechaHora = LocalDateTime.now();
//        System.out.println("Fecha de hora actual: \n" + fechaHora);
//
//        int dia = hoy.getDayOfMonth();
//        System.out.println("Dia es: " + dia);
//        int mes = hoy.getMonthValue();
//        System.out.println("El mes es: " + mes);
//        int ano = hoy.getYear();
//        System.out.println("Año: " + ano);
//        // Sumar 10 dias al dia de hoy
//        LocalDate hoyMas10 = hoy.plus(10, ChronoUnit.DAYS);
//        System.out.println("Hoy mas 10 dias es: " + hoyMas10);
//        // sumar 10 años
//        hoyMas10 = hoy.plus(10, ChronoUnit.YEARS);
//        System.out.println("Hoy mas 10 años es: " + hoyMas10);

//        LocalDate hoyMenos5dias = hoy.minus(5, ChronoUnit.DAYS);
//        LocalDate hoyMenos5meses = hoy.minus(5, ChronoUnit.MONTHS);
//        LocalDate hoyMenos5anos = hoy.minus(5, ChronoUnit.YEARS);
//        System.out.println("Hoy menos 5 dias: " + hoyMenos5dias);
//        System.out.println("Hoy menos 5 meses: " + hoyMenos5meses);
//        System.out.println("Hoy menos 5 años: " + hoyMenos5anos);

//        // Como saber si la fecha X esta en un año bisiesto
//        boolean bisiesto = hoy.isLeapYear();
//        System.out.println("Es bisiesto? " + bisiesto);
//        // Comparar dos fechas ** After o Before **
//        LocalDate otraFecha = LocalDate.parse("2005-05-02");
//        boolean antes = otraFecha.isAfter(hoy);
//        System.out.println(hoy + " es antes de " + otraFecha + " ?: " + antes);
//        boolean despues = otraFecha.isBefore(hoy);
//        System.out.println(hoy + " es despues de " + otraFecha + " ?: " + despues);
        Locale espanol = new Locale("es", "ES");

        LocalDateTime hoy2 = LocalDateTime.now();

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy", espanol);
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println((hoy2.format(formatoFecha)));
        System.out.println(hoy2.format(formatoHora));
        int hora2 = hoy2.getHour();
        int minuto2 = hoy2.getMinute();
        int segundo2 = hoy2.getSecond();
        System.out.println(hora2 + ":" + minuto2 + ":" + segundo2);
        LocalDateTime hoy3 = LocalDateTime.now();
        System.out.println(hoy2.getDayOfWeek());

        // Hay casos que se requiere detener el tiempo en la ejecucion de un programa...

        System.out.println("Hola mundo!");
        duerme();
        System.out.println("Hola de nuevo mundo!");

    }

    private static void duerme() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println("Error en el servidor");
        }
    }
}