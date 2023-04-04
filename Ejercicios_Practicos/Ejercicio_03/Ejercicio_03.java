package Ejercicios_Practicos.Ejercicio_03;

import Ejercicios_Practicos.Ejercicio_03.Entidades.Alumno;
import Ejercicios_Practicos.Ejercicio_03.Services.AlumnoService;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {
        AlumnoService sv = new AlumnoService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> listaAlumnos = new ArrayList();

        do {
            listaAlumnos.add(sv.crearAlumno());
            System.out.println("Desea continuar ingresando alumnos?? S/N");
        } while (leer.next().equalsIgnoreCase("S"));

        System.out.println("El promedio Final es " + sv.notaFinal(listaAlumnos));

    }
}
