package Ejercicios_Practicos.Ejercicio_01.Services;

import Ejercicios_Practicos.Ejercicio_01.Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Perro> listaRazasPerro = new ArrayList();

    public void ingresoRaza() {
        String opc;
        do {
            Perro objeto = new Perro();
            System.out.println("Ingrese la raza del perro");
            objeto.setRaza(leer.next());
            listaRazasPerro.add(objeto);
            System.out.println("Presione S para continuar ingresando otro valor");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));
        //return new Perro();
    }

    public void mostrarRazas() {
        for (Perro var : listaRazasPerro) {
            System.out.println(var);
        }
    }
}
