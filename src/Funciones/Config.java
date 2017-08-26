package Funciones;


import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *

import javax.swing.JButton;


/**
 *
 * @author federico
 */
public class Config {
       JButton boton = null;
       JLabel etiqueta;
       JTextField campo;
       
    public Config(){
        
    }
    public void habBoton(Object botones[]){       
       for(int i=0;i<botones.length;i++){
            boton=(JButton) botones[i];
            boton.setEnabled(true);
        }
    }
    public void desBoton(Object botones[]){       
       for(int i=0;i<botones.length;i++){
            boton=(JButton) botones[i];
            boton.setEnabled(false);
        }
    }
    public void limpiarTexto(Object textos[]){       
       for(int i=0;i<textos.length;i++){
            campo=(JTextField) textos[i];
            campo.setText("");
        }
    }
     public void habTexto(Object textos[]){       
       for(int i=0;i<textos.length;i++){
            campo=(JTextField) textos[i];
            campo.setEnabled(true);
        }
    }
      public void desTexto(Object textos[]){       
       for(int i=0;i<textos.length;i++){
            campo=(JTextField) textos[i];
            campo.setEnabled(false);
        }
    }
     
    public void mensaje(int tipo, String titulo, 
            String mensaje){
        switch(tipo){
        case 1:
        JOptionPane.showMessageDialog(null, 
             mensaje,titulo,JOptionPane.WARNING_MESSAGE);
        break;
        case 2:
        JOptionPane.showMessageDialog(null, 
                mensaje,titulo,JOptionPane.ERROR_MESSAGE);
        break;
        case 3:
        JOptionPane.showMessageDialog(null, 
          mensaje,titulo,JOptionPane.INFORMATION_MESSAGE);
        break;
        case 4:
        JOptionPane.showMessageDialog(null,
            mensaje,titulo,JOptionPane.QUESTION_MESSAGE);
        break;
    }
        
}
    public void confBoton(String texto, String tip,JButton boton){
    boton.setText(texto);
    boton.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
   boton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    boton.setToolTipText(tip);
}
     public void TamañoTabla(JTable tablanombre,int tam[]){   
    for(int i=0; i<tablanombre.getColumnCount();i++){
         tablanombre.getColumnModel().getColumn(i).setPreferredWidth(tam[i]);
        tablanombre.getColumnModel().getColumn(i).setMinWidth(tam[i]);
        tablanombre.getColumnModel().getColumn(i).setMaxWidth(tam[i]);
    }
    }
          public boolean mensajeResp( String mensaje,String titulo ){
         int res =JOptionPane.showConfirmDialog(null,mensaje,titulo,
                 JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE);
           return res==0;
     }
    
}