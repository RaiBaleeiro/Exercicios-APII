package AulaPratica7;

public class Livro extends Produto {
    private int paginas;
    private String autor;

    public Livro(String nome, String autor, int paginas, double preco){
        super(nome,preco);
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean ehGrande(){
        if(this.paginas>200){
            return true;
        }else return false;
    }

    @Override
    public String toString() {
        return "Codigo: "+getCodigo()+"\nNome do Produto: "+getNome()+"\nPreco: "+getPreco()+"\nAutor: "+getAutor()+"\n Total de Páginas: "+getPaginas()+"\n\n";
    }
}
