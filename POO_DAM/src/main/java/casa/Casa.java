package casa;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    private String direccion;
        private ArrayList<Habitacion> habitaciones;// COMPOSICIÓN: la Casa tiene habitaciones
        private Propietario propietario;
        static Scanner teclado = new Scanner(System.in);

        public Casa(String direccion) {
            this.direccion = direccion;
            this.habitaciones = new ArrayList<>();
            setPropietario();
        }

        public void agregarHabitacion(String nombre, int metros) {

            for (Habitacion hab: habitaciones){
                if (hab.getNombre().equals(nombre)){
                    System.out.println("La habitación ya existe");
                    return;
                }

            }
            Habitacion habitacion = new Habitacion(nombre, metros); //solamente la Casa crea las habitaciones
            habitaciones.add(habitacion);

        }

        public void eliminarHabitacion(String nombre){
            for (Habitacion hab:habitaciones){
                if (hab.getNombre().equals(nombre)){
                    habitaciones.remove(hab);
                    return;
                }
            }
        }

        public Habitacion mostrarHabitaciones() {
            System.out.println("Casa en " + direccion + " tiene "+habitaciones.size() + " Habitaciones :");
            //pinta el nombre de las habitaciones de la casa
            for (Habitacion hab : habitaciones){
                System.out.println("- "+hab.getNombre()+ "("+hab.getMetrosCuadrados()+" m2)");
            }
            return habitaciones.getFirst();
        }

        public Habitacion getHabitacionGrande(){

            Habitacion mayor=habitaciones.get(0);

            for (Habitacion hab : habitaciones){
                if (hab.getMetrosCuadrados()> mayor.getMetrosCuadrados()){
                    mayor=hab;
                }
            }
            return mayor;
        }
        public Propietario getPropietario() {
            return propietario;
        }

        public void setPropietario() {
            System.out.println("Inserte propietario: ");
            String nombre = teclado.next();
            System.out.println("Edad del propietario: ");
            int edad =teclado.nextInt();
            propietario = new Propietario(nombre,edad);
        }

        public void CalcularHabitacionMasConsumo(){
            double aux =0;
            double aux_ant=0;
            Habitacion mayor= habitaciones.get(0);
            for (Habitacion hab:habitaciones){
                aux=hab.CalcularConsumo();
                if (aux>=aux_ant){
                    mayor=hab;
                }
            }
            System.out.println("La habitacion que más consume es: "+mayor.getNombre()+" con "+ mayor.CalcularConsumo()+ " kWh");
        }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                ", habitaciones=" + habitaciones +
                ", propietario=" + propietario +
                '}';
    }


}
