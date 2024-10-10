package Academico_Pacote.visao;


import Academico_Pacote.controle.*;
import Academico_Pacote.modelo.*;
import javax.swing.JOptionPane;


public class AppAcademico
{
public static String menu(){
return "Digite:\n" +
"1 - Cadastrar aluno \n" +
"2 - Cadastrar turma \n"+
"3 - Matricular aluno \n"+
"4 - Listar alunos da turma\n"+
"5 - Desmatricular aluno \n"+
"6 - Listar alunos \n"+
"7 - Listar turmas \n"+
"0 - para sair";
}
public static void main(String[] args) {

ControleTurma controleTurma = new ControleTurma();
ControleAluno controleAluno = new ControleAluno();

int op;

op = Integer.parseInt(JOptionPane.showInputDialog(menu()));

while (op!=0){
switch(op){

case 1: {//cadastrar aluno

String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
controleAluno.cadastrarAluno(nome);
JOptionPane.showMessageDialog(null,"Aluno cadastrado com sucesso");

break;

}
case 2:{//cadastrar turma

int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da turma"));
String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
controleTurma.cadastrarTurma(codigo, disciplina);
JOptionPane.showMessageDialog(null,"Turma cadastrada com sucesso");
break;

}
case 3:{//matricular aluno
int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da turma"));

String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
Aluno aluno = controleAluno.buscarAluno(nome);
controleTurma.matricularAluno(aluno, codigo);
JOptionPane.showMessageDialog(null,
aluno.imprimir() + "\n matriculado com sucesso");
break;

}
case 4:{//listar alunos da turma
    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da turma que deseja saber os alunos"));
    JOptionPane.showMessageDialog(null,controleTurma.listarAlunos(codigo));

break;
}
case 5: {//desmatricular
    String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da turma que deseja desmatricular o aluno:"));
    controleTurma.desmatricularAluno(nome,codigo);

    JOptionPane.showMessageDialog(null, "Aluno desmatriculado com sucesso!");
break;
}
case 6: {//Listar alunos
    JOptionPane.showMessageDialog(null,controleAluno.listarAlunos());
break;
}
case 7: {//Listar turmas
    JOptionPane.showMessageDialog(null,controleTurma.listarTurmas());
break;
}
case 0:{
    JOptionPane.showMessageDialog(null,"Obrigado por utilizar nosso programa!");
    break;
}
default:{
    JOptionPane.showMessageDialog(null, "Opção inválida!");
}
}
op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
}
}
}