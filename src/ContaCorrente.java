import static java.lang.System.out;

public class ContaCorrente {
    private String nomeCorrentista;
    private String numeroAgencia;
    private String numeroConta;
    private double saldoAtual;
    public ContaCorrente()
    {

    }

    public ContaCorrente(String nomeCorrentista, String numeroAgencia, String numeroConta, double saldoAtual){
        this.nomeCorrentista = nomeCorrentista;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldoAtual = saldoAtual;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }
    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    public void deposito(double valor)
    {
        saldoAtual += valor;
    }
    public boolean saque (double valor){
        int ax = 0;
        if((saldoAtual - valor) >=0){
            saldoAtual -=valor;
            ax = 1;
        }
      if (ax == 1)
      {
          System.out.println("Saque realizado com sucesso");
          return true;
      }
      else {
          System.out.println("Saldo insuficiente");
          return false;
      }
    }
}

