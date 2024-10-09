package Agenda;

import javax.swing.JOptionPane;

public class TesteAgenda {

    public String menu(){
        return "Seja bem vindo ao banco de dados de Contatos! \n " +
                "1 - Adicionar Contato \n " +
                "2 - Excluir Contato \n " +
                "3 - Listar todos contatos \n " +
                "4 - Descrever um contato especifico \n" +
                "5 - Sair";
    }
    public static void main(String[] args) {
        Contato contato = new Contato();

        int op = Integer.parseInt(JOptionPane.showInputDialog(menu()));

        while(op!=5){












        }
    }  
}
