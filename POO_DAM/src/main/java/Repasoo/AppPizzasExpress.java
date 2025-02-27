package Repasoo;

import prueba_enum.SagasPelis;

import java.util.Scanner;

public class AppPizzasExpress {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CartaPizzas l = CartaPizzas.BBQ;
        System.out.println("*** BIENVENIDO A LA PIZZERÍA DE MUTXAMEL ***");
        Empleado empleado1 = new Empleado("Carlos");
        Empleado empleado2 = new Empleado("Sabrina");

      empleado1.obtenerDetalles();
      empleado2.obtenerDetalles();

        System.out.println("Haz tu pedido... ¿Cómo te llamas?");
        String nombre = sc.next();
        Cliente cliente = new Cliente(nombre);
        Pedido pedido = new Pedido(cliente);

        String op="";
        do {
            System.out.println("Qué te apetece hoy, "+nombre);
            System.out.println("========CARTA==========");
            for (CartaPizzas c: CartaPizzas.values()){
                System.out.println(c+": "+c.getPrecio()+"€");
            }
            System.out.println("=======================");
            try {
                String pizza = sc.next().toUpperCase();
                CartaPizzas pizzas = CartaPizzas.valueOf(pizza);
                pedido.anyadirCarta(pizzas);
            }catch (IllegalArgumentException e){
                System.out.println("El producto seleccionado no existe");
            }

            System.out.println("El precio actual de la cuenta es de "+ "¿Quieres añadir otra pizza a tu pedido? [S/N]");
            op=sc.next();

        }while (op.equals("S"));

        pedido.avanzar();
        double total = calcularTotal(pedido);
        double totalDescuento= total*0.8;

        System.out.println("Total pedido "+total+ "€. Descuento aplicado de 20%:"+ totalDescuento);
        System.out.println("Pasa por caja para pagar, gracias "+nombre);

        empleado1.siguienteEstado(pedido);
        empleado1.siguienteEstado(pedido);
        empleado1.siguienteEstado(pedido);
        empleado1.siguienteEstado(pedido);
        empleado1.entregarPedido(pedido);

    }
    public static double calcularTotal( Pedido pedido){
        double total =0;
        for (CartaPizzas p: pedido.getListacartaPizzas()){
            total+=p.getPrecio();
        }
        return total;
    }

}
