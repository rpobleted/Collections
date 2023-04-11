package Ejercicios_Practicos.Ejercicio_06.Services;

import Ejercicios_Practicos.Ejercicio_06.Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Producto> tienda = new HashMap();

    public void añadirProducto() {
        System.out.println("*** INGRESO DE PRODUCTOS ***");
        do {
            Producto t1 = new Producto();
            System.out.print("Ingrese el nombre : ");
            t1.setNombre(leer.next());
            System.out.print("Ingrese el precio : ");
            t1.setPrecio(leer.nextInt());
            tienda.put(t1.getNombre(), t1);
            System.out.println("Desea ingresar otro producto? (s/n) ");
        } while (leer.next().equalsIgnoreCase("S"));
    }

    public void modificarProducto() {
        System.out.println("*** MODIFICACIÓN DE PRODUCTOS ***");

        boolean encontrado = false;
        System.out.print("Ingrese el nombre : ");
        String nombre = leer.next();
        for (Map.Entry<String, Producto> entry : tienda.entrySet()) {
            if (entry.getKey().equals(nombre)) {
                System.out.println("Valor actual:$" + entry.getValue().getPrecio());
                System.out.print("Ingrese nuevo valor $");
                entry.getValue().setPrecio(leer.nextInt());
                System.out.println("*** Producto actualizado ***");
                System.out.println(entry.getValue());
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("Producto no encontrado");
        }
    }

    public void eliminarProducto() {
        System.out.println("*** ELIMINACION DE PRODUCTOS ***");
        boolean encontrado = false;
        System.out.print("Ingrese el nombre : ");
        String nombre = leer.next();
        for (Map.Entry<String, Producto> entry : tienda.entrySet()) {
            boolean valor =entry.getKey().equals(nombre);
            if (valor) {
                tienda.remove(nombre);
                System.out.println("Producto eliminado");
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("Producto no encontrado");
        }
    }

    public void mostrarLista() {
        System.out.println("*** VISUALIZAR LISTA COMPLETA ***");
        tienda.forEach((key, valores) -> System.out.println("Key=" + key + " " + valores));

// VERSION COMPLETA
//        for (Map.Entry<String, Producto> entry : tienda.entrySet()) {
//            System.out.println("Key=" + entry.getKey() + " // " + entry.getValue());
//        }
    }
}
