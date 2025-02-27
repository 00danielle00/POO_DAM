package Repasoo;

import semaforo.Semaforo;

public enum CartaPizzas {
    BBQ(9),
    CARBONARA(8),
    JAMON_YORK(6),
    ATUN(7.5),
    HAWAIANA(7),
    VEGGIE(10);

    private double precio;
    CartaPizzas(double precio) {
        this.precio=precio;
    }
    public CartaPizzas carta ( CartaPizzas actual){
        switch (actual){
            case BBQ :
                return CartaPizzas.BBQ;
            case CARBONARA:
                return CartaPizzas.CARBONARA;
            case JAMON_YORK:
                return CartaPizzas.JAMON_YORK;
            case ATUN:
                return CartaPizzas.ATUN;
            case HAWAIANA:
                return CartaPizzas.HAWAIANA;
            case VEGGIE:
                return CartaPizzas.VEGGIE;
            default:
                System.out.println("producto no disponible");
                return CartaPizzas.VEGGIE;

        }
    }
    public double getPrecio() {
        return precio;
    }
}
