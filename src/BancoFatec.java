
public class BancoFatec {
    public static void main(String[] args) {
    ContaCorrente conta = new ContaCorrente();
    System.out.println("Saldo atual: " + conta.getSaldoAtual());
    conta.deposito(200);
    System.out.println("Saldo atual: " + conta.getSaldoAtual());
    System.out.println("Sacando...");
    conta.saque(100);
    System.out.println("Saldo atual: " + conta.getSaldoAtual());
    System.out.println("Sacando...");
    conta.saque(120);
    System.out.println("Saldo atual: " + conta.getSaldoAtual());


    }
}