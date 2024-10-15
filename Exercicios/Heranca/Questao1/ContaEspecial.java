package Heranca.Questao1;

public class ContaEspecial extends Conta{
    
    public ContaEspecial(String nome){
        super(nome);
    }

    public String sacarEspecial(double valor){
        if(valor>0){
            if(getSaldo()>=valor){
            double taxa = valor*0.01;
            reduzirSaldo(valor);

            return "Valor sacado com sucesso! Serão abatidos R$"+taxa+" do saque pela transação";
            }else{
                return "Valor desejado é maior do que o saldo disponível!";
            }
        }else if(valor == 0){
            return "Nada aconteceu";
        } else return "Não é possível sacar um valor negativo!";

    }


    @Override
    public String toString(){
        return "Numero: "+getNumero()+"\n Nome da Conta: "+getNomeTitular()+"\n Saldo: "+getSaldo()+"\n\n";
    }

}
