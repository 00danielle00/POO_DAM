package casa;

public class Habitacion {
    private String nombre;

    private int metrosCuadrados;

    public Habitacion(String nombre, int metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados=metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "Habitacion : [ nombre = "+nombre+ " con metros cuadrrados "+metrosCuadrados+ " ]";
    }
}