package Atividade2.Lanchonete;

public class Produto {
   private int id;
   private String name;
   private float value;
   private int quant = 0;

    public void setName(String nome)
    {
        name = nome;
    }
    public void setValue(float valor)
    {
        value = valor;
    }

    public void setQuant(int quantidade)
    {
       quant = quantidade;
    }

    public void setId(int identificador)
    {
       id = identificador;
    }

    public int getId()
    {
        return id;
    }

    public float getQuant()
    {
        return quant;
    }

    public float getValue()
    {
        return value;
    }

    public String getName()
    {
        return name;
    }
     
    @Override
    public String toString()
    {
        return "Produto: " +name+" || R$"+value+" Id: "+id;
    }







}
