package Ejercicios_Practicos.Ejercicio_01.Services;

import Ejercicios_Practicos.Ejercicio_01.Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Perro> listaRazasPerro = new ArrayList();

    public Perro ingresoRaza() {
        String opc;
        Perro objeto;
        do {
            objeto = new Perro();
            System.out.println("Ingrese el nombre del perro");
            objeto.setNombre(leer.next());
            System.out.println("Ingrese la raza del perro");
            objeto.setRaza(leer.next());
            listaRazasPerro.add(objeto);
            System.out.println("Presione S para continuar, sino presione cualquier otra tecla");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));
        return objeto;
    }

    public void mostrarRazas() {
        for (Perro var : listaRazasPerro) {
            System.out.println(var);
        }
    }
}
