package CuentaBancaria;

import java.util.Scanner;

public class AppBancaria {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);
        String op="";
        do {

            op=cogerEleccion();
            switch (op){
                case "1":
                    mostrarMenu();
                    cuenta.consultarSaldo();
                    break;
                case "2":
                    double cantidad=0;
                    System.out.println("Introduzca la cantidad a introducir:");
                    try {
                         cantidad = sc.nextInt();
                         cuenta.ingresarDinero(cantidad);
                    } catch (DepositoMaximoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    System.out.println("introduzca la cantidad a retirar");
                    double retirar = sc.nextInt();
                    cuenta.retirarDinero(retirar);
                    break;
                default:
                    System.out.println("hasta luego...");
                    break;
            }

        }while(!op.equals("x"));

    }
    public static String cogerEleccion(){
        System.out.println("Selecciona una opción: ");
        return  sc.next();
    }
    public static void mostrarMenu(){
        System.out.println("=== Bienvenido al Banco ===");
        System.out.println("Indica la operacion que deseas realizar:");
        System.out.println("[1]. Consultar saldo");
        System.out.println("[2]. Ingresar");
        System.out.println("[3]. Retirar dinero");
        System.out.println("[X]. Salir");
    }

}
