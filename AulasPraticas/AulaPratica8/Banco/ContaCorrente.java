package Banco;
public class ContaCorrente extends Conta{
    private double taxa;

    public ContaCorrente(String nome, double saldo, double taxa) {
        super(nome, saldo);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }
    
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public void depositar (double valor){
        if (valor > 0){
            setSaldo(getSaldo() + valor);
            adicionarHistorico("\nDepositou R$ "+valor);
        }
    }
    @Override
    public boolean sacar(double valor) {
        if (getSaldo() >= valor+getTaxa() && valor > 0){
            setSaldo(getSaldo() - (valor+getTaxa()));
            adicionarHistorico("\nSacou R$ "+valor + "E foram cobrados R$"+getTaxa()+" de taxa.\n");
            return true;
        }
        return false;
    }
    
    public String getTipo(){
        return "Conta Corrente";
    }
    
}
