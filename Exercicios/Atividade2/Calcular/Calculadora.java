package Exercicios.Atividade2.Calcular;

public class Calculadora {
    public int somar(int n1, int n2)
    {
        return n1+n2;
    }

    public int subtrair(int n1, int n2)
    {
        return n1-n2;
    }

    public int multiplicar(int n1, int n2)
    {
        return n1*n2;
    }

    public int dividir(int n1, int n2)
    {
        if(n2 == 0)
        {
            System.out.println("ERRO!!! Nao é possível dividir por 0!");
            return 0;
        }
        return n1/n2;
    }


}
 