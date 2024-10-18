package Banco;
import java.util.ArrayList;
public class Conta {
      // atributos
    private int numeroConta;
    private String cliente;
    private double saldo;
    private ArrayList <String> historico;
    private static int identificador;
    
    //Construtores
    public Conta (){
       numeroConta = ++identificador;
       historico = new ArrayList();
    }
    
    public Conta(String cliente){
        numeroConta = ++identificador;
        this.cliente=cliente;
        saldo = 0.0;
        historico = new ArrayList();
    }
    public Conta (String cliente, double saldo){
        numeroConta=++identificador; 
        this.cliente = cliente;
        this.saldo = saldo;   
        historico = new ArrayList();
    }
    
    // métodos
   
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar (double valor){
        if (valor > 0){
            setSaldo(getSaldo() + valor);
            historico.add("\nDepositou R$ "+valor);
        }
    }
    public boolean sacar(double valor) {
        if (getSaldo() >= valor && valor > 0){
            setSaldo(getSaldo() - valor);
            historico.add("\nSacou R$ "+valor);
            return true;
        }
        return false;
    }
    public double consultarSaldo() {
        return getSaldo();
    }
    
    public void setCliente(String c){
        this.cliente = c;
    }
    
    public String mostrarHistorico(){
        String s = "";
        for(int i=0; i < historico.size(); i++)
            s = s + historico.get(i) + "\n";
        return s;
    }    
}