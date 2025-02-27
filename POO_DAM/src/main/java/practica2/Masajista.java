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
        System.out.println("Dando masaje a: "+jugador.getNombre());
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnyosExpeciencia() {
        return anyosExpeciencia;
    }

    public void setAnyosExpeciencia(int anyosExpeciencia) {
        this.anyosExpeciencia = anyosExpeciencia;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre()+" concentrándose en el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre()+ " viajando a la ciudad "+ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(getNombre()+ " celebrando el gol...");
    }
}
