package AulaPratica12.Questao2;

public class RepositorioDisciplina implements IDisciplina
{
    String arquivo="disciplina.ser";

    public List<Disciplina> getAllDisciplinas(){ ...}
    public void createDisciplina (Disciplina disciplina){...}
    public Disciplina readDisciplina(int id){...}
    public void updateDisciplina(Disciplina disciplina){ ...}
    public void deleteDisciplina(Disciplina disciplina){... }
}