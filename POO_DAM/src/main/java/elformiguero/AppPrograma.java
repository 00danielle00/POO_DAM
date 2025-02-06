package elformiguero;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class AppPrograma {

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println(" ");
        //creo una cadena
        Cadena antena3= new Cadena("Antena 3");
        System.out.println(antena3);
        //creo un programa
        System.out.println(" ");
        Programa el_hormiguero= new Programa("El_Hormiguero", antena3, "Director1");
        System.out.println(el_hormiguero);
        System.out.println(" ");

        //agregar cadena
        antena3.agregarPrograma(el_hormiguero);
        System.out.println(antena3);
        System.out.println(" ");

        el_hormiguero.agregarEmpleado("Pablo Motos", "presentador",null);
        System.out.println(el_hormiguero);
        System.out.println(" ");

        //insertamos invitados en el programa
        //a)
//
        // Definimos la fecha del invitado
        System.out.println("Inserte el año en el que acudirá el invitado");
        int y = teclado.nextInt();
        System.out.println("Introduce el mes:");
        int m = teclado.nextInt();
        System.out.println("Introduce el dia:");
        int d = teclado.nextInt();

        LocalDate fecha = LocalDate.of(y, m, d);

        // Insertamos el invitado
        el_hormiguero.agregarInvitados("Aitana", "cantante", 1, fecha);

        // Mostramos la lista de invitados
        System.out.println("Lista de invitados antes de eliminar:");
        System.out.println(el_hormiguero.getListaInvitados());
        








    }







}
