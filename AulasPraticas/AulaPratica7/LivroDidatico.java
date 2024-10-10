package AulaPratica7;

public class LivroDidatico extends Livro {

    private String disciplina;

    public LivroDidatico(String disciplina, double preco, String autor, String nome, int paginas){
        super(nome, autor, paginas, preco);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public boolean ehCaro(){
        if(this.getPreco()>200){
            return true;
        }else return false;
    }

    @Override
    public String toString(){
        return "Codigo: "+getCodigo()+"\nNome do Produto: "+getNome()+"\nPreco do produto: "+getPreco()+"\nAutor do Livro: "+getAutor()+"\nPreco do Livro: "+getPreco()+"\nDisciplina do Livro Didático: "+getDisciplina()+"\n\n";
    }
    
}
