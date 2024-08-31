package Atividade2.Banco;

public class Conta {
    String titular;
    int numeroTitular;
    String agencia;
    double saldo = 1500;
    String dataAbertura;

    public boolean sacar(double quant)
    {
        if(quant>saldo){
            System.out.println("Saldo da conta inválido!");
            return false;
        }else
        saldo -= quant;
        return true;
    }
    public void depositar(double quant)
    {
        saldo += quant;
    }



}
