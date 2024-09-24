package AulasPraticas.AulaPratica4.Banco;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Questao3
{
        
        public static String menu(){

    return "Digite:\n" +
    "1 - Criar conta \n"+
    "2 - Depositar \n"+
    "3 - Sacar \n"+
    "4 - Consultar saldo\n"+
    "5 - Imprimir dados da conta\n" +
    "6 - Cadastrar cliente\n" +
    "0 - Para sair";
    }

        public static void main (String[] args){
        

                ArrayList<Cliente> clientes = new ArrayList<>();   
                ArrayList<Conta> contas = new ArrayList<>();  

                int op = 1;

                while (op!=0){

                do{
                op = Integer.parseInt(JOptionPane.showInputDialog(null,menu()));
                if(clientes.isEmpty() && op ==1)
                {
                    JOptionPane.showMessageDialog(null, "Não existe nenhum cliente cadastrado! Você será redirecionado ao cadastro de clientes.");
                    op = 6;
                }
                if(contas.isEmpty() && (op == 2 || op == 3 || op == 4 || op ==5))
                {
                    JOptionPane.showMessageDialog(null, "Não existe nenhuma conta criada para fazer esse processo!Você será redirecionado ao cadastro de conta.");
                    op = 1;
                }
                }
                while(clientes.isEmpty() && op == 1);

                boolean existe = false;

                switch (op){
        

 

                case 1:{//Cadastrar conta
                    int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu cpf."));

                    for(Cliente cliente : clientes){
                        if(cliente.getCpf() == cpf){
                            existe = true;
                            int saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite o saldo inicial da sua conta"));
                            Conta conta = new Conta(cliente, saldo);
                            contas.add(conta);
                            JOptionPane.showMessageDialog(null, "Conta criada com sucesso!\n"+conta.imprimirConta());
                        }
                    }
                    if(existe == false){
                        JOptionPane.showMessageDialog(null, "CPF não consta no banco de dados.");
                    }
                break;
                }

                case 2:{//Depositar
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta que deseja fazer o depósito: "));

                    for(Conta conta: contas){
                        if(conta.getNumero() == numero){
                            existe = true;
                            long valor = Long.parseLong(JOptionPane.showInputDialog("Digite o valor que deseja depositar:"));
                            conta.depositar(valor);
                            JOptionPane.showMessageDialog(null, "valor depositado com sucesso!");
                        }
                    }
                    if(existe == false){
                        JOptionPane.showMessageDialog(null, "Conta não consta no banco de dados.");
                    }

                break;
                }
                case 3:{//sacar
                    
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta que deseja fazer o saque: "));

                    for(Conta conta: contas){
                        if(conta.getNumero() == numero){
                            existe = true;
                            long valor = Long.parseLong(JOptionPane.showInputDialog("Digite o valor que deseja sacar:"));
                            conta.sacar(valor);
                            if(conta.sacar(valor) == true){
                                JOptionPane.showMessageDialog(null, "Valor sacado com sucesso!");
                            }else{
                                JOptionPane.showMessageDialog(null, "Saldo impossibilita transação. Saque cancelado.");
                            }
                        }
                    }
                    if(existe == false){
                        JOptionPane.showMessageDialog(null, "Conta não consta no banco de dados.");
                    }
                    
        break;
        }
        case 4: {//Consultar saldo
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta que deseja checar o saldo:"));

            for(Conta conta: contas){
                if(conta.getNumero() == numero){
                    existe = true;
                    JOptionPane.showMessageDialog(null, "A conta possui um saldo de R$"+conta.getSaldo());
                }
            }
            if(existe == false){
                JOptionPane.showMessageDialog(null, "Conta não consta no banco de dados.");
            }
        break;
        }
        
        case 5: {//Imprimir dados da conta
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta que deseja checar o saldo: "));

            for(Conta conta: contas){
                if(conta.getNumero() == numero){
                    existe = true;
                    JOptionPane.showMessageDialog(null, conta.imprimirConta());
                }
            }
            if(existe == false){
                JOptionPane.showMessageDialog(null, "Conta não consta no banco de dados.");
            }
        break;
        }
        case 6:

            String nome = JOptionPane.showInputDialog("Digite o seu nome:");
            int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite seu CPF(apenas os digitos):"));
            String endereco = JOptionPane.showInputDialog("Digite seu endereco:");

            if(endereco!=null){
            Cliente cliente = new Cliente(nome, endereco, cpf);
            clientes.add(cliente);
            }else{
                Cliente cliente = new Cliente(nome, cpf);
                clientes.add(cliente);
            }
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
            break;

            case 0:
            break;

        default:
          JOptionPane.showMessageDialog(null, "Valor inválido!");
           break;
        }
      }
    }
}