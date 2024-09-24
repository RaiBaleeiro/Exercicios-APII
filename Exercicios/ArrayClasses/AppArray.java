package Exercicios.ArrayClasses;

import javax.swing.JOptionPane;

public class AppArray {
    public static void main (String[] args){

        String[] produtos;
        double[] valores;

        boolean tem = false;

        int quantidade=Integer.parseInt(JOptionPane.showInputDialog( "Digite a quantidade de produtos "));
        produtos = new String[quantidade];
        valores = new double[quantidade];

        for (int i=0; i<quantidade; i++){
        produtos[i] = JOptionPane.showInputDialog("Digite o nome do produto " + (i+1));
        valores[i] = Double.parseDouble(JOptionPane.showInputDialog ("Digite o valor do produto"+ (i+1)));
        }
        String busca = JOptionPane.showInputDialog("Digite o nome de algum produto pra checarmos se existe um produto com este nome");

        for(int i = 0; i<quantidade; i++)
        {
            if(produtos[i].equals(busca))
            {
                JOptionPane.showMessageDialog(null, "Produto encontrado! " + produtos[i] + " por R$"+valores[i]);
                tem = true;
            }
        }
        if(tem == false)
        {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        }


    }
}