package Atividade2.Lanchonete;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class TesteProduto {
    public static void main(String[]args)
    {
        int opcao=1, a=1,preco=0,idOpcao=0;;
        
        ArrayList<Produto> productList = new ArrayList<Produto>();

        while(opcao!=4)
        {



          opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Seja bem vindo ao programa da Lanchonete Delícia!\nO que deseja fazer?\n1 - Adicionar produto.\n2 - Registrar pedido.\n3 - Checar todos os itens criados\n4 - Encerrar programa"));   

    if(opcao == 1)
    {


        Produto produto = new Produto();

        produto.setName(JOptionPane.showInputDialog(null, "Digite o nome do novo produto:"));
        produto.setValue(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do novo produto:")));

        JOptionPane.showMessageDialog(null,"O produto " +produto.getName()+" custando "+produto.getValue()+" foi feito com sucesso! Seu id é "+idOpcao);
        produto.setId(idOpcao);

        idOpcao++;

        productList.add(produto);


    }else if(opcao == 2)
    {

        while(a != 2)
        {
        int id = 0;

        
        id = Integer.parseInt(JOptionPane.showInputDialog(null,productList+"\nDigite o id do produto que deseja adicionar."));
        productList.get(id).setQuant(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos desse produto deseja adicionar;")));
  

            preco += (productList.get(id).getValue() * productList.get(id).getQuant()); 

        a = Integer.parseInt(JOptionPane.showInputDialog("Caso não deseje adicionar outro produto digite 2."));
        }

        productList.forEach(n->{if(n.getQuant()>0){
            JOptionPane.showMessageDialog(null,"Foram consumidos "+n.getQuant()+" "+n.getName());
        }}
        );

        JOptionPane.showMessageDialog(null, "Com isso, a compra totalizou em R$"+preco);

    }else if(opcao == 3)
    {
        JOptionPane.showMessageDialog(null,productList+"\n");
    }





        }
    }
}
