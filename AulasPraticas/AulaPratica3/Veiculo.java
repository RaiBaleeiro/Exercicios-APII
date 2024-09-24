package AulasPraticas.AulaPratica3;


public class Veiculo
{
    private char codigo;
    private String tipo;
    private String modelo;
    private int posicao;
    private static int qtd;

    public char getCodigo() {
        return codigo;
    }

    public void setCodigo(char codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPosicao() {
        return posicao;
    }
    
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public static int getQtd() {
        return qtd;
    }

    public static void setQtd(int qtd) {
        Veiculo.qtd = qtd;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    void frente (int deslocamento){
        posicao += deslocamento;
    }
    void re ( int deslocamento){
        posicao -= deslocamento;
    }

    public Veiculo(char codigo,String tipo, String Modelo, int posicao)
    {
        this.codigo = codigo;
        this.tipo = tipo;
        this.modelo = Modelo;
        this.posicao = posicao;
        qtd++;
    }

    public Veiculo(){
        qtd++;
    }

    public Veiculo clone()
    {
        Veiculo v1 = new Veiculo(this.codigo,this.tipo,this.modelo,this.posicao);
        return v1;
    }





}

