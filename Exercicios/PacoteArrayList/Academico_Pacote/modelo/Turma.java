//Classe Turma
package Exercicios.PacoteArrayList.Academico_Pacote.modelo;

public class Turma {
private int codigo;
private String disciplina;
private ArrayList<Aluno> alunos;
private int cont=0;
public Turma (int codigo, String disciplina){

this.codigo=codigo;
this.disciplina=disciplina;
alunos=new Aluno[10];
}
public void matricular(Aluno a){
if (cont<alunos.length){
alunos[cont]=a;
cont++;
}
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
public Aluno[] getAlunos() {
return alunos;
}
public void setAlunos(Aluno[] alunos) {
this.alunos = alunos;
}

}