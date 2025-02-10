package EXAMEN_ud5;

import java.util.ArrayList;

public class Organizador {

        private String nombre;
        private String edicion;
        private ArrayList<Corredor> listaCorredores;
        private Corredor corredor;

        public Organizador( String edicion) {
            this.edicion = edicion;
            listaCorredores = new ArrayList<>();
            nombre="IES MUTXAMEL";
        }
        public void anyadircorredores(Corredor corredor){
            listaCorredores.add(corredor);
        }

        public void inscribirCorredores(String nombre, double importe){
            listaCorredores.add(new Corredor(nombre, importe));
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEdicion() {
            return edicion;
        }

        public void setEdicion(String edicion) {
            this.edicion = edicion;
        }

        public ArrayList<Corredor> getListaCorredores() {
            return listaCorredores;
        }

        public void setListaCorredores(ArrayList<Corredor> listaCorredores) {
            this.listaCorredores = listaCorredores;
        }

        public Corredor getCorredor() {
            return corredor;
        }

        public void setCorredor(Corredor corredor) {
            this.corredor = corredor;
        }
        //a)metodo mostrar corredores
        public void mostrarCorredores(){
            System.out.println("corredores inscritos: ");
            for (Corredor c: listaCorredores){
                System.out.println("["+c.getDorsal()+"]"+ c.getNombre() );
            }
        }

        @Override
        public String toString() {
            return "Organizador{" + "nombre='" + nombre + '\'' + ", edicion='" + edicion + '\'' + ", listaCorredores=" + listaCorredores + '}';
        }
    }


