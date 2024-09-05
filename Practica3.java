
public class Practica3 {
    public class Main {
        public static void main(String[] args) {
            // Crear objetos de la clase Libro
            Libro libro1 = new Libro("Berserk", "Kentaro Miura", 1997, "999-3-16-148410-0");
            Libro libro2 = new Libro("Jujutsu Kaisen", "Gege Akutami", 2018, "999-0-452-28423-4");
            Libro libro3 = new Libro("Juego de tronos", "George R R Martin", 1996, "999-0-679-43147-3");
    
            // Crear un objeto de la clase Biblioteca
            Biblioteca biblioteca = new Biblioteca();
    
            // Añadir los libros a la biblioteca
            biblioteca.agregarLibro(libro1);
            biblioteca.agregarLibro(libro2);
            biblioteca.agregarLibro(libro3);
    
            // Mostrar la informacion de todos los libros en la biblioteca
            System.out.println("Mostrando todos los libros en la biblioteca:");
            biblioteca.mostrarLibros();
    
            // Buscar un libro por su titulo 
            String tituloBuscado = "1984"; // Puedes cambiar esto a cualquier titulo que desees buscar
            System.out.println("\nBuscando el libro con titulo: " + tituloBuscado);
            Libro libroEncontrado = biblioteca.buscarLibroPorTitulo(tituloBuscado);
    
            // Verificar si el libro fue encontrado
            if (libroEncontrado != null) {
                System.out.println("\nInformacion del libro encontrado:");
                libroEncontrado.mostrarInformacion();
            } else {
                System.out.println("No se encontro ningun libro con el titulo ingresado.");
            }
        }
    }
    
    
    
}    
   
