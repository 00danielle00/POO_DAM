package biblioteca2;

public class AppBiblio {

    public static void main(String[] args) {
        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();
        System.out.println(" ");
        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", 1949);
        Libro libro3 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954);
        System.out.println(" ");
        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        System.out.println(" ");
        // Mostrar catálogo
        biblioteca.mostrarCatalogo();
        System.out.println(" ");
        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan", 1);
        Usuario usuario2 = new Usuario("Maria", 2);
        System.out.println(" ");

        // Registrar usuarios en la biblioteca
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);
        System.out.println(" ");

        // Préstamo de libros
        usuario1.prestarLibro(libro1);
        usuario2.prestarLibro(libro2);
        usuario1.prestarLibro(libro3);
        System.out.println(" ");

        // Listar libros prestados por cada usuario
        usuario1.listarLibrosPrestados();
        usuario2.listarLibrosPrestados();
        System.out.println(" ");

        // Intentar prestar un libro ya prestado
        usuario2.prestarLibro(libro1);
        System.out.println(" ");

        // Devolución de libros
        usuario1.devolverLibro(libro1);
        usuario2.devolverLibro(libro2);
        System.out.println(" ");

        // Mostrar catálogo actualizado
        biblioteca.mostrarCatalogo();
        System.out.println(" ");

        // Buscar un libro en la biblioteca
        biblioteca.buscarLibro("1984");
        biblioteca.buscarLibro("Harry Potter");

    }
}
