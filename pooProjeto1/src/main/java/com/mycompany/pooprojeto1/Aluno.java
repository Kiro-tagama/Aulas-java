package com.mycompany.pooprojeto1;

public class Aluno {
    
    String ra,nome,email,curso;
    
    String[] alunos;
    
    public void pagar(){
        
    }
    
    public void exibirDados(){
        System.out.println(
        ra+'\n'+nome+'\n'+email+'\n'+curso
        );
    }
    
    public void acessarAula(){
       System.out.println("aluno: "+nome);
       System.out.println("curso: "+curso);
    }
        
}
