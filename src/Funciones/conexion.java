/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class conexion {
    static Connection conn;
    private static String bd="utilsoft";
    private static String login="root";
    private static String pass="";
    private static String host="localhost";

    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection aConn) {
        conn = aConn;
    }

    public static String getBd() {
        return bd;
    }

    public static void setBd(String aBd) {
        bd = aBd;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String aLogin) {
        login = aLogin;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String aPass) {
        pass = aPass;
    }

    public static String getHost() {
        return host;
    }

    public static void setHost(String aHost) {
        host = aHost;
    }
    

    public conexion() {
        
    }
    
     public boolean Conexion() throws ClassNotFoundException{
      
           
        try {
            String url="jdbc:mysql://"+host+"/"+bd;
           Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,login,pass);
            return true;
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);   
            return false;
        }

    }
     //cierra la conexion con la BASE DE DATOS//
      public void cierraConexion(){
       try {
           conn.close();
           
       } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
      

  
     
}
