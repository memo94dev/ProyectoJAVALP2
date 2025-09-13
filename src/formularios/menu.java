package formularios;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        formularios = new javax.swing.JMenu();
        itemclientes = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itemciudad = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        itemdeposito = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        itemmedidas = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        itemproductos = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        itemproveedores = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        itemstock = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        itemtproductos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menucompras = new javax.swing.JMenu();
        registrarcompras = new javax.swing.JMenuItem();
        menuventas = new javax.swing.JMenu();
        registrarventa = new javax.swing.JMenuItem();
        menuinformes = new javax.swing.JMenu();
        infocompras = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        infoclientes = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        infoventas1 = new javax.swing.JMenuItem();
        menupass = new javax.swing.JMenu();
        confirmarcambiocontra = new javax.swing.JMenuItem();
        menuayuda = new javax.swing.JMenu();
        solicitardocayuda = new javax.swing.JMenuItem();
        menusalir = new javax.swing.JMenu();
        salirdelsistema = new javax.swing.JMenuItem();

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

        formularios.setText("Formularios");
        formularios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        itemclientes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemclientes.setText("Clientes");
        itemclientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemclientesActionPerformed(evt);
            }
        });
        formularios.add(itemclientes);
        formularios.add(jSeparator4);

        itemciudad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemciudad.setText("Ciudad");
        itemciudad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemciudadActionPerformed(evt);
            }
        });
        formularios.add(itemciudad);
        formularios.add(jSeparator5);

        itemdeposito.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemdeposito.setText("Depósito");
        itemdeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemdeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdepositoActionPerformed(evt);
            }
        });
        formularios.add(itemdeposito);
        formularios.add(jSeparator6);

        itemmedidas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemmedidas.setText("Medidas");
        itemmedidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemmedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemmedidasActionPerformed(evt);
            }
        });
        formularios.add(itemmedidas);
        formularios.add(jSeparator7);

        itemproductos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemproductos.setText("Productos");
        itemproductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemproductosActionPerformed(evt);
            }
        });
        formularios.add(itemproductos);
        formularios.add(jSeparator8);

        itemproveedores.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemproveedores.setText("Proveedores");
        itemproveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemproveedoresActionPerformed(evt);
            }
        });
        formularios.add(itemproveedores);
        formularios.add(jSeparator9);

        itemstock.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemstock.setText("Stock");
        itemstock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemstockActionPerformed(evt);
            }
        });
        formularios.add(itemstock);
        formularios.add(jSeparator10);

        itemtproductos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemtproductos.setText("Tipo de Productos");
        itemtproductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemtproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemtproductosActionPerformed(evt);
            }
        });
        formularios.add(itemtproductos);

        menureferenciales.add(formularios);
        menureferenciales.add(jSeparator1);

        jMenuBar1.add(menureferenciales);

        menucompras.setText("Compras");
        menucompras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        registrarcompras.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        registrarcompras.setText("Registrar Compras");
        registrarcompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarcomprasActionPerformed(evt);
            }
        });
        menucompras.add(registrarcompras);

        jMenuBar1.add(menucompras);

        menuventas.setText("Ventas");
        menuventas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        registrarventa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        registrarventa.setText("Registrar Venta");
        registrarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarventaActionPerformed(evt);
            }
        });
        menuventas.add(registrarventa);

        jMenuBar1.add(menuventas);

        menuinformes.setText("Informes");
        menuinformes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        infocompras.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        infocompras.setText("Informe Compras");
        menuinformes.add(infocompras);
        menuinformes.add(jSeparator2);

        infoclientes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        infoclientes.setText("Informe Ventas");
        menuinformes.add(infoclientes);
        menuinformes.add(jSeparator3);

        infoventas1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        infoventas1.setText("Informe de Clientes");
        infoventas1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        infoventas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoventas1ActionPerformed(evt);
            }
        });
        menuinformes.add(infoventas1);

        jMenuBar1.add(menuinformes);

        menupass.setText("Cambio de Contraseña");
        menupass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        confirmarcambiocontra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
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

        solicitardocayuda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        solicitardocayuda.setText("Ver el Manual de Inicio de Sesión");
        solicitardocayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitardocayudaActionPerformed(evt);
            }
        });
        menuayuda.add(solicitardocayuda);

        jMenuBar1.add(menuayuda);

        menusalir.setText("Salir");
        menusalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        salirdelsistema.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        salirdelsistema.setText("Salir");
        salirdelsistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirdelsistemaActionPerformed(evt);
            }
        });
        menusalir.add(salirdelsistema);

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

    private void itemdepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdepositoActionPerformed

        new deposito(this, true).setVisible(true);

    }//GEN-LAST:event_itemdepositoActionPerformed

    private void itemclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemclientesActionPerformed

        new clientes(this, true).setVisible(true);

    }//GEN-LAST:event_itemclientesActionPerformed

    private void confirmarcambiocontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarcambiocontraActionPerformed
        
        new cambio_contrasena(this, true).setVisible(true);
        
    }//GEN-LAST:event_confirmarcambiocontraActionPerformed

    private void solicitardocayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitardocayudaActionPerformed
        
        try {
            File path = new File("C:\\Users\\memo_\\Documents\\NetBeansProjects\\Proyecto\\src\\ayuda\\Manual de Inicio de Sesion.pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_solicitardocayudaActionPerformed

    private void registrarcomprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarcomprasActionPerformed
        
        new compras(this, true).setVisible(true);
        
    }//GEN-LAST:event_registrarcomprasActionPerformed

    private void salirdelsistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirdelsistemaActionPerformed
        
        int mensaje = JOptionPane.showConfirmDialog(this, "Desea abandonar el sistema?", "Atención", JOptionPane.YES_NO_OPTION); // Mensaje al presionar el boton salir
        if (mensaje == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_salirdelsistemaActionPerformed

    private void infoventas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoventas1ActionPerformed
        
        new informes(this, true).setVisible(true);
        
    }//GEN-LAST:event_infoventas1ActionPerformed

    private void registrarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarventaActionPerformed
        
        new ventas(this, true).setVisible(true);
        
    }//GEN-LAST:event_registrarventaActionPerformed

    private void itemciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemciudadActionPerformed
        
        new ciudad(this, true).setVisible(true);
        
    }//GEN-LAST:event_itemciudadActionPerformed

    private void itemmedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemmedidasActionPerformed
        
        new medidas(this, true).setVisible(true);
        
    }//GEN-LAST:event_itemmedidasActionPerformed

    private void itemproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemproductosActionPerformed
        
        new productos(this, true).setVisible(true);
        
    }//GEN-LAST:event_itemproductosActionPerformed

    private void itemproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemproveedoresActionPerformed
        
        new proveedores(this, true).setVisible(true);
        
    }//GEN-LAST:event_itemproveedoresActionPerformed

    private void itemtproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemtproductosActionPerformed
        
        new tipo_producto(this, true).setVisible(true);
        
    }//GEN-LAST:event_itemtproductosActionPerformed

    private void itemstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemstockActionPerformed
        
        new stock(this, true).setVisible(true);
        
    }//GEN-LAST:event_itemstockActionPerformed

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
            formularios.setVisible(true);
            formularios.setVisible(false);

            menucompras.setVisible(true);
            menuventas.setVisible(false);

            menuinformes.setVisible(true);
            infocompras.setVisible(true);
            infoclientes.setVisible(false);

            menupass.setVisible(true);
            menuayuda.setVisible(true);
            menusalir.setVisible(true);
        }
        if (acceso.nivel.equals("ventas")) {
            menureferenciales.setVisible(true);
            formularios.setVisible(false);
            formularios.setVisible(true);

            menucompras.setVisible(false);
            menuventas.setVisible(true);

            menuinformes.setVisible(true);
            infocompras.setVisible(false);
            infoclientes.setVisible(true);

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
    private javax.swing.JMenu formularios;
    private javax.swing.JMenuItem infoclientes;
    private javax.swing.JMenuItem infocompras;
    private javax.swing.JMenuItem infoventas1;
    private javax.swing.JMenuItem itemciudad;
    private javax.swing.JMenuItem itemclientes;
    private javax.swing.JMenuItem itemdeposito;
    private javax.swing.JMenuItem itemmedidas;
    private javax.swing.JMenuItem itemproductos;
    private javax.swing.JMenuItem itemproveedores;
    private javax.swing.JMenuItem itemstock;
    private javax.swing.JMenuItem itemtproductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenu menuayuda;
    private javax.swing.JMenu menucompras;
    private javax.swing.JMenu menuinformes;
    private javax.swing.JMenu menupass;
    private javax.swing.JMenu menureferenciales;
    private javax.swing.JMenu menusalir;
    private javax.swing.JMenu menuventas;
    private javax.swing.JMenuItem registrarcompras;
    private javax.swing.JMenuItem registrarventa;
    private javax.swing.JMenuItem salirdelsistema;
    private javax.swing.JMenuItem solicitardocayuda;
    // End of variables declaration//GEN-END:variables
}
