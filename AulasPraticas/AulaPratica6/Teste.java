import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Teste {

    public static String menu(){
        return "Digite:\n" +
        "1 - Criar Procedimento \n" +
        "2 - Criar Consulta \n" +
        "3 - Imprimir Procedimentos \n" +
        "4 - Imprimir Consultas \n"+
        "0 - para sair";
        }

    public static void main(String[] args) {

        ArrayList<Procedimento> procedimentos = new ArrayList<>();
        ArrayList<Consulta> consultas = new ArrayList<>();

        int op;
        
        op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        if(op == 2 && procedimentos.isEmpty()){
                JOptionPane.showMessageDialog(null,"Nao é possível marcar consultas sem ter nenhum procedimento feito! Iremos te redirecionar para a criação de procedimento.");
                op = 1;
            
        }

        
        
        while (op!=0){
        switch(op){
        
        case 1: {//Criar Procedimento
        String tipo = JOptionPane.showInputDialog("Digite o tipo do procedimento que deseja cadastrar");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite qual será o custo desse procedimento:"));

        Procedimento procedimento = new Procedimento(tipo, valor);
        procedimentos.add(procedimento);

        JOptionPane.showMessageDialog(null, "Procedimento criado com sucesso!");
        
        break;
        }
        case 2:{//Criar Consulta
        
            String animal = JOptionPane.showInputDialog("Digite o nome do animal que será atendido:");
            String medico = JOptionPane.showInputDialog("Digite o nome do médico que irá atendê-lo");
            String data = JOptionPane.showInputDialog("Para que dia deseja agendar esta consulta?");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual será o valor da consulta?(não inclui o custo dos procedimentos)"));
            Consulta consulta = new Consulta(animal, medico, data, valor);

            String tipoProcedimento = JOptionPane.showInputDialog("Digite o tipo do procedimento que será feito na consulta:");

                for(Procedimento a:procedimentos){
                    if(a.getTipoProcedimento().equals(tipoProcedimento)){
                         consulta.inserirProcedimento(a);
                         JOptionPane.showMessageDialog(null, "Procedimento adicionado!");
                    }else{
                    JOptionPane.showMessageDialog(null, "Procedimento inexistente!");
                    break;
                }}
            

            int escolha = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar outro procedimento? Digite 1 para sim e qualquer outro número para não."));

            while(escolha == 1){
                tipoProcedimento = JOptionPane.showInputDialog("Digite o tipo do procedimento que será feito na consulta:");
                for(Procedimento a:procedimentos){
                    if(a.getTipoProcedimento().equals(tipoProcedimento)){
                         consulta.inserirProcedimento(a);
                         JOptionPane.showMessageDialog(null, "Procedimento adicionado!");

                    }else{
                    JOptionPane.showMessageDialog(null, "Procedimento inexistente!");
                    break;
                }}
                escolha = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar outro procedimento? Digite 1 para sim e qualquer outro número para não."));
            }
            consultas.add(consulta);

        break;
        
        }
        case 3:{//Mostrar Procedimentos

            String mostrar = "";
                for(Procedimento a:procedimentos){
                    mostrar += a.imprimir();
                }
                JOptionPane.showMessageDialog(null, mostrar);
        break;
        
        }
        case 4:{//Mostrar Consultas
            String mostrar = "";
            for(Consulta a:consultas){
                mostrar += a.imprimir();
            }
            JOptionPane.showMessageDialog(null, mostrar);
        break;

        }

        case 0:{
            JOptionPane.showMessageDialog(null,"Obrigado por utilizar nosso programa!");
            break;
        }
        default:{
            JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
        }
        op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
        }
        }
