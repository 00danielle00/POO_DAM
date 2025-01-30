package org.example;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Persona> lista_personas;

    public Equipo(String nombre){
        this.nombre=nombre;
        lista_personas=new ArrayList<>(); //crea la lista

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas(ArrayList<Persona> lista_personas) {
        this.lista_personas = lista_personas;
    }
    @Override

    public String toString(){
        return "Equipo: [ nombre = "+getNombre()+" componentes = "+lista_personas + " ]";
    }
    public void anyadir_componentes(Persona persona){
        lista_personas.add(persona);
    }
    public void eliminar_persona(Persona persona){
        lista_personas.remove(persona);
    }
}
