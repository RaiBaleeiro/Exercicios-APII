public class Procedimento{
    private int codigo;
    private String tipoProcedimento;
    private double custo;

    private static int contCodigo = 0;

    public Procedimento(String tipoProcedimento, double custo){
        this.codigo = contCodigo;
        this.tipoProcedimento = tipoProcedimento;
        this.custo = custo;

        contCodigo++;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getCusto() {
        return custo;
    }

    public String getTipoProcedimento() {
        return tipoProcedimento;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public void setTipoProcedimento(String tipoProcedimento) {
        this.tipoProcedimento = tipoProcedimento;
    }

    public String imprimir(){
        return "Codigo: "+getCodigo() + "\nProcedimento: "+ getTipoProcedimento() + "\n" + "R$" + getCusto()+"\n\n";
    }




}