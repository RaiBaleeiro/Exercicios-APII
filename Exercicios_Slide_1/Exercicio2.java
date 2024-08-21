
package Exercicios_Slide_1;

import java.util.Scanner;

public class Exercicio2{
    public static void main(String args[]){

        int num=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero para que possamos informar o seu sucessor e seu antecessor! ");
        num = input.nextInt();
        input.close();

        System.out.println("O sucessor de "+num+" é "+(++num)+" e seu antecessor é "+(num-2));


    }
}
