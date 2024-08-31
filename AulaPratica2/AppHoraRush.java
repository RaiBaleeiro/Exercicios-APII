
public class AppHoraRush
{
    public static void main(String[] args)
    {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.codigo='A';
        veiculo1.cor="azul";
        veiculo1.tipo="ônibus";
        veiculo1.frente(3);

        System.out.println("Veiculo "+ veiculo1.codigo + " - posição: " + veiculo1.posicao);




    }
    
}
