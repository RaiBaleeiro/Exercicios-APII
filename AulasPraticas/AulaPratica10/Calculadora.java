package AulaPratica10;

public class Calculadora {
    
// método somar
public double somar (int n1, int n2){
    return n1+n2;
    }
    // método subtrair
    public double subtrair (int n1, int n2){
    return n1-n2;
    }
    // método multiplicar
    public double multiplicar (int n1, int n2){
    return n1*n2;
    }
    // método dividir
    public double dividir (int n1, int n2) {
        if (n2 ==0){
        throw new ArithmeticException("Divisão por zero");
        }
        else
        return n1/n2;
        }
}