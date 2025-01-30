package org.example;

import java.util.ArrayList;

public class Editorial {
    private String nombre;
    private String pais;

    private ArrayList<Libro>lista_libros;


    public Editorial(String nombre, String pais){
        this.nombre=nombre;
        this.pais=pais;
        lista_libros=new ArrayList<>();
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Libro> getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(ArrayList<Libro> lista_libros) {
        this.lista_libros = lista_libros;
    }

    public void anyadirLibro( Libro libro){
        lista_libros.add(libro);
    }

    public void borrarLibro(Libro libro){
        lista_libros.remove(libro);
    }
  @Override
  public String toString(){
        return "Editorial : ["+getNombre()+ " pais "+getPais()+ " lista de libros "+lista_libros+" ]";
  }

}
