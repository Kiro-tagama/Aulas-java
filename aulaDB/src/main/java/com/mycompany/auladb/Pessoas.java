/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.auladb;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author kiro
 */
public class Pessoas {
    private int id;
    private String nome,fone,email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void inserir(){
        //1: Definir o comando SQL
        String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?,?,?)";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        
        try(Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            
            ps.execute();
            
        }catch(Exception e){
            
        }

    }
}
