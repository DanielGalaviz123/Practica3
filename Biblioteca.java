import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca esta vacia.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarInformacion();
                System.out.println(); // Añadir una linea en blanco para separar libros
            }
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro; // Retorna el libro si se encuentra
            }
        }
        System.out.println("El libro con el titulo \"" + titulo + "\" no se encontro.");
        return null; // Retorna null si no se encuentra el libro
    }
}
