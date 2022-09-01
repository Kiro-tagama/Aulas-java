package com.mycompany.aula2;

import javax.swing.JOptionPane;

public class Aula2 {

    public static void main(String[] args) {
        /*
        double value1, value2, result;
                
        value1= Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro valor: "));       
        value2= Double.parseDouble(JOptionPane.showInputDialog("digite o segundo valor: "));
        
        result = value1 + value2;
        
        //System.out.println("o resultado é: "+result);
        
        JOptionPane.showMessageDialog(null, "resultado = "+ result);
        */
        
        // def 1
        /*
        double dolar, value;
                
        dolar= Double.parseDouble(JOptionPane.showInputDialog("digite o cotação do dolar valor: "));       
        value= Double.parseDouble(JOptionPane.showInputDialog("digite o  valor em dolar a ser convertido: "));
        
        
        JOptionPane.showMessageDialog(null, "conversão para real: "+ dolar*value);
        */
        
        // def 2
        /*
        double v1, v2, v3, v4;
                
        v1= Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro valor: "));       
        v2= Double.parseDouble(JOptionPane.showInputDialog("digite o segundo valor: "));
        v3= Double.parseDouble(JOptionPane.showInputDialog("digite o terceiro valor: "));
        v4= Double.parseDouble(JOptionPane.showInputDialog("digite o quarto valor: "));

        v1= v1*v1;
        v2= v2*v2;
        v3= v3*v3;
        v4= v4*v4;

        
        //System.out.println("o resultado é: "+result);
        
        JOptionPane.showMessageDialog(null, 
                "resultado 1 = "+ v1+"\n"+
                "resultado 2 = "+ v2+"\n"+
                "resultado 3 = "+ v3+"\n"+
                "resultado 4 = "+ v4+"\n"+
                "Resultado final = "+ ( v1+v2+v3+v4)
         );
         */
        
        // def 3
        /*
        double v1, v2, res;
                
        v1= Double.parseDouble(JOptionPane.showInputDialog("digite o peça: "));       
        v2= Double.parseDouble(JOptionPane.showInputDialog("digite o quantidade: "));
        res=v1*v2;
        JOptionPane.showMessageDialog(null, "5% de "+res+" é de: "+res*0.05  );
        */
        
        // def 4
        /*
        int value;
        value= Integer.parseInt(JOptionPane.showInputDialog("digite o valor: "));  
        JOptionPane.showMessageDialog(null, "antecessor:  "+(value-1) );
        */
        
        // def 5
        /*
        double v1, v2, res;
                
        v1= Double.parseDouble(JOptionPane.showInputDialog("digite o altura: "));       
        v2= Double.parseDouble(JOptionPane.showInputDialog("digite o base: "));
        res=v1*v2;
        JOptionPane.showMessageDialog(null, "area de "+res+"m²" );
        */
        
        //def 6
        /*
        int v1;
        v1= Integer.parseInt(JOptionPane.showInputDialog("digite tua idade:"));
        JOptionPane.showMessageDialog(null, "dias conforme a idade"+v1*365);
        */
        
        //def 7
        /*
        int v1;
        v1= Integer.parseInt(JOptionPane.showInputDialog("digite tua idade:"));
        JOptionPane.showMessageDialog(null, "dias conforme a idade "+v1*365+"\ne meses "+v1*30);
        */
        
        //def 8
        /*
        int brancos,nulos,validos,total;
        brancos= Integer.parseInt(JOptionPane.showInputDialog("digite o brancos: "));       
        nulos= Integer.parseInt(JOptionPane.showInputDialog("digite o nulos: "));
        validos= Integer.parseInt(JOptionPane.showInputDialog("digite o validos: "));
        
        total = brancos+nulos+validos;
        
        JOptionPane.showMessageDialog(null, 
                "total: "+total+"\n"+
                "brancos: "+((brancos*100)/total)+"%\n"+
                "nulos: "+((nulos*100)/total)+"%\n"+
                "validos: "+((validos*100)/total)+"%\n"
        );
        */
        
        //def 9
        /*
        double v1, v2, res;
                
        v1= Double.parseDouble(JOptionPane.showInputDialog("digite o salario: "));       
        v2= Double.parseDouble(JOptionPane.showInputDialog("digite o valor do rajuste:  ex: 10 ref a 10% (somente o numero) "));
        res=v1*(v2/100);
        JOptionPane.showMessageDialog(null, "reajuste" + (v1+res) );
        */
        
        //def 10
        /*
        double v1, distr, imposto;
        v1= Double.parseDouble(JOptionPane.showInputDialog("digite o valor do veiculo: "));       
        distr=v1*0.28;        imposto=v1*0.45;
        JOptionPane.showMessageDialog(null,
                "valor: "+v1+"\n"+
                "distribuidor: "+distr+"\nimposto: "+imposto+"\n"+
                "total: "+(v1+distr+imposto)
         );
         */
        
        //def 11
        /*
        double v1, v2, v3, v4;
                
        v1= Double.parseDouble(JOptionPane.showInputDialog("digite o quantidade de carros: "));       
        v2= Double.parseDouble(JOptionPane.showInputDialog("digite o total de vendas: "));
        v3= Double.parseDouble(JOptionPane.showInputDialog("digite o salario fixo: "));
        
        // 5% da venda total vezes cada carro
        v4=(v2*0.05)*v1;
        
        JOptionPane.showMessageDialog(null, 
                "quantidade de carros = "+ v1+"\n"+
                "total venda = "+ v2+"\n"+
                "salario = "+ v3+"\n"+
                "5% da venda multi. quantidade de vendas = "+ v4+"\n"+
                "Resultado final = "+ (v3+v4)
         );
        */
    }
}
