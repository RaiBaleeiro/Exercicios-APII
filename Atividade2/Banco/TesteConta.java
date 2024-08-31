package Atividade2.Banco;
import javax.swing.JOptionPane;

public class TesteConta {
    public static void main(String [] args)
    {
        int opcao = 0;

        Conta c1 = new Conta();
        c1.titular = "Josefa";
         c1.saldo = 100;
         Conta c2 = new Conta();
         c2.titular = "Josefa";
         c2.saldo = 100;
         if (c1 == c2) {
          System.out.println("iguais");
           } else {
           System.out.println("diferentes");
           }
           //O if analisa os dois objetos da classe "Conta", os quais possuem os exatos mesmos atributos, sendo eles o nome Josefa e o saldo de R$100. Porém, mesmo assim, o if ao comparar os dois objetos ele retorna um valor falso, dizendo que não são iguais.


        Conta banco = new Conta();

        opcao = Integer.parseInt(JOptionPane.showInputDialog("Seja bem vindo ao Banco das Galaxias! Informe o que deseja fazer: 1 para sacar e 2 para depositar:"));

        if(opcao == 1)
        {
            double quant = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade que deseja sacar!"));
            if(banco.sacar(quant) == true)
            {
                JOptionPane.showMessageDialog(null, "Seu saque de "+ quant + " Foi bem sucedido!");

            }else
            {
                JOptionPane.showMessageDialog(null, "Valor desejado é maior do que a quantidade existente na conta!");

            }

        }else if(opcao == 2)
        {
            double quant = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade que deseja depositar!"));
            banco.depositar(quant);
        }else
        {
            JOptionPane.showMessageDialog(null, "Opção inexistente!");

        }



    }
}
