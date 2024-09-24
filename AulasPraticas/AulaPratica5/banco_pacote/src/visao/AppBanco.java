package visao;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Conta;

public class AppBanco
{
public static String menu(){
return "Digite:\n" +
"1 - Cadastrar cliente\n"+
"2 - Cadastrar conta \n"+
"3 - Depositar \n"+

"4 - Sacar \n"+
"5 - Consultar saldo\n" +
"6 - Remover cliente\n" +
"7 - Remover conta\n" +
"8 - Listar cliente\n" +
"9 - Listar contas\n" +
"0 - para sair";
}
public static void main(String[] args) {
ArrayList <Cliente> clientes = new ArrayList();
ArrayList <Conta> contas= new ArrayList();
int op;
op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
while (op!=0){
switch (op){
case 1:{//cadastrar cliente
String nome;
long cpf;
nome = JOptionPane.showInputDialog("Digite o nome do cliente");
cpf = Long.parseLong(JOptionPane.showInputDialog("digite o CPF"));
Cliente c = new Cliente(nome, cpf);
clientes.add (c);
JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso\n" + c.imprimir());
break;
}
case 2:{//cadastrar conta
long cpf;
cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF"));
Conta conta = null;
for (Cliente cliente : clientes){
if (cliente.getCpf()==cpf){
conta = new Conta(cliente);
contas.add(conta);
break;
}
}
JOptionPane.showMessageDialog(null,"Conta cadastrada com sucesso\n"
+ conta.imprimir());
break;
}
case 3:{//depositar
break;
}
case 4: {//sacar
int numConta;
double valor;
numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta"));
for (Conta c: contas){
if (numConta == c.getNumeroConta()){
valor =
Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
if (c.sacar(valor))
JOptionPane.showMessageDialog(null,"Saque reallizado com sucesso");
else
JOptionPane.showMessageDialog(null,"Saldo insuficiente");
break;
}
}
break;
}

case 5: {//consultar saldo
int numConta;
numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta"));
for (Conta c: contas){
if (numConta == c.getNumeroConta()){
JOptionPane.showMessageDialog(null, "Saldo da conta\n" + c.imprimir());
break;
}
}
break;
}
case 6: {//remover cliente
long cpf;
cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do cliente que será removido"));
for (int i=0; i<clientes.size(); i++){
if (clientes.get(i).getCpf()==cpf){
clientes.remove(clientes.get(i));
break;
}
}
JOptionPane.showMessageDialog(null,"Cliente removido com sucesso\n");
break;
}
case 7: {//remover conta
break;
}
case 8:{// listar cliente
String listaClientes = "";
for (Cliente c: clientes){
listaClientes += c.imprimir() + "\n";
}
JOptionPane.showMessageDialog (null, listaClientes);
break;
}
case 9: {// listar conta
break;
}
}
op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
}
}
}