package livraria.modelo;

public class Papelaria extends Produto{
    private String descricao;
    private String fabricante;

    public Papelaria(String nome, double custo, String descricao, String fabricante){
        super(nome, custo);
        this.descricao = descricao;
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double calcularPreco(){
        return (getCusto() * 2);
    }

    @Override
    public String toString(){
        return "Codigo: "+getCodigo()+"\nNome: "+getNome()+"\nDescricao: "+getDescricao()+"\nFabricante:"+getFabricante()+"\nPreço: "+getCusto()+"\n\n";
    }


}
