package Agenda;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Contato {
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String data;
    private String tipo;

    ArrayList<Contato> contatos = new ArrayList<>();

    public Contato(){

    }

    public Contato(String nome, String email, String telefone, String endereco, String data, String tipo){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.data = data;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void incluirContato(Contato contato){
        contatos.add(contato);
    }

    public boolean excluirContato(String nome){
        boolean tem = false;
        for(Contato contato:contatos){
            if (contato.getNome() == nome){
                contatos.remove(contato);
                tem = true;
             }
            }
            return tem;
        }

        public String listarContatos(){
                return contatos.toString();
            }

        public String consultaDados(String nome){
            String cont = "";
            for(Contato contato:contatos){
                if(nome == contato.getNome()){
                    cont = contato.toString();
                }
            }
            return cont;
        }
            


        }




    



    

