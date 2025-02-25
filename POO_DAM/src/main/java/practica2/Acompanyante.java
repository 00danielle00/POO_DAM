package practica2;

public class Acompanyante extends MutxamelFC {
    private Jugador integrante;
    private String parentesco;

    public Acompanyante(String nombre, int edad, String parentesco, Jugador integrante) {
        super(nombre, edad);
        this.parentesco=parentesco;
        this.integrante=integrante;

    }

    private void animarEquipo(){

    }

}
