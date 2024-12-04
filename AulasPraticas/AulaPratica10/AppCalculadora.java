package AulaPratica10;
import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class AppCalculadora 
{
    public static void main(String[] args) {
        int x, y;        
        Calculadora c = new Calculadora();
        try{
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));    
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));     

        JOptionPane.showMessageDialog(null,"Soma: " + c.somar(x, y)+"\nSubtraçao: " + c.subtrair(x, y)+"\nDivisão: " + c.dividir(x, y)+"\nMultiplicação: " + c.multiplicar(x, y));
        
    } catch (Exception ex){
        System.out.println(ex.getMessage());
        }
    }
        //Questão 2: Na opção a e b são lançadas as exceções InputMismatchException, já na questão c é lançada a exceção ArithmeticException.

        //Questão 4: Ocorre um erro de compilação, o código nem sequer executa devido a um erro indicado pela IDE como sendo causado por os catchs criados após a Exception ex não acontecerem por o exception ex já tratar tudo.

}