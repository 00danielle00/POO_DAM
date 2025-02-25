package dificultades_enum;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Appuntuaciones {
    public static void main(String[] args) {
        Random random = new Random();
        int aleatorio = random.nextInt(900000)+100000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la dificultad: "+ Arrays.toString(dificultades_Enum.values()));
        String dif =sc.next().toUpperCase();
        System.out.println("Puntuacion obtenida: "+aleatorio);
        System.out.println("Puntuacion final : "+aleatorio);


    }
}
