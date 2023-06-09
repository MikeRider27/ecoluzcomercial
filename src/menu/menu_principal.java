/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import conexion.conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import movimiento_compra.ajustes;
import movimiento_compra.compra;
import movimiento_compra.notacredito;
import movimiento_compra.notaremision;
import movimiento_compra.ordencompra;
import movimiento_compra.pedido_compra;
import movimiento_ventas.Ventas;
import movimiento_ventas.apertura;
import movimiento_ventas.presupuest;
import referenciales.Articulos;
import referenciales.Bancos;
import referenciales.Caja;
import referenciales.Ciudad;
import referenciales.Clientes;
import referenciales.Impuesto;
import referenciales.Marca;

import referenciales.proveedores;
import referenciales.timbrado;
import reportes.informes;

//import referencia.mercaderia;
/**
 *
 * @author Javier
 */
public class menu_principal extends javax.swing.JFrame {
    
    conexion bd = new conexion();
    
    public menu_principal() {
        initComponents();
        bd.conecta();
        verficar_apertura();
        setTitle("ECOLUZ COMERCIAL");
        setExtendedState(MAXIMIZED_BOTH);
        setExtendedState(6);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        txtidusuario = new javax.swing.JTextField();
        txtidapertura = new javax.swing.JTextField();
        menubar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Principal");
        setIconImage(getIconImage());
        getContentPane().setLayout(null);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo.jpg"))); // NOI18N
        jcMousePanel1.setMaximumSize(getPreferredSize());
        jcMousePanel1.setMinimumSize(getMaximumSize());
        jcMousePanel1.setVisibleLogo(false);

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );

        getContentPane().add(jcMousePanel1);
        jcMousePanel1.setBounds(0, 0, 1370, 680);
        getContentPane().add(txtidusuario);
        txtidusuario.setBounds(330, 20, 120, 20);
        getContentPane().add(txtidapertura);
        txtidapertura.setBounds(480, 20, 130, 20);

        menubar.setBackground(new java.awt.Color(102, 102, 255));
        menubar.setBorder(null);
        menubar.setForeground(new java.awt.Color(0, 204, 204));

        jMenu1.setForeground(new java.awt.Color(0, 102, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/administrador.png"))); // NOI18N
        jMenu1.setText("Mant. y Seguridad");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(0, 255, 204));
        jMenuItem1.setForeground(new java.awt.Color(0, 153, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/Cliente.png"))); // NOI18N
        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setBackground(new java.awt.Color(0, 255, 204));
        jMenuItem2.setForeground(new java.awt.Color(0, 153, 255));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/proveedor.png"))); // NOI18N
        jMenuItem2.setText("Proveedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setBackground(new java.awt.Color(0, 255, 204));
        jMenuItem3.setForeground(new java.awt.Color(0, 153, 255));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/impuestos.png"))); // NOI18N
        jMenuItem3.setText("Timbrado");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenu6.setBackground(new java.awt.Color(0, 255, 204));
        jMenu6.setForeground(new java.awt.Color(0, 153, 255));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/articulos.png"))); // NOI18N
        jMenu6.setText("Articulos");

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setBackground(new java.awt.Color(0, 255, 204));
        jMenuItem16.setForeground(new java.awt.Color(0, 153, 255));
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/marcas.png"))); // NOI18N
        jMenuItem16.setText("Marca");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem16);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem17.setBackground(new java.awt.Color(0, 255, 204));
        jMenuItem17.setForeground(new java.awt.Color(0, 153, 255));
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/impuesto.png"))); // NOI18N
        jMenuItem17.setText("Impuesto");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setBackground(new java.awt.Color(0, 255, 204));
        jMenuItem4.setForeground(new java.awt.Color(0, 153, 255));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/articulos.png"))); // NOI18N
        jMenuItem4.setText("Productos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenu1.add(jMenu6);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem18.setBackground(new java.awt.Color(0, 255, 204));
        jMenuItem18.setForeground(new java.awt.Color(0, 153, 255));
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/bancos.png"))); // NOI18N
        jMenuItem18.setText("Bancos");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem18);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem19.setBackground(new java.awt.Color(0, 255, 204));
        jMenuItem19.setForeground(new java.awt.Color(0, 153, 255));
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/ciudad.png"))); // NOI18N
        jMenuItem19.setText("Ciudad");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem19);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem20.setBackground(new java.awt.Color(0, 255, 204));
        jMenuItem20.setForeground(new java.awt.Color(0, 153, 255));
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/caja.png"))); // NOI18N
        jMenuItem20.setText("Caja");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem20);

        menubar.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 153, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/movimientos.png"))); // NOI18N
        jMenu2.setText("Movimiento");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/ventas.png"))); // NOI18N
        jMenu4.setText("Gestion de Ventas");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/presupuesto.png"))); // NOI18N
        jMenuItem5.setText("Pedido Presupuesto");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/factura.png"))); // NOI18N
        jMenuItem6.setText("Factura");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/apertura.png"))); // NOI18N
        jMenuItem7.setText("Apertura - Cierre");
        jMenuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem7MouseClicked(evt);
            }
        });
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/informes.png"))); // NOI18N
        jMenuItem8.setText("Informe");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenu2.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/compras.png"))); // NOI18N
        jMenu5.setText("Gestion de Compras");

        jMenuItem9.setText("Pedido de Compra");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("Orden de Compra");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("Factura Compra");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Ajuste");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem13.setText("Nota de Remision");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setText("Nota de Credito");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Informe");
        jMenu5.add(jMenuItem15);

        jMenu2.add(jMenu5);

        menubar.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(0, 153, 204));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/info.png"))); // NOI18N
        jMenu3.setText("Ayuda");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        menubar.add(jMenu3);

        setJMenuBar(menubar);

        setSize(new java.awt.Dimension(1368, 861));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        try {
            Runtime.getRuntime().exec("hh.exe C:\\Utic\\Taller II\\Programacion\\ecoluzcomercial\\ayuda\\Ayuda.chm");
            //Runtime.getRuntime().exec("hh.exe F:/OfficeCommunicatorClient/src/resources/User Account HelpNew.chm");
            // TODO code application logic here
        } catch (Exception e) {
//             Logger.getLogger(ayuda.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Clientes().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       new proveedores().setVisible(true);
      
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new timbrado().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
        if (txtidapertura.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Realize Apertura de Caja");
            return;
        } else {
            new Ventas().setVisible(true);
            
        }

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseClicked

    }//GEN-LAST:event_jMenuItem7MouseClicked
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagen\\icon\\windows.png"));
        
        return retValue;
    }
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new apertura().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new presupuest().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        new Marca().setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        new Impuesto().setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new Articulos().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        new Bancos().setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        new Ciudad().setVisible(true);

    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        new Caja().setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new informes().setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new pedido_compra(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        new ordencompra(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        new compra(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        new ajustes(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        new notaremision(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        new notacredito(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

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
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    public static javax.swing.JMenuBar menubar;
    public static javax.swing.JTextField txtidapertura;
    public static javax.swing.JTextField txtidusuario;
    // End of variables declaration//GEN-END:variables

    private void verficar_apertura() {
        try {
            bd.statement = bd.conexion.createStatement();
            bd.resultado = bd.statement.executeQuery("SELECT id_apertura, id_estado\n"
                    + "  FROM apertura_cierre where id_estado = 1;");
            if (bd.resultado.next()) {
                menu_principal.txtidapertura.setText(bd.resultado.getString("id_apertura"));
            }
        } catch (SQLException ex) {
            System.out.println("error al recuperar apertura" + ex);
        }
        
    }
}
