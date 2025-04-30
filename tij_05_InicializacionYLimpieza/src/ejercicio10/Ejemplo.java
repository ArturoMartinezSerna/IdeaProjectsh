package ejercicio10;

public class Ejemplo {
    public Ejemplo() {
        System.out.println("Hola mundo!");
    }

    @Override
    public void finalize() {
        System.out.println("Adios mundo!");
        try {
            super.finalize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
