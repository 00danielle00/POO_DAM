package practica2;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Acompanyante extends MutxamelFC {
    private Jugador integrante;
    private String parentesco;

    public Acompanyante(String nombre, int edad, String parentesco, Jugador integrante) {
        super(nombre, edad);
        this.parentesco=parentesco;
        this.integrante=integrante;

    }

    public void animarEquipo(){
        System.out.println(getNombre()+" animando...");
    }


    @Override
    public void concentrarse() {
        System.out.println(getNombre()+" concentrandose en el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre()+" viajando a "+ ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(getNombre()+ "celebra el gol...");
    }
}
