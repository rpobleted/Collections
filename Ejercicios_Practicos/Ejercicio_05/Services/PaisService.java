package Ejercicios_Practicos.Ejercicio_05.Services;

import Ejercicios_Practicos.Ejercicio_05.Entidades.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //TreeSet<Pais> paises = new TreeSet();
    HashSet<Pais> paises = new HashSet();
    //ArrayList<Pais> paises = new ArrayList();
    Pais paisObj;

    public void crearPais() {
        do {
            paisObj = new Pais();
            System.out.print("Ingresa nombre : ");
            paisObj.setNombre(leer.next());
            paises.add(paisObj);
            System.out.println("Presiona S para ingresar uno nuevo, sino presiona cualquier tecla");
        } while (leer.next().equalsIgnoreCase("S"));
        mostrarConjunto();
    }

    public void mostrarConjunto() {
        paises.forEach((var) -> {System.out.println(var);
        });
    }

    public void eliminarPais() {
        System.out.print("Ingresa el nombre del pais que quiere eliminar : ");
        String aux = leer.next();
        int coincidencias = 0;
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            Pais paisActual = it.next(); // Almacenar el objeto que trae de la lista (el valor actual) y lo guardo en un objeto aux.
            if (paisActual.getNombre().equals(aux)) {
                it.remove();
                coincidencias++;
            }
        }

        if (coincidencias == 0) {
            System.out.println("No se encuentra el valor buscado");
        } else {
            System.out.println(coincidencias + "Registros eliminados");
        }
        mostrarConjunto();
    }

}
