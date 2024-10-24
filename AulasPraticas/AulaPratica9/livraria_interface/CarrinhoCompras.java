package AulaPratica9.livraria_interface;
import AulaPratica9.livraria_interface.IProduto;

import java.util.ArrayList;
public class CarrinhoCompras {
    ArrayList <IProduto> iprodutos = new ArrayList<>();
    
    public void adicionar(IProduto l){
        iprodutos.add(l);
    }
    
      public boolean aplicarDesconto (IPromocional l, double desconto){
        return l.aplicaDesconto(desconto);
    } 
    
    public double getTotal (){
        double total =0;
        for (IProduto l: iprodutos){
            total += l.getValor();
        }
        return total;
    }  
}