package Ejercicios_extra.Ejercicio_04.Services;

import Ejercicios_extra.Ejercicio_04.Entidades.Ciudad;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class CiudadService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<Integer, Ciudad> listaCiudades = new HashMap();

    public void ingresoCiudades() {
        System.out.println("***INGRESO DE CIUDADES***");
        do {
            Ciudad objCiudad = new Ciudad();
            System.out.print("Ingresa codigo postal: ");
            Integer codigo = leer.nextInt();
            System.out.print("Ingresa nombre ciudad: ");
            objCiudad.setCiudad(leer.next());
            if (!listaCiudades.containsKey(codigo)) {
                listaCiudades.put(codigo, objCiudad);
            } else {
                System.out.println("El codigo postal ya existe. Reintente");
            }
        } while (listaCiudades.size() != 3);
    }

    public void buscarCodigo() {
        System.out.println("*** BUSCAR CODIGO POSTAL EXISTENTE ***");
        System.out.print("Ingresa codigo postal: ");
        Integer codigo = leer.nextInt();
        int coincidencia = 0;
        for (Map.Entry<Integer, Ciudad> entry : listaCiudades.entrySet()) {
            Integer key = entry.getKey();
            Ciudad value = entry.getValue();
            if (Objects.equals(codigo, key)) {
                System.out.println("Key: " + key + " | " + "Ciudad" + value);
                coincidencia++;
            }
        }
        if (coincidencia == 0) {
            System.out.println("Codigo no existe.");
        }
    }

    public void agregarAdicional() {
        System.out.println("*** AGREGAR UNA CIUDAD ADICIONAL ***");
        do {
            Ciudad objCiudad = new Ciudad();
            System.out.print("Ingresa codigo postal: ");
            Integer codigo = leer.nextInt();
            System.out.print("Ingresa nombre ciudad: ");
            objCiudad.setCiudad(leer.next());
            if (!listaCiudades.containsKey(codigo)) {
                listaCiudades.put(codigo, objCiudad);
            } else {
                System.out.println("El codigo postal ya existe. Reintente");
            }
        } while (listaCiudades.size() != 4);
    }

    public void eliminarCiudades() {
        System.out.println("*** ELIMINAR 3 CIUDADES ***");
        int contador = 0;
        do {
            boolean coincidencia = false;
            System.out.print("Ingrese nombre ciudad :");
            String nombre = leer.next();
            for (Map.Entry<Integer, Ciudad> entry : listaCiudades.entrySet()) {
                Integer key = entry.getKey();
                Ciudad value = entry.getValue();
                if (nombre.contains(value.getCiudad())) {
                    listaCiudades.remove(key);
                    System.out.println(entry.getValue().getCiudad() + " Fue eliminada");
                    contador++;
                    coincidencia=true;
                    break;
                }
            }
            if (!coincidencia) {
                System.out.println("Codigo no existe.");
            }
        } while (contador < 3);
    }

    public void mostrarDatos() {
        System.out.println("*** LISTADO COMPLETO CIUDADES ***");
        for (Map.Entry<Integer, Ciudad> entry : listaCiudades.entrySet()) {
            Integer key = entry.getKey();
            Ciudad value = entry.getValue();
            System.out.println("Key: " + key + " | " + "Ciudad" + value);
        }
    }
}
