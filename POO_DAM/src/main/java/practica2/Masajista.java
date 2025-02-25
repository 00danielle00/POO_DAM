package practica2;

public class Masajista extends MutxamelFC{
    private String titulacion;
    private int anyosExpeciencia;


    public Masajista(String nombre, int edad, String titulacion, int anyosExpeciencia) {
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anyosExpeciencia=anyosExpeciencia;
    }
    public void darMasaje(Jugador jugador){
        System.out.println("Dando masaje a: "+jugador);
    }
}
