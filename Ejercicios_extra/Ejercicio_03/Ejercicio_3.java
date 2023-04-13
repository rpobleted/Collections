package Ejercicios_extra.Ejercicio_03;

import Ejercicios_extra.Ejercicio_03.Services.LibrosService;
import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibrosService sv = new LibrosService();

        int opc = 0;
        do {
            System.out.println("MENU LIBRERIA");
            System.out.println("1. Ingreso");
            System.out.println("2. Prestamo");
            System.out.println("3. Devolución");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");
            System.out.println("Elija una opción");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    sv.ingresoLibros();
                    break;
                case 2:
                    sv.prestamoLibros();
                    break;
                case 3:
                    sv.devolucionLibros();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("opcion incorrecta, vuelva a intentar...");
            }

        } while (opc != 5);

    }

}
