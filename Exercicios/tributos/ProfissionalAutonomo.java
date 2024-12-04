package Exercicios.tributos;

public class ProfissionalAutonomo implements ITributavel {
    private String nome;
    private String cpf;
    private String endereco;
    private double remuneracao;

    public ProfissionalAutonomo(String nome, String cpf, String endereco, double remuneracao) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.remuneracao = remuneracao;
    }

    @Override
    public String getTipoImposto() {
        return "INSS";
    }

    @Override
    public double getAliquota() {
        return 0.11;
    }

    @Override
    public double getValorImposto() {
        double teto = 7507.49;
        return Math.min(remuneracao, teto) * getAliquota();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }
}