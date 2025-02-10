package EXAMEN_ud5;

import java.util.ArrayList;

public class APPSOLIDARIOS {

        private static ArrayList<String> listaPatrocinadores;
        public static void main(String[] args){

            Organizador iesmutxamel = new Organizador("I");
            System.out.println(iesmutxamel);

            Corredor corredor1 = new Corredor("Luis",1.5);
            corredor1.insertarPatrocinador("Madre");
            corredor1.insertarPatrocinador("Profe_cast");
            System.out.println(corredor1);

            corredor1.insertarPatrocinador("madre");
            corredor1.insertarPatrocinador("Profe,cast");
            System.out.println(corredor1);

            Corredor corredor2 = new Corredor("Carla",0.0);
            System.out.println(corredor2);
            iesmutxamel.anyadircorredores(corredor2);

            System.out.println(iesmutxamel);
            iesmutxamel.mostrarCorredores();


        }

    }

