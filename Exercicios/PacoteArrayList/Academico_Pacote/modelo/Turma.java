//Classe Turma
package Academico_Pacote.modelo;

import java.util.ArrayList;

public class Turma {
private int codigo;
private String disciplina;
private ArrayList<Aluno> alunos = new ArrayList<>();
private static int cont=0;

public Turma (int codigo, String disciplina){

this.codigo=codigo;
this.disciplina=disciplina;
}
public void matricular(Aluno a){
alunos.add(a);
cont++;
}

public String imprimir(){
return getCodigo()+ " - " + getDisciplina() + "\nAlunos matriculados: " + getQtdAluno();
}

public int getQtdAluno(){
return cont;
}

public int getCodigo() {
return codigo;
}

public void setCodigo(int codigo) {
this.codigo = codigo;
}

public String getDisciplina() {
return disciplina;
}

public void setDisciplina(String disciplina) {
this.disciplina = disciplina;
}

public ArrayList<Aluno> getAlunos() {
return alunos;
}
public void setAlunos(Aluno a) {
    alunos.add(a);
}

public void desmatricular(Aluno a){
    alunos.remove(a);
    cont--;
}
}
