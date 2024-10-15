
import java.util.ArrayList;

public class Consulta {
    private int codigo;
    private String nomeAnimal;
    private String nomeMedico;
    private String dataConsulta;
    private double valor;
    private ArrayList<Procedimento> procedimentos = new ArrayList<>();

    public Consulta(int codigo, String nomeAnimal, String nomeMedico, String dataConsulta, double valor){
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.nomeMedico = nomeMedico;
        this.dataConsulta = dataConsulta;
        this.valor = valor;
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public void setProcedimentos(ArrayList<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    

}
