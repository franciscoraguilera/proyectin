/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;
import Vistas.GestionClientes;
import javax.swing.JTextField;

/**
 *
 * @author userpc
 */
public class Buscador {
    sentencias sen=new sentencias();
    Config conf= new Config();
    private JTextField codigo;
    private String tabla;
    private int cantidad;
    private String dato[];
    private String campo;
   
   public Buscador() {
       
    }
 public void cargarDatos(String[] titulos,String consultas,String[] dato,int cantidad,int tam[],String tabla, String campo){
 this.tabla=tabla;
 this.cantidad=cantidad;
 this.dato=dato;
 this.campo=campo;
    String consulta=consultas+this.tabla;
     
       
}
   
   
   
   
   
   
   
   
   
   
   
   
}
