package casa;

import java.util.ArrayList;

public class Habitacion {
    private String nombre;
    private double metrosCuadrados;
    private ArrayList<Electrodomestico> electrodomesticos;

    public Habitacion(String nombre, int metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados=metrosCuadrados;
        this.electrodomesticos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public ArrayList<Electrodomestico> getElectrodomesticos() {
        return electrodomesticos;
    }

    public void setElectrodomesticos(ArrayList<Electrodomestico> electrodomesticos) {
        this.electrodomesticos = electrodomesticos;
    }
    public void agregarElectrodomestico(String nombre, double consumo){
        for (Electrodomestico ele: electrodomesticos){
            if (ele.getNombre().equals(nombre)){
                System.out.println("El electrodoméstico ya existe");
                return;
            }

        }
        Electrodomestico electrodomestico = new Electrodomestico(nombre, consumo);
        electrodomesticos.add(electrodomestico);
    }
    public Electrodomestico mostrarElectrodomesticos() {
        System.out.println("Electrodomesticos en la habitacion "+ nombre);
        for (Electrodomestico ele : electrodomesticos){
            System.out.println("- "+ele.getNombre()+ "("+ele.getConsumo()+")");
        }
        return electrodomesticos.getFirst();
    }

    public double CalcularConsumo(){
        double consumo=0;

        for (Electrodomestico ele : electrodomesticos){
            consumo+= ele.getConsumo();
        }
        return consumo;
    }

    @Override
    public String toString() {
        return "- Habitacion : [ nombre = "+nombre+ " con metros cuadrados "+metrosCuadrados+ " ]";
    }
}