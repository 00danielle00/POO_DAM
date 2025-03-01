package practica2;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa al acompañante de cada jugador
 */
@Getter @Setter
public class Acompanyante extends MutxamelFC {
    /**
     * Atributos de los acompañantes
     */
    private Jugador integrante;
    private String parentesco;

    /**
     * constructor de la clase acompañante
     * @param nombre del acompañante
     * @param edad del acompañante
     * @param parentesco del acompañante en relación con el jugador
     * @param integrante del equipo
     */
    public Acompanyante(String nombre, int edad, String parentesco, Jugador integrante) {
        super(nombre, edad);
        this.parentesco=parentesco;
        this.integrante=integrante;
    }

    /**
     * método para animar al equipo del partido
     */
    public void animarEquipo(){
        System.out.println(getNombre()+" animando...");
    }

    /**
     * método heredado de la clase abstracta MutxamelFC
     */
    @Override
    public void concentrarse() {
        System.out.println(getNombre()+" concentrandose en el partido");
    }
    /**
     * método heredado de la clase abstracta MutxamelFC
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre()+" viajando a "+ ciudad);
    }
    /**
     * método heredado de la clase abstracta MutxamelFC
     */
    @Override
    public void celebrarGol() {
        System.out.println(getNombre()+ "celebra el gol...");
    }
}
