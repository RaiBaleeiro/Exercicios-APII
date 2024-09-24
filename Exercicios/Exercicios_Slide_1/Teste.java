
package Exercicios.Exercicios_Slide_1;

import java.util.Scanner;

public class Teste{
    public static void main(String args[]){

        float num1, num2;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem vindo ao programa de somas! Digite 2 números para que possamos somá-lo! ");

        System.out.println("Primeiro número: ");
        num1 = input.nextFloat();

        System.out.println("Segundo número: ");
        num2 = input.nextFloat();

        System.out.println("O resultado é igual a: "+(num1 + num2));



        input.close();

    }
}