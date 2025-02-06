package elformiguero;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class AppPrograma {

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n");
        //creamos una cadena de tv
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
        System.out.println("\n");

        //creamos un programa
        Programa el_hormiguero = new Programa("El Hormiguero",antena3,"Director1");
        System.out.println(el_hormiguero);
        System.out.println("\n");
        antena3.agregarPrograma(el_hormiguero);
        System.out.println(antena3);
        System.out.println("\n");
        //insertamos empleados en el programa
        el_hormiguero.agregarEmpleado("Pablo Motos","presentador", null);
        System.out.println(el_hormiguero);
        System.out.println("\n");
        //ver empleados del programa
        System.out.println(el_hormiguero.getListaEmpleados());
        System.out.println("\n");
        //insertamos invitados en el programa

        System.out.println("\n");
        //ver invitados del programa

        //insertamos invitados en el programa

        System.out.println("Inserte el año en el que acudirá el invitado");
        int y = teclado.nextInt();
        System.out.println("Introduce el mes:");
        int m = teclado.nextInt();
        System.out.println("Introduce el dia:");
        int d = teclado.nextInt();

        LocalDate fecha = LocalDate.of(y,m,d);

        System.out.println("\n");

        el_hormiguero.agregarInvitados("Aitana", "cantante", 1,fecha);

        System.out.println(el_hormiguero.getListaInvitados());



    }







}
