package Banco;
public class ContaCorrente extends Conta{
    private double taxa;

    public ContaCorrente(double taxa){
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }
    
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void depositar (double valor){
        if (valor > 0){
            setSaldo(getSaldo() + valor);
            adicionarHistorico("\nDepositou R$ "+valor);
        }
    }
    //Falta descontar a taxa de cada operação
    public boolean sacar(double valor) {
        if (getSaldo() >= valor && valor > 0){
            setSaldo(getSaldo() - valor);
            adicionarHistorico("\nSacou R$ "+valor);
            return true;
        }
        return false;
    }
    

    
}
