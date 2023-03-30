
package Ejercicios_Practicos.Ejercicio_01.Entidades;

public class Perro {
    
    // ATRIBUTOS
    private String raza;

    // Constructor vacio
    public Perro() {
    }
    
    // Constructor por parametros
    public Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }

}
