/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in  the editor.
 */
package Vistas;

import Funciones.Config;
import Funciones.conexion;
import Funciones.sentencias;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JInternalFrame.IS_MAXIMUM_PROPERTY;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class GestionProductos extends javax.swing.JFrame {
protected boolean iconable;
protected boolean closable;
protected boolean isMaximum;
conexion conn=new conexion();
Config conf=new Config();
sentencias sen=new sentencias();
    /**
     * Creates new form crearProveedor
     */
    public GestionProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
         conf.desTexto(new Object[]{txtCod,txtDes,txtCosto,txtPor,txtMayo,txtMino,txtStock,txtMarca});
         conf.desBoton(new Object[]{btnGrabarProducto,btnEditarProducto,btnEliminarProducto});
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        etiCodProducto = new javax.swing.JLabel();
        etiNomCobrador = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtDes = new javax.swing.JTextField();
        etiCodProducto2 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        etiCodProducto3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        etiCodProducto1 = new javax.swing.JLabel();
        etiNomCobrador1 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        etiCodProducto4 = new javax.swing.JLabel();
        etiCodProducto5 = new javax.swing.JLabel();
        txtMayo = new javax.swing.JTextField();
        txtMino = new javax.swing.JTextField();
        etiCodProducto6 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        comboFamilia = new javax.swing.JComboBox();
        txtPor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSalida = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnGrabarProducto = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnAgregarProveedor = new javax.swing.JButton();
        btnEditarProducto = new javax.swing.JButton();
        etiCodProducto7 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Raleway", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/producto.png"))); // NOI18N
        jLabel1.setText("GESTIÓN de PRODUCTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        jLabel2.setText("Buscar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 510, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Precio Unitario", "Stock"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 620, 250));

        etiCodProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiCodProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/cod.png"))); // NOI18N
        etiCodProducto.setText("Código");
        getContentPane().add(etiCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        etiNomCobrador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiNomCobrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/compraMenu.png"))); // NOI18N
        etiNomCobrador.setText("Descripción");
        getContentPane().add(etiNomCobrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        txtCod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 130, 30));

        txtDes.setFont(new java.awt.Font("Raleway", 3, 14)); // NOI18N
        getContentPane().add(txtDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 510, 30));

        etiCodProducto2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiCodProducto2.setText("Precio Costo");
        getContentPane().add(etiCodProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, 30));

        txtStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 40, 30));

        etiCodProducto3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiCodProducto3.setText("Porc. Venta ");
        getContentPane().add(etiCodProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 120, 30));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Informática", "Limpieza", "Comestibles", "Librería" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 270, 50));

        etiCodProducto1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiCodProducto1.setText("Existencia");
        getContentPane().add(etiCodProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        etiNomCobrador1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiNomCobrador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persons.png"))); // NOI18N
        etiNomCobrador1.setText("Proveedor");
        getContentPane().add(etiNomCobrador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, -1, -1));

        txtCosto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 130, 30));

        etiCodProducto4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiCodProducto4.setText("Mayorista");
        getContentPane().add(etiCodProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 100, 30));

        etiCodProducto5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiCodProducto5.setText("Minorista");
        getContentPane().add(etiCodProducto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, -1, 30));

        txtMayo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtMayo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 130, 30));

        txtMino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtMino, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, 120, 30));

        etiCodProducto6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiCodProducto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/codigoMenu.png"))); // NOI18N
        etiCodProducto6.setText("Familia");
        getContentPane().add(etiCodProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, -1, -1));

        txtMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 160, 30));

        getContentPane().add(comboFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 610, 60, 30));

        txtPor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 40, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N

        btnSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/exitMenu.png"))); // NOI18N
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        btnEliminarProducto.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        btnEliminarProducto.setText("ELIMINAR");
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnGrabarProducto.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        btnGrabarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGrabarProducto.setText("GRABAR");
        btnGrabarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGrabarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarProductoActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/CErrar2.png"))); // NOI18N
        btnCancel.setText("CANCELAR");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAgregarProveedor.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        btnAgregarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inserto.png"))); // NOI18N
        btnAgregarProveedor.setText("NUEVO");
        btnAgregarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProveedorActionPerformed(evt);
            }
        });

        btnEditarProducto.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        btnEditarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnEditarProducto.setText("EDITAR");
        btnEditarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGrabarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGrabarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 920, 110));

        etiCodProducto7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiCodProducto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/codigoMenu.png"))); // NOI18N
        etiCodProducto7.setText(" Marca");
        getContentPane().add(etiCodProducto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, -1, -1));

        getContentPane().add(comboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, 330, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        GestionProductos ge=new GestionProductos();
        ge.pack();
        ge.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnGrabarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGrabarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         try {
        if(!conn.Conexion()){
            conf.mensaje(2,"El Sistema comunica:", "No se puede acceder");
            System.exit(0);
        } else {
            conf.mensaje(3,"El Sistema comunica:", "Conectado");
        }
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GestionProductos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_formWindowOpened

    private void btnAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProveedorActionPerformed
         conf.habTexto(new Object[]{txtCod,txtDes,txtCosto,txtPor,txtMayo,txtMino,txtStock,txtMarca});
    }//GEN-LAST:event_btnAgregarProveedorActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        int mensaje= JOptionPane.showConfirmDialog(this,"¿Deseas cerrar esta ventana?","Salir",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if(mensaje == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnSalidaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProveedor;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnGrabarProducto;
    private javax.swing.JButton btnSalida;
    private javax.swing.JComboBox comboFamilia;
    private javax.swing.JComboBox comboProveedor;
    private javax.swing.JLabel etiCodProducto;
    private javax.swing.JLabel etiCodProducto1;
    private javax.swing.JLabel etiCodProducto2;
    private javax.swing.JLabel etiCodProducto3;
    private javax.swing.JLabel etiCodProducto4;
    private javax.swing.JLabel etiCodProducto5;
    private javax.swing.JLabel etiCodProducto6;
    private javax.swing.JLabel etiCodProducto7;
    private javax.swing.JLabel etiNomCobrador;
    private javax.swing.JLabel etiNomCobrador1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMayo;
    private javax.swing.JTextField txtMino;
    private javax.swing.JTextField txtPor;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

//    public void setIconifiable(boolean b) {
//        Boolean oldValue = iconable ? Boolean.TRUE : Boolean.FALSE;
//        Boolean newValue = b ? Boolean.TRUE : Boolean.FALSE;
//        iconable = b;
//        firePropertyChange("iconable", oldValue, newValue);
//    }
//        
//            public void setClosable(boolean b) {
//        Boolean oldValue = closable ? Boolean.TRUE : Boolean.FALSE;
//        Boolean newValue = b ? Boolean.TRUE : Boolean.FALSE;
//        closable = b;
//        firePropertyChange("closable", oldValue, newValue);
//    }
}