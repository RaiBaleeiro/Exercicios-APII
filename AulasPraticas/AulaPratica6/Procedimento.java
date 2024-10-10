public class Procedimento{
    private int codigo;
    private String tipoProcedimento;
    private int custo;

    public Procedimento(int codigo, String tipoProcedimento, int custo){
        this.codigo = codigo;
        this.tipoProcedimento = tipoProcedimento;
        this.custo = custo;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCusto() {
        return custo;
    }

    public String getTipoProcedimento() {
        return tipoProcedimento;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public void setTipoProcedimento(String tipoProcedimento) {
        this.tipoProcedimento = tipoProcedimento;
    }

    public String imprimir(){
        return getCodigo() + ": " + getTipoProcedimento() + "\n" + "R$" + getCusto();
    }




}