package Ejercicios_Practicos.Ejercicio_03.Services;

import Ejercicios_Practicos.Ejercicio_03.Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> listaAlumnos = new ArrayList();

    public void crearAlumno() {
        String nombre;
        ArrayList<Integer> notas;
        do {
            System.out.println("***** INGRESO DE ALUMNOS *****");
            System.out.print("Ingresa nombre :");
            nombre = leer.next();
            System.out.println("Ingresa 3 notas :");
            notas = new ArrayList<Integer>() {
                {
                    add(leer.nextInt());
                    add(leer.nextInt());
                    add(leer.nextInt());
                }
            };
            System.out.println("Desea continuar ingresando alumnos?? S/N");
        } while (leer.next().equalsIgnoreCase("S"));
        listaAlumnos.add(new Alumno(nombre, notas));
        System.out.println("*************************");
        //return new Alumno(nombre, notas);
    }

    public void notaFinal() {
        Integer promedio = 0;
        int coincidencia = 0;
        Alumno alumnoActual = new Alumno();
        System.out.println("***** CALCULO PROMEDIO *****");
        System.out.println("Ingresa el nombre del alumno para calcular su promedio final");
        String nombre = leer.next();

        Iterator<Alumno> it = listaAlumnos.iterator();
        while (it.hasNext()) {
            alumnoActual = it.next();
            if (alumnoActual.getNombre().equals(nombre)) {
                Iterator<Integer> it2 = alumnoActual.getNotas().iterator();
                while (it2.hasNext()) {
                    promedio = promedio + it2.next();
                }
                coincidencia++;
                System.out.println("El promedio Final es " + promedio / alumnoActual.getNotas().size());
            }
        }
        if (coincidencia==0){
            System.out.println("Alumno no encontrado");
        } 
        //return (promedio / alumnoActual.getNotas().size());
    }
}
