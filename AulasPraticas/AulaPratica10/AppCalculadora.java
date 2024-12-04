package AulaPratica10;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppCalculadora 
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x, y;        
        Calculadora c = new Calculadora();
        try{
        System.out.println("Digite o primeiro número: ");
        x = ler.nextInt();        
        
        System.out.println("Digite o segundo número: ");
        y = ler.nextInt();        
        System.out.println("Soma: " + c.somar(x, y));
        System.out.println("Subtraçao: " + c.subtrair(x, y));
        System.out.println("Divisão: " + c.dividir(x, y));
        System.out.println("Multiplicação: " + c.multiplicar(x, y));
        
    }      catch (InputMismatchException e){
        System.out.println("Entrada invalida ");
        }  catch (ArithmeticException e){
            System.out.println(e.toString);
        }catch (Exception ex){
        System.out.println(ex.getMessage());

}
        //Questão 2: Na opão a e b são lançadas as exceções InputMismatchException, já na questão c é lançada a exceção ArithmeticException

}