// Exemplo de uso (main)
public class Main {
    public static void main(String[] args) {
        ContaRepository contaRepository = new ContaRepositoryInMemory();
        SaldoContaRepository saldoContaRepository = new SaldoContaRepositoryInMemory();

        ContaService contaService = new ContaService(contaRepository);
        SaldoService saldoService = new SaldoService(saldoContaRepository, contaRepository);

        contaService.criarConta("João", 1000.0);
        contaService.realizarDeposito("...", 500.0); // Substitua "..." pelo número da conta
        contaService.realizarSaque("...", 200.0);

        double saldo = saldoService.consultarSaldo("...");
        System.out.println("Saldo da conta: " + saldo);
    }
}