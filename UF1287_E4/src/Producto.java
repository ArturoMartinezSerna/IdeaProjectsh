/** Este enum contiene los productos que puede haber en nuestro menú.
 * Los valores MENU1, MENU2... MENU5 se sustituirán en el futuro por la comida o bebida de nuestro restaurante.
 * */
public enum Producto {
    MENU1(1.0), MENU2(2.0), MENU3(3.0), MENU4(4.0), MENU5(5.0);

    double precio;

    Producto(double precio) {
        this.precio = precio;
    }


//    Producto() {
//        switch(this.ordinal()) {
//            case 0:
//                precio = 1.0;
//                break;
//            case 1:
//                precio = 2.0;
//                break;
//            case 2:
//                precio = 3.0;
//                break;
//            case 3:
//                precio = 4.0;
//                break;
//            case 4:
//                precio = 5.0;
//                break;
//        }
//    }
}
