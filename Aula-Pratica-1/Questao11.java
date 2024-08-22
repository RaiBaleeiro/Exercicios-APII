import javax.swing.JOptionPane;

public class Questao11 {
    public static void main(String args[]){
        
        float maiorNota=-1,menorNota=11,mediaNota=0, notaFloat=0;
        String maiorNome="a",menorNome="a",alunoNome, nota;

        for(int i=0;i<10;i++){
            alunoNome = JOptionPane.showInputDialog("Digite o nome do aluno \n");

            nota = JOptionPane.showInputDialog("Digite a nota do aluno \n");
	    notaFloat = Float.parseFloat(nota);
            mediaNota += Float.parseFloat(nota);

            if(notaFloat>maiorNota){
                maiorNota = notaFloat;
                maiorNome = alunoNome;
            }
            if(notaFloat<menorNota){
                menorNota = notaFloat;
                menorNome = alunoNome;
            }

        }
        mediaNota = mediaNota/10;

        JOptionPane.showMessageDialog(null,"A media da turma foi: "+mediaNota+" a maior nota foi "+maiorNota+" do aluno "+maiorNome+" e a menor nota foi "+menorNota+" do aluno "+menorNome);

    }
}
