package AulasPraticas.AulaPratica4.Banco;

public class Cliente {
    private int cpf;
    private String nome;
    private String endereco = "Não Consta";

    public Cliente(String nome, int cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome, String endereco, int cpf)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String imprimir()
    {
        return "O cliente " + this.nome + " possui o CPF " + this.cpf + " e mora em " + this.endereco;
    }





}
