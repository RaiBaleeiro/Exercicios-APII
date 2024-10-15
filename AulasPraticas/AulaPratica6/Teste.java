import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Teste {

    public static String menu(){
        return "Digite:\n" +
        "1 - Cadastrar produto \n" +
        "2 - Cadastrar livro \n" +
        "3 - Cadastrar livro didático \n" +
        "4 - Imprimir produtos \n"+
        "0 - para sair";
        }

    public static void main(String[] args) {

        int op;
        
        op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        
        
        while (op!=0){
        switch(op){
        
        case 1: {//cadastrar produto
        
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto:"));
        Produto produto = new Produto(nome, preco);
        produtos.add(produto);
        JOptionPane.showMessageDialog(null, "Produro cadastrado com sucesso!");
        break;
        }
        case 2:{//cadastrar livro
        
            String nome = JOptionPane.showInputDialog("Digite o nome do livro:");
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do livro:"));
            String autor = JOptionPane.showInputDialog("Digite o autor do livro:");
            int paginas = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de páginas do livro:"));
            Livro livro = new Livro(nome, autor, paginas, preco);
            produtos.add(livro);
            JOptionPane.showMessageDialog(null, "Livro criado com sucesso!");
        break;
        
        }
        case 3:{//cadastrar livro didatico

            String nome = JOptionPane.showInputDialog("Digite o nome do livro:");
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do livro:"));
            String autor = JOptionPane.showInputDialog("Digite o autor do livro:");
            int paginas = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de páginas do livro:"));
            String disciplina = JOptionPane.showInputDialog("Digite a disciplina do livro");
            LivroDidatico livrodidatico = new LivroDidatico(disciplina, preco, autor, nome, paginas);
            produtos.add(livrodidatico);
            JOptionPane.showMessageDialog(null, "Livro didático criado com sucesso!");
        break;
        
        }
        case 4:{//listar Produtos
            String saida = "";
            for(Produto produto:produtos){
                
                saida += produto.toString();
            }
            JOptionPane.showMessageDialog(null, saida);

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
