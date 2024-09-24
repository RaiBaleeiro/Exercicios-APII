package AulasPraticas.AulaPratica4.Lanchonete;


public class Produto{
    private int codigo;
    private String nome;
    private String descricao;
    private String tipo;
    private double valor;
    
    private int estoque;
    private static int numProdutos=0;
    // O atributo numProdutos ao contrário dos outros atributos não é criado a cada novo objeto, o mesmo espaço de memória é reutilizado, não alterando o valor do atributo a cada novo objeto.

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto(String nome){
    this.nome=nome; 
    codigo = numProdutos++;
}
public Produto(String nome, double valor){
this.nome=nome;
this.valor=valor;
codigo = numProdutos++;
}

public Produto(String nome, double valor, int quantidade){
this.nome=nome;
this.valor=valor;
this.estoque=quantidade;
codigo = numProdutos++;
}

public double getPreco(){
return valor *2;
}

public boolean venderProduto(int qtd){
boolean temProduto=false;
if (estoque >= qtd){
estoque = estoque - qtd;
temProduto=true;
}

return temProduto;
}

public void comprarProduto(int qtd){
estoque = estoque + qtd;
}

public String imprimir (){
return codigo + " - " + nome;
}

}



