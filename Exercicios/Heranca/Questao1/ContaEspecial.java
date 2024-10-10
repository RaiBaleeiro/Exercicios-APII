package Heranca.Questao1;

public class ContaEspecial extends Conta{
    
    public ContaEspecial(String nome){
        super(nome);
    }

    public String sacar(double valor){
        if(valor>0){
            double taxa = valor*0.01;
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
