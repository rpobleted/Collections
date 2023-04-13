package Ejercicios_extra.Ejercicio_04;

import Ejercicios_extra.Ejercicio_04.Services.CiudadService;
import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CiudadService sv = new CiudadService();
        int opc = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Ingreso de ciudades [total 10]");
            System.out.println("2. Buscar codigo postal");
            System.out.println("3. Agregar ciudad adicional");
            System.out.println("4. Eliminar 3 ciudades");
            System.out.println("5. Mostrar total de ciudades");
            System.out.println("6. Salir");
            System.out.println("Elija una opción");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    sv.ingresoCiudades();
                    break;
                case 2:
                    sv.buscarCodigo();
                    break;
                case 3:
                    sv.agregarAdicional();
                    break;
                case 4:
                    sv.eliminarCiudades();
                    break;
                case 5:
                    sv.mostrarDatos();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("opcion incorrecta, vuelva a intentar...");
            }
        } while (opc != 6);
    }
}
