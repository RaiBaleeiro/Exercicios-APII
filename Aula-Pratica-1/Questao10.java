import javax.swing.JOptionPane;

public class Questao10{
	public static void main(String [] args){
		

		float media=0;
		String nome, nota;


		nome = JOptionPane.showInputDialog("Bem vindo ao programa de calculo de media, digite o seu nome e em seguida suas 3 medias ");

		for(int i=1;i<=3;i++){
		nota = JOptionPane.showInputDialog("Digite a sua media "+i);
		media += Float.parseFloat(nota);
		
	}
		media = media/3;
		JOptionPane.showMessageDialog(null, "A média do aluno "+nome+" é "+media);
	}	
}