package formularios;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import prg.conectDB;

public class acceso extends javax.swing.JDialog {

    conectDB con; // Traer la clase de conexion
    ResultSet rs; // Resultados de SQL definidos en conecDB
    public static String username;
    public static int usercod;
    public static String nivel;
    int contador = 0;
    int contadorx = 0;

    public acceso(java.awt.Frame parent, boolean modal) {

        //super(parent, modal); // Se superpone
        initComponents();
        con = new conectDB(); // Instancia de la clase de conexion
        con.conectar(); // Metodo de conexion de la clase conecDB
        setLocationRelativeTo(null); // Centrar ventana en la pantalla

    }

    // Metodo para el ingreso
    private void ingresar() {

        try {
            String nick = "";
            rs = con.Listar("SELECT usu_cod, usu_nombres, usu_nick, usu_nivel "
                    + "FROM usuario "
                    + "WHERE usu_nick = '" + txtusu.getText() + "' and usu_clave = md5('"
                    + txtclave.getText() + "');"
            );
            while (rs.next()) {
                username = rs.getString("usu_nombres");
                usercod = Integer.parseInt(rs.getString("usu_cod"));
                nivel = rs.getString("usu_nivel");
                nick = rs.getString("usu_nick");
            }

            if (nick.equals(txtusu.getText())) {
                new menu().setVisible(true);
                this.setVisible(false);
            } else {
                // Bloquear usuario
                JOptionPane.showMessageDialog(this, "Contraseña incorrecta!");
                contador++;
                if (contador == 1) {
                    JOptionPane.showMessageDialog(this, "Tiene 2 oportunidades mas..");
                }
                if (contador == 2) {
                    JOptionPane.showMessageDialog(this, "El usuario sera bloqueado", "Atencion!", WIDTH);
                }
                if (contador == 3) {
                    String sql = "UPDATE usuario SET estado = 'inactivo' WHERE usu_nick = '" + txtusu.getText() +"';";
                    System.out.println(sql);
                    JOptionPane.showMessageDialog(this, "Usuario bloqueado! contacte con el administrador del sistema", "Atencion!", WIDTH);
                    JOptionPane.showMessageDialog(this, "Numero del administrador: 098522011...");
                    con.sentencia = con.conectar().createStatement();
                    con.sentencia.executeUpdate(sql);
                }
                txtusu.setText("");
                txtclave.setText("");
                txtusu.requestFocus();
            }

        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    // Metodo para validar usuario
    private void validar_usuario(){
        
        try {
            String usuario = txtusu.getText();
            String sql = "SELECT * FROM usuario WHERE usu_nick = '"
                    + usuario + "';";
            System.out.println(sql);
            rs = con.Listar(sql);
            boolean encontro = rs.next();
            
            if (encontro == false) {
                JOptionPane.showMessageDialog(this, "El usuario " + usuario + " no existe!");
                contadorx ++;
                System.out.println(contadorx);
                if (contadorx == 3) {
                    System.exit(0);
                }
            }else{
                usuario_bloqueado();
            }
        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // Validar usuario inactivo 
    private void usuario_bloqueado(){
        
        try {
            String usuario = txtusu.getText();
            String sql = "SELECT * FROM usuario WHERE estado = 'activo' AND usu_nick = '"
                    + usuario + "';";
            System.out.println(sql);
            rs = con.Listar(sql);
            boolean encontro = rs.next();
            if (encontro == false) {
                JOptionPane.showMessageDialog(this, "El usuario se encuentra bloqueado");
                JOptionPane.showMessageDialog(this, "Contacte con el administrador de sistemas");
                JOptionPane.showMessageDialog(this, "Al celular: 098522011.. o al correo: memo94dev@gmail.com");
            }else{
                txtclave.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jPanel1 = new javax.swing.JPanel();
        btnIngresar = new org.edisoncor.gui.button.ButtonNice();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        txtclave = new javax.swing.JPasswordField();
        btnCancelar = new org.edisoncor.gui.button.ButtonNice();
        btnSalir2 = new org.edisoncor.gui.button.ButtonNice();
        txtusu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acceso al Sistema", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel1.setOpaque(false);

        btnIngresar.setBackground(new java.awt.Color(0, 153, 51));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        labelMetric1.setText("Código: ");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        labelMetric2.setText("Contraseña:");
        labelMetric2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        btnCancelar.setBackground(new java.awt.Color(204, 0, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir2.setBackground(new java.awt.Color(0, 102, 255));
        btnSalir2.setText("Salir");
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });

        txtusu.setName(""); // NOI18N
        txtusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtclave)
                    .addComponent(txtusu, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        txtusu.getAccessibleContext().setAccessibleName("");

        panelCurves1.add(jPanel1, java.awt.BorderLayout.CENTER);

        panelNice1.add(panelCurves1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        ingresar();
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void txtusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuActionPerformed
        
        validar_usuario();
        
    }//GEN-LAST:event_txtusuActionPerformed

    /* Metodo para inhabilitar el boton guardar y las entradas de texto al iniciar la pantalla */
    private void desa_inicio() {

        /*btnguardar.setEnabled(false);
        txtcodigo.setEnabled(false);
        txtdescripcion.setEnabled(false);*/
    }

    /* Metodo para inhabilitar botones y habilitar botones */
    private void desa_botones(int a) {

        /* switch (a) {
            case 1:
                btnagregar.setEnabled(false);
                btnmodificar.setEnabled(false);
                btneliminar.setEnabled(false);
                btnimprimir.setEnabled(false);
                btnIngresar.setEnabled(false);
                break;
            case 2:
                btnagregar.setEnabled(true);
                btnmodificar.setEnabled(true);
                btneliminar.setEnabled(true);
                btnimprimir.setEnabled(true);
                btnIngresar.setEnabled(true);
                break;
        }*/
    }

    /* Metodo para realizar consulta de los codigos existentes y devolver el siguiente codigo a utilizar */
    private void generar_codigo() {

        /*    try {
            String sql = "SELECT COALESCE (MAX(cod_ciudad),0)+1 AS cod FROM ciudad;"; // Creamos la consulta SQL.
            rs = con.Listar(sql); // Utilizamos el metodo listar.
            rs.next(); // Llamar a los siguientes resultados.
            txtcodigo.setText(rs.getString("cod")); // Enviar el resultado en el campo de codigo de nuestro formulario.
        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    /* Metodo para validar duplicidad de la descripcion */
    private void validar_descripcion() {

        /*     try {
            String descripcion = txtdescripcion.getText().toUpperCase();
            rs = con.Listar("SELECT * FROM ciudad WHERE descrip_ciudad = '" + descripcion + "'");
            boolean encontro = rs.next();
            if (encontro == true) {
                JOptionPane.showMessageDialog(this, "La descripción de la ciudad '" + descripcion
                        + "' ya se encuentra registrada.");
                txtdescripcion.setEnabled(true);
            } else {
                btnguardar.setEnabled(true);
                btnguardar.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
    }

    // Metodo para guardar nuevo registro en la BDD
    private void guardar() {

        /* try {
            String codigo = txtcodigo.getText().trim(); // Obtengo el valor del campo codigo y limpio de espacios
            String descripcion = txtdescripcion.getText().toUpperCase().trim();
            String sql = "";
            if ("agregar".equals(operacion)) {
                sql = "INSERT INTO ciudad VALUES (" + codigo + ",'" + descripcion + "');";
                System.out.println(sql);
                JOptionPane.showMessageDialog(this, "Se ha insertado correctamente: " + descripcion);
            }
            if ("modificar".equals(operacion)) {
                sql = "UPDATE ciudad SET descrip_ciudad = '" + descripcion + "' WHERE cod_ciudad = " + codigo + ";";
                System.out.println(sql);
                JOptionPane.showMessageDialog(this, "Se ha modificado correctamente a: " + descripcion);
            }
            if ("eliminar".equals(operacion)) {
                sql = "DELETE FROM ciudad WHERE cod_ciudad = " + codigo + ";";
                System.out.println(sql);
                JOptionPane.showMessageDialog(this, "Se ha eliminado correctamente!");
            }

            con.sentencia = con.conectar().createStatement();
            con.sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    // Metodo para limpiar campos
    private void limpiar_campos() {

        /*txtcodigo.setText("");
        txtdescripcion.setText("");
        txtbuscar.setText("");*/
    }

    /* // Metodo para buscar 
    private boolean buscar() {

       /* try {
            String codigo = txtcodigo.getText();
            String sql = "SELECT descrip_ciudad as ciudad FROM ciudad WHERE cod_ciudad = " + codigo;
            System.out.println(sql);
            rs = con.Listar(sql);
            //rs.next();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "El codigo ingresado no existe");
                return false;
            } else {
                //rs.next();
                String resultado = rs.getString("ciudad");
                System.out.println(resultado);
                txtdescripcion.setText(resultado);
                return true;
                //txtdescripcion.setText(rs.getString("descripcion"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }*/
    // Metodo para buscar datos
    private void buscador() {

        /*try {
            cursor = (DefaultTableModel) tablaciudad.getModel();
            String buscar = txtbuscar.getText().toUpperCase().trim();
            String sql = "SELECT * FROM ciudad WHERE descrip_ciudad LIKE '%" + buscar + "%' ORDER BY cod_ciudad;";
            rs = con.Listar(sql);
            String[] fila1 = new String[2];

            while (rs.next()) {
                fila1[0] = rs.getString("cod_ciudad");
                fila1[1] = rs.getString("descrip_ciudad");
                cursor.addRow(fila1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }*/
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
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                acceso dialog = new acceso(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                dialog.setResizable(false);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonNice btnCancelar;
    private org.edisoncor.gui.button.ButtonNice btnIngresar;
    private org.edisoncor.gui.button.ButtonNice btnSalir2;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JTextField txtusu;
    // End of variables declaration//GEN-END:variables
}
