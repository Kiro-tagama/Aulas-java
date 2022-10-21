/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.auladb;

import javax.swing.JOptionPane;

/**
 *
 * @author kiro
 */
public class AulaDB {

    public static void main(String[] args) {
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int op;
        do{
           op = Integer.parseInt(JOptionPane.showInputDialog(menu));
           switch (op){
             case 1: {
               cadastrar();
               break;
             }
             case 2:
               break;
             case 3:
               break;
             case 4:
               break;
             case 0:
               break;
             default:
               JOptionPane.showMessageDialog(null, "Opção inválida");
           }
        }while(op !=0);

    }
    
    public static void cadastrar(){
        String nome = JOptionPane.showInputDialog("Nome?");
        String fone = JOptionPane.showInputDialog("Fone?");
        String email = JOptionPane.showInputDialog("Email?");
        Pessoas p = new Pessoas();
        p.setNome(nome);
        p.setFone(fone);
        p.setEmail(email);
        p.inserir();
    }
}
