package Exercicios.tributos;

public class Imovel implements ITributavel {
    private double valor;
    private double tamanho;
    private String endereco;

    public Imovel(double valor, double tamanho, String endereco) {
        this.valor = valor;
        this.tamanho = tamanho;
        this.endereco = endereco;
    }

    @Override
    public String getTipoImposto() {
        return "IPTU";
    }

    @Override
    public double getAliquota() {
        return 0.01;
    }

    @Override
    public double getValorImposto() {
        return getValor() * getAliquota();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}