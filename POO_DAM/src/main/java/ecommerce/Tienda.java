package ecommerce;

import java.util.Scanner;

public class Tienda {
    private static Scanner teclado = new Scanner(System.in);

    public static void realizarPago(MetodoPago metodo, double importe) {
        metodo.procesarPago(importe);
    }

    public static void iniciarPago() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué método de pago quieres usar? [Bizum,Paypal,Tarjeta]");
        String metodo = sc.next().toLowerCase();

        switch (metodo) {
            case "tarjeta":
                pagoTarjeta();
                break;
            case "paypal":
                pagoPaypal();
                break;
            case "bizum":
                pagoBizum();
                break;
            default:
                System.out.println("No es un sistema de pago");
                break;
        }
    }

    public static void pagoTarjeta() {
        System.out.println("Introduce los datos de tu tarjeta:");
        System.out.println("Numero (16 dígitos): ");
        String numTarjeta = teclado.next();
        System.out.println("tipo visa, mastercard, maestro");
        String tipotarjeta = teclado.next();

        MetodoPago metodotarjeta = new TarjetaCredito(numTarjeta, tipotarjeta);
        System.out.println("Validando tarjeta...");

        System.out.println("introduce el importe a pagar:");
        double importePagar = teclado.nextInt();

        realizarPago(metodotarjeta, importePagar);
    }

    public static void pagoPaypal() {
        System.out.println("Introduce el correo");
        String correo = teclado.next();

        System.out.println("Dime la cantidad de importe a enviar");
        int importe = teclado.nextInt();

        MetodoPago metodoPaypal = new Paypal(correo);
        realizarPago(metodoPaypal, importe);
    }

    public static void pagoBizum() {
        System.out.println("Introduce la cantidad que quieres enviar");
        double importe2 = teclado.nextInt();

        System.out.println("Introduce tu número de teléfono");
        String numeroTelef = teclado.next();

        System.out.println("Pin Generado: " + Bizum.generarPin());
        System.out.println("Introduce el pin:");
        int pin = teclado.nextInt();

        MetodoPago metodoBizum = new Bizum(numeroTelef);
        realizarPago(metodoBizum, importe2);

    }
}
