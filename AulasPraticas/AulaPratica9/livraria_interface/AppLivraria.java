package AulaPratica9.livraria_interface;

public class AppLivraria {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        LivroFisico fisico = new LivroFisico() ;
        fisico.setNome("Java como programar");
        fisico.setValor(200);
        carrinho.adicionar(fisico);
        
        Ebook ebook = new Ebook();
        ebook.setNome("Java");
        ebook.setValor(55.5);
        carrinho.adicionar(ebook);
       //Antes de alterarmos a main e a classe CarrinhoCompras, ocorria um erro devido ao fato que na classe CarrinhoCompras, havia o metodo aplicardesconto o qual dentro dele chamava o método aplicadesconto da interface IProduto, o qual não havia o método mencionado e por isso ocasionava um erro, após comentarmos esse método, apagamos a instanciação desse método aqui na classe main, já que tentava chamar um método agora inexistente também na classe CarrinhoCompras, por termos comentado ele. 
       carrinho.aplicarDesconto(ebook, 0.05);
        System.out.println("Total do carrinho R$: " + carrinho.getTotal());
    }
}