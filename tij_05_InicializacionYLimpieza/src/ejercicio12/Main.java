package ejercicio12;

public class Main {
    public static void main(String[] args) {
        Tank tanque = new Tank();

        tanque.fill();
        System.out.println("Llenado tanque");
        tanque.finalize();
        System.out.println("Intentado eliminar tanque");
        tanque.empty();
        System.out.println("Vaciando tanque");
        tanque.finalize();
        System.out.println("Matado tanque");

        try(Tank tanqueBienHecho = new Tank()) {
            tanqueBienHecho.fill();
            System.out.println("Llenado tanque bien hecho");
        } // Se llama a auto-closeable cuando se sale del try
    }
}
