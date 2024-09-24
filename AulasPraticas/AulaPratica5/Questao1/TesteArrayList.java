package AulasPraticas.AulaPratica5.Questao1;
 
//Classe principal
import java.util.ArrayList;
public class TesteArrayList {
public static void main(String[] args) {

ArrayList pessoas = new ArrayList();

pessoas.add(new Pessoa("Fulano", 20));
pessoas.add(new Pessoa("Beltrano", 18));
pessoas.add(new Pessoa("Ciclano", 23));

for (int i = 0; i < pessoas.size(); i++){
System.out.println(((Pessoa)pessoas.get(i)).imprimir());
}
//Alternativa b - Ocorre um erro, pois a classe ArrayList não possui um método chamado imprimir
//
}

}