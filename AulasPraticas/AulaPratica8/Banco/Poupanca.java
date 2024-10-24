package Banco;
public class Poupanca extends Conta{
    private double rendimento;

    public Poupanca(double rendimento){
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

}
