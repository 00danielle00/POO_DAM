package elformiguero;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada, LocalDate fecha_visita) {
        this.profesion = profesion;
        this.temporada = temporada;
        this.nombre = nombre;
        setFecha_visita(fecha_visita);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {


        this.fecha_visita = fecha_visita;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}
