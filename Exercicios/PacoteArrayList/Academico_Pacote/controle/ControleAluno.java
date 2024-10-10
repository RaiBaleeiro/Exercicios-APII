package Academico_Pacote.controle;

import java.util.ArrayList;
import Academico_Pacote.modelo.Aluno;

public class ControleAluno {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno(String nome){
        Aluno aluno = new Aluno(nome);
        alunos.add(aluno);
    }

    public Aluno buscarAluno(int matricula){
        Aluno aluno = null;
        for(Aluno a: alunos){
            if(a.getMatricula()==matricula){
                aluno = a;
                break;
            }
        }
        return aluno;
    }

    public Aluno buscarAluno(String nome){
        Aluno aluno = null;
        for(Aluno a: alunos){
            if(a.getNome().equals(nome)){
            aluno = a;
            break;
            }
        }
        return aluno;
    }

    public String listarAlunos(){
        String dadosAlunos="";
        for (Aluno a: alunos){
        dadosAlunos += a.imprimir()+ "\n";
        }
        return dadosAlunos;
        }

    



    
    
}
