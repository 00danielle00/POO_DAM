package casa;

public class AppCasa {
    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");
        System.out.println(casa);

        casa.agregarHabitacion("Dormitorio", 40);
        casa.agregarHabitacion("Cocina", 35);
        casa.agregarHabitacion("Baño", 10);

        casa.mostrarHabitaciones();
        System.out.println(casa.getHabitacionGrande());
        casa.agregarHabitacion("Baño", 20);
        casa.agregarHabitacion("Garaje", 20);

        casa.eliminarHabitacion("Cocina");
        casa.mostrarHabitaciones();

        Habitacion cocina = casa.mostrarHabitaciones();

        cocina.agregarElectrodomestico("Nevera", 123);
        cocina.agregarElectrodomestico("Lavadora", 34);

        System.out.println(cocina.mostrarElectrodomesticos());

        System.out.println("El consumo total de los electrodomesticos son: "+cocina.CalcularConsumo());




    }
}
