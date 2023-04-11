package Ejercicios_Practicos.Ejercicio_04.Services;

import Ejercicios_Practicos.Ejercicio_04.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaService {

    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    Pelicula pelicula;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPelicula() {
        do {
            pelicula = new Pelicula();
            System.out.print("Ingrese titulo :");
            pelicula.setTitulo(leer.next());
            System.out.print("Ingrese director :");
            pelicula.setDirector(leer.next());
            System.out.print("Ingrese duración [minutos] :");
            pelicula.setDuracion(leer.nextDouble());
            listaPeliculas.add(pelicula);
            System.out.println("Desea continuar ingresando alumnos?? S/N");
        } while (leer.next().equalsIgnoreCase("S"));
    }

    public void mostrarLista() {
//        for (Pelicula var : listaPeliculas) {
//                System.out.println(var);
//        }

        listaPeliculas.forEach((var) -> System.out.println(var));
    }

    public void filtrarPorDuracionMayoraUno() {
//    FORMA COMPLETA
//        for (Pelicula var : listaPeliculas) {
//            if (var.getDuracion() > 1) {
//                System.out.println(var);
//            }
//        }
        listaPeliculas.stream().filter((var) -> (var.getDuracion() > 1)).forEachOrdered((var) -> {
            System.out.println(var);
        });
    }

    public void ordenarPorDuracionMayor() {
        listaPeliculas.sort(compararDuracionMayor);
        mostrarLista();
    }

    public void ordenarPorDuracionMenor() {
        listaPeliculas.sort(compararDuracionMenor);
        mostrarLista();
    }

    public void ordenarPorTitulo() {
        listaPeliculas.sort(compararTitulo);
        mostrarLista();
    }

    public void ordenarPorDirector() {
        listaPeliculas.sort(compararDirector);
        mostrarLista();
    }

    // Comparators
//    FORMA COMPLETA
//    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {
//        @Override
//        public int compare(Pelicula p1, Pelicula p2) {
//            return p2.getDuracion().compareTo(p1.getDuracion());
//        }
//    };
    public static Comparator<Pelicula> compararDuracionMayor = (Pelicula p1, Pelicula p2) -> p2.getDuracion().compareTo(p1.getDuracion());

    public static Comparator<Pelicula> compararDuracionMenor = (Pelicula p1, Pelicula p2) -> p1.getDuracion().compareTo(p2.getDuracion());

    public static Comparator<Pelicula> compararTitulo = (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo());

    public static Comparator<Pelicula> compararDirector = (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector());
}
