package livraria.modelo;

public class Produto {
    private int codigo;
    private String nome;
    private double custo;

    private static int calcCodigo = 0;

    public Produto(String nome, double custo){
        this.codigo = calcCodigo;
        calcCodigo++;
        this.nome = nome;
        this.custo = custo;
    }

    public double getCusto() {
        return custo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularPreco(){
        return (this.custo * 1.2);
    }

    @Override
    public String toString(){
        return "Codigo: "+getCodigo()+"\nNome: "+getNome()+"\nPreço: "+getCusto()+"\n\n";
    }







}
