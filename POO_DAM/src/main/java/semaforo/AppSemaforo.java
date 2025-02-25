package semaforo;

public class AppSemaforo {
    public static void main(String[] args) {
        Semaforo sem = Semaforo.AMARILLO;

        //.values lo convierte a vector
        //valueof string a enum
        //ordinal posicion
        //
        for (int i = 0; i < 10; i++) {
            sem = sem.siguiente(sem);
            System.out.println(sem);
        }
    }
}
