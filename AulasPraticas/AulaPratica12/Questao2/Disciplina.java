package AulaPratica12.Questao2;

import java.io.Serializable;

public class Disciplina implements Serializable {
    private String nome;
    private int id;
    private int cargaHoraria;
    
    public Disciplina (){}
    
    public Disciplina (String nome){
        this.nome=nome;
    }
    
    public Disciplina (String nome, int id, int ch){
        this.nome=nome;
        this.id=id;
        this.cargaHoraria=ch;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
}

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public String imprimir(){
        return "Nome: " + this.getNome() + "\nId: " + this.getId() + "\nCarga horaria: " + this.getCargaHoraria();
    }
}