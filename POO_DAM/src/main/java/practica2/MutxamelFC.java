package practica2;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase abstracta que representa el equipo de MutxamelFC
 */
@Getter
@Setter
public abstract class MutxamelFC implements FuncionesIntegrantes {
    /**
     * Atributos de la clase abstracta
     */
    private String nombre;
    private int edad;

    /**
     * Constructor de la clase abstracta
     *
     * @param nombre del equipo
     * @param edad del equipo
     */
    public MutxamelFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Clase implementada de la Interfaz FuncionesIntegrantes
     */
    @Override
    public void concentrarse() {
        System.out.println(nombre + "concentrándose para el partido...");
    }

    /**
     * Clase implementada de la Interfaz FuncionesIntegrantes
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a " + ciudad + "...");
    }

    /**
     * Clase implementada de la Interfaz FuncionesIntegrantes
     */
    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOOOOOOOOOLLLLLLL");
    }

}
