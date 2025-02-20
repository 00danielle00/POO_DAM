package dispositivos_inteligentes;

import java.util.ArrayList;

public class AppDispositivos {

    public static void main(String[] args) {

        Televisor samsung = new Televisor("Samsung");
        samsung.encender();
        samsung.encender();
        samsung.sincronizar();

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisor("LG SMART"));
        listaDispositivos.add(new ParlanteInteligente("Alexa"));
        listaDispositivos.add(new AireAcondicionado("Haier Inverter"));
        listaDispositivos.add(new Televisor("Samsung comedor"));

        for (Dispositivo dispositivo :listaDispositivos){

            dispositivo.encender();

            if(dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();

            System.out.println("------------------------");
        }


        Dispositivo proyector = new Dispositivo("Proyector") {
            @Override
            public void encender() {
                if (getEstado()){

                }
            }
        };

    }
}