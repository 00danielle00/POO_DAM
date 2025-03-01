package practica2;

import herencia_festival.EdadValidaException;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa al jugador de un equipo
 */
@Getter @Setter
public class Jugador extends MutxamelFC implements AccionesDeportivas {

    /**
     * Atributos de la clase jugador
     */
    private Equipos categoria;
    private int dorsal;
    private Posiciones posiciones;

    /**
     * Constructor con los siguientes valores para la clase jugador
     * @param nombre del jugador
     * @param edad del jugador
     * @param dorsal del jugador
     * @param posiciones en la que juega el jugador
     * @param categoria en la que juega el jugador
     */
    public Jugador(String nombre, int edad, int dorsal, Posiciones posiciones, Equipos categoria) {
        super(nombre, edad);
        this.dorsal=dorsal;
        this.posiciones=posiciones;
        this.categoria=categoria;
    }

    /**
     * Método que simula que el jugador está calentando
     */
    public void calentar(){
        System.out.println(getNombre()+ " está calentando");
    }

    /**
     * Método que simula que el jugador está descansando
     */
    public void descansar(){
        System.out.println(getNombre()+" está descansando ");

    }

    /**
     * Método que simula que el jugador marga un gol
     */
    public void marcarGol(){
        System.out.println(getNombre()+" ha marcado un gol");
    }

    /**
     * Método de la Interfaz AccionesDeportivas
     */

    @Override
    public void entrenar() {

        System.out.println(getNombre()+" esta entrenando");
    }
    /**
     * Método de la Interfaz AccionesDeportivas
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println(getNombre()+" esta jugando un partido contra "+rival);
    }
    /**
     * Método de la clase madre MutxamelFC
     */
    @Override
    public void concentrarse() {
        System.out.println(getNombre()+ " se está concentrando ");
    }
    /**
     * Método de la clase madre MutxamelFC
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre()+" viajando a "+ciudad);
    }
    /**
     * Método de la clase madre MutxamelFC
     */
    @Override
    public void celebrarGol() {
        System.out.println(getNombre()+" celebrando el GOOL");
    }


}
