public class Practica3 {
    public static void main(String[] args) {
        // Crear autores
        Autor autor1 = new Autor(1, "Kentaro", "kentaro@gmail.com");
        Autor autor2 = new Autor(2, "Gege", "gege@gmail.com");
        Autor autor3 = new Autor(3, "George", "george@gmail.com");

        // Crear libros
        Libro libro1 = new Libro("Berserk", autor1, 1997, "999-3-16-148410-0", false);
        Libro libro2 = new Libro("Jujutsu", autor2, 2018, "999-0-452-28423-4", true);
        Libro libro3 = new Libro("Juego de tronos", autor3, 1996, "999-0-679-43147-3", false);

        // Crear biblioteca y agregar libros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Mostrar todos los libros
        System.out.println("Lista de todos los libros en la biblioteca:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro.getTitulo() + " de " + libro.getAutor().getNombre() + 
                               " (Prestado: " + (libro.isPrestado() ? "Sí" : "No") + ")");
        }

        // buscar un libro por titulo
        String tituloBuscado = "Jujutsu";
        Libro libroEncontrado = biblioteca.buscarLibroPorTitulo(tituloBuscado);
        if (libroEncontrado != null) {
            System.out.println("\nLibro encontrado: " + libroEncontrado.getTitulo() + 
                               " por " + libroEncontrado.getAutor().getNombre());
        } else {
            System.out.println("\nEl libro con el titulo \"" + tituloBuscado + "\" no se encontro.");
        }

        // libros prestados
        System.out.println("\nLibros prestados:");
        for (Libro libro : biblioteca.obtenerLibrosPrestados()) {
            System.out.println(libro.getTitulo() + " por " + libro.getAutor().getNombre());
        }

        // libros no prestados
        System.out.println("\nLibros no prestados:");
        for (Libro libro : biblioteca.obtenerLibrosNoPrestados()) {
            System.out.println(libro.getTitulo() + " por " + libro.getAutor().getNombre());
        }
    }
}

