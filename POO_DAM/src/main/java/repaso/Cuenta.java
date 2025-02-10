package repaso;

public class Cuenta {
    private static int contadorIban = 1;
    private String iban;
    private Cliente titular;
    private double saldo;

    public Cuenta() {
        iban = String.format("ES%03d", contadorIban++);
        titular = null;
        saldo = 0;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return iban + " - saldo "+ saldo + "€."+" Titular: "+titular;
    }
}
