package AulasPraticas.AulaPratica4.Lanchonete;

import java.util.Scanner;
public class Questao02g
{
public static String menu(){
    
return "Escolha uma opção:\n"
+ "1 - Cadastrar produto\n"
+ "2 - Fazer pedido\n"
+ "3 - Inserir itens\n"
+ "4 - Calcular valor do pedido\n"
+ "5 - Comparar produto\n" //comprar produtos para lanchonete
+ "0 - sair";
}
public static void main(String[] args) {
//O código cria o método menu, para mostrar ao usuario todas as opções possíveis. Após isso, cria um array de produtos, delimitando seu tamanho em 10 através da variável final int num_produtos, que a torna imutável. Com isso, utiliza do Scanner para receber uma entrada do usuario, com isso escolhendo uma das 5 opções possíveis, utilizando do switch para levar cada escolha à sua função.
Scanner teclado = new Scanner(System.in);
int op;
final int NUM_PRODUTOS = 10;
Produto produtos[] = new Produto[NUM_PRODUTOS];
int contProduto=0;
System.out.println(menu());
op = teclado.nextInt();
while (op!=0){
switch (op){
case 1:{
System.out.println("Digite o nome do produto");
String nome = teclado.next();
Produto p = new Produto (nome);
//na linha 27 abre a possibilidade do usuário digitar o nome do novo produto que está sendo criado, através do objeto teclado da classe scanner e do método "next". Já na linha 28 é criado um novo objeto da classe produto, o qual utiliza do nome dado pelo usuário.
produtos[contProduto]=p;
//
contProduto++;
System.out.println("Produto cadastrado: \n"+p.imprimir()+"\n");
break;
}
}
System.out.println(menu());
op = teclado.nextInt();
teclado.close();
}
}
}
