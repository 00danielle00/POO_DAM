package elformiguero_Rebelion;

public class AppProgramas {
    public static void main(String[] args) {

        Cadena antena3 = new Cadena("Cadena3");
        System.out.println(antena3);

        Programa el_hormiguero = new Programa("El Hormiguero",antena3,"Director1");
        System.out.println(el_hormiguero);
        System.out.println(antena3);

        el_hormiguero.anyadirEmpleado("Pablo Motos","presentador",null);
        System.out.println(el_hormiguero);



    }
}
