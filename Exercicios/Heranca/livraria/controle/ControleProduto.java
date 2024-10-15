package livraria.controle;

import java.util.ArrayList;
import livraria.modelo.*;

public class ControleProduto {
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public String cadastroProduto(Produto produto ){
        produtos.add(produto);
        return "Livro cadastrado com sucesso!";
    }

    public Produto pesquisarProduto(int codigo){
        for(Produto produto:produtos){
            if(produto.getCodigo() == codigo){
                return produto;
            }
        }
        return null;
    }

    public Produto pesquisarProduto(String nome){
        for(Produto produto:produtos){
            if(produto.getNome().equals(nome)){
                return produto;
            }
        }
        return null;
    }

    public void removerProduto(int codigo){
        for(Produto produto:produtos){
            if(produto.getCodigo() == codigo){
                produtos.remove(produto);
            }
        }
    }
    
    public String listarProdutos(){
        String dados = "";

        for(Produto produto:produtos){
            dados += produto.toString();
        }
        return dados;
    }
}
