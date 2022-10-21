import javax.swing.JOptionPane;

public class Hospital {
  public static void main(String[] main) {
    Consulta c = new Consulta();
    Medico m = new Medico();
    Pacienete p = new Pacienete();

    // input
    p.setNome(JOptionPane.showInputDialog("nome do paciente:"));
    m.setNome(JOptionPane.showInputDialog("nome do medico:"));
    m.setCrm(Integer.parseInt(JOptionPane.showInputDialog("digite o crm do médico")));
    
    // print
    JOptionPane.showMessageDialog(null, 
    "O(a) paciente " + p.getNome() + " , terá uma consulta no dia "+ c.getData() + " com o médico "+m.getNome()+ " crm: "+m.getCrm()
    );
  }
}
