package pruebas_lombok;

import lombok.*;

@Getter @Setter //crea el getter y setter de los atributos
@ToString //crea el tostring de todos los atributos
@AllArgsConstructor // crea el constructor con todos los arrgumentos dentro
@RequiredArgsConstructor //hace obligatorio el atributo nombre
public class Curso {

    @NonNull // no permite que el nombre sea null
    private String nombre;
    private int horas;


}
