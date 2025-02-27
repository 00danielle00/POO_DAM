package Repasoo;

import java.util.ArrayList;

public class Pedido extends PizzaExpress{
    private Cliente cliente;
    private ArrayList<CartaPizzas> listacartaPizzas;
    private Estado estadoPedido;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        listacartaPizzas = new ArrayList<>();
        this.estadoPedido=Estado.CREANDO;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<CartaPizzas> getListacartaPizzas() {
        return listacartaPizzas;
    }

    public void setListacartaPizzas(ArrayList<CartaPizzas> listacartaPizzas) {
        this.listacartaPizzas = listacartaPizzas;
    }

    public Estado getEstadoPedido() {
        return estadoPedido;
    }
    public void avanzar(){
        switch (estadoPedido){
            case CREANDO -> estadoPedido=Estado.RECIBIDO;
            case RECIBIDO -> estadoPedido=Estado.MONTANDI_PIZZA;
            case MONTANDI_PIZZA -> estadoPedido=Estado.HORNEANDO;
            case HORNEANDO -> estadoPedido= Estado.PREPARANDO_PEDIDO;
            case PREPARANDO_PEDIDO -> estadoPedido= Estado.LISTO;
        }
        System.out.println("Estado actual :"+estadoPedido);
    }

    public void setEstadoPedido(Estado estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    //
    public void anyadirCarta(CartaPizzas cartaPizzas){
        listacartaPizzas.add(cartaPizzas);
    }

    @Override
    void obtenerDetalles() {

    }
}
