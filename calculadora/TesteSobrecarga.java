public class TesteSobrecarga {
  public static void main(String[] args) {
    Calculadora c= new Calculadora();
    
    int x=1, y=2, z=3;
    String s1="50", s2="60";
    double f1=56.7, f2=0.3;

    System.out.printf("%.2f%n",c.soma(f1, f2));

    System.out.println(c.soma(x, y));
    System.out.println(c.soma(x, s1));
    System.out.println(c.soma(s2, y));
    System.out.println(c.soma(s1, s2));
    System.out.println(c.soma(x, y, z));
  }
}
