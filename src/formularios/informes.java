package formularios;

import com.sun.glass.events.KeyEvent;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import prg.conectDB;

/**
 *
 * @author memo_
 */
public class informes extends javax.swing.JDialog {

    conectDB con;
    ResultSet rs;
    String sql;
    int opcion = 0;

    public informes(java.awt.Frame parent, boolean modal) {
        //super(parent, modal);
        initComponents();
        con = new conectDB();
        con.conectar();
        inicio();
        llenar_combo("0");
        llenar_combo_depar("0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new org.edisoncor.gui.label.LabelMetric();
        labelCodigo1 = new org.edisoncor.gui.label.LabelMetric();
        labelCodigo2 = new org.edisoncor.gui.label.LabelMetric();
        labelCodigo3 = new org.edisoncor.gui.label.LabelMetric();
        txtdesde = new javax.swing.JTextField();
        txthasta = new javax.swing.JTextField();
        combodepar = new javax.swing.JComboBox<>();
        combociudad = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnsalir = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        checkcodigo = new javax.swing.JCheckBox();
        checkciudad = new javax.swing.JCheckBox();
        checkdepar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parámetros del Informe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        labelCodigo.setText("Hasta: ");
        labelCodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelCodigo1.setText("Desde:");
        labelCodigo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelCodigo2.setText("Ciudad: ");
        labelCodigo2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelCodigo3.setText("Departamento:");
        labelCodigo3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtdesde.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtdesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdesdeKeyPressed(evt);
            }
        });

        txthasta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txthasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txthastaKeyPressed(evt);
            }
        });

        combodepar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        combodepar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combodeparKeyPressed(evt);
            }
        });

        combociudad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        combociudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combociudadKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(txtdesde, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txthasta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(labelCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(labelCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combociudad, 0, 216, Short.MAX_VALUE)
                    .addComponent(combodepar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(labelCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(297, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(labelCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(combociudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(labelCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combodepar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(labelCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(307, Short.MAX_VALUE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnsalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnconsultar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btnconsultar.setText("Consultar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        btnconsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnconsultarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones de Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonGroup1.add(checkcodigo);
        checkcodigo.setText("Por Código");
        checkcodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkcodigoActionPerformed(evt);
            }
        });

        buttonGroup1.add(checkciudad);
        checkciudad.setText("Por Ciudad");
        checkciudad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkciudadActionPerformed(evt);
            }
        });

        buttonGroup1.add(checkdepar);
        checkdepar.setText("Por Depar.");
        checkdepar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkdepar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkdeparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkciudad)
                    .addComponent(checkdepar)
                    .addComponent(checkcodigo))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(checkcodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(checkciudad)
                .addGap(18, 18, 18)
                .addComponent(checkdepar)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Metodo para llenar combo de ciudades
    private void llenar_combo(String orden) {

        try {
            String sql = "SELECT CONCAT (cod_ciudad, '-', descrip_ciudad) AS ciudad FROM ciudad ORDER BY cod_ciudad = " + orden + "ASC;";
            rs = con.Listar(sql);
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    combociudad.addItem(rs.getString("ciudad"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    // Metodo para llenar combo de departamentos
    private void llenar_combo_depar(String orden) {

        try {
            String sql = "SELECT CONCAT (cod_depar, '-', depar_descrip) AS depar FROM departamentos ORDER BY cod_depar = " + orden + "ASC;";
            rs = con.Listar(sql);
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    combodepar.addItem(rs.getString("depar"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    // Metodo de inicio para habilitar campos necesarios
    private void inicio() {

        buttonGroup1.clearSelection();
        txtdesde.setText("");
        txthasta.setText("");
        combociudad.setEnabled(false);
        combodepar.setEnabled(false);
        txtdesde.setEnabled(false);
        txthasta.setEnabled(false);
        opcion = 0;

    }
    
    // Metodo imprimir Reporte
    private void imprimir(String a) {

        try {
            rs = con.Listar(a);
            Map parameters = new HashMap();
            parameters.put("", new String(""));
            JasperReport jr = null;

            // Cargamos el reporte
            URL url = getClass().getClassLoader().getResource("reportes/informe_clientes.jasper");
            jr = (JasperReport) JRLoader.loadObject(url);

            JasperPrint masterPrint = null;
            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
            masterPrint = JasperFillManager.fillReport(jr, parameters, jrRS);

            // Generar ventana para mostrar el reporte
            JasperViewer ventana = new JasperViewer(masterPrint, false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);
            ventana.setSize(1000, 680);
            ventana.setLocationRelativeTo(null);
        } catch (JRException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed

        String desde = txtdesde.getText();
        String hasta = txthasta.getText();
        if (opcion == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un parametro para la consulta");
        }else{
            if (opcion == 1) {
                sql = "SELECT * FROM v_reporte_clientes WHERE id_cliente BETWEEN " + desde 
                        + " AND " + hasta + " ORDER BY id_cliente ASC;";
                imprimir(sql);
                inicio();
            }
            if (opcion == 2) {
                sql = "SELECT * FROM v_reporte_clientes WHERE cod_ciudad = "
                + "(SELECT SPLIT_PART ('" + combociudad.getSelectedItem() + "','-',1)::integer)"
                + " ORDER BY id_cliente;";
                imprimir(sql);
                inicio();
            }
            if (opcion == 3) {
                sql = "SELECT * FROM v_reporte_clientes WHERE cod_depar = "
                + "(SELECT SPLIT_PART ('" + combodepar.getSelectedItem() + "','-',1)::integer)"
                + " ORDER BY id_cliente;";
                imprimir(sql);
                inicio();
            }
        }

    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed

        inicio();
        int mensaje = JOptionPane.showConfirmDialog(this, "Deseas salir sin actualizar tu contraseña?",
                "Atención!", JOptionPane.YES_NO_OPTION);
        if (mensaje == 0) {
            dispose();
        } else {
            inicio();
        }

    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtdesdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdesdeKeyPressed
        
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            String desde = txtdesde.getText().trim();
            if (desde.equals("") || desde.equals(" ")) {
                JOptionPane.showMessageDialog(this, "Este campo no puede estar vacio!");
                txtdesde.requestFocus();
            } else {
                txthasta.setEnabled(true);
                txthasta.requestFocus();
            }
        }
        
    }//GEN-LAST:event_txtdesdeKeyPressed

    private void txthastaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthastaKeyPressed
        
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            String hasta = txthasta.getText().trim();
            if (hasta.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Este campo no puede estar vacio!");
                txthasta.requestFocus();
            } else {
                btnconsultar.requestFocus();
            }
        }
        
    }//GEN-LAST:event_txthastaKeyPressed

    private void checkcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkcodigoActionPerformed
        
        opcion = 1;
        txtdesde.setEnabled(true);
        txtdesde.requestFocus();
        
        combociudad.setEnabled(false);
        combodepar.setEnabled(false);
        
    }//GEN-LAST:event_checkcodigoActionPerformed

    private void checkciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkciudadActionPerformed
        
        opcion = 2;
        combociudad.setEnabled(true);
        combociudad.requestFocus();
        
        txtdesde.setText("");
        txtdesde.setEnabled(false);
        txthasta.setText("");
        txthasta.setEnabled(false);
        combodepar.setEnabled(false);
        
    }//GEN-LAST:event_checkciudadActionPerformed

    private void checkdeparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkdeparActionPerformed
        
        opcion = 3;
        combodepar.setEnabled(true);
        combodepar.requestFocus();
        
        txtdesde.setText("");
        txtdesde.setEnabled(false);
        txthasta.setText("");
        txthasta.setEnabled(false);
        combociudad.setEnabled(false);
        
    }//GEN-LAST:event_checkdeparActionPerformed

    private void combociudadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combociudadKeyPressed
        
        if (evt.getKeyCode() == 10) {
            btnconsultar.requestFocus();
        }
        
    }//GEN-LAST:event_combociudadKeyPressed

    private void combodeparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combodeparKeyPressed
        
        if (evt.getKeyCode() == 10) {
            btnconsultar.requestFocus();
        }
        
    }//GEN-LAST:event_combodeparKeyPressed

    private void btnconsultarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnconsultarKeyPressed
        
        if (evt.getKeyCode() == 10) {
            btnconsultar.doClick();
        }
        
    }//GEN-LAST:event_btnconsultarKeyPressed

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
            java.util.logging.Logger.getLogger(informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                informes dialog = new informes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                dialog.setResizable(false);
                dialog.setLocationRelativeTo(null);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btnsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkciudad;
    private javax.swing.JCheckBox checkcodigo;
    private javax.swing.JCheckBox checkdepar;
    private javax.swing.JComboBox<String> combociudad;
    private javax.swing.JComboBox<String> combodepar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private org.edisoncor.gui.label.LabelMetric labelCodigo;
    private org.edisoncor.gui.label.LabelMetric labelCodigo1;
    private org.edisoncor.gui.label.LabelMetric labelCodigo2;
    private org.edisoncor.gui.label.LabelMetric labelCodigo3;
    private javax.swing.JTextField txtdesde;
    private javax.swing.JTextField txthasta;
    // End of variables declaration//GEN-END:variables
}
