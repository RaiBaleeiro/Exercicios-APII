package AulasPraticas.AulaPratica5.Questao1;

//Classe Pessoa
public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String n, int i) {
    nome = n; idade = i;
    }
    public String imprimir() {
    return nome + ", " + idade + " ano(s)";
    }
}
