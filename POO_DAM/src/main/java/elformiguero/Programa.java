package elformiguero;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programa {


    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, String nombreDirector) {
        this.nombre = nombre;
        this.cadena = cadena;
        temporadas = 0;
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        this.director=new Empleado(nombreDirector, "director",null);
        listaEmpleados.add(director);
    }

    public void agregarEmpleado(String nombre, String cargo, Empleado director){

        listaEmpleados.add(new Empleado(nombre, cargo,director));
    }
    public void borrarEmpleado(String nombre, String cargo, Empleado director){
        listaEmpleados.remove(new Empleado(nombre, cargo,director));
    }

    public void agregarInvitados(String nombre, String cargo, int temporadas, LocalDate fecha){
        listaInvitados.add(new Invitado(nombre,cargo,temporadas,fecha));
    }
    public void borrarInvitados(String nombre, String cargo, int temporadas, LocalDate fecha){
        listaInvitados.remove(new Invitado(nombre,cargo,temporadas,fecha));
    }


    //b)
    public void invitadosTemporada(int temporada){
        int numInvitadosTemporada=0;
        for (Invitado in: listaInvitados){
            if (in.getTemporada()==temporada){
                System.out.println("nombre: "+in.getNombre()+" con la profesión: "+in.getProfesion());
                numInvitadosTemporada++;

            }
        }
        System.out.println("El numero de invitados que han acudido al programa en la temporada "+temporada+": "+numInvitadosTemporada);

    }
    //c)
    public int vecesInvitado(String nombre){
        int veces=0;

        for (Invitado in:listaInvitados){
            if (in.getNombre().equals(nombre)){
                veces++;
            }
        }
        return veces;

    }

    //d)
    public void rastrearInvitado(String nombre){
        System.out.println("El invitado ha ido al programa "+vecesInvitado(nombre)+" veces");

        for (Invitado in:listaInvitados){
            if (in.getNombre().equals(nombre)){
                System.out.println("ha acudido en la fecha: "+in.getFecha_visita()+" y en la temporada "+in.getTemporada());
            }
        }
    }

    //e)

    public boolean buscarInvitado(String nombre){
        for (Invitado in:listaInvitados){
            if (in.getNombre().equals(nombre)){
                System.out.println("El invitado "+in.getNombre()+" ha acudido al programa");
                return true;
            }
        }
        System.out.println("El invitado "+ nombre+ " no ha acudido al programa ");
        return false;
    }


    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemaporadas() {
        return temporadas;
    }

    public void setTemaporadas(int temaporadas) {
        this.temporadas = temaporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena.getNombre() +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }
}
