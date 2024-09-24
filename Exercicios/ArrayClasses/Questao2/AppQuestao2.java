package Exercicios.ArrayClasses.Questao2;

import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.swing.JOptionPane;


public class AppQuestao2 {
    public static String menu(){

        return "Digite:\n" +
        "1 - Cadastrar funcionário \n"+
        "2 - Atualizar quantidade de horas trabalhadas \n"+
        "3 - Calcular salário \n"+
        "0 - Para sair";
        }

        public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
            int op = 1;

        while(op!=0){


            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));

            if(funcionarios.isEmpty() && (op == 2 || op == 3)){
                JOptionPane.showMessageDialog(null, "Não existe nenhum funcionario cadastrado no banco de dados! Irei te redirecionar à página de cadastro.");
                op = 1;
            }
            
            switch(op){
                case 1:
                
                    String nome = JOptionPane.showInputDialog("Digite seu nome");
                    long cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite seu cpf(apenas os digitos)"));
                    String cargo = JOptionPane.showInputDialog("Digite seu cargo");
                    String dataAdmissao = JOptionPane.showInputDialog("Digite o dia da sua admissao");
                    float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite quanto você ganha por hora"));

                    Funcionario funcionario = new Funcionario(nome, cpf, valorHora, dataAdmissao, cargo);
                    funcionarios.add(funcionario);

                    JOptionPane.showMessageDialog(null, "Funcionario adicionado com sucesso!");
                    break;

                case 2:

                    boolean existe = false;
                    cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do funcionario que deseja atualizar"));

                    for (Funcionario f : funcionarios) {
                        if (f.getCpf() == cpf){
                            existe = true;
                        int horasTrab = Integer.parseInt(JOptionPane.showInputDialog("Seja bem vindo, "+f.getNome()+", Digite quantas horas você trabalhou"));

                        f.atualizarHorasTrab(horasTrab);
                
                        JOptionPane.showMessageDialog(null, "Horas Atualizadas com sucesso!");
                            
                        }
                        }
                        if(existe == false){
                            JOptionPane.showMessageDialog(null, "Não foi possível encontrar um funcionario com este cpf!");
                        }
                        break;

                case 3:

                cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do funcionario que deseja saber o salário"));
                existe = false;

                for (Funcionario f : funcionarios) {
                    if (f.getCpf() == cpf){
                        existe = true;

                        JOptionPane.showMessageDialog(null, "O salário do funcionario "+f.getNome()+" Equivale a R$"+f.salario());
                    }
                    }
                    if(existe == false){
                        JOptionPane.showMessageDialog(null, "Não foi possível encontrar um funcionario com este cpf!");
                        break;
                    }

                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar o nosso programa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao inválida!");
                    break;
                    
            }
        }
}
}
