package Exercicios.ArrayClasses.Questao3;

import javax.swing.JOptionPane;

public class Livro {

    private int estoque = 0;
    private String titulo;
    private String autores;
    private String editora;
    private String ano;
    private String paginas;
    private double valor;

    public Livro(String titulo, String autores, String editora, String ano, String paginas, double valor, int estoque){
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.ano = ano;
        this.paginas = paginas;
        this.valor = calculoPreco(valor);
        this.estoque = estoque;
    }

    private double calculoPreco(double valor){
        return (valor * 1.5);
    }

    public void venda(){
        this.estoque--;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if((this.estoque += estoque)>=0){
        this.estoque += estoque;
        }else{
            this.estoque = 0;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString()
    {
        return "Livro: "+this.titulo+". Autores: "+this.autores+". Editora: "+this.editora+". Ano de Lançamento: "+this.ano+". Total de páginas: "+this.paginas+". Preco: "+this.valor+". Estoque: "+this.estoque;
    }








}
