package Exercicios.ArrayClasses.Questao2;

public class Funcionario {
    private String nome;
    private long cpf;
    private int horasTrab = 0;
    private float valorHora;
    private String cargo;
    private String dataAdmissao;

    //O problema é a necessidade de um programa para armazenar os dados de cada funcionario e também calcular seu salário. Apenas um objeto será utilizado, o objeto Funcionario.

    public Funcionario(String nome,long cpf,float valorHora,String dataAdmissao,String cargo)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.valorHora = valorHora;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }

    public float salario()
    {
        return (this.valorHora * this.horasTrab);
    }

    public String getCargo() {
        return cargo;
    }

    public long getCpf() {
        return cpf;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public String getNome() {
        return nome;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void atualizarHorasTrab(int horasTrab) {
        this.horasTrab += horasTrab;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
    
}
