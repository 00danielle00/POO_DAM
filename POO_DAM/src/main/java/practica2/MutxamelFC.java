package practica2;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class MutxamelFC implements FuncionesIntegrantes{

    private String nombre;
    private int edad;

    public MutxamelFC(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    @Override
    public void concentrarse() {
        System.out.println(nombre+"concentrándose para el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a "+ciudad+"...");
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOOOOOOOOOLLLLLLL");
    }

}
