package livraria.visao;

import java.util.ArrayList;
    
import javax.swing.JOptionPane;

import livraria.controle.ControleProduto;
import livraria.modelo.Livro;
import livraria.modelo.Papelaria;

public class Livraria {
    
        public static String menu(){
            return "Digite:\n" +
            "1 - Cadastrar Livro \n"+
            "2 - Cadastrar Papelaria \n"+
            "3 - Pesquisar Produto por Nome \n"+
            "4 - Listar Produtos\n"+
            "0 - Para Sair";
            }
    
        public static void main(String[] args) {
            int op;
    
    op = Integer.parseInt(JOptionPane.showInputDialog(menu()));

    ControleProduto controleProduto = new ControleProduto();
    
    
    
    while (op!=0){
    switch(op){
    
    case 1: {//cadastrar livro
    
        String nome = JOptionPane.showInputDialog("Digite o nome do Livro que deseja cadastrar: ");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto o livro custará: "));
        String autor = JOptionPane.showInputDialog("Digite o nome do autor do livro: ");
        String editora = JOptionPane.showInputDialog("Digite o nome da editora do livro: ");

        Livro livro = new Livro(nome, preco, autor, editora);
        livro.setCusto(livro.calcularPreco());

        controleProduto.cadastroProduto(livro);

        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");

    break;
    
    }
    case 2:{//cadastrar papelaria
        String nome = JOptionPane.showInputDialog("Digite o nome da papelaria que deseja cadastrar: ");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto a papelaria custará: "));
        String descricao = JOptionPane.showInputDialog("Digite qual será a descricao da papelaria: ");
        String fabricante = JOptionPane.showInputDialog("Digite o nome do fabricante da papelaria: ");

        Papelaria papelaria = new Papelaria(nome, preco, descricao, fabricante);
        papelaria.setCusto(papelaria.calcularPreco());

        controleProduto.cadastroProduto(papelaria);

        JOptionPane.showMessageDialog(null, "Papelaria cadastrada com sucesso!");
        break;
    }
    case 3:{//pesquisar produto por codigo ou nome
        int escolha = 2;
        while(escolha != 1 && escolha != 0){

        escolha = Integer.parseInt(JOptionPane.showInputDialog("Deseja pesquisar o produto via nome ou código?(Digite 1 para nome e 0 para código)"));
        if(escolha>1||escolha<0){
            JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
        }

        if(escolha == 0){
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto que deseja buscar: "));
            if(controleProduto.pesquisarProduto(codigo) == null){
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            }else{
                JOptionPane.showMessageDialog(null, controleProduto.pesquisarProduto(codigo).toString());
            }

        }else{
            String nome = JOptionPane.showInputDialog("Digite o nome do produto que deseja buscar: ");
            if(controleProduto.pesquisarProduto(nome) == null){
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            }else{
                JOptionPane.showMessageDialog(null, controleProduto.pesquisarProduto(nome).toString());
            }
        }

    break;
    
    }
    case 4:{//listar produtos
           JOptionPane.showMessageDialog(null, controleProduto.listarProdutos());
    

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
    
