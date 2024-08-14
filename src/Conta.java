class Conta {
    private String numeroConta;
    private String titular;
    private double saldo;
    public Conta(String numeroConta, String titular,
                 double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}