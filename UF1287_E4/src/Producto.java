public enum Producto {
    MENU1, MENU2, MENU3, MENU4, MENU5;

    double precio;

    Producto() {
        switch(this.ordinal()) {
            case 0:
                precio = 1.0;
                break;
            case 1:
                precio = 2.0;
                break;
            case 2:
                precio = 3.0;
                break;
            case 3:
                precio = 4.0;
                break;
            case 4:
                precio = 5.0;
                break;
        }
    }
}
