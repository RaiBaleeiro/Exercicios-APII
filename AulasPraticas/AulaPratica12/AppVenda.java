package AulaPratica12;
import javax.swing.JOptionPane;
public class AppVenda {
    
    public static String menu(){
        return "Escolha uma opção: \n"+
                "1 - Cadastrar produto\n"+
                "2 - Pesquisar produto\n"+
                "3 - Listar produtos\n"+
                "4 - Remover produto\n"+
                "0 - Sair";
    }

    public static void main(String[] args){
        RepositorioProduto rp = new RepositorioProduto();
        int op = Integer.parseInt (JOptionPane.showInputDialog (menu()));
        
        while (op!=0){
            switch (op){
                case 1:{
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));
                    String descricao = JOptionPane.showInputDialog("Digite a descrição do produto");
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
                    rp.salvarProduto(new Produto (codigo, descricao, valor));
                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                    break;
                }
                case 2:{
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto a ser removido"));
                    Produto p = rp.pesquisarProduto(codigo);
                    if (p!= null){
                         JOptionPane.showMessageDialog(null, p.toString());
                    } else{
                        JOptionPane.showMessageDialog(null, "Produto não encontrado");
                    }
                    break;
                }
                case 3:{
                    JOptionPane.showMessageDialog(null, rp.toString());
                    break;
                }
                case 4:{
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto a ser removido"));
                    try {
                        rp.removerProduto(codigo);
                        JOptionPane.showMessageDialog(null, "Produto removido com sucesso");
                    } catch (RuntimeException re){
                        JOptionPane.showMessageDialog(null, re.getMessage());    
                    }
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "Opção invalida");
                }
            }
            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
    }
}