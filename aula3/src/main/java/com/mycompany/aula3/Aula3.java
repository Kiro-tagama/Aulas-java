package com.mycompany.aula3;

import javax.swing.JOptionPane;

public class Aula3 {

    public static void main(String[] args) {
        int nota=9;
        
        /*
        if( nota >6){
            JOptionPane.showMessageDialog(null, "bom"); 
        }else{
            System.out.println("ruim");
        }
        */
        
        switch(nota){
        case 10 -> System.out.println("10");
        case 9-> System.out.println("9");
        case 8-> System.out.println("8");
        case 7-> System.out.println("7");
        default -> System.out.println("triste");
        }
    }

    
}
