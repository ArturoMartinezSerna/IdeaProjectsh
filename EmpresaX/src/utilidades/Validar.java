package utilidades;

public class Validar {

    public static boolean validarNombreEmpresa(String nombreEmpresa) {
        String[] palabras = nombreEmpresa.split(" ");

        for(String palabra : palabras) {
            if(Character.isLowerCase(palabra.charAt(0)))
                return false;
        }
        return true;
    }

    public static boolean validarTelefono(String telefono) {
        for(int i = 0; i < telefono.length(); i++) {
            if(!Character.isDigit(telefono.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean validarEmail(String email) {
        String[] partesArroba = email.split("@");
        String[] partesTrasArroba;

        if(partesArroba.length != 2)
            return false;
        partesTrasArroba = partesArroba[0].split(".");

        return true;
    }
}
