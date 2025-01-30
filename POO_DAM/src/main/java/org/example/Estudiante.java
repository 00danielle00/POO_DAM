package org.example;

public class Estudiante {
    public static int contadorEstudiantes=0;
    public static final String FORMATO_CORREO="^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private Libro libroprestado;


    public Estudiante(String nombre){
        this.nombre=nombre;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
    }

    public Estudiante(String nombre, String curso, String email){

        this.nombre=nombre;
        this.curso=curso;
        this.email=email;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
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
    public Libro getLibroprestado() {
        return libroprestado;
    }

    public void setLibroprestado(Libro libroprestado) {
        this.libroprestado = libroprestado;
    }
    @Override
    public String toString(){
        if (libroprestado!= null) {
            return "Alumno [nombre= " + this.nombre + " curso " + this.curso + " nia " + this.nia + " el email " + this.email +libroprestado.getEstudianteprestado()+ "]";
        }else {
            return "Alumno [nombre= " + this.nombre + " curso " + this.curso + " nia " + this.nia + " el email " + this.email+" }";
        }
    }
    public static int obtenertotal(){
        return contadorEstudiantes;
    }

    public static boolean validarcorreo(String email){
        return email.matches(FORMATO_CORREO) && email != null;
    }


}
