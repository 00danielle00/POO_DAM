package org.example;

public class Estudiante {
    public static int contadorEstudiantes=0;


    private String nombre;
    private String curso;
    private int nia;
    private String email;

    public Estudiante(String nombre){
        this.nombre=nombre;
        contadorEstudiantes++;
        this.nia=contadorEstudiantes;
    }

    public Estudiante(String nombre, String curso, String email){

        this.nombre=nombre;
        this.curso=curso;
        this.email=email;
        contadorEstudiantes++;
        this.nia=contadorEstudiantes;
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
    @Override
    public String toString(){
        return "Alumno [nombre= "+this.nombre+ " curso "+this.curso+" nia "+this.nia+" el email "+this.email+"]";
    }
    public static int obtenertotal(){
        return contadorEstudiantes;
    }

}
