package Exercicios.tributos;

public interface ITributavel {
    String getTipoImposto(); // Tipo de imposto (ex.: ICMS, ISS, IPTU, etc.)
    double getAliquota(); // Alíquota do imposto
    double getValorImposto(); // Valor do imposto
}