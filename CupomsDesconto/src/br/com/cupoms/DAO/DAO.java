
package br.com.cupoms.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class DAO {
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    protected PreparedStatement stmt;
    protected Connection conn;
    
    
    public DAO(){
        this.servidor = "localhost:3306";
        this.banco = "dbcupom";
        this.usuario = "root";
        this.senha = "";
    }
    
    public void conectar (){
        String url = "jdbc:mysql://"+servidor+"/"+banco;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = (Connection) DriverManager.getConnection(url,usuario,senha);
        } catch(ClassNotFoundException|SQLException ex){
            System.out.println("Erro ao conectar "+ex.getMessage());
        }
        
    }


}

