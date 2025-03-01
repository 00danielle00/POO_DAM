package practica2;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa el Entrenador del equipo.
 */

public class Entrenador extends MutxamelFC implements AccionesDeportivas {
    /**
     * Atributos de la clase Entrenador
     */
    @Getter
    private Equipos equipos;
    @Setter
    private String formacionPreferida;

    /**
     * @param nombre representa el nombre del Entrenador
     * @param edad  representa la edad del Entrenador
     * @param formacionPreferida representa la formación para cada equipo
     * @param equipos que entrena el Entrenador
     */
    public Entrenador(String nombre, int edad, String formacionPreferida, Equipos equipos) {
        super(nombre, edad);
        this.formacionPreferida = formacionPreferida;
        formacionPreferida(formacionPreferida);
        this.equipos = equipos;
    }

    /**
     * Método para planificar el entrenamiento
     */
    public void planificarEntrenamiento() {
        System.out.println(getNombre() + " está planificando el entrenamiento");
    }

    /**
     * Método que sirve para hacer cambios de jugadores.
     */
    public void hacerCambios() {
        System.out.println(getNombre() + " ha hecho cambios en el equipo");

    }

    /**
     * Método para controlar la formación en caso de que no tenga el formato correcto.
     *
     * @param formacion representa la formación del equipo
     * @throws dorsalException en caso de que la formación no tenga el formato correcto
     */
    public void formacionPreferida(String formacion) throws formacionException {
        if (!formacion.matches("\\d-\\d-\\d")) {
            throw new formacionException("ERROR:La formacion no tiene el formato correcto");
        }
    }

    /**
     * Método heredado de la interfaz AccionesDeportivas
     */
    @Override
    public void entrenar() {
        System.out.println(getNombre() + "está entrenando ");
    }

    /**
     * Método heredado de la clase AccionesDeportivas
     *
     * @param rival con el que jugará el partido
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println(getNombre() + "está jugando un partido contra el equipo " + rival);
    }

    /**
     * Método heredado de la clase MutxamelFC
     */
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrandose en el partido");
    }

    /**
     * Método heredado de la clase MutxamelFC
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viajando con su equipo a " + ciudad);
    }

    /**
     * Método heredado de la clase MutxamelFC
     */
    @Override
    public void celebrarGol() {
        System.out.println(getNombre() + " celebrando el gol...");
    }

    /**
     * Método para mostrar los datos de cada entrenador
     *
     * @return los datos de cada entrenador
     */
    @Override
    public String toString() {
        return "Entrenador " + getNombre() + " equipos: " + equipos + ", formacionPreferida:'" + formacionPreferida + '}';
    }
}
