package Academico_Pacote.controle;

import java.util.ArrayList;

import Academico_Pacote.modelo.Turma;

public class ControleTurma {
    private ArrayList<Turma> turmas = new ArrayList<>();

    public void cadastrarTurma(Turma a){
        Turma turma = a;
        turmas.add(turma);
    }

    public Turma pesquisarTurma(int codigo){
        Turma turma = null;
        for(Turma a:turmas){
            if(a.getCodigo().equals(codigo)){
                turma = a;
                break;
            }
        }
        return turma;
    }
    
    public boolean matricularAluno(Aluno aluno,int codigo){
        for(Turma turma:turmas){
            if(turma.getCodigo().equals(codigo)){
                turma.matricular(aluno);
                return true;
            }
        }
        return false;
    }

        public boolean matricularAluno(Aluno aluno,int codigo){
        for(Turma turma:turmas){
            if(turma.getCodigo().equals(codigo)){
                turma.matricular(aluno);
                return true;
            }
        }
        return false;
    }

    public boolean matricularAluno(Aluno aluno,int codigo){
        for(Turma turma:turmas){
            if(turma.getCodigo().equals(codigo)){
                turma.desmatricular(aluno);
                return true;
            }
        }
        return false;
    }





}
