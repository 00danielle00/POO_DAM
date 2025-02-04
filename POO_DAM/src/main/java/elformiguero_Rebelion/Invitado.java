package elformiguero_Rebelion;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {
static Scanner teclado=new Scanner(System.in);
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    Invitado(String nombre, String profesion, LocalDate fecha_visita, int temporada){
        this.nombre=nombre;
        this.profesion=profesion;
        this.fecha_visita=setFecha_visita();
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

    //a) modificar el set para que pregunte la fecha al usuario
    public LocalDate setFecha_visita() {
        System.out.println("Ingrese el año en el que acudirá  el invitado "+nombre);
        int anyo= teclado.nextInt();
        System.out.println("ingrese el mes :");
        int mes = teclado.nextInt();
        System.out.println("ingrese el día : ");
        int dia =teclado.nextInt();
        this.fecha_visita= LocalDate.of(anyo,mes,dia);
        return fecha_visita;
    }


    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Invitado: [" + "nombre='" + nombre + '\'' + ", profesion='" + profesion + '\'' + ", fecha_visita=" + fecha_visita + ", temporada=" + temporada + " ]";
    }

}
