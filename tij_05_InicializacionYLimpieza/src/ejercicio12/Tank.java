package ejercicio12;

public class Tank implements AutoCloseable {

    boolean full;

    public Tank() {
        System.out.println("Tank!");
        full = false;
    }

    public void fill() {
        System.out.println("Tank filled!");
        full = true;
    }

    public void empty() {
        System.out.println("Tank empty!");
        full = false;
    }
    @Override
    public void finalize() {
        if(full) {
            System.out.println("Error! Tank not empty");
        }
        else {
            System.out.println("Tank destroyed!");
            try {
                super.finalize();
            } catch(Throwable e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void close() {
        if(full) {
            System.out.println("Error! Tank not empty");
        }
        else {
            System.out.println("Tank destroyed!");
        }
    }

    
}
