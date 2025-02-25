package prueba_enum;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;

public class AppPelis {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SagasPelis peli = SagasPelis.SHREK;
        System.out.println(peli);

        for (SagasPelis pelis : SagasPelis.values()) {
            System.out.println("Peli: "+pelis+" con "+ pelis.getNum_pelis()+" pelis en total");
        }

        System.out.println("Introduce una saga: "+ Arrays.toString(SagasPelis.values()));
        String saga = sc.nextLine().toUpperCase();
        SagasPelis saga_enum = SagasPelis.valueOf(saga);
        System.out.println("la saga escogida es "+saga_enum+ " con "+saga_enum.getNum_pelis()+" peliculas ");

        //ordinal
        int posicion = saga_enum.ordinal();
        System.out.println("la saga consultada está en la posición "+ posicion);

        //name
        String saga_peli = SagasPelis.CREPUSCULO.name();
        System.out.println(saga_peli);

        //value --> vector
        //valueof -->  enum a string
        //ordibal --> obtener posicion
        //name --> string a enum

    }


}
