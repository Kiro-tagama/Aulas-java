public class Calculadora {

  public int soma(int a, int b) {
    return a+b;
  }

  // sobrecarga
  public double soma(double a, double b) {
    return a+b;
  }

  // sobrecarga
  public int soma(String a, String b) {
    int n1 = Integer.parseInt(a);
    int n2 = Integer.parseInt(b);
    return n1+n2;
  }

  // sobrecarga
  public int soma(int a, int b, int c) {
    return a+b+c;
  }

  public int soma(String a, int b) {
    return Integer.parseInt(a)+b;
  }
  public int soma(int a, String b) {
    return a+Integer.parseInt(b);
  }
  

  /* */
  public int sub(int a, int b) {
    return a-b;
  }
  
  public int mult(int a, int b) {
    return a*b;
  }
  
  public int divi(int a, int b) {
    return a/b;
  }
}