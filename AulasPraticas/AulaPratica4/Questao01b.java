package AulasPraticas.AulaPratica4;

import javax.swing.JOptionPane;
public class Questao01b {
public static void main(String[] args) {
String [] alunos;
final int QTD_ALUNOS;
QTD_ALUNOS = Integer.parseInt(JOptionPane.showInputDialog ("Digite a quantidade de alunos"));
alunos = new String [QTD_ALUNOS];
String listaAlunos = "";
// Linhas 6-10 - Primeiro é criado um array do tipo String com o nome alunos, porém o valor ainda não é determinado, após isso, é criada uma variável inteira final QTD_ALUNOS, determinando que seu valor seja inalterável, com isso, dando um valor a essa variável na linha 8. Ao fazer isso, na linha 9 o tamanho do array alunos é determinado a partir do tamanho de QTD_Alunos. Por final, na linha 10 é criada a variável String listaAlunos vazia
for (int i=0; i < alunos.length; i++){
alunos[i] = JOptionPane.showInputDialog ("Digite o nome do alunos");
}
for (String a: alunos){
listaAlunos +=a +"\n";
}
//Linhas 15-16 - Na linha 15 é criado um for utilizando a String a, esse for vai passar por cada valor contido no array "alunos", onde em cada iteração a String "a" irá ser um valor do array "alunos", com isso, na linha 16 cada valor do array "alunos" será "somado" à variável listaAlunos e ocorrerá uma quebra de linha, fazendo assim realmente uma lista contendo o nome de todos os alunos do array "alunos".
JOptionPane.showMessageDialog(null, "Nome dos alunos: \n" +
listaAlunos);
}
}
