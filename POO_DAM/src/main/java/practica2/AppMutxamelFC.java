package practica2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class AppMutxamelFC {
    static ArrayList<Jugador> senior = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Entrenador> listaEntrenadores = new ArrayList<>();
    public static void main(String[] args) throws dorsalException {
        // crear varios jugadores para el equipo SENIOR
        Jugador neymar = null;
        Jugador Richarlison = null;
        Jugador LucasPaqueta = null;
        try {
            neymar = new Jugador("Neymar", 30, 11, Posiciones.DELANTERO, Equipos.SENIOR);
            comprobarDorsal(neymar);
            senior.add(neymar);

            LucasPaqueta = new Jugador("Lucas", 27, 17, Posiciones.CENTROCAMPISTA, Equipos.SENIOR);
            comprobarDorsal(LucasPaqueta);
            senior.add(LucasPaqueta);

            Richarlison = new Jugador("Richarlison", 27, 9, Posiciones.DEFENSA, Equipos.SENIOR);
            comprobarDorsal(Richarlison);
            senior.add(Richarlison);

            System.out.println("Equipo Senior de Brasil: ");
            for (Jugador jugador : senior) {
                System.out.println("-" + jugador.getNombre() + " - " + jugador.getPosiciones());
            }
        } catch (dorsalException e){
            System.out.println(e.getMessage());

        }
        //crear entrenador para el equipo senior:
        Entrenador entrenadorBr = new Entrenador("Dorival", 61, "4-3-3", Equipos.SENIOR);
        listaEntrenadores.add(entrenadorBr);
        System.out.println("Entrenador " + entrenadorBr.getNombre() + " para el equipo de " + entrenadorBr.getEquipos());

        //crear masajistas del club
        Masajista masajista = new Masajista("Pedro", 34, "masajes deportivos", 9);
        System.out.println("Masajista: " + masajista.getNombre() + " con " + masajista.getAnyosExpeciencia() + " años de experiencia " + " con la titulacion " + masajista.getTitulacion());

        //crear acompañante
        Acompanyante Bruna = new Acompanyante("Bruna", 26, "novia", neymar);
        System.out.println("Acompañante: " + Bruna.getNombre() + " con parentesco " + Bruna.getParentesco() + " del jugador " + neymar.getNombre());

        System.out.println();
        //concentrarse
        System.out.println("===Concentrándose===");
        neymar.concentrarse();
        LucasPaqueta.concentrarse();
        Richarlison.concentrarse();
        masajista.concentrarse();
        entrenadorBr.concentrarse();
        Bruna.concentrarse(); //acompañante
        System.out.println();
        // entrenar
        System.out.println("===Entrenando===");
        neymar.entrenar();
        LucasPaqueta.entrenar();
        Richarlison.entrenar();
        entrenadorBr.entrenar();
        System.out.println();
        //masajes
        System.out.println("===Dando masajes===");
        masajista.darMasaje(neymar);
        //viajar
        System.out.println("===Viajar===");
        neymar.viajar("Madrid");
        System.out.println();

        System.out.println("===Planificar entrenamiento===");
        entrenadorBr.planificarEntrenamiento();
        System.out.println();

        System.out.println("===Entrenar==");
        LucasPaqueta.entrenar();
        System.out.println();

        System.out.println("===descansar");
        LucasPaqueta.descansar();
        System.out.println();

        System.out.println("===calentar==");
        LucasPaqueta.calentar();
        System.out.println();
        System.out.println("===Jugar partido===");
        LucasPaqueta.jugarPartido("Madrid");
        System.out.println();

        System.out.println("===animarEquipo===");
        Bruna.animarEquipo();
        System.out.println();

        System.out.println("===hacer cambios===");
        entrenadorBr.hacerCambios();
        System.out.println();

        System.out.println("===hacer GOL");
        LucasPaqueta.marcarGol();
        neymar.marcarGol();
        Richarlison.marcarGol();
        System.out.println();

        System.out.println("===celebrar gol==");
        neymar.celebrarGol();
        entrenadorBr.celebrarGol();
        masajista.celebrarGol();
        Bruna.celebrarGol();
        System.out.println();

        System.out.println("Dar masaje a varios jugadores");
        masajista.darMasaje(neymar);
        masajista.darMasaje(Richarlison);
        System.out.println();

        System.out.println("===Viajar a Mutxamel===");
        entrenadorBr.viajar("Mutxamel");
        for (Jugador j : senior) {
            j.viajar("Mutxamel");
        }
        System.out.println();

        System.out.println("===descansar===");
        neymar.descansar();
        System.out.println();

        String op = "";
        do {
            menuPrincipal();
            op=sc.next();
            mantenimiento(op);

        }while (!op.equals("X"));


    }
    public static void menuPrincipal(){
        System.out.println("=== App de mantenimiento del Mutxamel FC ===");
        System.out.println("[1]. Mantenimiento de jugadores");
        System.out.println("\t Dentro podremos añadir jugadores, modificar datos y añadir acompañantes (solo séniors)");
        System.out.println("[2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
        System.out.println("\t Dentro podremos añadir entrenadores y modificar sus datos.");
        System.out.println("[X]. Salir");
        System.out.println("===========================================");
        System.out.println("Selecciona una opción:");
    }
    public static void mantenimiento(String op){
        switch (op){
            case "1":
                System.out.println("hola");
                break;
            case "2":
                mostrarmenuEntrenadores();
                String opcion=sc.next();
                cogerOpcionEntrenador(opcion);
                break;
            default:
                System.out.println("Hasta luego");
                break;

        }
    }
    public static void mostrarmenuEntrenadores(){
        System.out.println("=== Manteniemiento Entrenadores ===");
        System.out.println("[1]. Añadir entrenadores.");
        System.out.println("[2]. Modificar entrenadores");
        System.out.println("[X]. Volver al menú principal");
    }
    public static void cogerOpcionEntrenador(String opcion){
        switch (opcion){
            case "1":
                System.out.println("¿Qué Entrenador quieres añadir?");
                System.out.println("Tenemos los siguientes entrenadores:");
                mostrarEntrenadores();
                agregarJugador();
                System.out.println("Entrenadores añadidos:");
                mostrarEntrenadores();
                System.out.println();
                break;
            case "2":
                System.out.println("¿Que entrenador quieres modificar?");
                System.out.println("Tenemos los siguientes entrenadores:");
                mostrarEntrenadores();
                modificarEntrenador();
                break;
            default:
                menuPrincipal();
        }
    }
    public static void mostrarEntrenadores(){
        for (Entrenador en: listaEntrenadores){
            System.out.println(en.toString());
        }
    }
    //metodopara añadir entrenador
    public static void agregarJugador(){
        System.out.println("Introduce el nombre del entrenador :");
        String nombre = sc.next();
        System.out.println("Introduce la edad del jugador");
        int edad = sc.nextInt();
        System.out.println("Introduce la formación de equipos:");
        String formacion= sc.next();
        Entrenador entrenadorCreado= new Entrenador(nombre,edad,formacion, Equipos.SENIOR);
        listaEntrenadores.add(entrenadorCreado);
        System.out.println("Entrenador "+nombre+ " creado correctamente!!!!");
    }
    public static void modificarEntrenador(){
        System.out.println("¿Qué jugador quieres modificar?, Introduce el nombre");
        String nombre = sc.next();
        for (Entrenador en: listaEntrenadores){
            if (en.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Introduce el nombre:");
                String nuevoNombre= sc.next();
                en.setNombre(nuevoNombre);
                System.out.println("Introduce la edad:");
                int edad=sc.nextInt();
                en.setEdad(edad);
                System.out.println("Introduce la formacion");
                String formacion= sc.next();
                en.setFormacionPreferida(formacion);
            }
        }

    }

    public static void comprobarDorsal(Jugador jugador) throws dorsalException {
        for (Jugador j : senior) {
            if (j.getDorsal() == jugador.getDorsal()) {
                throw new dorsalException("ERROR: los jugadores no pueden tener el mismo dorsal");
            }
        }
        System.out.println("Dorsales válidos");
    }
}
