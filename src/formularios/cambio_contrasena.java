package formularios;

import com.sun.glass.events.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import prg.conectDB;

/**
 *
 * @author memo_
 */
public class cambio_contrasena extends javax.swing.JDialog {

    conectDB con;
    ResultSet rs;
    int contador = 0;

    public cambio_contrasena(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        con = new conectDB();
        con.conectar();
        inicio();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtpassnueva = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtpassactual = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtpassconfirmar = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        btncancelar = new javax.swing.JButton();
        btnaceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/candado.png"))); // NOI18N
        jLabel1.setText("Contraseña Actual: ");

        txtpassnueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassnuevaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/candado.png"))); // NOI18N
        jLabel2.setText("Nueva Contraseña: ");

        txtpassactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassactualActionPerformed(evt);
            }
        });
        txtpassactual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassactualKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/candado.png"))); // NOI18N
        jLabel3.setText("Confirmar Contraseña: ");

        txtpassconfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassconfirmarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpassnueva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassactual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassconfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassactual, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassnueva, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btncancelar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.gif"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnaceptar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aceptar.png"))); // NOI18N
        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(69, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(59, 59, 59)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Metodo de inicio para habilitar campos necesarios
    private void inicio() {

        txtpassnueva.setText("");
        txtpassnueva.setEnabled(false);
        txtpassconfirmar.setText("");
        txtpassconfirmar.setEnabled(false);
        txtpassactual.setText("");
        txtpassactual.requestFocus();

    }

    // Metodo para verificar campos vacios
    private boolean campos_vacios() {

        String passactual = txtpassactual.getText();
        String passnueva = txtpassnueva.getText();
        String passconfirmar = txtpassconfirmar.getText();
        if (passactual.equals("") || passnueva.equals("") || passconfirmar.equals("")) {
            JOptionPane.showMessageDialog(this, "Debes completar todos los campos!");
            return true;
        }
        return false;

    }

    private void txtpassactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassactualActionPerformed

    }//GEN-LAST:event_txtpassactualActionPerformed

    private void txtpassactualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassactualKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtpassactual.getText().trim().equals("")) {
                try {
                    rs = con.Listar("SELECT * FROM usuario "
                            + "WHERE usu_cod = " + acceso.usercod
                            + "AND usu_clave = md5('" + txtpassactual.getText() + "')");
                    if (rs.isBeforeFirst()) {
                        txtpassnueva.setEnabled(true);
                        txtpassnueva.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(this, "La contraseña ingresada no es "
                                + "correcta", "Atención!", JOptionPane.INFORMATION_MESSAGE);
                        txtpassactual.setText("");
                        txtpassactual.requestFocus();
                        contador++;
                        if (contador == 3) {
                            System.exit(0);
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(cambio_contrasena.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_txtpassactualKeyPressed

    private void txtpassnuevaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassnuevaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtpassnueva.getText().trim().equals("")) {
                txtpassconfirmar.setEnabled(true);
                txtpassconfirmar.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Este campo no puede estar vacio",
                        "Atención", JOptionPane.INFORMATION_MESSAGE);
                txtpassnueva.setText("");
                txtpassnueva.requestFocus();
            }
        }

    }//GEN-LAST:event_txtpassnuevaKeyPressed

    private void txtpassconfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassconfirmarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtpassconfirmar.getText().trim().equals("")) {
                if (txtpassconfirmar.getText().trim().equals(txtpassnueva.getText().trim())) {
                    btnaceptar.setEnabled(true);
                    btnaceptar.doClick();
                } else {
                    JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden",
                            "Atención", JOptionPane.INFORMATION_MESSAGE);
                    inicio();
                    /*txtpassnueva.setText("");
                    txtpassnueva.setEnabled(false);
                    txtpassconfirmar.setText("");
                    txtpassconfirmar.setEnabled(false);
                    txtpassactual.setText("");
                    txtpassactual.requestFocus();*/
                }
            } else {
                JOptionPane.showMessageDialog(this, "Este campo no puede estar vacio",
                        "Atención", JOptionPane.INFORMATION_MESSAGE);
                txtpassnueva.setText("");
                txtpassnueva.requestFocus();
            }
        }

    }//GEN-LAST:event_txtpassconfirmarKeyPressed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed

        if (!campos_vacios()) {
            int mensaje = JOptionPane.showConfirmDialog(this, "Deseas modificar tu contraseña?",
                    "Atención!", JOptionPane.YES_NO_OPTION);
            if (mensaje == 0) {
                con.actualizar_datos("usuario", "usu_clave = md5('" + txtpassconfirmar.getText()
                        + "'), cambio = 1", "usu_cod = " + acceso.usercod, 1);
                inicio();
                dispose();
            } else {
                inicio();
            }
        }

    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed

        inicio();
        /*int mensaje = JOptionPane.showConfirmDialog(this, "Deseas salir sin actualizar tu contraseña?",
                "Atención!", JOptionPane.YES_NO_OPTION);
        if (mensaje == 0) {
            dispose();
        } else {
            inicio();
        }*/

    }//GEN-LAST:event_btncancelarActionPerformed

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
            java.util.logging.Logger.getLogger(cambio_contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cambio_contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cambio_contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cambio_contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cambio_contrasena dialog = new cambio_contrasena(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                //dialog.setLocationRelativeTo(null);
                dialog.setResizable(false);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtpassactual;
    private javax.swing.JPasswordField txtpassconfirmar;
    private javax.swing.JPasswordField txtpassnueva;
    // End of variables declaration//GEN-END:variables
}
