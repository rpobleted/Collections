package Ejercicios_Practicos.Ejercicio_01.Services;

import Ejercicios_Practicos.Ejercicio_01.Entidades.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class PerroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Perro> listaRazasPerro = new ArrayList();

    /**
     * Método para creación de objetos tipo Perro que seran guardados en una
     * Lista, incluye 2 atributos nombre y raza.
     *
     * @return Objeto
     */
    public Perro ingresoPerro() {
        System.out.println("****   CREACION DE PERROS    ****");
        String opc;
        Perro objeto;
        do {
            objeto = new Perro();
            System.out.print("Ingrese el nombre del perro : ");
            objeto.setNombre(leer.next());
            System.out.print("Ingrese la raza del perro  : ");
            objeto.setRaza(leer.next());
            listaRazasPerro.add(objeto);
            System.out.println("Presione S para continuar, sino presione cualquier otra tecla");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));
        mostrarPerros();
        return objeto;
    }

    /**
     * Método para recorrer la lista mediante forEach.
     */
    public void mostrarPerros() {
        System.out.println("****   LISTA COMPLETA    ****");
        ordenarPorRaza(listaRazasPerro);
        listaRazasPerro.forEach((var) -> System.out.println(var));
    }

    /**
     * Método para recorrer la lista mediante ITERATOR, ingresar un valor String
     * para raza y cuando lo encuentre borrar la posición de la lista. 1) Cuando
     * no encuentra el valor, entrega mensaje error y muestra lista. 2) Cuando
     * encuentra los valores, entrega la cantidad de registros que eliminar y
     * luego muestra lista actualizada
     */
    public void eliminarPerro() {
        System.out.println("****   MENU DE ELIMINACION DE PERROS    ****");
        System.out.println("Ingresa la raza del perro que quieres eliminar : ");
        String aux = leer.next();
        System.out.println("Ingresa el nombre del perro que quieres eliminar : ");
        String aux1 = leer.next();
        int coincidencias = 0;

        Iterator<Perro> it = listaRazasPerro.iterator();
        while (it.hasNext()) {
            Perro perroActual = it.next(); // Almacenar el objeto que trae de la lista (el valor actual) y lo guardo en un objeto aux.
            if (perroActual.getRaza().equals(aux) && perroActual.getNombre().equals(aux1)) {
                it.remove();
                coincidencias++;
            }
        }

        if (coincidencias == 0) {
            System.out.println("No se encuentra el valor buscado");
        } else {
            System.out.println(coincidencias + "Registros eliminados");
        }
        mostrarPerros();
    }

    public static void ordenarPorRaza(ArrayList<Perro> listaRazasPerros) {

        // Definimos un comparador para ordenar por raza
        Comparator<Perro> comparadorRaza = new Comparator<Perro>() {
            @Override
            public int compare(Perro perro1, Perro perro2) {
                return perro1.getRaza().compareTo(perro2.getRaza());
            }
        };

        // Ordenamos la lista utilizando el comparador
        Collections.sort(listaRazasPerros, comparadorRaza);
    }
}
