// Domínio Saldo
class SaldoConta {
    private String numeroConta;
    private double saldo;

    public SaldoConta(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;

    }
}