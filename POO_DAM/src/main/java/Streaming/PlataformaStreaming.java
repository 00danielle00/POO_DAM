package Streaming;

public class PlataformaStreaming {

    public static void main(String[] args) {

        Suscripcion[] planes= {new PlanGratis("Gratis",0),new PlanBasico("Básico",9.99)};

        for(Suscripcion plan : planes){
            System.out.println();
            plan.mostrarInfo();
            plan.obtenerBeneficios();
            plan.obtenerPeriodoPrueba();
        }

    }
}