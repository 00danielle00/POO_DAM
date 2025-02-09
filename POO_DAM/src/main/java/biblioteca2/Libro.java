package biblioteca2;

import biblioteca.Estudiante;
import biblioteca.Prestamo;

/**
 * Esta clase representa un libro en la biblioteca
 * @author Danielle Bemfica
 * @version 1.0
 * @see Biblioteca
 * @see Usuario
 */
public class Libro {
    /**
     * Estos son los atributos de la clase Libro
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    /**
     * Es el constructor para inicializar un libro con su libro, autor y año de publicación.
     * @param titulo define el títuli del libro.
     * @param autor define el autor de dichho libro.
     * @param anioPublicacion define el año de publicación del libro.
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        disponible=true;
    }

    /**
     * Este método es para prestar el libro, cambia su estado a "no disponible"
     */
    public void prestarLibro(){
        if (!disponible){
            System.out.println("El libro no está disponible");
            disponible=false;
        }
    }

    /**
     * Este método es para devolver el libro ya prestado, cambia su estado a disponible
     */
    public void devolverLibro(){
        if (disponible){
            System.out.println("El libro está disponible");
            disponible=true;
        }
    }

    /**
     * Es la sección de los getters y setters
     */
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

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Muestra la información del libro
     */
    public void mostrarInformacion(){
        System.out.println("El libro con el título: "+titulo+" con el autor "+autor+" publicado en el año "+anioPublicacion+ " disponible "+disponible);
    }


    /**
     * muestra por pantalla la información detallada sobre el libro
     * @return el título, autor,año de publicación y si está disponible
     */
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", disponible=" + disponible +
                '}';
    }
}
