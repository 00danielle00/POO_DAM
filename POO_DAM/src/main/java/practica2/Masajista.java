package practica2;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa al masajista del equipo
 */
@Setter
@Getter
public class Masajista extends MutxamelFC {
    private String titulacion;
    private int anyosExpeciencia;

    /**
     * Constructor de la clase Masajista
     *
     * @param nombre del masajista
     * @param edad del masajista
     * @param titulacion  que tiene el masajista
     * @param anyosExpeciencia que tiene el masajista
     */
    public Masajista(String nombre, int edad, String titulacion, int anyosExpeciencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anyosExpeciencia = anyosExpeciencia;
    }

    /**
     * Metodo para dar masaje a un jugador
     *
     * @param jugador al que le da el masaje
     */
    public void darMasaje(Jugador jugador) {
        System.out.println("Dando masaje a: " + jugador.getNombre());
    }

    /**
     * Método heredado de la clase madre MutxamelFC
     */
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrándose en el partido");
    }

    /**
     * Método heredado de la clase madre MutxamelFC
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viajando a la ciudad " + ciudad);
    }

    /**
     * Método heredado de la clase madre MutxamelFC
     */
    @Override
    public void celebrarGol() {
        System.out.println(getNombre() + " celebrando el gol...");
    }
}
