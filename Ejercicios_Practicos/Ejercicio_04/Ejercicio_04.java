package Ejercicios_Practicos.Ejercicio_04;

import Ejercicios_Practicos.Ejercicio_04.Services.PeliculaService;

public class Ejercicio_04 {

    public static void main(String[] args) {
        PeliculaService sv = new PeliculaService();

        sv.crearPelicula();

        System.out.println("**** MOSTRAR LISTA NATIVA ****");
        sv.mostrarLista();

        System.out.println("**** FILTRO PELICULAS MAYORES A 1 HORA ****");
        sv.filtrarPorDuracionMayoraUno();

        System.out.println("**** ORDENAR LA LISTA NATIVA POR DURACION (MAYOR A MENOR) ****");
        sv.ordenarPorDuracionMayor();

        System.out.println("**** ORDENAR LA LISTA NATIVA POR DURACION (MENOR A MAYOR) ****");
        sv.ordenarPorDuracionMenor();

        System.out.println("**** ORDENAR LA LISTA NATIVA POR TITULO (ALFABETICAMENTE CRECIENTE) ****");
        sv.ordenarPorTitulo();

        System.out.println("**** ORDENAR LA LISTA NATIVA POR DIRECTOR (ALFABETICAMENTE CRECIENTE) ****");
        sv.ordenarPorDirector();

    }

}
