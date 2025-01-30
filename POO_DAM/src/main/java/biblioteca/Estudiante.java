package biblioteca;

import java.util.ArrayList;

public class Estudiante {
    public static int contadorEstudiantes=0;
    public static final String FORMATO_CORREO="^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;


    private ArrayList <Libro> libroprestados;

    public Estudiante(String nombre){
        this.nombre=nombre;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
        libroprestados=new ArrayList<>();
    }

    public Estudiante(String nombre, String curso, String email){

        this.nombre=nombre;
        this.curso=curso;
        this.email=email;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
        libroprestados=new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList <Libro> getLibrosPrestados() {
        return libroprestados;
    }

    public void setLibroprestados(ArrayList<Libro> libroprestados) {
        this.libroprestados = libroprestados;
    }

    public void anyadirLibro(Libro libro){
        libroprestados.add(libro);
    }
    public void borrarLibro(Libro libro){
        libroprestados.remove(libro);
    }
    @Override
    public String toString(){
        if (libroprestados.isEmpty()) {
            return "Alumno [nombre= " + this.nombre + " curso " + this.curso + " nia " + this.nia + " el email " + this.email +" Libro prestado= "+libroprestados+ " ]";
        }else {
            return "Alumno [nombre= " + this.nombre + " curso " + this.curso + " nia " + this.nia + " el email " + this.email+" ]";
        }
    }
    public static int obtenertotal(){
        return contadorEstudiantes;
    }

    public static boolean validarcorreo(String email){
        return email.matches(FORMATO_CORREO) && email != null;
    }


}
