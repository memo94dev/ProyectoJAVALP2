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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import prg.VentanaBuscar;
import prg.conectDB;

public class stock extends javax.swing.JDialog {

    conectDB con; // Traer la clase de conexion
    ResultSet rs; // Resultados de SQL definidos en conecDB
    javax.swing.table.DefaultTableModel cursor; // Cursor para recorrer la tabla
    int operacion = 0; // Bandera para definir la accion que se va a realizar (todos, por depo, por producto)

    public stock(java.awt.Frame parent, boolean modal) {

        //super(parent, modal); // Se superpone a otras ventanas u objetos
        initComponents();
        con = new conectDB(); // Instancia de la clase de conexion
        con.conectar(); // Metodo de conexion de la clase conecDB

        //cargar_tabla(); // Metodo para cargar datos de la BDD en la tabla de inicio
        inicio(); // Metodo de inicio de la pantalla
        limpiar_campos();
        llenar_combo("1");
        //setLocationRelativeTo(null); // Centrar ventana en la pantalla, lo pongo al final, en el metodo main

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnlimpiar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnSalir = new org.edisoncor.gui.button.ButtonNice();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablastock = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        checktodos = new javax.swing.JCheckBox();
        checkdeposito = new javax.swing.JCheckBox();
        checkproducto = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        labelCodigo = new org.edisoncor.gui.label.LabelMetric();
        txtcodigo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtproducto = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jPanel5 = new javax.swing.JPanel();
        labelCiudad1 = new org.edisoncor.gui.label.LabelMetric();
        combodepo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(970, 598));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel2.setOpaque(false);

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        btnbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnbuscarKeyPressed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 102, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tablastock.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tablastock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Depósito", "Producto", "Cantidad", "Cajas"
            }
        ));
        tablastock.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablastock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablastockMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablastock);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));
        jPanel3.setOpaque(false);

        buttonGroup1.add(checktodos);
        checktodos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checktodos.setText("Todos");
        checktodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checktodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(checkdeposito);
        checkdeposito.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkdeposito.setText("Por Depósito");
        checkdeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkdepositoActionPerformed(evt);
            }
        });

        buttonGroup1.add(checkproducto);
        checkproducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkproducto.setText("Por Producto");
        checkproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkproductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(checktodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkproducto)
                    .addComponent(checkdeposito))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(checktodos)
                .addGap(27, 27, 27)
                .addComponent(checkproducto)
                .addGap(28, 28, 28)
                .addComponent(checkdeposito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Por Producto"));
        jPanel4.setOpaque(false);

        labelCodigo.setText("Código: ");
        labelCodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcodigo.setDescripcion("Cód.");
        txtcodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoKeyPressed(evt);
            }
        });

        txtproducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtproducto.setDescripcion("Producto");
        txtproducto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Por Depósito"));
        jPanel5.setOpaque(false);

        labelCiudad1.setText("Por Depósito:");
        labelCiudad1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        combodepo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        combodepo.setForeground(new java.awt.Color(102, 102, 102));
        combodepo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combodepo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combodepoMouseClicked(evt);
            }
        });
        combodepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodepoActionPerformed(evt);
            }
        });
        combodepo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combodepoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                combodepoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCiudad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combodepo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(labelCiudad1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combodepo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        panelCurves1.add(jPanel1, java.awt.BorderLayout.CENTER);

        panelNice1.add(panelCurves1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Metodo de inicio */
    private void inicio() {

        btnbuscar.setEnabled(false);
        txtcodigo.setEnabled(false);
        txtproducto.setEnabled(false);
        combodepo.setEnabled(false);

    }

    /* Metodo para inhabilitar botones y habilitar botones */
    private void desa_botones(int a) {

        /*switch (a) {
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
        }*/
    }

    // Metodo para limpiar campos
    private void limpiar_campos() {

        txtcodigo.setText("");
        txtproducto.setText("");
        //buttonGroup1.clearSelection(); // Deseleccionar todos los check buttons

    }

    // Metodo para cargar datos en la tabla con datos de la BDD
    private void cargar_tabla() {

        try {
            cursor = (DefaultTableModel) tablastock.getModel();
            String sql = "SELECT d.cod_deposito, d.descrip, p.cod_producto, p.p_descrip, s.cantidad, s.cajas "
                    + "FROM stock s, deposito d, producto p "
                    + "WHERE s.cod_deposito = d.cod_deposito AND s.cod_producto = p.cod_producto;";
            rs = con.Listar(sql);
            String[] fila = new String[4];
            while (rs.next()) {
                fila[0] = rs.getString("descrip");
                fila[1] = rs.getString("p_descrip");
                fila[2] = rs.getString("cantidad");
                fila[3] = rs.getString("cajas");
                cursor.addRow(fila);
                System.out.println("ingresa");
            }
        } catch (SQLException ex) {
            Logger.getLogger(stock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para cargar tabla por deposito
    private void cargar_tabla_deposito() {

        try {
            cursor = (DefaultTableModel) tablastock.getModel();
            String sql = "SELECT d.cod_deposito, d.descrip, p.cod_producto, p.p_descrip, s.cantidad, s.cajas "
                    + "FROM stock s, deposito d, producto p "
                    + "WHERE s.cod_deposito = d.cod_deposito "
                    + "AND s.cod_producto = p.cod_producto "
                    + "AND d.cod_deposito = "
                    + "(SELECT SPLIT_PART('" + combodepo.getSelectedItem() + "','-',1)::integer);";
            rs = con.Listar(sql);
            String[] fila = new String[4];
            while (rs.next()) {
                fila[0] = rs.getString("descrip");
                fila[1] = rs.getString("p_descrip");
                fila[2] = rs.getString("cantidad");
                fila[3] = rs.getString("cajas");
                cursor.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(stock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para cargar tabla por producto
    private void cargar_tabla_producto() {

        try {
            cursor = (DefaultTableModel) tablastock.getModel();
            String sql = "SELECT d.cod_deposito, d.descrip, p.cod_producto, p.p_descrip, s.cantidad, s.cajas "
                    + "FROM stock s, deposito d, producto p "
                    + "WHERE s.cod_deposito = d.cod_deposito "
                    + "AND s.cod_producto = p.cod_producto "
                    + "AND p.cod_producto = "
                    + txtcodigo.getText();
            rs = con.Listar(sql);
            String[] fila = new String[4];
            while (rs.next()) {
                fila[0] = rs.getString("descrip");
                fila[1] = rs.getString("p_descrip");
                fila[2] = rs.getString("cantidad");
                fila[3] = rs.getString("cajas");
                cursor.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(stock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para cargar combobox
    private void llenar_combo(String orden) {

        try {
            String sql = "SELECT CONCAT(cod_deposito, '- ' , descrip) AS deposito FROM deposito ORDER BY cod_deposito ASC;";
            rs = con.Listar(sql);
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    combodepo.addItem(rs.getString("deposito"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(stock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para limpiar valores de la tabla
    private void limpiar_tabla() {

        cursor = (DefaultTableModel) tablastock.getModel();
        while (cursor.getRowCount() > 0) {
            cursor.removeRow(0);
        }

    }

    // Metodo para validar producto para que no se dupliquen
    private String buscar(String codigo) {

        try {
            String sql = "SELECT p_descrip FROM producto WHERE cod_producto = " + codigo;
            rs = con.Listar(sql);
            if (rs.next()) {
                String ds = rs.getString("p_descrip").trim();;
                System.out.println("Se encuentra el producto en la BDD: " + ds);
                return ds;
            }
        } catch (SQLException ex) {
            Logger.getLogger(stock.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    // Metodo para buscar datos
    private void buscador() {

        try {
            cursor = (DefaultTableModel) tablastock.getModel();
            String buscar = txtcodigo.getText().toUpperCase().trim();
            String sql = "SELECT p.cod_producto, CONCAT(p.cod_tipo_prod, '- ', t.t_p_descrip) AS tipo_producto, CONCAT(p.id_u_medida, '- ', u.u_descrip) AS medida, p.p_descrip, p.precio "
                    + "FROM producto p "
                    + "JOIN tipo_producto t ON p.cod_tipo_prod = t.cod_tipo_prod "
                    + "JOIN u_medida u ON p.id_u_medida = u.id_u_medida "
                    + "WHERE p.p_descrip ILIKE '%" + buscar + "%'"
                    + "ORDER BY p.cod_producto ASC;";
            rs = con.Listar(sql);
            String[] fila = new String[5];
            while (rs.next()) {
                fila[0] = rs.getString("cod_producto");
                fila[1] = rs.getString("p_descrip");
                fila[2] = rs.getString("tipo_producto");
                fila[3] = rs.getString("medida");
                fila[4] = rs.getString("precio");
                cursor.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(stock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo imprimir Reporte
    private void imprimir() {

        try {
            String sql = "SELECT * FROM v_reporte_productos;";
            rs = con.Listar(sql);
            Map parameters = new HashMap();
            parameters.put("", new String(""));
            JasperReport jr = null;

            // Cargamos el reporte
            URL url = getClass().getClassLoader().getResource("reportes/reporte_productos.jasper");
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
            Logger.getLogger(stock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para buscar y validar todos los productos
    private void validar_todos() {

        try {
            rs = con.Listar("SELECT d.cod_deposito, d.descrip, p.cod_producto, p.p_descrip, s.cantidad, s.cajas "
                    + "FROM stock s, deposito d, producto p "
                    + "WHERE s.cod_deposito = d.cod_deposito AND s.cod_producto = p.cod_producto");
            boolean encontro = rs.next();
            if (encontro == false) {
                JOptionPane.showMessageDialog(this, "No existen productos en stock!");
            } else {
                cargar_tabla();
            }
        } catch (SQLException ex) {
            Logger.getLogger(stock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para buscar por deposito
    private void validar_deposito() {

        try {
            rs = con.Listar("SELECT d.cod_deposito, d.descrip, p.cod_producto, p.p_descrip, s.cantidad, s.cajas "
                    + "FROM stock s, deposito d, producto p "
                    + "WHERE s.cod_deposito = d.cod_deposito "
                    + "AND s.cod_producto = p.cod_producto "
                    + "AND d.cod_deposito = "
                    + "(SELECT SPLIT_PART('" + combodepo.getSelectedItem() + "','-',1)::integer);");
            boolean encontro = rs.next();
            if (encontro == false) {
                JOptionPane.showMessageDialog(this, "No existen productos en el deposito!");
            } else {
                cargar_tabla_deposito();
            }
        } catch (SQLException ex) {
            Logger.getLogger(stock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para buscar por producto
    private void validar_producto() {

        try {
            rs = con.Listar("SELECT d.cod_deposito, d.descrip, p.cod_producto, p.p_descrip, s.cantidad, s.cajas "
                    + "FROM stock s, deposito d, producto p "
                    + "WHERE s.cod_deposito = d.cod_deposito "
                    + "AND s.cod_producto = p.cod_producto "
                    + "AND p.cod_producto = "
                    + txtcodigo.getText());
            boolean encontro = rs.next();
            if (encontro == false) {
                JOptionPane.showMessageDialog(this, "No existe el producto!");
            } else {
                cargar_tabla_producto();
            }
        } catch (SQLException ex) {
            Logger.getLogger(stock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int mensaje = JOptionPane.showConfirmDialog(this, "Desea salir?", "Atención", JOptionPane.YES_NO_OPTION); // Mensaje al presionar el boton salir
        if (mensaje == JOptionPane.YES_OPTION) {
            //System.exit(WIDTH); // Para cerrar totalmente el sistema.
            dispose(); // Para cerrar ventanas de opciones o formularios sin parar el sistema.
        }

    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed

    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        if (operacion == 1) {
            validar_todos();
            /*checktodos.setEnabled(false);
            checkdeposito.setEnabled(false);
            checkproducto.setEnabled(false);
            buttonGroup1.clearSelection();
            checktodos.isSelected();*/
        }
        if (operacion == 2) {
            validar_deposito();
        }
        if (operacion == 3) {
            validar_producto();
        }
        btnbuscar.setEnabled(false);


    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed

        inicio();
        limpiar_campos();
        limpiar_tabla();
        btnbuscar.setEnabled(false);

    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void tablastockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablastockMouseClicked

    }//GEN-LAST:event_tablastockMouseClicked

    private void txtproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductoActionPerformed

    private void combodepoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combodepoMouseClicked

    }//GEN-LAST:event_combodepoMouseClicked

    private void combodepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodepoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combodepoActionPerformed

    private void combodepoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combodepoKeyPressed

        btnbuscar.setEnabled(true);
        btnbuscar.requestFocus();

    }//GEN-LAST:event_combodepoKeyPressed

    private void combodepoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combodepoKeyTyped

    }//GEN-LAST:event_combodepoKeyTyped

    private void checktodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checktodosActionPerformed

        limpiar_tabla();
        limpiar_campos();
        operacion = 1;
        btnbuscar.setEnabled(true);
        btnbuscar.requestFocus();

    }//GEN-LAST:event_checktodosActionPerformed

    private void checkproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkproductoActionPerformed

        JOptionPane.showMessageDialog(this, "Presione enter para seleccionar un producto!");
        limpiar_tabla();
        limpiar_campos();
        operacion = 3;
        txtcodigo.setEnabled(true);
        txtcodigo.requestFocus();

    }//GEN-LAST:event_checkproductoActionPerformed

    private void checkdepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkdepositoActionPerformed

        limpiar_tabla();
        limpiar_campos();
        operacion = 2;
        combodepo.setEnabled(true);
        combodepo.requestFocus();

    }//GEN-LAST:event_checkdepositoActionPerformed

    private void txtcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String codigo = txtcodigo.getText().trim();

            JTextField[] tfParam = new JTextField[2];
            tfParam[0] = txtcodigo;
            tfParam[1] = txtproducto;

            VentanaBuscar buscarproveedor = new VentanaBuscar("SELECT cod_producto, p_descrip, precio FROM producto WHERE p_descrip ILIKE ",
                    new String[]{"Codigo", "Producto", "Precio",}, 3, tfParam);
            buscarproveedor.setTitle("Buscar Producto");
            buscarproveedor.setVisible(true);

            txtcodigo.setEnabled(false);
            btnbuscar.setEnabled(true);
            btnbuscar.requestFocus();

        }

    }//GEN-LAST:event_txtcodigoKeyPressed

    private void btnbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnbuscarKeyPressed

        if (operacion == 1) {
            validar_todos();
        }
        if (operacion == 2) {
            validar_deposito();
        }
        if (operacion == 3) {
            validar_producto();
        }
        btnbuscar.setEnabled(false);

    }//GEN-LAST:event_btnbuscarKeyPressed

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
            java.util.logging.Logger.getLogger(stock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                stock dialog = new stock(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.button.ButtonNice btnSalir;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkdeposito;
    private javax.swing.JCheckBox checkproducto;
    private javax.swing.JCheckBox checktodos;
    private javax.swing.JComboBox<String> combodepo;
    private javax.swing.JComboBox<String> combodeposito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelCiudad1;
    private org.edisoncor.gui.label.LabelMetric labelCodigo;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private javax.swing.JTable tablastock;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcodigo;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtproducto;
    // End of variables declaration//GEN-END:variables
}
