import java.util.Scanner;

public class Questao8{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);

		float media=0;
		String nome;

		System.out.println("Bem vindo ao programa de calculo de media, digite o seu nome e em seguida suas 3 medias ");
		nome = input.next();

		for(int i=1;i<=3;i++){
		System.out.println("Digite a sua media "+i);
		media += input.nextFloat();
		
	}
		media = media/3;
		System.out.println("A média do aluno "+nome+" é "+media);
	}	
}