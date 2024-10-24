package AulaPratica9.livraria_interface;

public class Revista implements IProduto, IPromocional{
    private String nome;
    private String descricao;
    private double valor;
    private String editora;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEditora() {
        return editora;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public boolean aplicaDesconto(double porcentagem){
        if (porcentagem >0.1){
           return false;
       }
       else {
           this.valor -= (this.valor * porcentagem);
           return true;
       }
   }

    
}
