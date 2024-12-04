package Exercicios.tributos;

import java.util.ArrayList;
import java.util.List;

public class CalculaTributo {
    private List<ITributavel> tributaveis;

    public CalculaTributo() {
        this.tributaveis = new ArrayList<>();
    }

    public void adicionarTributo(ITributavel tributavel) {
        tributaveis.add(tributavel);
    }

    public double calculaTotalTributo() {
        double total = 0;
        for (ITributavel tributavel : tributaveis) {
            total += tributavel.getValorImposto();
        }
        return total;
    }
}