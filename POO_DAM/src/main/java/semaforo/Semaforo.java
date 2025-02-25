package semaforo;

public enum Semaforo {
    AMARILLO,ROJO,VERDE;

    public Semaforo siguiente(Semaforo actual){
       switch (actual){
           case ROJO :
               return Semaforo.VERDE;
           case AMARILLO:
               return Semaforo.ROJO;
           case VERDE:
               return Semaforo.AMARILLO;
           default:
               return Semaforo.ROJO;
       }

    }
}

