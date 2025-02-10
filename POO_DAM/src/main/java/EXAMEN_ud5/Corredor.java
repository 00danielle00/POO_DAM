package EXAMEN_ud5;

import java.util.ArrayList;

public class Corredor {
    package carrera_solidaria;

    import java.util.ArrayList;

    public class Corredor {
        public int contadorDorsal=1;

        private String nombre;
        private int dorsal;
        private static ArrayList<String> listaPatrocinadores;
        private double importe_vuelta;
        private int vueltas_competadas;
        private Organizador organizador;

        public Corredor(String nombre, double importe_vuelta) {
            this.nombre=nombre;
            this.dorsal = contadorDorsal++;
            listaPatrocinadores = new ArrayList<>();
            this.importe_vuelta = importe_vuelta; //poner 0.50€ por defecto
            if (importe_vuelta==0.00){
                this.importe_vuelta=0.50;
            }
            vueltas_competadas = 0;
        }
        public void insertarPatrocinador(String nombre){
            listaPatrocinadores.add(nombre);
        }


        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getDorsal() {
            return dorsal;
        }

        public void setDorsal(int dorsal) {
            this.dorsal = dorsal;
        }

        public ArrayList<String> getListaPatrocinadores() {
            return listaPatrocinadores;
        }

        public void setListaPatrocinadores(ArrayList<String> listaPatrocinadores) {
            this.listaPatrocinadores = listaPatrocinadores;
        }

        public double getImporte_vuelta() {
            return importe_vuelta;
        }

        public void setImporte_vuelta(double importe_vuelta) {
            this.importe_vuelta = importe_vuelta;
        }

        public int getVueltas_competadas() {
            return vueltas_competadas;
        }

        public void setVueltas_competadas(int vueltas_competadas) {
            this.vueltas_competadas = vueltas_competadas;
        }

        public Organizador getOrganizador() {
            return organizador;
        }

        public void setOrganizador(Organizador organizador) {
            this.organizador = organizador;
        }

        @Override
        public String toString() {
            return "Corredor{" +
                    "nombre='" + nombre + '\'' +
                    ", dorsal=" + dorsal +
                    ", importe_vuelta=" + importe_vuelta +
                    ", vueltas_competadas=" + vueltas_competadas +
                    ", listaPatrocinadores"+ listaPatrocinadores +
                    '}';
        }
    }

}
