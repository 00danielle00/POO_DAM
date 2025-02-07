package pruebas_lombok;

import lombok.*;


@Getter @Setter //crea el getter y setter de los atributos
@RequiredArgsConstructor //hace que el campo nombre sea obligatorio
@AllArgsConstructor // crea el constructor con todos los atributos
@ToString // crea el tostring
public class Estudiante {
//atributos de la clase estudiante
    @NonNull//no permite que el atributo sea vacío
    private String nombre;
    private int edad;
    private Curso curso;
}
