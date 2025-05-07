package objetos;

public enum Refresco {
    COCA_COLA(0.90), PEPSI(0.80), FANTA_NARANJA(1.20), SPRITE(1.50), AQUARIUS_LIMON(1.80), NESTEA(0.60);
    private double precio; // El precio del refresco

    Refresco(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return name() + " - Precio: " + precio;
    }
}
