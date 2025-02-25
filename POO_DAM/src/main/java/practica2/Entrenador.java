package practica2;

import lombok.Getter;
import lombok.Setter;


public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    @Getter
    private Equipos equipos;
    @Setter
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, String formacionPreferida, Equipos equipos) {
        super(nombre, edad);
        this.formacionPreferida=formacionPreferida;
        formacionPreferida(formacionPreferida);
        this.equipos=equipos;
    }

    public void planificarEntrenamiento(){
        System.out.println(getNombre()+" está planificando el entrenamiento");
    }
    public void hacerCambios(){
        System.out.println(getNombre()+" ha hecho cambios en el equipo");

    }
    public void formacionPreferida(String formacion){
        if (!formacion.matches("\\d-\\d-\\d")){
            System.out.println("ERROR: La formacion no tiene el formato correcto");

        }


    }

    @Override
    public void entrenar() {
        System.out.println(getNombre()+ "está entrenando ");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println(getNombre()+ "está jugando un partido contra el equipo "+rival);
    }
}
