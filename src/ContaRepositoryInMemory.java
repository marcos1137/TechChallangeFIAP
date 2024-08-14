// Simulação de repositório em memória (substituir por implementação real)
class ContaRepositoryInMemory implements ContaRepository {
    private Map<String, Conta> contas = new HashMap<>();

    @Override
    public void salvar(Conta conta) {
        contas.put(conta.getNumeroConta(), conta);
    }
    @Override
    public Conta buscarPorNumero(String numeroConta) {
        return contas.get(numeroConta);
    }
}