package practica2;

import java.util.ArrayList;
import java.util.Arrays;

public class AppMutxamelFC {
    public static void main(String[] args) {
        // crear varios jugadores para el equipo SENIOR
        ArrayList<Jugador> senior = new ArrayList<>();

            Jugador neymar = new Jugador("Neymar", 30, 11, Posiciones.DELANTERO, Equipos.SENIOR);
            Jugador LucasPaqueta = new Jugador("Lucas", 27, 17, Posiciones.CENTROCAMPISTA, Equipos.SENIOR);
            Jugador Richarlison = new Jugador("Richarlison", 27, 9, Posiciones.DEFENSA, Equipos.SENIOR);

            senior.add(neymar);
            senior.add(LucasPaqueta);
            senior.add(Richarlison);
            System.out.println("Equipo Senior de Brasil: ");
            for (Jugador jugador: senior){
                System.out.println(jugador.getNombre()+" - "+jugador.getPosiciones());
                System.out.println("----------------------");
            }
        //crear entrenador para el equipo senior:
            Entrenador entrenadorBr = new Entrenador("Dorival",61,"4-3-4", Equipos.SENIOR );
            System.out.println("Entrenador "+entrenadorBr.getNombre()+ " para el equipo de "+ entrenadorBr.getEquipos());

            //crear masajistas del club
           


    }
}
