package Exercicios.ArrayClasses.Questao3;

import javax.swing.JOptionPane;

public class Cliente {
    
    private String nome;
    private int cpf;
    private int compras = 0;
    private int id;
    private static int calcId = 0;

    public Cliente(String nome,int cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.id = calcId;
        calcId++;

    }

    public void compra(){
        this.compras++;
    }

    public int getCpf() {
        return cpf;
    }

    @Override
    public String toString()
    {
        return ("Id "+this.id+": "+this.nome+". CPF: "+this.cpf+". Livros comprados: "+this.compras);
    }

}
