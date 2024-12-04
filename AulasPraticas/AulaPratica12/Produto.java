package AulaPratica12;

import java.io.Serializable;

public class Produto implements Serializable {
    private int codigo;
    private String descricao;
    private double valor;

    public Produto(){
        
    }
    public Produto (int codigo, String descricao, double valor){
        this.codigo=codigo;
        this.descricao=descricao;
        this.valor=valor;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
    @Override
    public String toString(){
        return getCodigo() + " - " + getDescricao() + " - R$ " + getValor();
    }
}