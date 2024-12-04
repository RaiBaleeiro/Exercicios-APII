package Banco;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppBanco {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        // Criando contas
        ContaCorrente cc = new ContaCorrente("João",2000,200);
        Poupanca poupanca = new Poupanca("Cleber",2000.0, 1.05);

        // Adicionando à lista
        contas.add(cc);
        contas.add(poupanca);

        // Testando métodos
        for (Conta conta : contas) {
            if (conta instanceof Poupanca) {
                Poupanca p = (Poupanca) conta;
                JOptionPane.showMessageDialog(null,"Rendimento da poupança: " + p.calcularRendimento());
            } else if (conta instanceof ContaCorrente) {
                JOptionPane.showMessageDialog(null,"Saldo da conta corrente: " + conta.getSaldo());
            }

            // Exibindo dados
            JOptionPane.showMessageDialog(null,conta.recuperarDadosConta());
        }
    }
}
