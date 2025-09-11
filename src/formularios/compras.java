package formularios;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
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

public class compras extends javax.swing.JDialog {
    
    conectDB con; // Traer la clase de conexion
    ResultSet rs; // Resultados de SQL definidos en conecDB
    javax.swing.table.DefaultTableModel cursor; // Cursor para recorrer la tabla
    int operacion = 0; // Bandera para definir la accion que se va a realizar (insert, update, delete)
    int total = 0;
    DecimalFormat formateador = new DecimalFormat("###,###,###");
    
    public compras(java.awt.Frame parent, boolean modal) {

        //super(parent, modal); // Se superpone a otras ventanas u objetos
        initComponents();
        con = new conectDB(); // Instancia de la clase de conexion
        con.conectar(); // Metodo de conexion de la clase conecDB

        fecha();
        hora();
        txtusuario.setText(acceso.username);
        desa_inicio(); // Metodo de inicio de la pantalla
        llenar_combo("0");
        setLocationRelativeTo(null); // Centrar ventana en la pantalla, lo llevo al metodo main

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtproducto = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtcodigoproducto = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelApellido = new org.edisoncor.gui.label.LabelMetric();
        labelTelefono = new org.edisoncor.gui.label.LabelMetric();
        txtprecio = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtcantidad = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelTelefono1 = new org.edisoncor.gui.label.LabelMetric();
        btnaddproducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacompra = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btngrabar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnSalir = new org.edisoncor.gui.button.ButtonNice();
        btnanular = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelCodigo = new org.edisoncor.gui.label.LabelMetric();
        txtcodigo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtusuario = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelDocumento = new org.edisoncor.gui.label.LabelMetric();
        txtfecha = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelNombre1 = new org.edisoncor.gui.label.LabelMetric();
        txthora = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelNombre2 = new org.edisoncor.gui.label.LabelMetric();
        jPanel5 = new javax.swing.JPanel();
        labelNombre = new org.edisoncor.gui.label.LabelMetric();
        txtcodigoproveedor = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtproveedor = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtfactura = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelDireccion = new org.edisoncor.gui.label.LabelMetric();
        labelCiudad = new org.edisoncor.gui.label.LabelMetric();
        combodeposito = new javax.swing.JComboBox<>();
        txttotal = new javax.swing.JTextField();
        labelTelefono2 = new org.edisoncor.gui.label.LabelMetric();
        labelApellido1 = new org.edisoncor.gui.label.LabelMetric();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compras", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(970, 598));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));
        jPanel2.setOpaque(false);

        txtproducto.setDescripcion("Producto");
        txtproducto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductoActionPerformed(evt);
            }
        });
        txtproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtproductoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtproductoKeyTyped(evt);
            }
        });

        txtcodigoproducto.setDescripcion("Cód.");
        txtcodigoproducto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtcodigoproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoproductoActionPerformed(evt);
            }
        });
        txtcodigoproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoproductoKeyPressed(evt);
            }
        });

        labelApellido.setText("Producto:");
        labelApellido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelTelefono.setText("Precio:");
        labelTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtprecio.setDescripcion("Precio");
        txtprecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprecioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });

        txtcantidad.setDescripcion("Cantidad");
        txtcantidad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
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

        labelTelefono1.setText("Cantidad:");
        labelTelefono1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnaddproducto.setText("+");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcodigoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtprecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(labelTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnaddproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaddproducto, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tablacompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tablacompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Producto", "Precio", "Cantidad", "Cod_depo"
            }
        ));
        tablacompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablacompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacompraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablacompra);
        if (tablacompra.getColumnModel().getColumnCount() > 0) {
            tablacompra.getColumnModel().getColumn(4).setMinWidth(0);
            tablacompra.getColumnModel().getColumn(4).setPreferredWidth(0);
            tablacompra.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel3.setOpaque(false);

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btngrabar.setText("Grabar");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });
        btngrabar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btngrabarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btngrabarKeyTyped(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 102, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnanular.setText("Anular");
        btnanular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btngrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnanular, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnanular, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
        jPanel4.setOpaque(false);

        labelCodigo.setText("Código: ");
        labelCodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

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

        txtusuario.setDescripcion("Usuario");
        txtusuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusuarioKeyPressed(evt);
            }
        });

        labelDocumento.setText("Usuario: ");
        labelDocumento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtfecha.setDescripcion("Ingrese la fecha");
        txtfecha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });
        txtfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfechaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfechaKeyTyped(evt);
            }
        });

        labelNombre1.setText("Fecha: ");
        labelNombre1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txthora.setDescripcion("Ingrese la hora");
        txthora.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txthora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthoraActionPerformed(evt);
            }
        });
        txthora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txthoraKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthoraKeyTyped(evt);
            }
        });

        labelNombre2.setText("Hora:");
        labelNombre2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedor/Depósito"));
        jPanel5.setOpaque(false);

        labelNombre.setText("Proveedor:");
        labelNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtcodigoproveedor.setDescripcion("Cód.");
        txtcodigoproveedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtcodigoproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoproveedorActionPerformed(evt);
            }
        });
        txtcodigoproveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoproveedorKeyPressed(evt);
            }
        });

        txtproveedor.setDescripcion("Razón Social");
        txtproveedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproveedorActionPerformed(evt);
            }
        });
        txtproveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtproveedorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtproveedorKeyTyped(evt);
            }
        });

        txtfactura.setDescripcion("Número de Factura");
        txtfactura.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfacturaActionPerformed(evt);
            }
        });
        txtfactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfacturaKeyPressed(evt);
            }
        });

        labelDireccion.setText("Nr. Factura:");
        labelDireccion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelCiudad.setText("Depósito:");
        labelCiudad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        combodeposito.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        combodeposito.setForeground(new java.awt.Color(102, 102, 102));
        combodeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combodeposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combodepositoMouseClicked(evt);
            }
        });
        combodeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodepositoActionPerformed(evt);
            }
        });
        combodeposito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combodepositoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                combodepositoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcodigoproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfactura, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(combodeposito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigoproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combodeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txttotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        labelTelefono2.setText("Gs.:");
        labelTelefono2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelApellido1.setText("Total Compra:");
        labelApellido1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        panelCurves1.add(jPanel1, java.awt.BorderLayout.CENTER);

        panelNice1.add(panelCurves1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Metodo para traer la fecha de la Base de Datos
    private void fecha() {
        
        try {
            rs = con.Listar("SELECT TO_CHAR(CURRENT_DATE, 'DD/MM/YYYY') AS fecha;");
            rs.next();
            txtfecha.setText(rs.getString("fecha"));
        } catch (SQLException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    // Metodo para traer la hora de la Base de Datos
    private void hora() {
        
        try {
            rs = con.Listar("SELECT TO_CHAR(CURRENT_TIMESTAMP, 'HH12:MI:SS') AS hora;");
            rs.next();
            txthora.setText(rs.getString("hora"));
        } catch (SQLException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /* Metodo para inhabilitar el boton guardar y las entradas de texto al iniciar la pantalla */
    private void desa_inicio() {
        
        btngrabar.setEnabled(false);
        txtcodigoproducto.setEnabled(false);
        txtproducto.setEnabled(false);
        txtcantidad.setEnabled(false);
        txtprecio.setEnabled(false);
        txtusuario.setEnabled(false);
        txtcodigo.setEnabled(false);
        txtproveedor.setEnabled(false);
        txtcodigoproveedor.setEnabled(false);
        txtfactura.setEnabled(false);
        combodeposito.setEnabled(false);
        txtfactura.setEnabled(false);
        txtfecha.setEnabled(false);
        txthora.setEnabled(false);
        btnaddproducto.setEnabled(false);
        btnagregar.setEnabled(true);
        btncancelar.setEnabled(false);
        btnanular.setEnabled(true);
        btnSalir.setEnabled(true);
        txttotal.setEnabled(false);
        
    }

    /* Metodo para inhabilitar botones y habilitar botones */
    private void desa_botones(int a) {
        
        switch (a) {
            case 1:
                btnagregar.setEnabled(false);
                btnSalir.setEnabled(false);
                btncancelar.setEnabled(true);
                btnanular.setEnabled(false);
                break;
            case 2:
                btnagregar.setEnabled(true);
                btnSalir.setEnabled(true);
                btngrabar.setEnabled(false);
                btnanular.setEnabled(true);
                break;
        }
        
    }

    /* Metodo para realizar consulta de los codigos existentes y devolver el siguiente codigo de compra a utilizar */
    private void generar_codigo() {
        
        try {
            String sql = "SELECT COALESCE (MAX(cod_compra),0)+1 AS cod FROM compra;"; // Creamos la consulta SQL.
            rs = con.Listar(sql); // Utilizamos el metodo listar.
            rs.next(); // Llamar a los siguientes resultados.
            txtcodigo.setText(rs.getString("cod")); // Enviar el resultado en el campo de codigo de nuestro formulario.
        } catch (SQLException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /* Metodo para validar duplicidad de valores en la BDD */
    private boolean validar_documento() {
        
        try {
            String doc = txtusuario.getText().trim();
            rs = con.Listar("SELECT * FROM clientes WHERE ci_ruc = '" + doc + "'");
            //boolean encontro = rs.next();
            if (rs.next()) {
                String nombre = rs.getString("cli_nombre");
                String apellido = rs.getString("cli_apellido");
                JOptionPane.showMessageDialog(this, "El documento ingresado '" + doc
                        + "' ya ha sido registrado para: " + nombre + " " + apellido);
                return true; // Documento duplicado
            }
        } catch (SQLException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; // Documento no duplicado

    }

    // Metodo para guardar nuevo registro en la BDD
    private void guardar() {
        
        String codigo = txtcodigoproducto.getText().trim();
        String codigoCompra = txtcodigo.getText().trim();
        String codigoproveedor = txtcodigoproveedor.getText().trim();
        String factura = txtfactura.getText().trim();
        String fecha = txtfecha.getText().toUpperCase().trim();
        String hora = txthora.getText().trim();
        String deposito = (String) combodeposito.getSelectedItem();
        // Grabar cabecera de compra
        if (operacion == 1) {
            String estado = "activo";
            String monto = txttotal.getText();
            String montoreal = monto.replace(".", "");
            con.insertar_datos("compra",
                    "cod_compra, cod_proveedor, nro_factura, fecha, estado, cod_deposito, hora, total_compra",
                    codigoCompra + ", "
                    + codigoproveedor + ", '"
                    + factura + "', "
                    + "(SELECT ('" + fecha + "')::date), '"
                    + estado + "', "
                    + "(SELECT SPLIT_PART('" + deposito + "','-',1)::integer), "
                    + "(SELECT ('" + hora + "')::time), "
                    + montoreal,
                    1);
            // Grabar detalle de compra
            for (int a = 0; a < tablacompra.getRowCount(); a++) {
                con.insertar_datos("detalle_compra",
                        "cod_producto, cod_compra, cod_deposito, precio, cantidad",
                        tablacompra.getValueAt(a, 0) + ", "
                        + codigoCompra + ", "
                        + "(SELECT SPLIT_PART('" + deposito + "','-',1)::integer), "
                        + tablacompra.getValueAt(a, 2) + ", "
                        + tablacompra.getValueAt(a, 3),
                         2);
            }
            // Grabar o actualizar stock
            for (int b = 0; b < tablacompra.getRowCount(); b++) {
                try {
                    rs = con.Listar("SELECT * FROM stock WHERE cod_producto = " + tablacompra.getValueAt(b, 0) + "AND cod_deposito = "
                            + "(SELECT SPLIT_PART('" + deposito + "','-',1)::integer)");
                    boolean encontro = rs.next();
                    if (encontro == false) {
                        con.insertar_datos("stock",
                                "cod_producto, cod_deposito, cantidad, cajas",
                                tablacompra.getValueAt(b, 0) + ", "
                                + "(SELECT SPLIT_PART('" + deposito + "','-',1)::integer), "
                                + tablacompra.getValueAt(b, 3) + ", "
                                + tablacompra.getValueAt(b, 3) + "/12",
                                 2);
                    } else {
                        String sql = "UPDATE stock SET cantidad = cantidad + " + tablacompra.getValueAt(b, 3)
                                + ", cajas = ((SELECT cantidad FROM stock WHERE cod_deposito = (SELECT SPLIT_PART('" + deposito + "','-',1)::integer) AND cod_producto = "
                                + tablacompra.getValueAt(b, 0) + ") + " + tablacompra.getValueAt(b, 3) + ") / 12" // Obtener la cantidad total de productos de la base de datos con una subconsulta
                                + "WHERE cod_producto = " + tablacompra.getValueAt(b, 0)
                                + " AND cod_deposito = "
                                + "(SELECT SPLIT_PART('" + deposito + "','-',1)::integer)";
                        System.out.println(sql);
                        con.sentencia = con.conectar().createStatement();
                        con.sentencia.executeUpdate(sql);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        if (operacion == 2) {
            String estado = "anulado";
            System.out.println(codigo);
            String codigo_anular = txtcodigo.getText().trim();
            con.actualizar_datos("compra",
                    "estado = '" + estado + "' ",
                    "cod_compra = " + codigo_anular, 3);
            
            for (int c = 0; c < tablacompra.getRowCount(); c++) {
                try {
                    String sql = "UPDATE stock SET cantidad = cantidad - " + tablacompra.getValueAt(c, 3)
                            + ", cajas = cantidad / 12 WHERE cod_producto = " + tablacompra.getValueAt(c, 0)
                            + " AND cod_deposito = " + tablacompra.getValueAt(c, 4);
                    System.out.println(sql);
                    con.sentencia = con.conectar().createStatement();
                    con.sentencia.executeUpdate(sql);
                } catch (SQLException ex) {
                    Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    // Metodo para limpiar campos
    private void limpiar_campos() {
        
        txtcodigoproducto.setText("");
        txtcodigo.setText("");
        txtproducto.setText("");
        txtcantidad.setText("");
        txtcodigoproveedor.setText("");
        txtproveedor.setText("");
        txtfactura.setText("");
        txtprecio.setText("");
        txttotal.setText("");
        //txttotal.setText("");

    }

    // Metodo para cargar datos en la tabla con datos de la BDD
    private void cargar_tabla() {
        
        cursor = (DefaultTableModel) tablacompra.getModel();
        int subtotal = 0;
        subtotal = Integer.parseInt(txtcantidad.getText()) * Integer.parseInt(txtprecio.getText());
        total = total + subtotal;
        txttotal.setText(formateador.format(total));
        String campo[] = new String[]{txtcodigoproducto.getText(), txtproducto.getText(),
            txtprecio.getText(), txtcantidad.getText()};
        
        cursor.addRow(campo);
        
        nuevo_producto();
        btngrabar.setEnabled(true);
        
    }

    // Metodo para agregar nuevo producto
    private void nuevo_producto() {
        
        txtcodigoproducto.setText("");
        txtproducto.setText("");
        txtcantidad.setText("");
        txtprecio.setText("");
        txtcodigoproducto.setEnabled(true);
        txtprecio.setEnabled(false);
        txtcantidad.setEnabled(false);
        txtcodigoproducto.requestFocus();
        
    }

    // Metodo para cargar combobox
    private void llenar_combo(String orden) {
        
        try {
            String sql = "SELECT CONCAT (cod_deposito, '- ', descrip) AS deposito FROM deposito ORDER BY cod_deposito = " + orden + "DESC;";
            rs = con.Listar(sql);
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    combodeposito.addItem(rs.getString("deposito"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    // Metodo para limpiar valores de la tabla
    private void limpiar_tabla() {
        
        cursor = (DefaultTableModel) tablacompra.getModel();
        while (cursor.getRowCount() > 0) {
            cursor.removeRow(0);
        }
        
    }

    // Metodo para validar documento para que no se dupliquen al editar
    private String buscar(String codigo) {
        
        try {
            String sql = "SELECT ci_ruc FROM clientes WHERE id_cliente = " + codigo;
            rs = con.Listar(sql);
            if (rs.next()) {
                return rs.getString("ci_ruc").trim();
            }
        } catch (SQLException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

    // Metodo para habilitar campos dentro del metodo txtdocumento
    private void habilitarCampos() {

        /* txtnombre.setEnabled(true);
        txtnombre.requestFocus();
        txtusuario.setEnabled(false);*/
    }

    // Metodo para mostrar mensaje dentro del metodo txtdocumento
    private void mostrarErrorDocumento() {
        
        txtusuario.requestFocus();
        txtusuario.selectAll();
        
    }

    // Metodo para buscar datos
    private void buscador() {

        /* try {
            cursor = (DefaultTableModel) tablacompra.getModel();
            String buscar = txtbuscar.getText().toUpperCase().trim();
            String sql = "SELECT * FROM clientes WHERE ci_ruc LIKE '%" + buscar + "%' OR cli_nombre ILIKE '%" + buscar + "%' ORDER BY id_cliente;";
            rs = con.Listar(sql);
            String[] fila = new String[6];
            while (rs.next()) {
                fila[0] = rs.getString("id_cliente");
                fila[1] = rs.getString("ci_ruc");
                fila[2] = rs.getString("cli_nombre");
                fila[3] = rs.getString("cli_apellido");
                fila[4] = rs.getString("cli_direccion");
                fila[5] = rs.getString("cli_telefono");
                cursor.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    // Metodo imprimir Reporte
    private void imprimir() {
        
        try {
            String sql = "SELECT * FROM v_reporte_clientes;";
            rs = con.Listar(sql);
            Map parameters = new HashMap();
            parameters.put("", new String(""));
            JasperReport jr = null;

            // Cargamos el reporte
            URL url = getClass().getClassLoader().getResource("reportes/reporte_clientes.jasper");
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
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    // Ver datos
    private void ver_datos() {
        
        int fila = tablacompra.getSelectedRow();
        txtcodigoproducto.setText(tablacompra.getValueAt(fila, 0).toString());
        txtusuario.setText(tablacompra.getValueAt(fila, 1).toString());
        //txtnombre.setText(tablacompra.getValueAt(fila, 2).toString());
        txtproveedor.setText(tablacompra.getValueAt(fila, 3).toString());
        //combociudad.setEnabled(true);
        txtfactura.setText(tablacompra.getValueAt(fila, 4).toString());
        txtprecio.setText(tablacompra.getValueAt(fila, 5).toString());
        
        String codigo = tablacompra.getValueAt(fila, 0).toString();
        //System.out.println("Codigo del cliente: " + codigo);

        try {
            String sql = "SELECT CONCAT(c.cod_ciudad, '-', c.descrip_ciudad) AS ciudad FROM ciudad c JOIN clientes cl ON cl.cod_ciudad = c.cod_ciudad WHERE cl.id_cliente = "
                    + codigo;
            //System.out.println(sql);
            rs = con.Listar(sql);
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    String ciudad = rs.getString("ciudad");
                    //System.out.println(ciudad);
                    combodeposito.setSelectedItem(rs.getString("ciudad"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    // Metodo para anular
    private void accion_anular() {
        
        try {
            String codigo = txtcodigo.getText().trim();
            rs = con.Listar("SELECT CONCAT (d.cod_deposito, '- ', d.descrip) AS deposito, p.razon_social, c.* FROM compra c, proveedor p, deposito d WHERE c.cod_proveedor = p.cod_proveedor AND c.cod_deposito = d.cod_deposito AND c.cod_compra = " + codigo);
            boolean encontro = rs.next();
            if (encontro == true) {
                txtfactura.setText(rs.getString("nro_factura"));
                txtcodigoproveedor.setText(rs.getString("cod_proveedor"));
                txtproveedor.setText(rs.getString("razon_social"));
                //combodeposito.addItem(rs.getString("deposito")); // Para agregar valores al combobox
                combodeposito.setSelectedItem(rs.getString("deposito")); // Para seleccionar un valor del combobox
                //System.out.println("Deposito: " + rs.getString("deposito"));
                cargar_tabla_anular();
                txtcodigo.setEnabled(false);
                operacion = 2;
                btngrabar.setEnabled(true);
                btngrabar.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "No existe el codigo de compras ingresado!");
                txtcodigo.selectAll();
            }
        } catch (SQLException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    // Metodo para cargar tabla con detalles de la compra a anular
    private void cargar_tabla_anular() {
        
        try {
            String codigo = txtcodigo.getText();
            cursor = (DefaultTableModel) tablacompra.getModel();
            rs = con.Listar("SELECT dt.cod_producto, p.p_descrip, dt.precio, dt.cantidad, dt.cod_deposito"
                    + " FROM detalle_compra dt, producto p"
                    + " WHERE dt.cod_producto = p.cod_producto"
                    + " AND dt.cod_compra = " + codigo + ";");
            String [] fila = new String[5];
            while (rs.next()) {
                fila [0] = rs.getString("cod_producto");
                fila [1] = rs.getString("p_descrip");
                fila [2] = rs.getString("precio");
                fila [3] = rs.getString("cantidad");
                fila [4] = rs.getString("cod_deposito");
                cursor.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void txtcodigoproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoproductoActionPerformed

        /* boolean encontrado = buscar();
        if (!encontrado) {
            txtcodigo.requestFocus(); // vuelve el foco al campo código
            txtcodigo.selectAll();    // selecciona el texto para que el usuario pueda reemplazarlo
            return;                   // corta la ejecución del resto del método
        }
        if ("eliminar".equals(operacion)) {
            //buscar_deposito();
            txtnombre.setEnabled(false);
            txtcodigo.setEnabled(false);
            btnguardar.setEnabled(true);
            btnguardar.requestFocus();
        } else {
            //buscar_deposito();
            txtcodigo.setEnabled(false);
            txtnombre.setEnabled(true);
            txtnombre.requestFocus();
        }
         */
    }//GEN-LAST:event_txtcodigoproductoActionPerformed

    private void txtproveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtproveedorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproveedorKeyPressed

    private void txtfacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfacturaKeyPressed

        /*if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            String factura = txtfactura.getText().trim();
            if (factura.equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese un numero de factura!");
                txtfactura.requestFocus();
            }
        }*/

    }//GEN-LAST:event_txtfacturaKeyPressed

    private void txtprecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioKeyPressed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyPressed
        
        String codigo = txtcodigoproducto.getText().trim();
        String documento = txtusuario.getText().trim();
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (documento.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete este campo!");
                txtusuario.requestFocus();
                return;
            }
            
            if (operacion == 1) {
                // Modo guardar: validar si el documento ya existe
                if (!validar_documento()) {
                    habilitarCampos();
                } else {
                    mostrarErrorDocumento();
                }
            } else {
                // Modo edición
                String documentoActual = buscar(codigo);
                if (documentoActual == null) {
                    JOptionPane.showMessageDialog(this, "El código ingresado no existe");
                    txtcodigoproducto.requestFocus();
                    return;
                }
                
                if (documento.equals(documentoActual)) {
                    // Documento no cambió, no validar
                    habilitarCampos();
                } else {
                    // Documento cambió, validar
                    if (!validar_documento()) {
                        habilitarCampos();
                    } else {
                        mostrarErrorDocumento();
                    }
                }
            }
        }
        

    }//GEN-LAST:event_txtusuarioKeyPressed

    private void txtproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproveedorActionPerformed
        
        txtproveedor.setEnabled(false);
        combodeposito.setEnabled(true);
        combodeposito.requestFocus();

    }//GEN-LAST:event_txtproveedorActionPerformed

    private void txtproveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtproveedorKeyTyped
        
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo puede ingresar letras");
            txtproveedor.requestFocus();
        }

    }//GEN-LAST:event_txtproveedorKeyTyped

    private void combodepositoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combodepositoKeyTyped
        
        combodeposito.setEnabled(false);
        txtfactura.setEnabled(true);
        txtfactura.requestFocus();

    }//GEN-LAST:event_combodepositoKeyTyped

    private void combodepositoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combodepositoMouseClicked
        
        combodeposito.setEnabled(false);
        txtfactura.setEnabled(true);
        txtfactura.requestFocus();

    }//GEN-LAST:event_combodepositoMouseClicked

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        
        int k = evt.getKeyChar();
        if ((k >= 32 && k <= 45) || (k >= 58 && k <= 126)) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Solo puede ingresar numeros");
            txtprecio.requestFocus();
        }

    }//GEN-LAST:event_txtprecioKeyTyped

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        
        txtprecio.setEnabled(false);
        txtcantidad.setEnabled(true);
        txtcantidad.requestFocus();

    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfacturaActionPerformed
        
        String factura = txtfactura.getText().trim();
        if (factura.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero de factura!");
            txtfactura.requestFocus();
        } else {
            txtfactura.setEnabled(false);
            combodeposito.setEnabled(true);
            combodeposito.requestFocus();
        }

    }//GEN-LAST:event_txtfacturaActionPerformed

    private void tablacompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacompraMouseClicked
 
    }//GEN-LAST:event_tablacompraMouseClicked

    private void combodepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combodepositoActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void txtfechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaKeyPressed

    private void txtfechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaKeyTyped

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductoActionPerformed

    private void txtproductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtproductoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductoKeyPressed

    private void txtproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtproductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductoKeyTyped

    private void txtcodigoproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoproveedorActionPerformed

    private void txthoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthoraActionPerformed

    private void txthoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthoraKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthoraKeyPressed

    private void txthoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthoraKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txthoraKeyTyped

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtcantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyPressed
        
        if (evt.getKeyCode() == 10) {
            String cantidad = txtcantidad.getText().trim();
            if (cantidad.isEmpty() || cantidad.equals("0")) {
                JOptionPane.showMessageDialog(this, "Debe ingresar una cantidad valida!");
                txtcantidad.requestFocus();
            } else {
                cargar_tabla();
            }
        }
        
    }//GEN-LAST:event_txtcantidadKeyPressed

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        
        int k = evt.getKeyChar();
        if ((k >= 32 && k <= 45) || (k >= 58 && k <= 126)) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Solo puede ingresar numeros");
            txtcantidad.requestFocus();
        }
        
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        
        operacion = 1;
        generar_codigo();
        desa_botones(1);
        JOptionPane.showMessageDialog(this, "Pulsa un Enter para agregar un Proveedor!");
        txtcodigoproveedor.setEnabled(true);
        txtcodigoproveedor.requestFocus();

    }//GEN-LAST:event_btnagregarActionPerformed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        
        guardar();
        btncancelar.doClick();
        
    }//GEN-LAST:event_btngrabarActionPerformed

    private void btngrabarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btngrabarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btngrabarKeyPressed

    private void btngrabarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btngrabarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btngrabarKeyTyped

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        
        limpiar_campos();
        limpiar_tabla();
        desa_inicio();
        
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        int mensaje = JOptionPane.showConfirmDialog(this, "Desea salir?", "Atención", JOptionPane.YES_NO_OPTION); // Mensaje al presionar el boton salir
        if (mensaje == JOptionPane.YES_OPTION) {
            //System.exit(WIDTH); // Para cerrar totalmente el sistema. Con codigo 1(confuso)
            //System.exit(0); // Mejor practica, cierra el programa con codigo o(correcto)
            dispose(); // Para cerrar ventanas de opciones o formularios sin parar el sistema.
        }
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void combodepositoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combodepositoKeyPressed
        
        combodeposito.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Pulsa un Enter para seleccionar los Productos!");
        txtcodigoproducto.setEnabled(true);
        txtcodigoproducto.requestFocus();

    }//GEN-LAST:event_combodepositoKeyPressed

    private void txtcodigoproveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoproveedorKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JTextField[] tfParam = new JTextField[2];
            tfParam[0] = txtcodigoproveedor;
            tfParam[1] = txtproveedor;
            
            VentanaBuscar buscarproveedor = new VentanaBuscar("SELECT cod_proveedor, razon_social FROM proveedor WHERE razon_social ILIKE ",
                    new String[]{"Codigo", "Proveedor",}, 2, tfParam);
            buscarproveedor.setTitle("Buscar Proveedor");
            buscarproveedor.setVisible(true);
            
            txtcodigoproveedor.setEnabled(false);
            txtfactura.setEnabled(true);
            txtfactura.requestFocus();
        }

    }//GEN-LAST:event_txtcodigoproveedorKeyPressed

    private void txtcodigoproductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoproductoKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JTextField[] tfParam = new JTextField[3];
            tfParam[0] = txtcodigoproducto;
            tfParam[1] = txtproducto;
            tfParam[2] = txtprecio;
            
            VentanaBuscar buscarproducto = new VentanaBuscar("SELECT cod_producto, p_descrip, precio FROM producto WHERE p_descrip ILIKE ",
                    new String[]{"Codigo", "Producto", "Precio",}, 3, tfParam);
            buscarproducto.setTitle("Buscar Producto");
            buscarproducto.setVisible(true);
            
            txtcodigoproducto.setEnabled(false);
            txtproducto.setEnabled(false);
            txtprecio.setEnabled(true);
            txtcantidad.setEnabled(true);
            txtcantidad.requestFocus();
        }

    }//GEN-LAST:event_txtcodigoproductoKeyPressed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void btnanularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanularActionPerformed
        
        JOptionPane.showMessageDialog(this, "Ingrese el codigo de compra que desea anular");
        txtcodigo.setEnabled(true);
        txtcodigo.requestFocus();
        desa_botones(1);
        
    }//GEN-LAST:event_btnanularActionPerformed

    private void txtcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String codigo = txtcodigo.getText().trim();
            if (codigo.isEmpty() || codigo.equals("0")) {
                JOptionPane.showMessageDialog(this, "Ingresa un codigo valido para anular!");
            } else {
                try {
                    rs = con.Listar("SELECT * FROM compra WHERE cod_compra = " + codigo
                            + "AND estado = 'anulado'");
                    boolean encontro = rs.next();
                    if (encontro == true) {
                        JOptionPane.showMessageDialog(this, "La compra con el codigo ingresado ya ha sido anulada!");
                        btncancelar.doClick();
                    } else {
                        accion_anular();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }//GEN-LAST:event_txtcodigoKeyPressed

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
            java.util.logging.Logger.getLogger(compras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(compras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(compras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(compras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                compras dialog = new compras(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                dialog.setResizable(false); // Evitar que el usuario cambie el tamaño de la ventana
                dialog.setLocationRelativeTo(null); // Centrar ventana en la pantalla

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonNice btnSalir;
    private javax.swing.JButton btnaddproducto;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnanular;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btngrabar;
    private javax.swing.JComboBox<String> combodeposito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelApellido;
    private org.edisoncor.gui.label.LabelMetric labelApellido1;
    private org.edisoncor.gui.label.LabelMetric labelCiudad;
    private org.edisoncor.gui.label.LabelMetric labelCodigo;
    private org.edisoncor.gui.label.LabelMetric labelDireccion;
    private org.edisoncor.gui.label.LabelMetric labelDocumento;
    private org.edisoncor.gui.label.LabelMetric labelNombre;
    private org.edisoncor.gui.label.LabelMetric labelNombre1;
    private org.edisoncor.gui.label.LabelMetric labelNombre2;
    private org.edisoncor.gui.label.LabelMetric labelTelefono;
    private org.edisoncor.gui.label.LabelMetric labelTelefono1;
    private org.edisoncor.gui.label.LabelMetric labelTelefono2;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private javax.swing.JTable tablacompra;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcantidad;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcodigo;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcodigoproducto;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcodigoproveedor;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtfactura;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtfecha;
    private org.edisoncor.gui.textField.TextFieldRectBackground txthora;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtprecio;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtproducto;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtproveedor;
    private javax.swing.JTextField txttotal;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtusuario;
    // End of variables declaration//GEN-END:variables
}
