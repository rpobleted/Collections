package Ejericios_extra.Ejercicio_02.Services;

import Ejericios_extra.Ejercicio_02.Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CantanteFamosoService {

    ArrayList<CantanteFamoso> listaCantantes = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregarCantante() {
        for (int i = 0; i < 5; i++) {
            CantanteFamoso objeto = new CantanteFamoso();
            System.out.println("INGRESO DE CANTANTES FAMOSOS");
            System.out.print("Ingresa el nombre: ");
            objeto.setNombre(leer.next());
            System.out.print("Ingresa el disco con más ventas: ");
            objeto.setDiscoConMasVentas(leer.next());
            listaCantantes.add(objeto);
        }
        mostrarLista();
    }

    public void mostrarLista() {
        for (CantanteFamoso var : listaCantantes) {
            System.out.println(var);
        }
    }

    public void agregarAdicional() {
        System.out.println("INGRESO DE CANTANTES FAMOSOS");
        do {
            CantanteFamoso objeto = new CantanteFamoso();
            System.out.print("Ingresa el nombre: ");
            objeto.setNombre(leer.next());
            System.out.print("Ingresa el disco con más ventas: ");
            objeto.setDiscoConMasVentas(leer.next());
            listaCantantes.add(objeto);
            System.out.println("Desea ingresar otro cantante? s/n");
        } while (leer.next().equalsIgnoreCase("S"));
        mostrarLista();
    }

    public void eliminarCantante() {
        System.out.println("Ingresar el cantante que desea eliminar");
        String nombre = leer.next();

        Iterator<CantanteFamoso> it = listaCantantes.iterator();
        boolean encontrado = false;
        while (it.hasNext()) {
            CantanteFamoso aux = it.next();
            if (aux.getNombre().equals(nombre)) {
                it.remove();
                encontrado = true;
                System.out.println("El cantante " + nombre + " fue eliminado");
            }
        }

        if (encontrado == false) {
            System.out.println("El cantante no se encuentra en la lista");
        }
        mostrarLista();
    }
}
