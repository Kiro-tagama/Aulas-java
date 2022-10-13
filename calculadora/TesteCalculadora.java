import javax.swing.JOptionPane;

public class TesteCalculadora {
  public static void main(String[] args) {
    Calculadora c = new Calculadora();

    int option = Integer.parseInt(JOptionPane.showInputDialog("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão"));

    int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
    int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

    int resultado;

    if (option == 1) {
      resultado = c.soma(a, b);
    }else if (option == 2) {
      resultado = c.sub(a, b);
    }else if (option == 3) {
      resultado = c.mult(a, b);
    }else{
      resultado = c.divi(a, b);
    }

    JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
  }  
}
