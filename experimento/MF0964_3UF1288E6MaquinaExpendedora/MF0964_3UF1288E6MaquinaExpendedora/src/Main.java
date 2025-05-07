import objetos.MaquinaExpendedora;
import util.Utilidades;

/**
 * Máquina expendedora de refrescos
 * Desarrolla en Java una aplicación de consola que simule una máquina expendedora de refrescos. Esta máquina debe permitir al usuario:
 * Ver un menú de 6 refrescos disponibles con su precio.
 * Seleccionar un refresco introduciendo un número.
 * Introducir el dinero para pagar.
 * Mostrar si el dinero es suficiente y calcular el cambio.
 * Al final, mostrar:
 * Cuántas unidades se vendieron de cada refresco.
 * El total de dinero recaudado.
 * Bebidas disponibles:
 * Coca-Cola
 * Pepsi
 * Fanta Naranja
 * Sprite
 * Aquarius Limón
 * Nestea
 *
 * Requisitos mínimos
 * Usar al menos una Clase y la Programación orientada a Objetos
 * Usar una estructura ArrayList para almacenar los refrescos vendidos.
 * Permitir la selección del refresco y gestión del pago con Scanner o JOptionPane
 * Al finalizar, recorrer el ArrayList y mostrar las estadísticas de venta.
 * Implementar control de errores (por ejemplo, opción no válida o dinero insuficiente).
 */

public class Main {

    static MaquinaExpendedora maquina = new MaquinaExpendedora();

    public static void main(String[] args) {
        final String MENU_PRINCIPAL = maquina.toStringRefrescos() + "0 -> Salir" + "\n\nIntroduzca refresco:";
        int opcion;

        do {
            opcion = Utilidades.pideInt(MENU_PRINCIPAL);
            if(opcion != 0)
                maquina.venderRefresco(opcion - 1);
        } while(opcion != 0);

        maquina.mostrarEstadisticas();
    }

}