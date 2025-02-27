package Repasoo;

public class Cliente extends PizzaExpress implements AccionesPedido{
    private String nombre;
    private int descuento;

    public Cliente(String nombre) {
        this.nombre = nombre;
        descuento = 20;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    ///otras
    public void pedir(){

    }
    public void pagar(){

    }
    public void recoger(){

    }

    @Override
    void obtenerDetalles() {

    }

    @Override
    public void cancelarPedido(Pedido pedido) {

    }
}
