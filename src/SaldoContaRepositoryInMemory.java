// Simulação de repositório em memória (substituir por implementação real)
class SaldoContaRepositoryInMemory implements SaldoContaRepository {
    private Map<String, SaldoConta> saldos = new HashMap<>();

    @Override
    public void salvar(SaldoConta saldoConta) {
        saldos.put(saldoConta.getNumeroConta(), saldoConta);
    }

    @Override
    public SaldoConta buscarPorNumero(String numeroConta) {
        return saldos.get(numeroConta);
    }
}
