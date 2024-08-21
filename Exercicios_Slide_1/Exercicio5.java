package Exercicios_Slide_1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]){
        
        float maiorNota=-1,menorNota=11,mediaNota=0,nota=0;
        String maiorNome="a",menorNome="a",alunoNome;

        Scanner input = new Scanner(System.in);

        for(int i=0;i<10;i++){
            System.out.println("Digite o nome do aluno \n");
            alunoNome = input.next();

            System.out.println("Digite a nota do aluno \n");
            nota = input.nextFloat();
            mediaNota+=nota;

            if(nota>maiorNota){
                maiorNota = nota;
                maiorNome = alunoNome;
            }
            if(nota<menorNota){
                menorNota = nota;
                menorNome = alunoNome;
            }

        }
        mediaNota = mediaNota/10;

        System.out.println("A media da turma foi: "+mediaNota+" a maior nota foi "+maiorNota+" do aluno "+maiorNome+" e a menor nota foi "+menorNota+" do aluno "+menorNome);



        input.close();
    }
}
