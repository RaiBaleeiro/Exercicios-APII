import javax.swing.JOptionPane;
public class Questao9{
public static void main(String[] args) {
String nome, num1, num2;
nome = JOptionPane.showInputDialog("Digite o nome");
num1 = JOptionPane.showInputDialog("Digite um número inteiro");
num2 = JOptionPane.showInputDialog("Digite um número real");
int numInt = Integer.parseInt(num1);
double numDouble = Double.parseDouble(num2);
JOptionPane.showMessageDialog(null, nome);
JOptionPane.showMessageDialog(null, "A soma dos números é: "
+ (numInt+numDouble));
}
}