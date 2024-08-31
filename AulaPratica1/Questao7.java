import java.util.Scanner;
//Para utilizar o scanner é preciso importar a classe
public class Questao7 {
public static void main (String[] args){
Scanner teclado = new Scanner(System.in);
System.out.println("Digite os dados solicitados");
System.out.print("\nNome: ");
String nome = teclado.nextLine();
System.out.print("\nInteiro: ");
int numInt = teclado.nextInt();
System.out.print("\nFloat: ");
float numFloat = teclado.nextFloat();
System.out.print("\nDouble: ");
double numDouble = teclado.nextDouble();
System.out.println(nome + "\n"+ numInt + "\n"+ numFloat +"\n"+ numDouble);
}
}