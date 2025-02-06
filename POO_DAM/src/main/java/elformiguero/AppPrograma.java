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
//        System.out.println("Inserte el año en el que acudirá el invitado");
//        int y = teclado.nextInt();
//        System.out.println("Introduce el mes:");
//        int m = teclado.nextInt();
//        System.out.println("Introduce el dia:");
//        int d = teclado.nextInt();
//        LocalDate fecha = LocalDate.of(y,m,d);
        System.out.println(" ");
        LocalDate fecha = LocalDate.of(2025, 5, 20);
        el_hormiguero.agregarInvitados("Aitana", "cantante", 1, fecha);
        System.out.println(el_hormiguero.getListaInvitados());

        System.out.println(" ");
        el_hormiguero.invitadosTemporada(1);
        System.out.println(" ");
        System.out.println(el_hormiguero.vecesInvitado("Aitana"));
        System.out.println(" ");
        el_hormiguero.rastrearInvitado("Aitana");
        System.out.println(" ");
        el_hormiguero.buscarInvitado("Aitana");
        System.out.println(" ");
        el_hormiguero.borrarInvitados(new Invitado("Aitana", "cantante", 1, LocalDate.of(2025, 5, 20)));








    }







}
