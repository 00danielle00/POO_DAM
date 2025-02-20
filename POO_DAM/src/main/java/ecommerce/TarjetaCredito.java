package ecommerce;


public class TarjetaCredito extends MetodoPago {
    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;
        validarTarjeta(tipo, nro_tarjeta);
    }

    public void validarTarjeta(String tipo, String num) {
        validarLongitudTarjeta(num);
        validarValoresTarjeta(tipo);
    }

    public void validarLongitudTarjeta(String numero) {
        if (numero.length() != 16) {
            System.out.println("Error:La longitud no es correcta");

        }
    }

    public boolean validarValoresTarjeta(String tipo) {
        if (tipo.equalsIgnoreCase("visa") || tipo.equalsIgnoreCase("maestro") || tipo.equalsIgnoreCase("mastercard")) {
            return true;
        } else {
            System.out.println("El tipo de tarjeta que has elegido no es correcto");
            return false;
        }
    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito " + tipo);
    }
}
