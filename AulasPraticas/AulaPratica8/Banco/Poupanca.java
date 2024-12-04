package Banco;
public class Poupanca extends Conta{
    private double rendimento;

    public Poupanca(String nome, double saldo, double rendimento){
        super(nome, saldo);
        this.rendimento=rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public String calcularRendimento(){
        return "Rendimento: "+getSaldo()*rendimento;
    }

    public String getTipo(){
        return "Poupança";
    }

}
