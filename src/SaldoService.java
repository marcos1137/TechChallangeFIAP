class SaldoService {
    private SaldoContaRepository saldoContaRepository;
    private ContaRepository contaRepository;

    public SaldoService(SaldoContaRepository saldoContaRepository, ContaRepository contaRepository) {
        this.saldoContaRepository = saldoContaRepository;
        this.contaRepository = contaRepository;
    }

    public double consultarSaldo(String numeroConta) {
        Conta conta = contaRepository.buscarPorNumero(numeroConta);
        if (conta == null) {
            throw new RuntimeException("Conta não encontrada");
        }
        SaldoConta saldoConta = new SaldoConta(numeroConta, conta.getSaldo());
        saldoContaRepository.salvar(saldoConta);
        return saldoConta.getSaldo();
    }
}