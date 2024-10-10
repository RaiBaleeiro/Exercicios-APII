package Academico_Pacote.controle;

import java.util.ArrayList;

import Academico_Pacote.modelo.*;

public class ControleTurma {
    private ArrayList<Turma> turmas = new ArrayList<>();

    public void cadastrarTurma(int codigo, String disciplina){
        Turma turma = new Turma(codigo, disciplina);
        turmas.add(turma);
    }

    public Turma pesquisarTurma(int codigo){
        Turma turma = null;
        for(Turma a:turmas){
            if(a.getCodigo()==codigo){
                turma = a;
                break;
            }
        }
        return turma;
    }
    
    public boolean matricularAluno(Aluno aluno,int codigo){
        for(Turma turma:turmas){
            if(turma.getCodigo()==codigo){
                turma.matricular(aluno);
                return true;
            }
        }
        return false;
    }

    public boolean desmatricularAluno(String aluno,int codigo){
        for(Turma turma:turmas){
            if(turma.getCodigo()==codigo){
                for(Aluno a:turma.getAlunos()){
                if(a.getNome().equals(aluno)){
                    turma.desmatricular(a);
                }
                return true;
                }
            }
        }
        return false;
    }

    public String listarTurmas(){
        String dadosTurmas="";
        for (Turma a: turmas){
        dadosTurmas += a.imprimir()+ "\n";
        }
        return dadosTurmas;
        }

        public String listarAlunos(int codigo){
            String listagem = "";
            for(Turma turma:turmas){
                if(turma.getCodigo()==codigo){
                    for(Aluno aluno:turma.getAlunos()){
                        listagem += aluno.imprimir()+"\n";
                    }
                }

            }
            return listagem;
        }


}
