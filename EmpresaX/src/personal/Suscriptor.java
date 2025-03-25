package personal;

import utilidades.Validar;

public class Suscriptor extends Persona {
    String email;
    String telefono;

    public Suscriptor(String email, String telefono) {
        this.email = email;
        this.telefono = telefono;
    }

    public void setTelefono(String telefono) {
        boolean numeroIncorrecto;
        do {
            numeroIncorrecto = false;
            if (!Validar.validarTelefono(telefono)) {
                telefono = pideTelefono();
            }
        }while(numeroIncorrecto);
    }

    public String pideTelefono() {
        String telefono = "";

        return telefono;
    }
}
