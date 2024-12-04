package Banco;
import java.util.ArrayList;
public abstract class Conta {
      // atributos
    private int numeroConta;
    private String cliente;
    private double saldo;
    private ArrayList <String> historico;
    private static int identificador;
    
    //Construtores
    public Conta (){
       numeroConta = ++identificador;
       historico = new ArrayList<>();
    }
    
    public Conta(String cliente){
        numeroConta = ++identificador;
        this.cliente=cliente;
        saldo = 0.0;
        historico = new ArrayList<>();
    }
    public Conta (String cliente, double saldo){
        numeroConta=++identificador; 
        this.cliente = cliente;
        this.saldo = saldo;   
        historico = new ArrayList<>();
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

    public void adicionarHistorico(String texto){
        historico.add(texto);
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

    public String recuperarDadosConta(){
        return "Número: "+this.numeroConta+"\nSaldo: "+this.saldo;
    }

    public abstract String getTipo();
}

//Questão 7: É uma classe que não pode ser instanciada diretamente e serve como base para outras classes. Permite definir métodos que as subclasses devem implementar.

//Questão8: Se o método getTipo for abstrato na classe Conta, todas as classes filhas são obrigadas a implementá-lo. Caso não seja implementado, haverá erro de compilação.

//Questão 10: Esse método getTipo abstrato serve como uma fundação para futuras classes que possam ser construídas, já que força as classes que implementam a classe Conta a utilizá-la, reduz erros e força uma uniformização.

//Questão 11: Sim, métodos abstratos podem ser chamados dentro de métodos da própria classe abstrata, desde que sejam implementados pelas subclasses antes de serem usados em tempo de execução.