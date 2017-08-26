/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class sentencias extends conexion{//herencia
    ResultSet rs = null;//objeto para guardar los 
    //resultados de la consulta
    Statement query;//objeto para ejecutar
    //una sentencia, enviar datos para consulta
    public sentencias(){//constructor
        super();//constructor de la clase padre 
        //conexion
    }
   /////realizar consultas a la base de datos
   public ResultSet consultas(String sql){
        try {
            query = conn.createStatement();
            rs=query.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    } 
  
//    public void CargaCombos( String des,String tabla, JComboBox combo) throws SQLException{
//        String sql = ("SELECT "+des+" AS resultado FROM "+tabla+"");
//       query = conn.createStatement();
//        rs=query.executeQuery(sql);
//         while(rs.next()){
//           combo.addItem(rs.getString(1));
//      }
//    }
      //   metodo para cargar las tablas que recibe 5 parametros
      public void CargaTabla(JTable tablanombre, String titulo[],String consul,String datos[],
              int can){
        try {
           //modelo para la tabla(importamos)y le agregamos los titulos(vector de cadenas)
            DefaultTableModel tabla = new DefaultTableModel(null,titulo);
            query = conn.createStatement();//creamos una conexion con la variable conn
            rs=query.executeQuery(consul);//realizamos la consulta, es decir lo que contiene consul
            String filadatos[]= new String[can];//un vector de datos de tipo cadena, el tamaño
            //esta definido por los campos de la base de datos(Alumno)
            while(rs.next()){//mientras tenga datos
                for(int i=0; i<can;i++){//recorrer las filas de la base de datos
                    filadatos[i]=rs.getString(datos[i]);//agregamos a filadatos y datos[i]
                    //contiene los nombres de los campos de la base de datos
                }
                tabla.addRow(filadatos);//agregamos el vector al modelo(tabla)
            }
            tablanombre.setModel(tabla);//y el modelo(tabla) lo agregamos(setModel) a la tabla
        } catch (SQLException ex) {
            Logger.getLogger(sentencias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        //   modificamos las tablas
   
    
    //   realizar el registro de un nuevo dato
   public boolean ejecutarInser(String sql){
        try {//capturamos las exepciones
            Statement stmt;//objeto para crear la directiva 
                  stmt=conn.createStatement();//usamos la conexion para crear una sentencia
                    stmt.executeUpdate(sql);//usamos el metodo executeUpdate()la para ejecutar la sentencia sql
                 return true;
        } catch (SQLException ex) {//captura si existe un error
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        }
   }
   public void ejecutarInserDet(String sql){
        try {//capturamos las exepciones
            Statement stmt;//objeto para crear la directiva 
                  stmt=conn.createStatement();//usamos la conexion para crear una sentencia
                    stmt.executeUpdate(sql);//usamos el metodo executeUpdate()la para ejecutar la sentencia sql
                   JOptionPane.showMessageDialog(null,"Grabado realizado con exito");//mensaje si fue exitoso
        } catch (SQLException ex) {//captura si existe un error
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"Error...Verifique");//lanzamos un mensasje de alerta
        }
   }
   
     //   modifica un registro 
    public void ejecutarModif(String sql){
        try {
            Statement stmt;//objeto para crear la directiva  
                  stmt=conn.createStatement();
                   stmt.executeUpdate(sql);
                   JOptionPane.showMessageDialog(null,"Modificado realizado con exito");
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"Error...Verifique");
        }
   }
     //   elimina un registro
    public void ejecutarBorrad(String sql){
        try {
            Statement stmt;
                  stmt=conn.createStatement();
                  //graba en la cabecera
                   stmt.executeUpdate(sql);
                   JOptionPane.showMessageDialog(null,"Borrado realizado con exito");
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"Error...Verifique");
        }
   }
    
        public String fecha_servidor() throws SQLException{
            String fechaSer = "", fecha = "";
            String consultaSQL = ("select current_date as fecha");
            query = conn.createStatement();
            rs=query.executeQuery(consultaSQL);              
            if (rs.next()) { 
                  fechaSer = rs.getString("fecha");       
                } 
             String año=fechaSer.substring(0,4);
             String mes=fechaSer.substring(5,7);
              String dia=fechaSer.substring(8,10);
              fecha=(dia+"/"+mes+"/"+año);
           return fecha;
        }
}