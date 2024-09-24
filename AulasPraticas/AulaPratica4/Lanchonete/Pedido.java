package AulasPraticas.AulaPratica4.Lanchonete;

public class Pedido {

    private int codigo;
    private String data;
    private Item[] itens;
    private int contItem=0;
    private static int geradorDeCodigo=0;
    //Questão f - Tanto a data quanto o codigo não necessitam de um método set, pois o código é unico para cada pedido e é "setado" de forma crescente a cada pedido criado através da variavel geradorDeCodigo no constructor. A data é bastante semelhante, de modo que é "setada" dentro do constructor, porém utiliza de um valor dado pelo usuário para "setar", e, pelo uso inerente da data, não há necessidade alguma de alterá-la utilizando um set posteriormente.


    public Pedido (String data){
    this.data=data;
    this.itens = new Item[10];
    this.codigo=geradorDeCodigo++;
    }

    public void inserirItem(Item i){
    itens[contItem]=i;
    contItem++;
    }

    public double calcularTotalPedido(){
    double total=0;
    for (Item i: itens){
    total+=i.calcularSubTotal();
    }

    return total;
    }

    public int getCodigo() {
    return codigo;
    }

    public String getData() {
    return data;
    }
    
    public Item[] getItens() {
    return itens;
    }
    }
