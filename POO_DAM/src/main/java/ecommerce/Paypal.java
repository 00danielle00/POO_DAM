package ecommerce;

public class Paypal extends MetodoPago {
    public static final String FORMATO_CUENTA = "^[A-Za-z0-9+_.-]+@+[A-Za-z0-9+_.-]+.com$";
    private double saldo;
    private String cuenta;

    public Paypal(String cuenta) {
        saldo = 23;
        this.cuenta = cuenta;
        validarPaypal(cuenta, saldo);
    }

    public void validarPaypal(String correo, double num) {
        comprobarFormatoCorreo(correo);
        comprobarSaldo(num);
    }

    public void comprobarFormatoCorreo(String correo) {
        if (!correo.matches(FORMATO_CUENTA)) {
            System.out.println("ERROR:El formato del correo no es correcto");
        }

    }

    public boolean comprobarSaldo(double dinero) {
        if (dinero > saldo) {
            return false;
        }
        return true;
    }


    @Override
    public void procesarPago(double importe) {
        if (comprobarSaldo(importe)) {
            System.out.println("Procesando pago de " + importe + "€ con PayPal");
        } else {
            System.out.println("ERROR:Saldo insuficiente");
        }
    }
}

