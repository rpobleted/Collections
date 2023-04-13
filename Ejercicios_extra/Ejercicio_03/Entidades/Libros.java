package Ejercicios_extra.Ejercicio_03.Entidades;

public class Libros {

    private String titulo;
    private String autor;
    private Integer totalLibros;
    private Integer prestadosLibros;

    public Libros() {
    }

    public Libros(String titulo, String autor, Integer totalLibros, Integer prestadosLibros) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalLibros = totalLibros;
        this.prestadosLibros = prestadosLibros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotalLibros() {
        return totalLibros;
    }

    public void setTotalLibros(Integer totalLibros) {
        this.totalLibros = totalLibros;
    }

    public Integer getPrestadosLibros() {
        return prestadosLibros;
    }

    public void setPrestadosLibros(Integer prestadosLibros) {
        this.prestadosLibros = prestadosLibros;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", totalLibros=" + totalLibros + ", prestadosLibros=" + prestadosLibros + '}';
    }


}
