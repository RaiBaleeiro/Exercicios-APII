package Heranca.Questao1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste {
    public static String menu(){
        return "Digite:\n" +
        "1 - Cadastrar conta \n"+
        "2 - Depositar \n"+
        "3 - Sacar \n"+
        "4 - Consultar saldo\n"+
        "0 - para sair";
        }

    public static void main(String[] args) {
        int op;

op = Integer.parseInt(JOptionPane.showInputDialog(menu()));

ArrayList<Conta> contas = new ArrayList<>();
ArrayList<ContaEspecial> contasEspeciais = new ArrayList<>();

while (op!=0){
switch(op){

case 1: {//cadastrar conta

    int especial = Integer.parseInt(JOptionPane.showInputDialog("Deseja criar uma conta especial ou normal? Digite 1 para especial e 0 para normal."));
    if(especial == 1){
        String nome = JOptionPane.showInputDialog("Digite seu nome para que possamos criar a conta");
        ContaEspecial conta = new ContaEspecial(nome);
        contasEspeciais.add(conta);
    }else{
        String nome = JOptionPane.showInputDialog("Digite seu nome para que possamos criar a conta");
        Conta conta = new Conta(nome);
        contas.add(conta);
    }
break;

}
case 2:{//depositar
    String nome = JOptionPane.showInputDialog("Digite o nome da conta que deseja depositar dinheiro");
    for(Conta conta:contas){
        if(conta.getNomeTitular().equals(nome)){
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar: "));
            JOptionPane.showMessageDialog(null, conta.depositar(valor));
            break;
        }
    }
    for(ContaEspecial conta:contasEspeciais){
        if(conta.getNomeTitular().equals(nome)){
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar: "));
            JOptionPane.showMessageDialog(null, conta.depositar(valor));
            break;
        }
    }
    break;
}
case 3:{//sacar
    String nome = JOptionPane.showInputDialog("Digite o nome da conta que deseja sacar dinheiro");
    for(Conta conta:contas){
        if(conta.getNomeTitular().equals(nome)){
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar: "));
            JOptionPane.showMessageDialog(null, conta.sacar(valor));
            break;
        }
    }
    for(ContaEspecial conta:contasEspeciais){
        if(conta.getNomeTitular().equals(nome)){
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar: "));
            JOptionPane.showMessageDialog(null, conta.sacarEspecial(valor));
            break;
        }
    }

break;

}
case 4:{//Consultar saldo
    String nome = JOptionPane.showInputDialog("Digite o nome da conta que deseja consultar o saldo");
    for(Conta conta:contas){
        if(conta.getNomeTitular().equals(nome)){
            JOptionPane.showMessageDialog(null, conta.toString());
            break;
        }
    }
    for(ContaEspecial conta:contasEspeciais){
        if(conta.getNomeTitular().equals(nome)){
            JOptionPane.showMessageDialog(null, conta.toString());
            break;
        }
    }
break;
}
case 0:{
    JOptionPane.showMessageDialog(null,"Obrigado por utilizar nosso programa!");
    break;
}
default:{
    JOptionPane.showMessageDialog(null, "Opção inválida!");
}
}
op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
}

    }

}
