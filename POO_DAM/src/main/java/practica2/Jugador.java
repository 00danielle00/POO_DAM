package practica2;

public class Jugador extends MutxamelFC implements AccionesDeportivas {

    private Equipos categoria;
    private int dorsal;
    private Posiciones posiciones;

    public Jugador(String nombre, int edad, int dorsal, Posiciones posiciones, Equipos categoria) {
        super(nombre, edad);
        this.dorsal=dorsal;
        this.posiciones=posiciones;
        this.categoria=categoria;
    }

    public void calentar(){
        System.out.println(getNombre()+ " está calentando");
    }
    public void descansar(){
        System.out.println(getNombre()+" está descansando ");

    }
    public void marcarGol(){
        System.out.println(getNombre()+" ha marcado un gol");
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public Posiciones getPosiciones() {
        return posiciones;
    }

    @Override
    public void entrenar() {

        System.out.println(getNombre()+" esta entrenando");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println(getNombre()+" esta jugando un partido contra "+rival);
    }

}
