package org.example;

public class Libro {

    private static int CANTIDADLIBROS=0;
    private static int LIBROSDISPONIBLES=0;
    final static String LIB="LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Editorial editorial;
    private Estudiante estudianteprestado;

    public Libro(String titulo, String autor, Editorial editorial){
        this.titulo=titulo;
        this.autor=autor;
        CANTIDADLIBROS++;
        LIBROSDISPONIBLES++;
        disponible=true;
        id=LIB+calcularId();
        estudianteprestado=null;
        this.editorial=editorial;

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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public boolean getdisponible() {
        return disponible;
    }
    public void setdisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public static int getCANTIDADLIBROS() {
        return CANTIDADLIBROS;
    }

    public static void setCANTIDADLIBROS(int CANTIDADLIBROS) {
        Libro.CANTIDADLIBROS = CANTIDADLIBROS;
    }

    public static int getLIBROSDISPONIBLES() {
        return LIBROSDISPONIBLES;
    }

    public static void setLIBROSDISPONIBLES(int LIBROSDISPONIBLES) {
        Libro.LIBROSDISPONIBLES = LIBROSDISPONIBLES;
    }
    public Estudiante getEstudianteprestado() {
        return estudianteprestado;
    }

    public void setEstudianteprestado(Estudiante estudianteprestado) {
        this.estudianteprestado = estudianteprestado;
    }
    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }


    @Override
    public String toString(){
        if (estudianteprestado != null){
        return "Libro : [ titulo="+getTitulo()+" author="+getAutor()+" id="+getId()+" disponible="+getdisponible()+" estudiante " +estudianteprestado.getNombre()+" editorial"+editorial.getNombre()+" ]";}
        else{
            return "Libro : [ titulo="+getTitulo()+" author="+getAutor()+" id="+getId()+" disponible="+getdisponible()+" estudiante "+" editorial"+editorial.getNombre()+" ]";
        }
    }

    public String calcularId(){
//        if (CANTIDADLIBROS<10){
//            return "00"+CANTIDADLIBROS++;
//        }
//        else if(CANTIDADLIBROS<100){
//            return "0"+CANTIDADLIBROS++;
//        }else {
//            return ""+CANTIDADLIBROS++;
//        }
        return String.format("%03d",CANTIDADLIBROS);

    }
    public Prestamo prestar(Estudiante estudiante){
        if (disponible && estudiante.getLibroprestado()== null) {
            disponible = false;
            System.out.println("El libro" + getTitulo() + " ha sido prestado con exito " + " a " + estudiante.getNombre() + ".");
            LIBROSDISPONIBLES--;
            estudianteprestado = estudiante;
            estudiante.setLibroprestado(this);
            Prestamo prestamo = new Prestamo(estudiante,this);
            System.out.println("Se ha generado el préstamo "+prestamo);
            return prestamo;
//            getPrestamo(prestamo);

        } else if (estudiante.getLibroprestado()!= null) {
            System.out.println("El estidiante "+estudiante.getNombre()+" ya tiene un libro prestado");
        } else {
            System.out.println("El libro" + getTitulo() + " no se puede prestar ");
        }
        return null;
    }
//    public Prestamo getPrestamo(Prestamo prestamo){
//        return prestamo;
//    }
    public void devolver(Estudiante estudiante){
        if (!disponible) {
            disponible = true;
            System.out.println("El libro "+getTitulo()+ " ha sido devuelto con éxito"+" por "+estudianteprestado.getNombre());
            LIBROSDISPONIBLES++;
            estudianteprestado=null;
            estudiante.setLibroprestado(null);

        }else {
            System.out.println("El libro"+getTitulo()+"no se puede devolver");
        }
    }

    public boolean estaDisponible(){
        return disponible;
    }
    public static int getTotalLibros(){
        return CANTIDADLIBROS;
    }
    public static int getLibrosDisponibles(){
        return LIBROSDISPONIBLES;
    }


}
