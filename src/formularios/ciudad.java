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

public class ciudad extends javax.swing.JDialog {
    
    conectDB con; // Traer la clase de conexion
    ResultSet rs; // Resultados de SQL definidos en conecDB
    javax.swing.table.DefaultTableModel cursor; // Cursor para recorrer la tabla
    String operacion = ""; // Bandera para definir la accion que se va a realizar (insert, update, delete)

    public ciudad(java.awt.Frame parent, boolean modal) {
        
        //super(parent, modal); // Se superpone
        initComponents();
        con = new conectDB(); // Instancia de la clase de conexion
        con.conectar(); // Metodo de conexion de la clase conecDB
        
        cargar_tabla(); // Metodo para cargar datos de la BDD en la tabla de inicio
        desa_inicio(); // Metodo de inicio de la pantalla
        setLocationRelativeTo(null); // Centrar ventana en la pantalla
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnSalir = new org.edisoncor.gui.button.ButtonNice();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        txtdescripcion = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtcodigo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtbuscar = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladepo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Ciudad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel1.setOpaque(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel2.setOpaque(false);

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnimprimir.setText("Imprimir");
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        btnSalir.setBackground(new java.awt.Color(0, 102, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        labelMetric1.setText("Código: ");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        labelMetric2.setText("Descripción: ");
        labelMetric2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        txtdescripcion.setDescripcion("Ingrese la descripción");
        txtdescripcion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyPressed(evt);
            }
        });

        txtcodigo.setDescripcion("Cód.");
        txtcodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        txtbuscar.setDescripcion("Buscar Ciudad");
        txtbuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelMetric3.setText("Buscar");
        labelMetric3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        tabladepo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabladepo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción"
            }
        ));
        tabladepo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tabladepo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

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

    /* Metodo para inhabilitar el boton guardar y las entradas de texto al iniciar la pantalla */
    private void desa_inicio(){
        
        btnguardar.setEnabled(false);
        txtcodigo.setEnabled(false);
        txtdescripcion.setEnabled(false);
        
    }
    
    /* Metodo para inhabilitar botones y habilitar botones */
    private void desa_botones(int a){
        
        switch(a){
            case 1:
                btnagregar.setEnabled(false);
                btnmodificar.setEnabled(false);
                btneliminar.setEnabled(false);
                btnimprimir.setEnabled(false);
                btnSalir.setEnabled(false);
            break;
            case 2:
                btnagregar.setEnabled(true);
                btnmodificar.setEnabled(true);
                btneliminar.setEnabled(true);
                btnimprimir.setEnabled(true);
                btnSalir.setEnabled(true);
            break;
        }
        
    }
    
    /* Metodo para realizar consulta de los codigos existentes y devolver el siguiente codigo a utilizar */
    private void generar_codigo(){
        
        try {
            String sql = "SELECT COALESCE (MAX(cod_ciudad),0)+1 AS cod FROM ciudad;"; // Creamos la consulta SQL.
            rs = con.Listar(sql); // Utilizamos el metodo listar.
            rs.next(); // Llamar a los siguientes resultados.
            txtcodigo.setText(rs.getString("cod")); // Enviar el resultado en el campo de codigo de nuestro formulario.
        } catch (SQLException ex) {
            Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /* Metodo para validar duplicidad de la descripcion */
    private void validar_descripcion(){
        
        try {
            String descripcion = txtdescripcion.getText().toUpperCase();
            rs = con.Listar("SELECT * FROM ciudad WHERE descrip_ciudad = '" + descripcion + "'");
            boolean encontro = rs.next();
            if (encontro == true){
                JOptionPane.showMessageDialog(this, "La descripción de la ciudad '" + descripcion 
                        + "' ya se encuentra registrada.");
                txtdescripcion.setEnabled(true);
            }else{
                btnguardar.setEnabled(true);
                btnguardar.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // Metodo para guardar nuevo registro en la BDD
    private void guardar(){
        
        try {
            String codigo = txtcodigo.getText().trim(); // Obtengo el valor del campo codigo y limpio de espacios
            String descripcion = txtdescripcion.getText().toUpperCase().trim();
            String sql = "";
            if ("agregar".equals(operacion)){
                sql = "INSERT INTO ciudad VALUES (" + codigo + ",'" + descripcion + "');";
                System.out.println(sql);
                JOptionPane.showMessageDialog(this, "Se ha insertado correctamente: " + descripcion);
            }
            if ("modificar".equals(operacion)){
                sql = "UPDATE ciudad SET descrip_ciudad = '" + descripcion + "' WHERE cod_ciudad = " + codigo + ";";
                System.out.println(sql);
                JOptionPane.showMessageDialog(this, "Se ha modificado correctamente a: " + descripcion);
            }
            if ("eliminar".equals(operacion)){
                sql = "DELETE FROM ciudad WHERE cod_ciudad = " + codigo + ";";
                System.out.println(sql);
                JOptionPane.showMessageDialog(this, "Se ha eliminado correctamente!");
            }
            
            con.sentencia = con.conectar().createStatement();
            con.sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // Metodo para limpiar campos
    private void limpiar_campos(){
        
        txtcodigo.setText("");
        txtdescripcion.setText("");
        txtbuscar.setText("");
        
    }
    
    // Metodo para cargar datos en la tabla con datos de la BDD
    private void cargar_tabla(){
        
        try {
            cursor = (DefaultTableModel) tabladepo.getModel();
            String sql = "SELECT * FROM ciudad ORDER BY cod_ciudad ASC;";
            rs = con.Listar(sql);
            String[] fila = new String[2];
            while(rs.next()){
                fila[0] = rs.getString("cod_ciudad");
                fila[1] = rs.getString("descrip_ciudad");
                cursor.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // Metodo para limpiar valores de la tabla
    private void limpiar_tabla(){
        
        cursor = (DefaultTableModel) tabladepo.getModel();
        while (cursor.getRowCount() > 0){
            cursor.removeRow(0);
        }
        
    }
    
    // Metodo para buscar 
    private boolean buscar(){
        
        try {
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
            Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    // Metodo para buscar datos
    private void buscador(){
        
        try {
            cursor = (DefaultTableModel) tabladepo.getModel();
            String buscar = txtbuscar.getText().toUpperCase().trim();
            String sql = "SELECT * FROM ciudad WHERE descrip_ciudad LIKE '%" + buscar + "%' ORDER BY cod_ciudad;";
            rs = con.Listar(sql);
            String[] fila1 = new String[2];
            
            while (rs.next()){
                fila1[0] = rs.getString("cod_ciudad");
                fila1[1] = rs.getString("descrip_ciudad");
                cursor.addRow(fila1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // Metodo imprimir Reporte
    private void imprimir(){
        
        try {
            String sql = "SELECT * FROM ciudad ORDER BY cod_ciudad ASC";
            rs = con.Listar(sql);
            Map parameters = new HashMap();
            parameters.put("", new String(""));
            JasperReport jr = null;
            
            // Cargamos el reporte
            URL url = getClass().getClassLoader().getResource("reportes/reporte_ciudad.jasper");
            jr = (JasperReport) JRLoader.loadObject(url);
            
            JasperPrint masterPrint = null;
            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
            masterPrint = JasperFillManager.fillReport(jr, parameters, jrRS);
            
            // Generar ventana para mostrar el reporte
            JasperViewer ventana = new JasperViewer(masterPrint, false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);
            ventana.setSize(700, 700);
            ventana.setLocationRelativeTo(null);
        } catch (JRException ex) {
            Logger.getLogger(deposito.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        
        operacion = "modificar";
        desa_botones(1);
        JOptionPane.showMessageDialog(this, "Ingresa un codigo para la ciudad a editar");
        txtcodigo.setEnabled(true);
        txtcodigo.requestFocus();
        
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        int mensaje = JOptionPane.showConfirmDialog(this,"Desea salir?","Atención",JOptionPane.YES_NO_OPTION); // Mensaje al presionar el boton salir
        if (mensaje == JOptionPane.YES_OPTION){
            //System.exit(WIDTH); // Para cerrar totalmente el sistema.
            dispose(); // Para cerrar ventanas de opciones o formularios sin parar el sistema.
        }
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        
        operacion = "agregar";
        desa_botones(1);
        generar_codigo();
        txtdescripcion.setEnabled(true);
        txtdescripcion.requestFocus();
        
    }//GEN-LAST:event_btnagregarActionPerformed

    private void txtdescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyPressed
        
        String descripcion = txtdescripcion.getText().trim();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER){
            if(descripcion.equals("") || descripcion.equals(" ")){
                JOptionPane.showMessageDialog(this, "Ingrese algun valor");
                txtdescripcion.requestFocus();
            }else{
                if("agregar".equals(operacion)){
                    validar_descripcion();
                }else{
                    btnguardar.setEnabled(true);
                    btnguardar.requestFocus();
                }
            }
        }
        
    }//GEN-LAST:event_txtdescripcionKeyPressed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        
        int mensaje = JOptionPane.showConfirmDialog(this, "Deseas " + operacion, "Atencion", JOptionPane.YES_NO_OPTION);
        if (mensaje == JOptionPane.YES_OPTION){
            guardar();
            btncancelar.doClick();
            /*desa_inicio();
            limpiar_campos();
            limpiar_tabla();
            cargar_tabla();
            desa_botones(2); todos estos elementos se cambian por el doClick del boton cancelar*/
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed

        boolean encontrado = buscar();
        if (!encontrado) {
            txtcodigo.requestFocus(); // vuelve el foco al campo código
            txtcodigo.selectAll();    // selecciona el texto para que el usuario pueda reemplazarlo
            return;                   // corta la ejecución del resto del método
        }
        if ("eliminar".equals(operacion)) {
            //buscar();
            txtdescripcion.setEnabled(false);
            txtcodigo.setEnabled(false);
            btnguardar.setEnabled(true);
            btnguardar.requestFocus();
        } else {
            //buscar();
            txtcodigo.setEnabled(false);
            txtdescripcion.setEnabled(true);
            txtdescripcion.requestFocus();
        }
        
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        
        operacion = "eliminar";
        desa_botones(1);
        JOptionPane.showMessageDialog(this, "Ingresa el numero de la ciudad a eliminar!");
        txtcodigo.setEnabled(true);
        txtcodigo.requestFocus();
        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        
        limpiar_tabla();
        buscador();
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
            
        desa_inicio();
        limpiar_campos();
        limpiar_tabla();
        cargar_tabla();
        desa_botones(2);
            
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        
        imprimir();
        
    }//GEN-LAST:event_btnimprimirActionPerformed

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
            java.util.logging.Logger.getLogger(ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ciudad dialog = new ciudad(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.button.ButtonNice btnSalir;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private javax.swing.JTable tabladepo;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtbuscar;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcodigo;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
