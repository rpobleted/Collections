package Ejercicios_Practicos.Ejercicio_03.Services;

import Ejercicios_Practicos.Ejercicio_03.Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {

        System.out.println("***** INGRESO DE ALUMNOS *****");
        System.out.print("Ingresa nombre :");
        String nombre = leer.next();
        System.out.println("Ingresa 3 notas :");
        ArrayList<Integer> notas = new ArrayList<Integer>() {
            {
                add(leer.nextInt());
                add(leer.nextInt());
                add(leer.nextInt());
            }
        };
        System.out.println("*************************");
        return new Alumno(nombre, notas);
    }

    public Integer notaFinal(ArrayList lista) {
        Integer promedio = 0;
        Alumno alumnoActual= new Alumno();
        System.out.println("Ingresa el nombre del alumno para calcular su promedio final");
        String nombre = leer.next();

        Iterator<Alumno> it = lista.iterator();
        while (it.hasNext()) {
             alumnoActual= it.next();
            if (alumnoActual.getNombre().equals(nombre)) {

                Iterator<Integer> it2 = alumnoActual.getNotas().iterator();
                while (it2.hasNext()) {
                    promedio = promedio + it2.next();
                }
            }
        }
        return (promedio / alumnoActual.getNotas().size());
    }
}
