package Ejericios_extra.Ejercicio_02;

import Ejericios_extra.Ejercicio_02.Services.CantanteFamosoService;
import java.util.Scanner;

public class Ejercicio_02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CantanteFamosoService sv = new CantanteFamosoService();

        int opciones = 0;
        do {

            System.out.println("MENU");
            System.out.println("1. Agregar 5 cantantes");
            System.out.println("2. Agregar 1 cantante adicional");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            System.out.println("Elija una opcion");

            opciones = leer.nextInt();
            switch (opciones) {
                case 1:
                    sv.agregarCantante();
                    break;
                case 2:
                    sv.agregarAdicional();
                    break;
                case 3:
                    sv.eliminarCantante();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("opcion incorrecta, vuelva a intentar...");
            }

        } while (opciones != 4);

    }

}
