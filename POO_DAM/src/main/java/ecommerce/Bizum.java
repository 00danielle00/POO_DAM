package ecommerce;

import java.util.Random;

public class Bizum extends MetodoPago {

    private String telefono;
    private int pin;

    public Bizum(String telefono) {
        this.telefono = telefono;
        pin = generarPin();
        validarBizum(telefono, pin);

    }

    public void validarBizum(String num, int pin) {
        comprobarNumeroTelefono(num);
        validarPin(pin);
    }

    public void comprobarNumeroTelefono(String numero) {
        if (numero.length() != 9) {
            System.out.println("ERROR:la longitud del número de teléfono no es correcta");
        }
    }

    public int validarPin(int pin) {
        if (this.pin == pin) {
            System.out.println("pin correcto");
            return pin;

        }
        return 0;
    }

    public static int generarPin() {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(900000) + 100000;
        return numero;
    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con Bizum");
    }
}
