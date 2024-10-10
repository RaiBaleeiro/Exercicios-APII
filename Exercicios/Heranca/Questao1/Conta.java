package Heranca.Questao1;

public class Conta {
    private String nomeTitular;
    private int numero;
    private double saldo;

    private static int contNumero = 0;

    public Conta(String nome){
        this.nomeTitular = nome;
        saldo = 0;
        numero = contNumero;

        contNumero++;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String depositar(double valor){
        if(valor>=0){
            this.saldo+=valor;
            return "Depósito feito com sucesso!";
        }else return "Não é possível depositar um valor negativo!";
    }

    public String sacar(double valor){
        if(valor>0){
            double taxa = valor*0.05;
            valor -= taxa;

            return "Valor sacado com sucesso! Você irá receber "+valor+" após a taxa de operação.";
        }else if(valor == 0){
            return "Nada aconteceu";
        } else return "Não é possível sacar um valor negativo!";

    }

    @Override
    public String toString(){
        return "Numero: "+getNumero()+"\n Nome da Conta: "+getNomeTitular()+"\n Saldo: "+getSaldo()+"\n\n";
    }
    
}
