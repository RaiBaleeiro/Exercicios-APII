package AulasPraticas.AulaPratica4.Lanchonete;

import javax.swing.JOptionPane;

public class Item {
    private int quantidade;
    private Produto produto;

    public Item(Produto produto){
        this.produto = produto;
        this.quantidade = 0;
    }

    public void setQuantidade(int quantidade){
        //Só atualiza a quantidade do item se tiver a quantidade indicada no estoque do produto
        if(produto.getEstoque()>=quantidade){
            this.quantidade = quantidade;
        }else
        {
            JOptionPane.showMessageDialog(null, "Estoque insuficiente!");
        }
        
    
        }
        public int getQuantidade(){
            return this.quantidade;

        }

        public Produto getProduto(){
            return this.produto;

        }

        public double calcularSubTotal(){//quantidade x preço do produto
            return (this.produto.getPreco() * this.quantidade);


        } 
}
