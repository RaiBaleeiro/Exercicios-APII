package Exercicios.tributos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        CalculaTributo calculaTributo = new CalculaTributo();

        while (true) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de tributável para cadastrar:\n1. Consultoria\n2. Imóvel\n3. Profissional Autônomo\n4. Calcular Total de Tributos\n5. Sair"));

            if (opcao == 5) {
                break;
            }

            switch (opcao) {
                case 1:
                String descricao = JOptionPane.showInputDialog("Descrição da consultoria: ");
                double valorConsultoria = Double.parseDouble(JOptionPane.showInputDialog("Valor da consultoria: "));
                    calculaTributo.adicionarTributo(new Consultoria(descricao, valorConsultoria));
                    break;

                case 2:
                    double valorImovel = Double.parseDouble(JOptionPane.showInputDialog("Valor do imóvel: "));
                    double tamanho = Double.parseDouble(JOptionPane.showInputDialog("Tamanho do imóvel: "));
                    String endereco = JOptionPane.showInputDialog("Endereço do imóvel: ");
                    calculaTributo.adicionarTributo(new Imovel(valorImovel, tamanho, endereco));
                    break;

                case 3:
                    String nome = JOptionPane.showInputDialog("Nome do profissional: ");
                    String cpf = JOptionPane.showInputDialog("CPF: ");
                    String enderecoProf = JOptionPane.showInputDialog("Endereço: ");
                    double remuneracao = Double.parseDouble(JOptionPane.showInputDialog("Remuneração: "));
                    calculaTributo.adicionarTributo(new ProfissionalAutonomo(nome, cpf, enderecoProf, remuneracao));
                    break;

                case 4:
                   JOptionPane.showMessageDialog(null,"Valor total de tributos arrecadados: R$"+calculaTributo.calculaTotalTributo());
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida.");
            }
        }
    }
}