package Ejercicios_Practicos.Ejercicio_06;

import Ejercicios_Practicos.Ejercicio_06.Services.ProductoService;
import java.util.Scanner;

public class Ejercicio_06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ProductoService tienda = new ProductoService();

        int opc;
        do {
            System.out.println("**** MENU DE TIENDA****");
            System.out.println("1. Introducir producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar lista completa");
            System.out.println("5. Salir");
            System.out.print("Selecciones un opción : ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    tienda.añadirProducto();
                    break;
                case 2:
                    tienda.modificarProducto();
                    break;
                case 3:
                    tienda.eliminarProducto();
                    break;
                case 4:
                    tienda.mostrarLista();
                    break;
                case 5:
                    System.out.println("Saliendo ....");
                    break;
                default:
                    System.out.println("Opción no existente, vuelva a intentar");
            }
        } while (opc < 5);
    }
}
