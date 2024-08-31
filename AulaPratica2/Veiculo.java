

public class Veiculo
{
    int x;
    char codigo;
    String tipo;
    String cor;
    int posicao;



    //Faça o L
    void frente (int deslocamento){
        posicao = posicao + deslocamento;
    }
    void re ( int deslocamento){
        posicao -= deslocamento;
    }
}
