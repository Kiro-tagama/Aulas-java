package com.mycompany.repeticao;

public class Repeticao {

    public static void main(String[] args) {
        int contador=1;
        
        while(contador<=20){
            if(contador%2 == 0){
                 System.out.println(contador);
            }else{}
            contador++;
        }
        
        /*
        do{
            System.out.println(contador);
            contador++;
        }while(contador<=5);
        */
        
        /*
        for(contador=1; contador<=5; contador++){
            System.out.println(contador);
        }
        */
        
    }
}
