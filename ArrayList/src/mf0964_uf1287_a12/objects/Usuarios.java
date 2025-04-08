package mf0964_uf1287_a12.objects;

import mf0964_uf1287_a12.utilities.Util;

import javax.swing.*;
import java.util.ArrayList;

public class Usuarios {
    ArrayList<Usuario> usuarios;

    public Usuarios() {
        usuarios = new ArrayList<>();
    }

    public boolean pideUsuario() {
        int edad = Util.pideInt("Introduzca la edad del usuario");
        if(Util.isEdadValida(edad)) {
            String dni = pideDni();
            String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre del usuario");
            String apellido = JOptionPane.showInputDialog(null, "Introduzca el apellido");
            String movil = pideMovil();
            String email = pideEmail();
            if (this.addUsuario(dni, nombre, apellido, edad, movil, email)) {
                JOptionPane.showMessageDialog(null, "Usuario " + nombre + "  creado con exito");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error:" + nombre + " no creado");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede crear una cuenta para un usuario de " + edad + " años.");
        }
        return false;
    }
            private boolean addUsuario(String dni, String nombre, String apellido, int edad, String movil, String email) {
                usuarios.add(new Usuario(dni, nombre, apellido, edad, movil, email));
                return true;
            }

    public static String pideDni() {
        String dni;
        boolean repetir;

        do {
            dni = JOptionPane.showInputDialog(null, "Introduce el dni del usuario");
            repetir = !Util.isFormatoDni(dni);
            if(repetir) {
                JOptionPane.showMessageDialog(null, "El dni debe tener 8 numeros y una letra");
            }
        } while(repetir);
        return dni;
    }

    private static String pideMovil() {
        String movil;
        boolean repetir;

        do {
            movil = JOptionPane.showInputDialog(null, "Introduzca el movil del usuario");
            repetir = !Util.isFormatoMovil(movil);
            if(repetir) {
                JOptionPane.showMessageDialog(null, "El movil debe tener solo numeros");
            }
        } while(repetir);
        return movil;
    }

    private static String pideEmail() {
        String email;
        String validacionEmail;
        boolean repetir;

        do {
            email = JOptionPane.showInputDialog(null, "Introduzca el email");
            validacionEmail = JOptionPane.showInputDialog(null, "Introduzca el email de nuevo");
            repetir = !Util.isEmailValido(email, validacionEmail);

            if(repetir) {
                JOptionPane.showMessageDialog(null, "El email debe coincidir");
            }
        } while(repetir);
        return email;
    }

    public void mostrarUsuarios() {
        String mensaje = "";

        for(int i = 0; i < this.usuarios.size(); i++) {
            mensaje = this.usuarios.get(i).toString() + "\n";
            JOptionPane.showMessageDialog(null, mensaje);
        }


    }
}
