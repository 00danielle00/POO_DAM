package CuentaBancaria;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria (double saldo){
        this.saldo=saldo;
    }

    public void ingresarDinero(double ingreso){
        if (ingreso<=0.0){
            throw new SaldoInsuficienteException("La cantidad debe ser mayor a cero");
        } else if (ingreso > 3000.0) {
            throw new DepositoMaximoException("Has excedido el deposito máximo");
        }
        saldo+=ingreso;
        System.out.println("Saldo "+saldo+ "€ introducido");
    }
    public void retirarDinero (double retirar){
        if (saldo<=0.0){
            throw new SaldoInsuficienteException("El saldo es insuficiente");
        } else if (retirar > 3000.0) {
            throw new DepositoMaximoException("Has excedido el deposito máximo");
        }
        saldo-=retirar;
        System.out.println("Saldo "+saldo+ "€ retirado");

    }
    public void consultarSaldo(){
        System.out.println("Saldo disponible :"+saldo);
    }

}
