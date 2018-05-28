/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NKNM
 */
public class DatabaseConnection {
    
    public final static int OK = 1;
    public final static int NOT_OK = 0;
    public final static int CHAVE_DUPLICADA = 2;
    public final static int CONSULTA = 1;
    public final static int EDITA = 2;
    public final static int APAGA = 3;
    
    private Connection cn;
    private Statement st;
    private String db;
    private int estado;
    
    
    public DatabaseConnection(String db){
        this.db = db;
    }
    
    public void ligar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.db, "root", "root");
            this.st = cn.createStatement();
            
            this.estado = OK;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            this.estado = NOT_OK;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            this.estado = NOT_OK;
        }
    }
    
        public void executaSQL(String sql){
        try {
            this.st.executeUpdate(sql);
            this.estado = OK;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            if(ex.getErrorCode() == 1583){
                this.estado = CHAVE_DUPLICADA;
            }
            else{
                this.estado = NOT_OK;
            }
        }
    }
        
    public void desligar(){
        if(this.cn != null){
            try {
                this.cn.close();
                this.estado = OK;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
                this.estado = NOT_OK;
            }
        }
    }

    public int getEstado() {return estado;}
    public void setEstado(int estado) {this.estado = estado;}
}
