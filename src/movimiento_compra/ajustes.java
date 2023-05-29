package movimiento_compra;

//import controlador.control_presupuesto;
import java.awt.event.KeyEvent;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import buscadores.Buscador_Presupuesto;
//import buscadores.buscador_cliente1;
//import buscadores.buscador_mercaderia1;
import java.sql.PreparedStatement;

public class ajustes extends javax.swing.JDialog {

//    //instanciamos para conectar con el controlador de presupuesto
//    control_presupuesto controlpresu;
//    //creamos una bandera para las acciones de los botones
//    String accion = "";
//    SimpleDateFormat fec = new SimpleDateFormat("dd/MM/yyyy"); //formato para fecha
//    DecimalFormat formateador = new DecimalFormat("#,##0"); //formato para separador de miles
    public static int bandera = 0;

    public ajustes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //instanciamos la conexion a la clase de control presupuesto
//        controlpresu = new control_presupuesto(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jcMousePanel3 = new jcMousePanel.jcMousePanel();
        jLabel17 = new javax.swing.JLabel();
        txtn1 = new javax.swing.JTextField();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        btagregar = new javax.swing.JButton();
        btquitar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalle = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnuevo = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2)));
        jPanel3.setLayout(null);

        jLabel13.setForeground(new java.awt.Color(0, 102, 153));
        jLabel13.setText("N°");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(40, 100, 30, 14);

        txtn.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtn.setForeground(new java.awt.Color(0, 153, 204));
        txtn.setEnabled(false);
        jPanel3.add(txtn);
        txtn.setBounds(120, 100, 80, 19);

        jLabel14.setForeground(new java.awt.Color(0, 102, 153));
        jLabel14.setText("Fecha");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(40, 70, 50, 14);

        txtfecha.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtfecha.setForeground(new java.awt.Color(0, 153, 204));
        txtfecha.setEnabled(false);
        jPanel3.add(txtfecha);
        txtfecha.setBounds(120, 70, 80, 19);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Ajuste de Mercaderias");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(40, 10, 220, 22);

        jcMousePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ajustes.jpg"))); // NOI18N
        jcMousePanel3.setVisibleLogo(false);
        jPanel3.add(jcMousePanel3);
        jcMousePanel3.setBounds(370, 10, 190, 140);

        jLabel17.setForeground(new java.awt.Color(0, 102, 153));
        jLabel17.setText("Observacion");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(40, 130, 90, 14);

        txtn1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtn1.setForeground(new java.awt.Color(0, 153, 204));
        txtn1.setEnabled(false);
        jPanel3.add(txtn1);
        txtn1.setBounds(120, 130, 150, 19);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 10, 590, 160);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);
        jcMousePanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2)));
        jPanel4.setEnabled(false);
        jPanel4.setLayout(null);

        jLabel15.setForeground(new java.awt.Color(0, 102, 153));
        jLabel15.setText("Codigo");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(100, 10, 60, 14);

        jLabel16.setForeground(new java.awt.Color(0, 102, 153));
        jLabel16.setText("Tipo ");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(460, 60, 80, 14);

        jLabel18.setForeground(new java.awt.Color(0, 102, 153));
        jLabel18.setText("Cantidad");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(190, 10, 70, 14);

        txtcodigo.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtcodigo.setForeground(new java.awt.Color(0, 51, 204));
        txtcodigo.setEnabled(false);
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });
        jPanel4.add(txtcodigo);
        txtcodigo.setBounds(90, 30, 60, 20);

        txtdescripcion.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtdescripcion.setForeground(new java.awt.Color(0, 51, 204));
        txtdescripcion.setEnabled(false);
        jPanel4.add(txtdescripcion);
        txtdescripcion.setBounds(390, 30, 100, 20);

        txtprecio.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtprecio.setForeground(new java.awt.Color(0, 51, 204));
        txtprecio.setEnabled(false);
        jPanel4.add(txtprecio);
        txtprecio.setBounds(310, 30, 70, 20);

        txtcantidad.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtcantidad.setForeground(new java.awt.Color(0, 51, 204));
        txtcantidad.setEnabled(false);
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        jPanel4.add(txtcantidad);
        txtcantidad.setBounds(180, 30, 70, 20);

        btagregar.setText("Agregar");
        btagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagregarActionPerformed(evt);
            }
        });
        jPanel4.add(btagregar);
        btagregar.setBounds(200, 70, 71, 23);

        btquitar.setText("Quitar");
        btquitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btquitarActionPerformed(evt);
            }
        });
        jPanel4.add(btquitar);
        btquitar.setBounds(280, 70, 70, 23);

        detalle.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2)));
        detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(detalle);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 550, 160);

        jLabel21.setForeground(new java.awt.Color(0, 102, 153));
        jLabel21.setText("Total");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(300, 280, 24, 14);

        txttotal.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        txttotal.setForeground(new java.awt.Color(0, 51, 204));
        txttotal.setText("0");
        txttotal.setEnabled(false);
        jPanel4.add(txttotal);
        txttotal.setBounds(410, 270, 160, 20);

        btnuevo.setBackground(new java.awt.Color(0, 0, 0));
        btnuevo.setForeground(new java.awt.Color(0, 102, 153));
        btnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/nuevo.png"))); // NOI18N
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });
        jPanel4.add(btnuevo);
        btnuevo.setBounds(80, 320, 80, 30);

        btmodificar.setBackground(new java.awt.Color(0, 0, 0));
        btmodificar.setForeground(new java.awt.Color(0, 102, 153));
        btmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/editar.png"))); // NOI18N
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });
        jPanel4.add(btmodificar);
        btmodificar.setBounds(350, 320, 80, 30);

        bteliminar.setBackground(new java.awt.Color(0, 0, 0));
        bteliminar.setForeground(new java.awt.Color(0, 102, 153));
        bteliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/borrar.png"))); // NOI18N
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        jPanel4.add(bteliminar);
        bteliminar.setBounds(170, 320, 80, 30);

        btguardar.setBackground(new java.awt.Color(0, 0, 0));
        btguardar.setForeground(new java.awt.Color(0, 102, 153));
        btguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/Save.png"))); // NOI18N
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        jPanel4.add(btguardar);
        btguardar.setBounds(260, 320, 80, 30);

        btcancelar.setBackground(new java.awt.Color(0, 0, 0));
        btcancelar.setForeground(new java.awt.Color(0, 102, 153));
        btcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/cancelar.png"))); // NOI18N
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });
        jPanel4.add(btcancelar);
        btcancelar.setBounds(440, 320, 80, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vencimiento", "Fallla" }));
        jPanel4.add(jComboBox1);
        jComboBox1.setBounds(440, 80, 110, 20);

        jLabel19.setForeground(new java.awt.Color(0, 102, 153));
        jLabel19.setText("Deposito");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(350, 10, 80, 14);

        jcMousePanel1.add(jPanel4);
        jPanel4.setBounds(10, 170, 590, 370);

        getContentPane().add(jcMousePanel1);
        jcMousePanel1.setBounds(0, 0, 620, 690);

        setSize(new java.awt.Dimension(626, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            btagregar.setEnabled(true);
//            if (txtcodigo.getText().isEmpty()) {
//                //utilizamos bandera para el inicio y cierre de formulario
//                bandera = 1;
//                new buscador_mercaderia1(null, true).setVisible(true);
//                bandera = 0;
//            } else {
//                controlpresu.recuperar_mercaderia();
//            }
//        }
    }//GEN-LAST:event_txtcodigoKeyPressed

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
//        if (Character.isDigit(evt.getKeyChar()) == false) {
//            evt.consume();
//        }
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtcantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            btagregar.doClick();  //va sobre el boton aceptar
//            btguardar.setEnabled(true);
//        }
    }//GEN-LAST:event_txtcantidadKeyPressed

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
//        if (Character.isDigit(evt.getKeyChar()) == false) {
//            evt.consume();
//        }
//        if (txtcantidad.getText().length() > 2) {  //ingresa hasta 4 digitos
//            evt.consume();
//
//        }
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void btagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagregarActionPerformed
//        if (txtcodigo.getText().trim().isEmpty()) {  //si el campo esta vacio
//            JOptionPane.showMessageDialog(null, "El campo esta vacio", "Error", JOptionPane.INFORMATION_MESSAGE);
//            txtcodigo.requestFocus();
//            return;
//        }
//        if (txtcantidad.getText().trim().isEmpty() || Integer.parseInt(txtcantidad.getText().trim()) <= 0) {
//            JOptionPane.showMessageDialog(null, "Verifique los datos", "Error", JOptionPane.INFORMATION_MESSAGE);
//            txtcantidad.requestFocus();
//            return;
//        }
//        controlpresu.cargar_boton();
    }//GEN-LAST:event_btagregarActionPerformed

    private void btquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btquitarActionPerformed
//        controlpresu.quitar_boton();
    }//GEN-LAST:event_btquitarActionPerformed

    private void detalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detalleMouseClicked
//        btquitar.setEnabled(true);
    }//GEN-LAST:event_detalleMouseClicked

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
//        txtfecha.setText(fec.format(new Date()));
//        btcancelar.doClick();
//        btcancelar.setEnabled(true);
//        accion = "nuevo";
//        controlpresu.autonumerico();
//        txtidempleado.setText(menu.txtid.getText());
//        txtempleado.setText(menu.txtusuario.getText());
////        controlpresu.limpiarcamposnuevo();
//        controlpresu.habilitarcampos();
//        txtidcliente.requestFocus();
//        controlpresu.habilitarbotonesnuevo();
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
//        new Buscador_Presupuesto(null, true).setVisible(true);
//        if (!txtn.getText().isEmpty()) {   //!=significa distinto a vacio
//            //recuperamos los datos de la vista
//            controlpresu.modificar();
//            accion = "modificar";
//            controlpresu.deshabilitarbotones();
//            controlpresu.habilitarcampos();
//            btcancelar.setEnabled(true);
//            txtidcliente.setEnabled(true);
//            txtidcliente.requestFocus();
//            btguardar.setEnabled(true);
//        }
    }//GEN-LAST:event_btmodificarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed

        
//            new Buscador_Presupuesto(null, true).setVisible(true);
//
//            if (!txtn.getText().isEmpty()) {
//                    controlpresu.modificar();
//            }
////
//            controlpresu.anular_presupuesto();
        
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
//        if (detalle.getRowCount() == 0) {
//            JOptionPane.showMessageDialog(null, "Verifique los datos", "Atencion", JOptionPane.QUESTION_MESSAGE);
//            return;
//        }
//        int mensaje = JOptionPane.showConfirmDialog(null, "Desea Guardar", "Atencion", JOptionPane.YES_NO_OPTION);
//        if (mensaje == JOptionPane.YES_OPTION) {
//            grabar();
//        }
    }//GEN-LAST:event_btguardarActionPerformed
    public void grabar() {
//        if (accion.equals("nuevo")) {
//            controlpresu.insertar();
//            btcancelar.doClick();
//
//        } else {
//            controlpresu.eliminar();
//            controlpresu.insertar();
//        }
//
//        btcancelar.doClick();

    }

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
//        accion = "";
//        controlpresu.habilitarbotones();
//        controlpresu.deshabilitarcampos();
//        btcancelar.setEnabled(false);
//        btagregar.setEnabled(false);
//        btquitar.setEnabled(false);
//        controlpresu.limpiarcampos();
//        DefaultTableModel tab = (DefaultTableModel) detalle.getModel();
//        tab.setRowCount(0);   //limpiamos las filas a cero
//        txttotal.setText("0");
    }//GEN-LAST:event_btcancelarActionPerformed

    private String convertir_fecha(String fecha) {
        // 25-08-2016
//        String dia = "", mes = "", anho = "";
//        dia = fecha.substring(0, 2);
//        mes = fecha.substring(3, 5);
//        anho = fecha.substring(6, 10);
//        fecha = anho + "-" + mes + "-" + dia;
//
        return fecha;
    }

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
            java.util.logging.Logger.getLogger(ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ajustes dialog = new ajustes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btagregar;
    public javax.swing.JButton btcancelar;
    public javax.swing.JButton bteliminar;
    public static javax.swing.JButton btguardar;
    public javax.swing.JButton btmodificar;
    public javax.swing.JButton btnuevo;
    public javax.swing.JButton btquitar;
    public javax.swing.JTable detalle;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel3;
    public static javax.swing.JTextField txtcantidad;
    public static javax.swing.JTextField txtcodigo;
    public static javax.swing.JTextField txtdescripcion;
    public javax.swing.JTextField txtfecha;
    public static javax.swing.JTextField txtn;
    public static javax.swing.JTextField txtn1;
    public static javax.swing.JTextField txtprecio;
    public javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

}
