package Ejericios_extra.Ejercicio_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_01 {

    /**
     * Diseñar un programa que lea una serie de valores numéricos enteros desde
     * el teclado y los guarde en un ArrayList de tipo Integer. La lectura de
     * números termina cuando se introduzca el valor -99. Este valor no se
     * guarda en el ArrayList. A continuación, el programa mostrará por pantalla
     * el número de valores que se han leído, su suma y su media (promedio).
     *
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> listaNumeros = new ArrayList();
        
        //CICLO PARA INGRESAR
        System.out.println("INGRESO DE SERIE NUMERICA");
        int numero;
        do {
            numero = leer.nextInt();
            if (numero != -99) {
                listaNumeros.add(numero);
            }
        } while (numero != -99);
        
        //CICLO PARA MOSTRAR
        System.out.println("MOSTRAR LISTA");
        for (Integer var : listaNumeros) {
            System.out.println(var);
        }  
    }
}
