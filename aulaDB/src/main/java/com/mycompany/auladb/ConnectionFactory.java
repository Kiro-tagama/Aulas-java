package com.mycompany.auladb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
  private String usuario = "rodrigo";
  private String senha = "123456";

  public Connection obtemConexao(){
    try {
      Connection c= DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/db_pessoas", 
        usuario, senha);
      return c;
    } catch (SQLException e) {
        System.out.println(e);
      return null;
    }
  }
}
