package Atividade2.Escola;

public class Aluno {
    int matricula;
    String nome;
    float prova1=0;
    float prova2=0;
    float trabalho=0;
    float mFinal;

    public void setMatricula(int nMatricula)
    {
        matricula = nMatricula;
    }
    public int getMatricula()
    {
        return matricula;
    }

    public void setNome(String sNome)
    {
        nome = sNome;
    }
    public String getNome()
    {
        return nome;
    }

    public void setProva1(float sProva1)
    {
        prova1 = sProva1;
    }
    public float getProva1()
    {
        return prova1;
    }

    public void setProva2(float sProva2)
    {
        prova2 = sProva2;
    }
    public float getProva2()
    {
        return prova2;
    }

    public void setTrabalho(float sTrabalho)
    {
        trabalho = sTrabalho;
    }
    public float getTrabalho()
    {
        return trabalho;
    }
   
    public float calcularMedia(float n1, float n2,float t)
    {
        mFinal = (((4*n1) +(4*n2)+(2*t))/10);
        return mFinal;
    }

    public float calcularFinal()
    {
        if(mFinal<7)
        {
            return (7-mFinal);
        }else{
            return 0;
        }


    }




}
