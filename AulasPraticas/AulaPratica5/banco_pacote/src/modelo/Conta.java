package modelo;

//Classe Conta
public class Conta {
private int numeroConta;
private Cliente cliente;
private double saldo;
private static int identificador;
public Conta (){
identificador++;
numeroConta=identificador;
}

public Conta (Cliente c){
cliente = c;
identificador++;
numeroConta=identificador;
}
public Conta (Cliente c, double saldo){
identificador++;
numeroConta=identificador;
this.cliente = c;
this.saldo = saldo;
}
public int getNumeroConta (){
return numeroConta;
}
public double getSaldo(){
return saldo;
}
public boolean sacar(double valor){
boolean sacou=false;
if (saldo >= valor){
saldo = saldo - valor;
sacou=true;
}
return sacou;
}
public void depositar(double valor){
saldo = saldo + valor;
}
public void tranferir(Conta c, double v){
if (this.sacar(v)){
c.depositar(v);
}
}
public String imprimir (){
return "Numero: " + numeroConta + "\nTitular: " + cliente.getNome() + "\nSaldo:"+ saldo;
}
public Cliente getCliente() {
return cliente;
}
public void setCliente(Cliente cliente) {
this.cliente = cliente;
}
}