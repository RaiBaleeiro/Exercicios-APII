package AulaPratica10;


//Questão 6 c): As saídas começam normalmente em inicio do main, inicio do metodo1 e inicio do metodo2 e prosseguem de 1000, 2001 à 6015 até que ocorre um erro NullPointerException.

//Questão 7: assim como anteriormente, o código executa até 6015, porém, diferente de antes, após mostrar o erro nullexception, o programa torna a dar mais saídas, sendo elas fim do metodo2, fim do metodo1 e fim do main, respectivamente.

//Questão 8: Agora, a unica diferença para o código da questão 7 é que ao invés de apenas 1 exceção nullpointer, é lançada várias, após o 6015, numerando em 10.

public class Questao6 
{
    public static void	main(String[]	args) {
	System.out.println("inicio do main");
        metodo1();
	System.out.println("fim do main");
    }
    static  void metodo1() {
        System.out.println("inicio do metodo1");
        try {
        metodo2();
        } catch (NullPointerException e){
        System.out.println("erro: " + e);
        }
        System.out.println("fim do metodo1");
    }
    static void	metodo2() {
        System.out.println("inicio do metodo2");
	Conta cc = new Conta();
    for (int i = 0; i <= 15; i++){ 
        cc.depositar(i + 1000);
        System.out.println(cc.getSaldo());
        if (i == 5) {
        cc = null;
        }
        System.out.println("fim do metodo2");
    }
}
}
