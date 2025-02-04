package elformiguero_Rebelion;

import casa.Habitacion;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    Cadena(String nombre){
        this.nombre=nombre;
        this.listaProgramas=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    //añadir y eliminar programas
    public void anyadirPrograma(Programa programa){
        if (listaProgramas.contains(programa)){
            listaProgramas.add(programa);
            programa.setCadena(this); //asegura que el programa se relaciona con su cadena correspondiente
        }

    }
    public void eliminarPrograma(Programa programa){
        listaProgramas.remove(programa);
    }

    @Override
    public String toString() {
        return "Cadena : [" + "Nombre='" + nombre + '\'' + ", ListaProgramas =" + listaProgramas+ " ]";
    }





}
