package biblioteca2;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

/**
 * Esta clase representa a un usuario que puede tomar libros prestados
 * @author Danielle Bemfica Ludovico
 * @version 1.0
 * @see Libro
 * @see Biblioteca
 */
public class Usuario {
    /**
     * Atributos de la clase usuario
     */
    private String nombre;
    private int id;
    private ArrayList<Libro> librosPrestados;
    /**
     * Constructor para inicializar un usuario con nombre y un ID.
     * @param nombre representa el nombre del usuario.
     * @param id identificador único del usuario.
     */
    public Usuario(String nombre, int id) {
        this.id = id;
        this.nombre = nombre;
        librosPrestados = new ArrayList<>();
    }
    /**
     * Este método permite al usuario prestar un libro solo si está disponible.
     * @param libro el libro  que se va a prestar.
     */
    public void prestarLibro(Libro libro) {
        if (libro.getDisponible()) {
            librosPrestados.add(libro);
            libro.setDisponible(false);
            System.out.println(nombre + " ha prestado el libro " + libro.getTitulo());
        } else {
            System.out.println("El libro " + libro.getTitulo() + " no se puede prestar.");
        }
    }
    /**
     * Este método permite al usuario devolver un libro prestado.
     * @param libro el libro que se va a devolver.
     */
    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            librosPrestados.remove(libro);
            libro.setDisponible(true);
        }
        System.out.println("el libro "+libro.getTitulo()+ " ha sido devuelto por "+nombre);
    }

    /**
     * Este método muestra por pantalla la lista de los libros prestados
     */
    public void listarLibrosPrestados() {
        System.out.println("Los libros prestados por "+nombre +" son: "+ getLibrosPrestados());
    }

    /**
     *Sección de getters y setters
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    /**
     *
     * @return los atributos de la clase usuario por pantalla.
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", librosPrestados=" + librosPrestados +
                '}';
    }
}
