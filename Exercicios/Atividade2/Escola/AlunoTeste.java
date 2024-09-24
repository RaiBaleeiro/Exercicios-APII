package Exercicios.Atividade2.Escola;

import javax.swing.JOptionPane;

public class AlunoTeste {
    public static void main(String[]args)
    {
        int opcao=1;
        float n1,n2,t;

        Aluno metodo = new Aluno();
        
        JOptionPane.showMessageDialog(null, "Seja bem vindo ao calculo de notas!");

        while(opcao !=3)
        {

        opcao = (Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer?\n1 - Calcular media final\n2 - Saber quantos pontos são necessários tirar na prova final\n3 - Encerrar o programa")));
            if(opcao == 1)
            {
                n1 = (Float.parseFloat(JOptionPane.showInputDialog("Digite a nota que tirou na 1° prova:")));
                n2 = (Float.parseFloat(JOptionPane.showInputDialog("Digite a nota que tirou na 2° prova:")));
                t = (Float.parseFloat(JOptionPane.showInputDialog("Digite a nota que tirou no trabalho:")));

                JOptionPane.showMessageDialog(null,"Sua média final foi "+metodo.calcularMedia(n1, n2, t));
            }else if(opcao == 2)
            {

                JOptionPane.showMessageDialog(null,"Voce irá precisar tirar "+metodo.calcularFinal()+" pontos.");
                if(metodo.calcularFinal()==7)
                {
                    JOptionPane.showMessageDialog(null,"Ou você ainda não calculou a sua media ou tá beeeem ferrado e precisa fechar a prova final!");
                }





            }





        }
    }
}
