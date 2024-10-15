package livraria.modelo;

public class Livro extends Produto{
    private String autor;
    private String editora;

    public Livro(String nome, double custo, String autor, String editora){
        super(nome,custo);
        this.autor = autor;
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double calcularPreco(){
        return (getCusto() * 1.5);
    }

    @Override
    public String toString(){
        return "Codigo: "+getCodigo()+"\nNome: "+getNome()+"\nAutor: "+getAutor()+"\nEditora: "+getEditora()+"\nPreço: "+getCusto()+"\n\n";
    }

}
