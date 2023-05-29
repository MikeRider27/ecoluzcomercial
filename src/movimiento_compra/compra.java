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

public class compra extends javax.swing.JDialog {

//    //instanciamos para conectar con el controlador de presupuesto
//    control_presupuesto controlpresu;
//    //creamos una bandera para las acciones de los botones
//    String accion = "";
//    SimpleDateFormat fec = new SimpleDateFormat("dd/MM/yyyy"); //formato para fecha
//    DecimalFormat formateador = new DecimalFormat("#,##0"); //formato para separador de miles
    public static int bandera = 0;

    public compra(java.awt.Frame parent, boolean modal) {
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
        jLabel31 = new javax.swing.JLabel();
        txtfecha1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        credito = new javax.swing.JRadioButton();
        contado = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtfecha2 = new javax.swing.JTextField();
        jcMousePanel3 = new jcMousePanel.jcMousePanel();
        jLabel34 = new javax.swing.JLabel();
        txtfecha3 = new javax.swing.JTextField();
        txtfecha4 = new javax.swing.JTextField();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalle = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtsub5 = new javax.swing.JTextField();
        txtiva5 = new javax.swing.JTextField();
        txtiva10 = new javax.swing.JTextField();
        txtexenta = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtsub10 = new javax.swing.JTextField();
        btnuevo = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtcodigo1 = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        btagregar = new javax.swing.JButton();
        btquitar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtprecio1 = new javax.swing.JTextField();
        txtprecio2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2)));
        jPanel3.setLayout(null);

        jLabel13.setForeground(new java.awt.Color(0, 102, 153));
        jLabel13.setText("Nº");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(10, 70, 60, 14);

        txtn.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtn.setForeground(new java.awt.Color(0, 153, 204));
        txtn.setEnabled(false);
        jPanel3.add(txtn);
        txtn.setBounds(90, 70, 80, 19);

        jLabel14.setForeground(new java.awt.Color(0, 102, 153));
        jLabel14.setText("Fecha");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(10, 100, 60, 14);

        txtfecha.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtfecha.setForeground(new java.awt.Color(0, 153, 204));
        txtfecha.setEnabled(false);
        jPanel3.add(txtfecha);
        txtfecha.setBounds(90, 100, 80, 19);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Factura Compra");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(220, 10, 190, 22);

        jLabel31.setForeground(new java.awt.Color(0, 102, 153));
        jLabel31.setText("Factura Nº");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(10, 160, 60, 14);

        txtfecha1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtfecha1.setForeground(new java.awt.Color(0, 153, 204));
        txtfecha1.setEnabled(false);
        jPanel3.add(txtfecha1);
        txtfecha1.setBounds(90, 160, 80, 19);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204))));
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Intervalo");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(110, 70, 60, 14);

        credito.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        credito.setText("CREDITO");
        credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditoActionPerformed(evt);
            }
        });
        jPanel5.add(credito);
        credito.setBounds(100, 30, 69, 21);

        contado.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        contado.setText("CONTADO");
        contado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contadoActionPerformed(evt);
            }
        });
        jPanel5.add(contado);
        contado.setBounds(10, 30, 75, 21);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Tipo de Compra");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(40, 10, 120, 14);
        jPanel5.add(jTextField1);
        jTextField1.setBounds(110, 90, 60, 20);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 153, 204));
        jLabel32.setText("Cuota");
        jPanel5.add(jLabel32);
        jLabel32.setBounds(20, 70, 50, 14);
        jPanel5.add(jTextField2);
        jTextField2.setBounds(10, 90, 60, 20);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(200, 60, 190, 120);

        jLabel33.setForeground(new java.awt.Color(0, 102, 153));
        jLabel33.setText("Nº Orden ");
        jPanel3.add(jLabel33);
        jLabel33.setBounds(10, 130, 60, 14);

        txtfecha2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtfecha2.setForeground(new java.awt.Color(0, 153, 204));
        txtfecha2.setEnabled(false);
        jPanel3.add(txtfecha2);
        txtfecha2.setBounds(90, 130, 80, 19);

        jcMousePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/compra.jpg"))); // NOI18N
        jcMousePanel3.setVisibleLogo(false);
        jPanel3.add(jcMousePanel3);
        jcMousePanel3.setBounds(400, 60, 180, 150);

        jLabel34.setForeground(new java.awt.Color(0, 102, 153));
        jLabel34.setText("Proveedor");
        jPanel3.add(jLabel34);
        jLabel34.setBounds(10, 190, 60, 14);

        txtfecha3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtfecha3.setForeground(new java.awt.Color(0, 153, 204));
        txtfecha3.setEnabled(false);
        jPanel3.add(txtfecha3);
        txtfecha3.setBounds(160, 190, 90, 19);

        txtfecha4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtfecha4.setForeground(new java.awt.Color(0, 153, 204));
        txtfecha4.setEnabled(false);
        jPanel3.add(txtfecha4);
        txtfecha4.setBounds(90, 190, 60, 19);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 10, 590, 240);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);
        jcMousePanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2)));
        jPanel4.setEnabled(false);
        jPanel4.setLayout(null);

        jLabel24.setText("Impuestos");
        jPanel4.add(jLabel24);
        jLabel24.setBounds(450, 80, 70, 14);

        detalle.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2)));
        detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Cantidad", "Precio", "5%", "10%", "Exenta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        jScrollPane1.setBounds(20, 100, 550, 160);

        jLabel19.setForeground(new java.awt.Color(0, 102, 153));
        jLabel19.setText("Sub total");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(250, 280, 80, 14);

        jLabel20.setForeground(new java.awt.Color(0, 102, 153));
        jLabel20.setText("Total Impuesto");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(50, 270, 72, 14);

        jLabel21.setForeground(new java.awt.Color(0, 102, 153));
        jLabel21.setText("Total");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(250, 310, 24, 14);

        txtsub5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        txtsub5.setForeground(new java.awt.Color(0, 51, 204));
        txtsub5.setText("0");
        txtsub5.setEnabled(false);
        jPanel4.add(txtsub5);
        txtsub5.setBounds(330, 270, 60, 20);

        txtiva5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        txtiva5.setForeground(new java.awt.Color(0, 51, 204));
        txtiva5.setText("0");
        txtiva5.setEnabled(false);
        jPanel4.add(txtiva5);
        txtiva5.setBounds(30, 310, 60, 20);

        txtiva10.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        txtiva10.setForeground(new java.awt.Color(0, 51, 204));
        txtiva10.setText("0");
        txtiva10.setEnabled(false);
        jPanel4.add(txtiva10);
        txtiva10.setBounds(120, 310, 80, 20);

        txtexenta.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        txtexenta.setForeground(new java.awt.Color(0, 51, 204));
        txtexenta.setText("0");
        txtexenta.setEnabled(false);
        jPanel4.add(txtexenta);
        txtexenta.setBounds(500, 270, 60, 20);

        txttotal.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        txttotal.setForeground(new java.awt.Color(0, 51, 204));
        txttotal.setText("0");
        txttotal.setEnabled(false);
        jPanel4.add(txttotal);
        txttotal.setBounds(390, 310, 140, 20);

        jLabel25.setText("5%");
        jPanel4.add(jLabel25);
        jLabel25.setBounds(50, 290, 50, 14);

        jLabel26.setText("10%");
        jPanel4.add(jLabel26);
        jLabel26.setBounds(140, 290, 60, 14);

        txtsub10.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        txtsub10.setForeground(new java.awt.Color(0, 51, 204));
        txtsub10.setText("0");
        txtsub10.setEnabled(false);
        jPanel4.add(txtsub10);
        txtsub10.setBounds(410, 270, 70, 20);

        btnuevo.setBackground(new java.awt.Color(0, 0, 0));
        btnuevo.setForeground(new java.awt.Color(0, 102, 153));
        btnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/nuevo.png"))); // NOI18N
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });
        jPanel4.add(btnuevo);
        btnuevo.setBounds(80, 350, 80, 30);

        btmodificar.setBackground(new java.awt.Color(0, 0, 0));
        btmodificar.setForeground(new java.awt.Color(0, 102, 153));
        btmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/editar.png"))); // NOI18N
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });
        jPanel4.add(btmodificar);
        btmodificar.setBounds(350, 350, 80, 30);

        bteliminar.setBackground(new java.awt.Color(0, 0, 0));
        bteliminar.setForeground(new java.awt.Color(0, 102, 153));
        bteliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/borrar.png"))); // NOI18N
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        jPanel4.add(bteliminar);
        bteliminar.setBounds(170, 350, 80, 30);

        btguardar.setBackground(new java.awt.Color(0, 0, 0));
        btguardar.setForeground(new java.awt.Color(0, 102, 153));
        btguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/Save.png"))); // NOI18N
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        jPanel4.add(btguardar);
        btguardar.setBounds(260, 350, 80, 30);

        btcancelar.setBackground(new java.awt.Color(0, 0, 0));
        btcancelar.setForeground(new java.awt.Color(0, 102, 153));
        btcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/cancelar.png"))); // NOI18N
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });
        jPanel4.add(btcancelar);
        btcancelar.setBounds(440, 350, 80, 30);

        jLabel15.setForeground(new java.awt.Color(0, 102, 153));
        jLabel15.setText("Codigo");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(30, 10, 70, 14);

        jLabel16.setForeground(new java.awt.Color(0, 102, 153));
        jLabel16.setText("Descripcion");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(130, 10, 90, 14);

        jLabel17.setForeground(new java.awt.Color(0, 102, 153));
        jLabel17.setText("Deposito");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(430, 10, 80, 14);

        jLabel18.setForeground(new java.awt.Color(0, 102, 153));
        jLabel18.setText("Cantidad");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(250, 10, 80, 14);

        txtcodigo1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtcodigo1.setForeground(new java.awt.Color(0, 51, 204));
        txtcodigo1.setEnabled(false);
        txtcodigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigo1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigo1KeyTyped(evt);
            }
        });
        jPanel4.add(txtcodigo1);
        txtcodigo1.setBounds(20, 30, 60, 20);

        txtdescripcion.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtdescripcion.setForeground(new java.awt.Color(0, 51, 204));
        txtdescripcion.setEnabled(false);
        jPanel4.add(txtdescripcion);
        txtdescripcion.setBounds(110, 30, 100, 20);

        txtprecio.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtprecio.setForeground(new java.awt.Color(0, 51, 204));
        txtprecio.setEnabled(false);
        jPanel4.add(txtprecio);
        txtprecio.setBounds(410, 30, 40, 20);

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
        txtcantidad.setBounds(240, 30, 60, 20);

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

        jLabel22.setForeground(new java.awt.Color(0, 102, 153));
        jLabel22.setText("Precio");
        jPanel4.add(jLabel22);
        jLabel22.setBounds(340, 10, 80, 14);

        txtprecio1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtprecio1.setForeground(new java.awt.Color(0, 51, 204));
        txtprecio1.setEnabled(false);
        jPanel4.add(txtprecio1);
        txtprecio1.setBounds(460, 30, 80, 20);

        txtprecio2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtprecio2.setForeground(new java.awt.Color(0, 51, 204));
        txtprecio2.setEnabled(false);
        jPanel4.add(txtprecio2);
        txtprecio2.setBounds(320, 30, 70, 20);

        jcMousePanel1.add(jPanel4);
        jPanel4.setBounds(10, 250, 590, 390);

        getContentPane().add(jcMousePanel1);
        jcMousePanel1.setBounds(0, 0, 610, 650);

        setSize(new java.awt.Dimension(620, 692));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditoActionPerformed
        //        tipo = "CREDITO";
        //        txtcondicion.setText("2");
    }//GEN-LAST:event_creditoActionPerformed

    private void contadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contadoActionPerformed
        //        tipo = "CONTADO";
        //        txtcondicion.setText("1");
    }//GEN-LAST:event_contadoActionPerformed

    private void txtcodigo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigo1KeyPressed
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
    }//GEN-LAST:event_txtcodigo1KeyPressed

    private void txtcodigo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigo1KeyTyped
        //        if (Character.isDigit(evt.getKeyChar()) == false) {
            //            evt.consume();
            //        }
    }//GEN-LAST:event_txtcodigo1KeyTyped

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
            java.util.logging.Logger.getLogger(compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                compra dialog = new compra(new javax.swing.JFrame(), true);
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
    public javax.swing.JRadioButton contado;
    public javax.swing.JRadioButton credito;
    public javax.swing.JTable detalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel3;
    public static javax.swing.JTextField txtcantidad;
    public static javax.swing.JTextField txtcodigo1;
    public static javax.swing.JTextField txtdescripcion;
    public javax.swing.JTextField txtexenta;
    public javax.swing.JTextField txtfecha;
    public javax.swing.JTextField txtfecha1;
    public javax.swing.JTextField txtfecha2;
    public javax.swing.JTextField txtfecha3;
    public javax.swing.JTextField txtfecha4;
    public javax.swing.JTextField txtiva10;
    public javax.swing.JTextField txtiva5;
    public static javax.swing.JTextField txtn;
    public static javax.swing.JTextField txtprecio;
    public static javax.swing.JTextField txtprecio1;
    public static javax.swing.JTextField txtprecio2;
    public javax.swing.JTextField txtsub10;
    public javax.swing.JTextField txtsub5;
    public javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

}
