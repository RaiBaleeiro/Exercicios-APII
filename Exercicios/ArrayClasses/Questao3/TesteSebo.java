package Exercicios.ArrayClasses.Questao3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TesteSebo {

            public static String menu(){
        
                return "Digite:\n" +
                "1 - Adicionar Livro \n"+
                "2 - Cadastrar Cliente \n"+
                "3 - Comprar Livro \n"+
                "4 - Listar todos os livros adicionados \n"+
                "5 - Listar todos os clientes cadastrados \n"+
                "6 - Alterar Estoque \n"+
                "0 - Para sair";
                }
        
                public static void main(String[] args) {
        
                ArrayList<Livro> livros = new ArrayList<>();
                ArrayList<Cliente> clientes = new ArrayList<>();
                
                    int op = 1;
        
                while(op!=0){
        
        
                    op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        
                    if(livros.isEmpty() && (op == 3 || op == 4||op == 6)){
                        JOptionPane.showMessageDialog(null, "Não existe nenhum livro adicionado! Você será redirecionado à página para adicionar livros.");
                        op = 1;
                    }
                    if(clientes.isEmpty() && (op == 3 || op == 5)){
                        JOptionPane.showMessageDialog(null, "Não existe nenhum cliente cadastrado! Você será redirecionado à página de cadastro de clientes.");
                    }
                    
                    switch(op){
                        case 1:{
                            String titulo = JOptionPane.showInputDialog("Digite o título do livro que deseja adicionar:");
                            String autores = JOptionPane.showInputDialog("Digite os autores do livro que deseja adicionar:");
                            String editora = JOptionPane.showInputDialog("Digite a editora do livro que deseja adicionar:");
                            String ano = JOptionPane.showInputDialog("Digite o ano de lançamento do livro que deseja adicionar:");
                            String paginas = JOptionPane.showInputDialog("Digite o total de páginas do livro que deseja adicionar:");
                            int estoque = Integer.parseInt(JOptionPane.showInputDialog("Digite o estoque atual do livro que deseja adicionar:"));
                            if(estoque<0){
                                JOptionPane.showMessageDialog(null, "Não é possível ter um estoque negativo!");
                                estoque = 0;
                            }
                            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto foi pago pelo livro que deseja adicionar(50% será aplicado em cima disso para lucro):"));

                            Livro livro = new Livro(titulo, autores, editora, ano, paginas, valor, estoque);
                            livros.add(livro);
                            JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!");
                            JOptionPane.showMessageDialog(null, livro);
                            break;
                        }
        
                        case 2:{
                            String nome = JOptionPane.showInputDialog("Digite o nome do cliente que deseja cadastrar:");
                            int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do cliente que deseja cadastrar:"));        
                  
                            Cliente cliente = new Cliente(nome, cpf);
                            clientes.add(cliente);
                            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                            JOptionPane.showMessageDialog(null, cliente);

                             break;
                        }
        
                        case 3:{
                            boolean existec = false;
                            boolean existel = false;
                            int cpf = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o cpf do cliente que deseja fazer a compra"));

                                for(Cliente cliente: clientes){
                                    if(cliente.getCpf()==cpf){
                                        existec = true;
                                        }
                                   

                                if(existec == false){
                                    JOptionPane.showMessageDialog(null, "Esse CPF não consta no banco de dados!");
                                    break;
                                }else{
                                    existec = false;
                                    String slivro = JOptionPane.showInputDialog("Digite o titulo do livro que deseja comprar: ");
                                    for(Livro livro:livros){
                                        if(livro.getTitulo().equals(slivro)){
                                            if(livro.getEstoque()<0){
                                                JOptionPane.showMessageDialog(null, "Infelizmente estamos sem estoque do livro desejado, tente comprar outro livro.");
                                                break;
                                            }
                                            existel = true;
                                            livro.venda();
                                            cliente.compra();

                                            JOptionPane.showMessageDialog(null, "Livro vendido com sucesso!");
                                            break;
                                        }
                                        }
                                    }
                                    if(existel == false){
                                        JOptionPane.showMessageDialog(null, "Livro não consta no banco de dados!");
                                        break;
                                    }
                                }
                                        break;
                        }
                        case 4:{
                            JOptionPane.showMessageDialog(null, livros);   
                            break;
                        }
                        
                        case 5:{
                            JOptionPane.showMessageDialog(null, clientes);
                            break;
                        }
                        case 6:{
                            boolean existe = false;
                            String slivro = JOptionPane.showInputDialog(null, "Digite o titulo do livro que deseja alterar o estoque:");
                            for(Livro livro: livros){
                                if(livro.getTitulo().equals(slivro)){
                                    existe = true;
                                    livro.setEstoque(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que deseja alterar:")));
                                    JOptionPane.showMessageDialog(null, "Estoque alterado com sucesso!");
                                }
                            }
                            if(existe == false){
                                JOptionPane.showMessageDialog(null,"Livro não consta no banco de dados!");
                            }
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
        


