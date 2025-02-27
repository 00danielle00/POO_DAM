package Repasoo;

public class Empleado extends PizzaExpress implements AccionesPedido {
   private static int contador =1;
   private String id_empleado;
   private String nombre;

    public Empleado(String nombre) {
        this.id_empleado =String.format("EMP%03d",contador++);
        this.nombre = nombre;
    }

    public void siguienteEstado(Pedido pedido){
        pedido.avanzar();
    }
    public void entregarPedido(Pedido pedido){
        if (pedido.getEstadoPedido()!=Estado.LISTO){

        }
        System.out.println("Pedido entregado por: "+nombre);

   }

    @Override
    void obtenerDetalles() {
        System.out.println("Empleado "+id_empleado+": "+ nombre);

    }

    @Override
    public void cancelarPedido(Pedido pedido) {
        if (pedido.getEstadoPedido()==Estado.CANCELADO){
            System.out.println("Pedido cancelado por "+nombre);
        }
    }
}
