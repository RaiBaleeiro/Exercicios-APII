
package Exercicios.Exercicios_Slide_1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]){

        int total,saque,nota100=0,nota50=0,nota10=0,nota5=0,nota1=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo ao caixa eletrônico! Informe quantos reais deseja sacar: ");
        total = input.nextInt();
        input.close();

        saque = total;

        if(saque>=100){
            nota100 = saque/100;
            if(saque%100>0){
                saque=saque%100;
            }else{saque=0;}
        }
        if(saque>=50){
            nota50 = saque/50;
            if(saque%50>0){
                saque=saque%50;
            }else{saque=0;}
        }
        if(saque>=10){
            nota10 = saque/10;
            if(saque%10>0){
                saque=saque%10;
            }else{saque=0;}
        }
        if(saque>=5){
            nota5 = saque/5;
            if(saque%5>0){
                saque=saque%5;
            }else{saque=0;}
        }
        if(saque>=1){
            nota1 = saque/1;
            if(saque%1>0){
                saque=saque%1;
            }else{saque=0;}
        }

        System.out.println("Seu saque de R$"+total+" Irá lhe render "+nota100+" notas de 100 reais, "+nota50+" notas de 50 reais, "+nota10+" notas de 10 reais, "+nota5+" notas de 5 reais e "+nota1+" notas de 1 real. ");
    }
}
