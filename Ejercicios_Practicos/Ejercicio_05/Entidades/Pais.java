package Ejercicios_Practicos.Ejercicio_05.Entidades;

import java.util.Objects;

public class Pais implements Comparable<Pais>{ 
    
    private String nombre;


    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + '}';
    }

    // GENERA UN CODIGO POR CADA INGRESO UNICO
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
    // DEVUELVE UN BOOLEAN DADA LA COMPARACION 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Pais t) {
        return t.getNombre().compareTo(this.nombre);
    }



}
