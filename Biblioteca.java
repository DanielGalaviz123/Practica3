import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public List<Libro> obtenerLibrosPrestados() {
        List<Libro> librosPrestados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.isPrestado()) {
                librosPrestados.add(libro);
            }
        }
        return librosPrestados;
    }

    public List<Libro> obtenerLibrosNoPrestados() {
        List<Libro> librosNoPrestados = new ArrayList<>();
        for (Libro libro : libros) {
            if (!libro.isPrestado()) {
                librosNoPrestados.add(libro);
            }
        }
        return librosNoPrestados;
    }

    public List<Libro> getLibros() {
        return libros;
    }
}
