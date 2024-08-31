package Atividade2.Calcular;

import javax.swing.JOptionPane;

public class TestaCalculadora
{
    public static void main(String[]args)
    {
        int x,y;
        Calculadora calc = new Calculadora();
        String aux = JOptionPane.showInputDialog("Digite um número");
        x = Integer.parseInt(aux);
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        System.out.println("Soma: "+ calc.somar(x,y));
        System.out.println("Subtração: "+ calc.subtrair(x, y));
        System.out.println("Multiplicação: "+ calc.multiplicar(x, y));
        System.out.println("Divisão: "+ calc.dividir(x, y));
    }




}
