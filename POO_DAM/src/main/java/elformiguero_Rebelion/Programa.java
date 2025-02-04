package elformiguero_Rebelion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programa {
    private String nombre;
    private int temporadas;
    private Cadena cadena;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    Programa(String nombre, Cadena cadena, String nombredire ){
        this.nombre=nombre;
        temporadas=0;
        this.cadena=cadena;
        this.listaEmpleados=new ArrayList<>();
        this.listaInvitados=new ArrayList<>();
        this.director=new Empleado(nombredire,"Director");
        this.listaEmpleados.add(this.director);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    //añadir y borrar empleados
    public void anyadirEmpleado(String nombre, String cargo, Empleado empleado){
        if (empleado==null){
         empleado = new Empleado(nombre, cargo);
        }
        listaEmpleados.add(empleado);
    }
    public void anyadirInvitado(String nombre, String profesion, LocalDate fecha_visita, int temporada){
        Invitado invitado = new Invitado(nombre, profesion, fecha_visita, temporada);
        listaInvitados.add(invitado);
    }
    public void borrarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }
    public void borrarInvitado(Invitado invitado){
        listaInvitados.remove(invitado);
    }
    public void incrementarTemporada(){
        temporadas++;
    }

    public String toString() {
        return "Programa: [" + "nombre='" + nombre + '\'' + ", temporadas=" + temporadas + ", cadena=" + cadena + ", Empleados=" + listaEmpleados+ ", Invitados=" + listaEmpleados + ", director=" + director + " ]";
    }

}
