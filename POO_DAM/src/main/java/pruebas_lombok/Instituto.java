package pruebas_lombok;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;


@Getter @Setter @ToString //crea el getter, setter y toString
@AllArgsConstructor // crea el constructor
public class Instituto {
    //atributos de la clase instituto

    @NonNull // no permite que el nombre esté vacio
    private String nombre;
    private String poblacion;
    private String direccion;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Curso> listaCursos;

    //añado el arraylist al constructor ya que no se añadían los cursos y estudiantes
    public Instituto(String nombre){
        //en caso de que el nombre esté vacío, se le añadirá un valor por defecto
        this.nombre=Objects.requireNonNullElse(nombre, "Instituto sin nombre");
        this.listaEstudiantes=new ArrayList<>();
        this.listaCursos=new ArrayList<>();
    }

    //método para agregar el curso a la lista de cursos
    public void agregarCurso(Curso curso){
        if (curso!=null){
            listaCursos.add(curso);

        }else {
            System.out.println("no se puede agregar un curso nulo");
        }
    }
    // método para agregar el estudiante a la lista de estudiantes
    public void agregarEstudiante(Estudiante estudiante){
        if (estudiante!=null){
            listaEstudiantes.add(estudiante);
        }else {
            System.out.println("No se puede crear un estudiante nulo");
        }

    }
}
