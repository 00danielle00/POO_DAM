package elformiguero;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre){
        this.nombre=nombre;
        this.listaProgramas=new ArrayList<>();

    }

    //añadir y eliminar programa

    public void agregarPrograma(Programa programa){
        listaProgramas.add(programa);
    }

    public void borrarPrograma(Programa programa){
        listaProgramas.remove(programa);
    }

    public ArrayList<Programa> getProgramas() {
        return listaProgramas;
    }

    public void setProgramas(ArrayList<Programa> programas) {
        this.listaProgramas = programas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", programas=" + listaProgramas +
                '}';
    }
}
