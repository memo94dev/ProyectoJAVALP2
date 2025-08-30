package formularios;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import prg.conectDB;

public class menu extends javax.swing.JFrame {

    conectDB con;
    ResultSet rs;
    String username = acceso.username.toUpperCase();

    public menu() {

        initComponents();
        inicio();
        niveles();

        setLocationRelativeTo(null);
        setExtendedState(this.MAXIMIZED_BOTH);
        //setResizable(false);
        etiquetausuario.setText(username);
        con = new conectDB();
        con.conectar();
        
        primera_sesion();

        // Obtener fecha y formatearla
        Date d = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        etiquetafecha.setText(df.format(d));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etiquetausuario = new javax.swing.JLabel();
        etiquetafecha = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menureferenciales = new javax.swing.JMenu();
        refventas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        refcompras = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menucompras = new javax.swing.JMenu();
        menuventas = new javax.swing.JMenu();
        menuinformes = new javax.swing.JMenu();
        infocompras = new javax.swing.JMenuItem();
        infoventas = new javax.swing.JMenuItem();
        menupass = new javax.swing.JMenu();
        confirmarcambiocontra = new javax.swing.JMenuItem();
        menuayuda = new javax.swing.JMenu();
        menusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fecha: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido: ");

        etiquetausuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetausuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetausuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        etiquetafecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetafecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetafecha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(100, 32769));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(100, 26));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(66, 70));

        menureferenciales.setText("Referenciales");
        menureferenciales.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        refventas.setText("Ventas");
        refventas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem1.setText("Deposito");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        refventas.add(jMenuItem1);

        menureferenciales.add(refventas);

        refcompras.setText("Compras");
        refcompras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem2.setText("Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        refcompras.add(jMenuItem2);

        menureferenciales.add(refcompras);

        jMenuBar1.add(menureferenciales);

        menucompras.setText("Compras");
        menucompras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.add(menucompras);

        menuventas.setText("Ventas");
        menuventas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.add(menuventas);

        menuinformes.setText("Informes");
        menuinformes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        infocompras.setText("Informe Compras");
        menuinformes.add(infocompras);

        infoventas.setText("Informe Ventas");
        menuinformes.add(infoventas);

        jMenuBar1.add(menuinformes);

        menupass.setText("Cambio de Contraseña");
        menupass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        confirmarcambiocontra.setText("Confirmar");
        confirmarcambiocontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarcambiocontraActionPerformed(evt);
            }
        });
        menupass.add(confirmarcambiocontra);

        jMenuBar1.add(menupass);

        menuayuda.setText("Ayuda");
        menuayuda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.add(menuayuda);

        menusalir.setText("Salir");
        menusalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.add(menusalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetafecha, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(etiquetausuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(427, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetausuario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(etiquetafecha, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(348, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        new deposito(this, true).setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        new clientes(this, true).setVisible(true);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void confirmarcambiocontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarcambiocontraActionPerformed
        
        new cambio_contrasena(this, true).setVisible(true);
        
    }//GEN-LAST:event_confirmarcambiocontraActionPerformed

    // Metodo para cambiar contrasena en el primer inicio de sesion
    private void primera_sesion(){
        
        if (acceso.cambio.equals("0")) {
            JOptionPane.showMessageDialog(this, "Debe cambiar su contraseña antes de iniciar sesión!");
            confirmarcambiocontra.doClick();
        }
        
    }
    
    // Metodo de inicio
    private void inicio() {

        JOptionPane.showMessageDialog(this, "Bienvenido: " + username);

    }

    // Menu por nivel de usuario
    private void niveles() {

        if (acceso.nivel.equals("administrador")) {
            menureferenciales.setVisible(true);
            menucompras.setVisible(true);
            menuventas.setVisible(true);
            menuinformes.setVisible(true);
            menupass.setVisible(true);
            menuayuda.setVisible(true);
            menusalir.setVisible(true);
        }
        if (acceso.nivel.equals("compra")) {
            menureferenciales.setVisible(true);
            refcompras.setVisible(true);
            refventas.setVisible(false);

            menucompras.setVisible(true);
            menuventas.setVisible(false);

            menuinformes.setVisible(true);
            infocompras.setVisible(true);
            infoventas.setVisible(false);

            menupass.setVisible(true);
            menuayuda.setVisible(true);
            menusalir.setVisible(true);
        }
        if (acceso.nivel.equals("ventas")) {
            menureferenciales.setVisible(true);
            refcompras.setVisible(false);
            refventas.setVisible(true);

            menucompras.setVisible(false);
            menuventas.setVisible(true);

            menuinformes.setVisible(true);
            infocompras.setVisible(false);
            infoventas.setVisible(true);

            menupass.setVisible(true);
            menuayuda.setVisible(true);
            menusalir.setVisible(true);
        }

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem confirmarcambiocontra;
    private javax.swing.JLabel etiquetafecha;
    private javax.swing.JLabel etiquetausuario;
    private javax.swing.JMenuItem infocompras;
    private javax.swing.JMenuItem infoventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuayuda;
    private javax.swing.JMenu menucompras;
    private javax.swing.JMenu menuinformes;
    private javax.swing.JMenu menupass;
    private javax.swing.JMenu menureferenciales;
    private javax.swing.JMenu menusalir;
    private javax.swing.JMenu menuventas;
    private javax.swing.JMenu refcompras;
    private javax.swing.JMenu refventas;
    // End of variables declaration//GEN-END:variables
}
