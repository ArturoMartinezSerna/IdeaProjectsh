public class Main {
    public static void main(String[] args) {
        int valor1;
        int precedencia = 2+3*4; //14
        precedencia = (2+3)*4; //20

        boolean logica = 1>2&&2>3; //false

        //ternario
        String valor = precedencia>4?"Es mayor que 4":"Es menor de 4";
        System.out.println("Una evaluacion la puedo hacer aqui->" +
                (precedencia > 4 ? "Es mayor que 4" : "Es menor de 4"));
        valor1 = precedencia;
        if(valor1 > 4) {
            System.out.println("Hola mundo!");
        }
        else{
            System.out.println("El valor es falso");
        }

    }



}