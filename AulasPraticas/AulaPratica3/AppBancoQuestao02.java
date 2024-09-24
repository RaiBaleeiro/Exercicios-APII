package AulasPraticas.AulaPratica3;

import javax.swing.JOptionPane;

public class AppBancoQuestao02 {
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
        
                Conta conta1 = new Conta();
                Conta conta2 = new Conta();
                int op;
        
                op = Integer.parseInt(JOptionPane.showInputDialog(null,menu()));
                
                while (op!=0){
                switch (op){
        
                case 1:{//Cadastrar conta
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número da conta: "));
                String nome;
                nome = JOptionPane.showInputDialog(null,"Digite o nome do cliente: ");
                conta1 = new Conta(numero,nome);
                System.out.println("Conta definida com sucesso!\n");
                numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número da conta: "));
                nome = JOptionPane.showInputDialog(null,"Digite o nome do cliente: ");
                conta2 = new Conta(numero,nome);
               JOptionPane.showMessageDialog(null,"Conta definida com sucesso!\n");
                break;
                }
                case 2:{//Depositar
                    int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
                    if (numConta == conta1.getNumero()) {
                        conta1.depositar(valor);
                    } else if (numConta == conta2.getNumero()) {
                        conta2.depositar(valor);
                    } else {
                        JOptionPane.showMessageDialog(null,"Conta inválida.");
                    }
                break;
                }
                case 3:{//sacar
                    int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
                    double valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do saque: "));
            if (numConta == conta1.getNumero()) {
                if (!conta1.sacar(valor)) {
                    System.out.println("Saldo insuficiente.");
                }
            } else if (numConta == conta2.getNumero()) {
                if (!conta2.sacar(valor)) {
                    JOptionPane.showMessageDialog(null,"Saldo insuficiente.");
                }
            } else {
               JOptionPane.showMessageDialog(null,"Conta inválida.");
            }
        break;
        }
        case 4: {//Consultar saldo
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
            if (numConta == conta1.getNumero()) {
               JOptionPane.showMessageDialog(null,"Saldo: R$ " + conta1.getSaldo());
            } else if (numConta == conta2.getNumero()) {
               JOptionPane.showMessageDialog(null,"Saldo: R$ " + conta2.getSaldo());
            } else {
                JOptionPane.showMessageDialog(null,"Conta inválida.");
            }
        break;
        }
        case 5: {//Imprimir dados da conta
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
            if (numConta == conta1.getNumero()) {
                JOptionPane.showMessageDialog(null,conta1.imprimirConta());
            } else if (numConta == conta2.getNumero()) {
                JOptionPane.showMessageDialog(null,conta2.imprimirConta());
            } else {
               JOptionPane.showMessageDialog(null,"Conta inválida.");
            }
        break;
        }
        case 6: {
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da transferência: "));
            conta1.transferir(conta2, valor);
            JOptionPane.showMessageDialog(null,"Transferência realizada.");
            break;

        }
        case 7: { // Extrato
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
            if (numConta == conta1.getNumero()) {
                JOptionPane.showMessageDialog(null,conta1.extrato());
            } else if (numConta == conta2.getNumero()) {
                JOptionPane.showMessageDialog(null,conta2.extrato());
            } else {
                JOptionPane.showMessageDialog(null,"Conta inválida.");
            }
            break;
        }
        }
    }
        }
    }