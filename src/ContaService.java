class ContaService {
    private ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;  

    }
    public void criarConta(String titular, double saldoInicial) {
        // Lógica de geração de número de conta (simplificada)
        String numeroConta = UUID.randomUUID().toString();
        Conta novaConta = new Conta(numeroConta, titular, saldoInicial);
        contaRepository.salvar(novaConta);
    }

    public void realizarDeposito(String numeroConta, double valor) {
        Conta conta = contaRepository.buscarPorNumero(numeroConta);
        if (conta == null) {
            throw new RuntimeException("Conta não encontrada");
        }
        if (valor <= 0) {
            throw new RuntimeException("Valor de depósito inválido");
        }
        conta.setSaldo(conta.getSaldo() + valor);
        contaRepository.salvar(conta);
    }

    public void realizarSaque(String numeroConta, double valor) {
        Conta conta = contaRepository.buscarPorNumero(numeroConta);
        if (conta == null) {
            throw new RuntimeException("Conta não encontrada");
        }
        if (valor <= 0 || valor > conta.getSaldo()) {
            throw new RuntimeException("Saldo insuficiente ou valor de saque inválido");
        }
        conta.setSaldo(conta.getSaldo() - valor);
        contaRepository.salvar(conta);
    }
}
