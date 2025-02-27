package practica2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;

public class AppMutxamelFC {
    static ArrayList<Jugador> senior = new ArrayList<>();
    public static void main(String[] args) throws dorsalException {
//        // crear varios jugadores para el equipo SENIOR
//        Jugador neymar;
//        Jugador Richarlison;
//        Jugador LucasPaqueta;
//        try {
//            neymar = new Jugador("Neymar", 30, 11, Posiciones.DELANTERO, Equipos.SENIOR);
//            comprobarDorsal(neymar);
//            senior.add(neymar);
//
//
//                LucasPaqueta = new Jugador("Lucas", 27, 17, Posiciones.CENTROCAMPISTA, Equipos.SENIOR);
//                comprobarDorsal(LucasPaqueta);
//                senior.add(LucasPaqueta);
//
//
//                 Richarlison = new Jugador("Richarlison", 27, 9, Posiciones.DEFENSA, Equipos.SENIOR);
//                comprobarDorsal(Richarlison);
//                senior.add(Richarlison);
//
//                System.out.println("Equipo Senior de Brasil: ");
//                for (Jugador jugador : senior) {
//                    System.out.println("-" + jugador.getNombre() + " - " + jugador.getPosiciones());
//                }
//            }catch (dorsalException e){
//                System.out.println(e.getMessage());
//            }
//            //crear entrenador para el equipo senior:
//            Entrenador entrenadorBr = new Entrenador("Dorival",61,"4-3-3", Equipos.SENIOR );
//            System.out.println("Entrenador "+entrenadorBr.getNombre()+ " para el equipo de "+ entrenadorBr.getEquipos());
//
//            //crear masajistas del club
//            Masajista masajista = new Masajista("Pedro", 34, "masajes deportivos", 9);
//            System.out.println("Masajista: "+masajista.getNombre()+" con "+masajista.getAnyosExpeciencia()+" años de experiencia "+" con la titulacion "+masajista.getTitulacion());
//
//            //crear acompañante
//            Acompanyante Bruna = new Acompanyante("Bruna", 26, "novia", neymar);
//            System.out.println("Acompañante: "+Bruna.getNombre()+" con parentesco "+Bruna.getParentesco()+ " del jugador "+neymar.getNombre() );

//            System.out.println();
//            //concentrarse
//        System.out.println("===Concentrándose===");
//            neymar.concentrarse();
//            LucasPaqueta.concentrarse();
//            Richarlison.concentrarse();
//            masajista.concentrarse();
//            entrenadorBr.concentrarse();
//            Bruna.concentrarse(); //acompañante
//            System.out.println();
            //entrenar
//        System.out.println("===Entrenando===");
//            neymar.entrenar();
//            LucasPaqueta.entrenar();
//            Richarlison.entrenar();
//            entrenadorBr.entrenar();
//        System.out.println();
//        //masajes
//            System.out.println("===Dando masajes===");
//            masajista.darMasaje(neymar);
//            //viajar
//            System.out.println("===Viajar===");
//            neymar.viajar("Madrid");
//        System.out.println();
//
//        System.out.println("===Planificar entrenamiento===");
//            entrenadorBr.planificarEntrenamiento();
//            System.out.println();
//
//        System.out.println("===Entrenar==");
//        LucasPaqueta.entrenar();
//        System.out.println();
//
//        System.out.println("===descansar");
//        LucasPaqueta.descansar();
//        System.out.println();
//
//        System.out.println("===calentar==");
//        LucasPaqueta.calentar();
//        System.out.println();
//        System.out.println("===Jugar partido===");
//        LucasPaqueta.jugarPartido("Madrid");
//        System.out.println();
//
//        System.out.println("===animarEquipo===");
//        Bruna.animarEquipo();
//        System.out.println();
//
//        System.out.println("===hacer cambios===");
//        entrenadorBr.hacerCambios();
//        System.out.println();
//
//        System.out.println("===hacer GOL");
//        LucasPaqueta.marcarGol();
//        neymar.marcarGol();
//        Richarlison.marcarGol();
//        System.out.println();
//
//        System.out.println("===celebrar gol==");
//        neymar.celebrarGol();
//        entrenadorBr.celebrarGol();
//        masajista.celebrarGol();
//        Bruna.celebrarGol();
//        System.out.println();
//
//        System.out.println("Dar masaje a varios jugadores");
//        masajista.darMasaje(neymar);
//        masajista.darMasaje(Richarlison);
//        System.out.println();
//
//        System.out.println("===Viajar a Mutxamel===");
//        entrenadorBr.viajar("Mutxamel");
//        for (Jugador j: senior){
//            j.viajar("Mutxamel");
//        }
//        System.out.println();
//
//        System.out.println("===descansar===");
//        neymar.descansar();

    }
    public static void comprobarDorsal(Jugador jugador) throws dorsalException{
        for (Jugador j: senior){
            if (j.getDorsal()==jugador.getDorsal()){
                throw new dorsalException("ERROR: los jugadores no pueden tener el mismo dorsal");
            }
        }
        System.out.println("Dorsales válidos");
    }
}
