package biblioteca2;

import lombok.Data;

import java.util.ArrayList;

/**
 * Esta clase gestiona el catálogo de libros y préstamos
 * @author Danielle Bemfica Ludovico
 * @version 1.0
 *  @see Libro
 *  @see Biblioteca
 */
public class Biblioteca {
    /**
     * Atributos de la clase biblioteca
     */
    private ArrayList<Libro> catalogo;
    private ArrayList<Usuario> usuariosRegistrados;

    /**
     * Constructor para inicializar la biblioteca  y el catalogo
     * con listas vacías, que sañadirán conforme se vayan creando
     */
    public Biblioteca() {
        catalogo = new ArrayList<>();
        usuariosRegistrados = new ArrayList<>();

    }
    /**
     * Este método arega un libro al catálogo de la biblioteca.
     * @param libro  el libro que se va a agregar.
     */
    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
        System.out.println("El libro " + libro.getTitulo() + " se ha añadido al catálogo");

    }
    /**
     * Este método registra un nuevo usuario en la biblioteca.
     * @param usuario el usuario que se quiera registrar.
     */
    public void registrarUsuario(Usuario usuario) {
        usuariosRegistrados.add(usuario);
        System.out.println("El usuario "+usuario.getNombre()+ " ha sido registrado exitosamente");

    }
    /**
     * Este método busca un libro en el catálogo por su título.
     * @param titulo el título del libro que se quiere buscar.
     */
    public void buscarLibro(String titulo) {
        for (Libro lib : catalogo) {
            if (lib.getTitulo().equals(titulo)) {
                System.out.println("El libro "+lib.getTitulo()+ "si que se encuentra en el catálogo");
                return;
            }
        }
        System.out.println("El libro "+titulo+ " no se encuentra");
    }

    /**
     * Muestra el catálogo de libros que están disponible
     */
    public void mostrarCatalogo() {
        System.out.println("los libros disponibles son:");

        for (Libro lib : catalogo) {
            if (lib.getDisponible()){
                System.out.println("El libro "+lib.getTitulo()+ " está disponible");
            }
        }
    }

    /**
     * Sección de getters y setters
     */

    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Libro> catalogo) {
        this.catalogo = catalogo;
    }

    public ArrayList<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public void setUsuariosRegistrados(ArrayList<Usuario> usuariosRegistrados) {
        this.usuariosRegistrados = usuariosRegistrados;
    }

    /**
     *
     * @return muestra por pantalla los atributos de la clase biblioteca
     */

    @Override
    public String toString() {
        return "Biblioteca{" +
                "catalogo=" + catalogo +
                ", usuariosRegistrados=" + usuariosRegistrados +
                '}';
    }
}






