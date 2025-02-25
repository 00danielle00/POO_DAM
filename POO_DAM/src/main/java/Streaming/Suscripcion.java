package Streaming;

public abstract class Suscripcion {

    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan,double precio){
        this.nombrePlan=nombrePlan;
        this.precio=precio;
    }

    public void mostrarInfo(){
        System.out.println("Nombre del plan: " + nombrePlan +  " con precio: " + precio + "€.");
    }

    public abstract void obtenerBeneficios();

    public abstract void obtenerPeriodoPrueba();


}