package AulaPratica12;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;

public class RepositorioProduto
{
    private final String nomeArquivo="produto.ser";
    
    public void salvarProduto (Produto p) {
        try (FileOutputStream fos= new FileOutputStream(nomeArquivo, true)){
           ObjectOutputStream gravarArq = new ObjectOutputStream(fos);
           gravarArq.writeObject(p);
           gravarArq.close();
        } catch (FileNotFoundException e){
            System.out.println("Erro ao salvar o produto");
        } catch (IOException ioe){
            System.out.println ("Problema ao salvar o produto"); 
        }
    }
    
     public ArrayList<Produto> listarProduto() {
         ArrayList<Produto> produtos = new ArrayList();
         ObjectInputStream lerArq = null;
         try(FileInputStream fis = new FileInputStream(nomeArquivo)) { 
            while (fis.available()>0){
                lerArq = new ObjectInputStream (fis);
                Produto p = (Produto)lerArq.readObject();
                produtos.add(p);
            }
            lerArq.close();
         }catch (FileNotFoundException ex){
             System.out.println("Erro na leitura do arquivo "+ ex.getMessage());
         } catch (EOFException e){
            System.out.println("Erro de fim de arquivo");
         } catch (IOException | ClassNotFoundException ex){
            System.out.println ("Problema ao atualizar o arquivo"); 
         }
         return produtos;
     }
     
     public Produto pesquisarProduto(int codigo){
         ArrayList <Produto> produtos = listarProduto();
         Produto produto=null;
         for (Produto p: produtos){
             if (p.getCodigo() == codigo){
                 produto = p;
                 break;
             }
         }
         return produto;
     }
     
     public void removerProduto(int codigo){
         ArrayList <Produto> produtos = listarProduto();
         boolean removeu=false;
         for (int i=0; i<produtos.size(); i++){
             if (produtos.get(i).getCodigo() == codigo){
                 produtos.remove(produtos.get(i));
                 atualizarArquivoProduto(produtos);
                 removeu=true;
                 break;
             }
         }
         if (!removeu){
             throw new RuntimeException("Produto não encontrado");
         }
     }
     
     private void atualizarArquivoProduto(ArrayList<Produto> produtos){
         try (FileOutputStream fos= new FileOutputStream(nomeArquivo)){
           ObjectOutputStream gravarArq = new ObjectOutputStream(fos);
           for (Produto p: produtos){
               gravarArq.writeObject(p);
            }
            gravarArq.close();
        } catch (IOException ioe){
            System.out.println ("Problema ao atualizar o arquivo"); 
        }
     }
     
     public String toString(){
         String resultado="";
         ArrayList <Produto> produtos = listarProduto();
         for (Produto p: produtos){
             resultado += p.toString() + "\n";
         }
         return resultado;
     }
}