
import java.util.ArrayList;

public class Consulta {
    private int codigo;
    private String nomeAnimal;
    private String nomeMedico;
    private String dataConsulta;
    private double valor;
    private ArrayList<Procedimento> procedimentos = new ArrayList<>();

    private static int contCodigo = 0;

    public Consulta(String nomeAnimal, String nomeMedico, String dataConsulta, double valor){
        this.codigo = contCodigo;
        this.nomeAnimal = nomeAnimal;
        this.nomeMedico = nomeMedico;
        this.dataConsulta = dataConsulta;
        this.valor = valor;

        contCodigo++;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public ArrayList<Procedimento> getProcedimentos() {
        return procedimentos;
    }
    
    public double getValor() {
        return valor;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String inserirProcedimento(Procedimento procedimento){
        procedimentos.add(procedimento);
        return "Procedimento adicionado com sucesso!";
    }    

    public String removerProcedimento(Procedimento procedimento){
        procedimentos.remove(procedimento);
        return "Procedimento removido com sucesso!";
    }

    public Procedimento buscaProcedimento(String nome){
        for(Procedimento a:procedimentos){
            if(a.getTipoProcedimento().equals(nome)){
                return a;
            }
        }
        return null;

    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Procedimento procedimento:procedimentos){
            valorTotal += procedimento.getCusto();
        }
        valorTotal += this.valor;
        return valorTotal;
    }

    public String imprimir(){
        String procedimentosFeitos = "";
        for(Procedimento procedimento: procedimentos){
            int i = 0;
            procedimentosFeitos +=  i + " - "+procedimento.getTipoProcedimento()+" - "+procedimento.getCusto()+"\n";
            i++;
        }
        return "Consulta: "+this.codigo+ "\nAnimal: "+this.nomeAnimal+"\nMédico: "+this.nomeMedico+"\nValor: "+this.valor+"\nProcedimentos ---\n"+procedimentosFeitos+"Valor Total: "+calcularValorTotal()+"\n\n";
    }

}
