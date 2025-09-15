package formularios;

import java.awt.Frame;
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

public class ventas extends javax.swing.JDialog {

    conectDB con; // Traer la clase de conexion
    ResultSet rs; // Resultados de SQL definidos en conecDB
    javax.swing.table.DefaultTableModel cursor; // Cursor para recorrer la tabla
    int operacion = 0; // Bandera para definir la accion que se va a realizar (insert, update, delete)
    int total = 0;
    DecimalFormat formateador = new DecimalFormat("###,###,###");

    public ventas(java.awt.Frame parent, boolean modal) {

        //super(parent, modal); // Se superpone a otras ventanas u objetos
        initComponents();
        con = new conectDB(); // Instancia de la clase de conexion
        con.conectar(); // Metodo de conexion de la clase conecDB

        fecha();
        hora();
        txtusuario.setText(acceso.username);
        desa_inicio(); // Metodo de inicio de la pantalla
        llenar_combo();
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
        btnmas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaventa = new javax.swing.JTable();
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
        txtcodigocliente = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtcliente = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtfactura = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelDireccion = new org.edisoncor.gui.label.LabelMetric();
        combodeposito = new javax.swing.JComboBox<>();
        labelCiudad = new org.edisoncor.gui.label.LabelMetric();
        factuno = new org.edisoncor.gui.textField.TextFieldRectBackground();
        factdos = new org.edisoncor.gui.textField.TextFieldRectBackground();
        btnregistrarcliente = new javax.swing.JButton();
        txttotal = new javax.swing.JTextField();
        labelTelefono2 = new org.edisoncor.gui.label.LabelMetric();
        labelApellido1 = new org.edisoncor.gui.label.LabelMetric();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
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

        btnmas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/suma.png"))); // NOI18N
        btnmas.setToolTipText("Agregar productos");
        btnmas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasActionPerformed(evt);
            }
        });
        btnmas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnmasKeyPressed(evt);
            }
        });

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
                        .addComponent(btnmas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(btnmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tablaventa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tablaventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Producto", "Precio", "Cantidad", "Cod_depo"
            }
        ));
        tablaventa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaventaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaventa);
        if (tablaventa.getColumnModel().getColumnCount() > 0) {
            tablaventa.getColumnModel().getColumn(4).setMinWidth(0);
            tablaventa.getColumnModel().getColumn(4).setPreferredWidth(0);
            tablaventa.getColumnModel().getColumn(4).setMaxWidth(0);
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
                        .addComponent(labelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));
        jPanel5.setOpaque(false);

        labelNombre.setText("Cliente:");
        labelNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtcodigocliente.setToolTipText("Pulse ENTER para agregar un cliente");
        txtcodigocliente.setDescripcion("Cód.");
        txtcodigocliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtcodigocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoclienteActionPerformed(evt);
            }
        });
        txtcodigocliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoclienteKeyPressed(evt);
            }
        });

        txtcliente.setDescripcion("Nombre");
        txtcliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });
        txtcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtclienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtclienteKeyTyped(evt);
            }
        });

        txtfactura.setDescripcion("Nro. Factura");
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

        labelCiudad.setText("Depósito:");
        labelCiudad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        factuno.setDescripcion("000");
        factuno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        factuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factunoActionPerformed(evt);
            }
        });
        factuno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                factunoKeyPressed(evt);
            }
        });

        factdos.setDescripcion("000");
        factdos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        factdos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factdosActionPerformed(evt);
            }
        });
        factdos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                factdosKeyPressed(evt);
            }
        });

        btnregistrarcliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnregistrarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nueva-cuenta-color.png"))); // NOI18N
        btnregistrarcliente.setToolTipText("Agregar nuevo cliente");
        btnregistrarcliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregistrarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarclienteActionPerformed(evt);
            }
        });
        btnregistrarcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnregistrarclienteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnregistrarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtcodigocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(labelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(factuno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(factdos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(labelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(combodeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combodeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnregistrarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(factuno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(factdos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txttotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txttotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        labelTelefono2.setText("Gs.:");
        labelTelefono2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelApellido1.setText("Total Ventas:");
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
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
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
                .addContainerGap(62, Short.MAX_VALUE))
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
            Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para traer la hora de la Base de Datos
    private void hora() {

        try {
            rs = con.Listar("SELECT TO_CHAR(CURRENT_TIMESTAMP, 'HH12:MI:SS') AS hora;");
            rs.next();
            txthora.setText(rs.getString("hora"));
        } catch (SQLException ex) {
            Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
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
        txtcliente.setEnabled(false);
        txtcodigocliente.setEnabled(false);
        txtfactura.setEnabled(false);
        combodeposito.setEnabled(false);
        txtfactura.setEnabled(false);
        txtfecha.setEnabled(false);
        txthora.setEnabled(false);
        btnmas.setEnabled(false);
        btnagregar.setEnabled(true);
        btncancelar.setEnabled(false);
        btnanular.setEnabled(true);
        btnSalir.setEnabled(true);
        txttotal.setEnabled(false);

        btnregistrarcliente.setEnabled(false);

        factuno.setEnabled(false);
        factdos.setEnabled(false);

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

    /* Metodo para realizar consulta de los codigos existentes y devolver el siguiente codigo de venta a utilizar */
    private void generar_codigo() {

        try {
            String sql = "SELECT COALESCE (MAX(cod_venta),0)+1 AS cod FROM venta;"; // Creamos la consulta SQL.
            rs = con.Listar(sql); // Utilizamos el metodo listar.
            rs.next(); // Llamar a los siguientes resultados.
            txtcodigo.setText(rs.getString("cod")); // Enviar el resultado en el campo de codigo de nuestro formulario.

            // Formatear para codigo de factura
            /*String depo = combodeposito.getSelectedItem().toString();
            int numeroDepo = Integer.parseInt(depo.split("- ")[0]);
            String fac2 = String.format("%03d", numeroDepo);
            factdos.setText(fac2);*/
            int codigo = Integer.parseInt(rs.getString("cod"));
            String codFormateado = String.format("%03d", codigo);
            factuno.setText(codFormateado); // Enviar el resultado en el campo de codigo de nuestro formulario.

        } catch (SQLException ex) {
            Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /* Metodo para generar numero de factura segun el ultimo registro de la BDD */
    private void generar_factura() {

        try {
            String sql = "SELECT COALESCE (MAX(nro_factura),0)+1 AS factura FROM venta;"; // Creamos la consulta SQL.
            rs = con.Listar(sql); // Utilizamos el metodo listar.
            rs.next(); // Llamar a los siguientes resultados.

            // Formatear para codigo de factura
            String depo = combodeposito.getSelectedItem().toString();
            int numeroDepo = Integer.parseInt(depo.split("- ")[0]);
            String fac2 = String.format("%03d", numeroDepo);
            factdos.setText(fac2);

            int factura = Integer.parseInt(rs.getString("factura"));
            String idFormateado = String.format("%07d", factura);
            txtfactura.setText(idFormateado); // Enviar el resultado en el campo de codigo de nuestro formulario.
        } catch (SQLException ex) {
            Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para guardar nuevo registro en la BDD
    private void guardar() {

        String codigo = txtcodigoproducto.getText().trim();
        String codigoVenta = txtcodigo.getText().trim();
        String codigocliente = txtcodigocliente.getText().trim();
        String factura = txtfactura.getText().trim();
        String fecha = txtfecha.getText().toUpperCase().trim();
        String hora = txthora.getText().trim();
        String deposito = (String) combodeposito.getSelectedItem();
        String faclegal = factuno.getText() + "-" + factdos.getText() + "-" + factura;
        System.out.println("String de la factura legal: " + faclegal);

        int mensaje = JOptionPane.showConfirmDialog(this, "Desea realizar la accion?", "Atención", JOptionPane.YES_NO_OPTION); // Mensaje al presionar el boton salir
        if (mensaje == JOptionPane.YES_OPTION) {

            // Grabar cabecera de compra
            if (operacion == 1) {
                String estado = "activo";
                String monto = txttotal.getText();
                String montoreal = monto.replace(".", "");
                con.insertar_datos("venta",
                        "cod_venta, id_cliente, fecha, total_venta, estado, hora, nro_factura, factura",
                        codigoVenta + ", "
                        + codigocliente + ", "
                        + "(SELECT ('" + fecha + "')::date), "
                        + montoreal + ", '"
                        + estado + "', "
                        + "(SELECT ('" + hora + "')::time), "
                        + factura + ", '"
                        + faclegal + "'",
                        1);
                // Grabar detalle de venta
                for (int a = 0; a < tablaventa.getRowCount(); a++) {
                    con.insertar_datos("det_venta",
                            "cod_producto, cod_venta, cod_deposito, det_precio_unit, det_cantidad",
                            tablaventa.getValueAt(a, 0) + ", "
                            + codigoVenta + ", "
                            + "(SELECT SPLIT_PART('" + deposito + "','-',1)::integer), "
                            + tablaventa.getValueAt(a, 2) + ", "
                            + tablaventa.getValueAt(a, 3),
                            2);
                }
                // Grabar o actualizar stock
                for (int b = 0; b < tablaventa.getRowCount(); b++) {
                    try {
                        rs = con.Listar("SELECT * FROM stock WHERE cod_producto = " + tablaventa.getValueAt(b, 0) + "AND cod_deposito = "
                                + "(SELECT SPLIT_PART('" + deposito + "','-',1)::integer)");
                        boolean encontro = rs.next();
                        if (encontro == false) {
                            /*con.insertar_datos("stock",
                                "cod_producto, cod_deposito, cantidad, cajas",
                                tablaventa.getValueAt(b, 0) + ", "
                                + "(SELECT SPLIT_PART('" + deposito + "','-',1)::integer), "
                                + tablaventa.getValueAt(b, 3) + ", "
                                + tablaventa.getValueAt(b, 3) + "/12",
                                2);*/
                            JOptionPane.showMessageDialog(this, "No hay stock de productos en existencia!");
                        } else {
                            String sql = "UPDATE stock SET cantidad = cantidad - " + tablaventa.getValueAt(b, 3)
                                    + ", cajas = (cantidad - " + tablaventa.getValueAt(b, 3) + ") / 12"
                                    + " WHERE cod_producto = " + tablaventa.getValueAt(b, 0)
                                    + " AND cod_deposito = "
                                    + "(SELECT SPLIT_PART('" + deposito + "','-',1)::integer)";
                            System.out.println(sql);
                            con.sentencia = con.conectar().createStatement();
                            con.sentencia.executeUpdate(sql);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                String codigoventa = txtcodigo.getText();
                System.out.println("codigo venta sql: " + codigoventa);
                String sql = "SELECT * FROM v_factura_venta WHERE cod_venta = " + codigoventa;
                imprimir(sql);

            }
            if (operacion == 2) {
                String estado = "anulado";
                System.out.println(codigo);
                String codigo_anular = txtcodigo.getText().trim();
                con.actualizar_datos("venta",
                        "estado = '" + estado + "' ",
                        "cod_venta = " + codigo_anular, 3);

                for (int c = 0; c < tablaventa.getRowCount(); c++) {
                    try {
                        String sql = "UPDATE stock SET cantidad = cantidad + " + tablaventa.getValueAt(c, 3)
                                + ", cajas = (cantidad + " + tablaventa.getValueAt(c, 3) + ") / 12 WHERE cod_producto = " + tablaventa.getValueAt(c, 0)
                                + " AND cod_deposito = " + tablaventa.getValueAt(c, 4);
                        System.out.println(sql);
                        con.sentencia = con.conectar().createStatement();
                        con.sentencia.executeUpdate(sql);
                    } catch (SQLException ex) {
                        Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } else {
            btncancelar.doClick();
        }
    }

    // Metodo para limpiar campos
    private void limpiar_campos() {

        txtcodigoproducto.setText("");
        txtcodigo.setText("");
        txtproducto.setText("");
        txtcantidad.setText("");
        txtcodigocliente.setText("");
        txtcliente.setText("");
        txtfactura.setText("");
        txtprecio.setText("");
        txttotal.setText("");
        txttotal.setText("");

        factuno.setText("");
        factdos.setText("");

    }

    // Metodo para cargar datos en la tabla con datos de la BDD
    private void cargar_tabla() {

        cursor = (DefaultTableModel) tablaventa.getModel();
        int subtotal = 0;
        subtotal = Integer.parseInt(txtcantidad.getText()) * Integer.parseInt(txtprecio.getText());
        total = total + subtotal;
        txttotal.setText(formateador.format(total));
        String campo[] = new String[]{txtcodigoproducto.getText(), txtproducto.getText(),
            txtprecio.getText(), txtcantidad.getText()};

        cursor.addRow(campo);

        nuevo_producto();
        //btngrabar.setEnabled(true);

    }

    // Metodo para agregar nuevo producto
    private void nuevo_producto() {

        txtcodigoproducto.setText("");
        txtproducto.setText("");
        txtcantidad.setText("");
        txtprecio.setText("");
        //txtcodigoproducto.setEnabled(true);
        txtprecio.setEnabled(false);
        txtcantidad.setEnabled(false);
        btnmas.requestFocus();

    }

    // Metodo para cargar combobox
    private void llenar_combo() {

        try {
            String sql = "SELECT CONCAT (cod_deposito, '- ', descrip) AS deposito FROM deposito ORDER BY cod_deposito ASC;";
            rs = con.Listar(sql);
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    combodeposito.addItem(rs.getString("deposito"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para limpiar valores de la tabla
    private void limpiar_tabla() {

        cursor = (DefaultTableModel) tablaventa.getModel();
        while (cursor.getRowCount() > 0) {
            cursor.removeRow(0);
        }

    }

    // Ver datos
    private void ver_datos() {

        int fila = tablaventa.getSelectedRow();
        txtcodigoproducto.setText(tablaventa.getValueAt(fila, 0).toString());
        txtusuario.setText(tablaventa.getValueAt(fila, 1).toString());
        //txtnombre.setText(tablacompra.getValueAt(fila, 2).toString());
        txtcliente.setText(tablaventa.getValueAt(fila, 3).toString());
        //combociudad.setEnabled(true);
        txtfactura.setText(tablaventa.getValueAt(fila, 4).toString());
        txtprecio.setText(tablaventa.getValueAt(fila, 5).toString());

        String codigo = tablaventa.getValueAt(fila, 0).toString();
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
            Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para anular
    private void accion_anular() {

        try {
            String codigo = txtcodigo.getText().trim();
            rs = con.Listar("SELECT CONCAT(c.cli_nombre, ' ' , c.cli_apellido) AS nombre, c.ci_ruc, v.* "
                    + "FROM venta v, clientes c WHERE v.id_cliente = c.id_cliente AND v.cod_venta = " + codigo);
            boolean encontro = rs.next();
            if (encontro == true) {

                // Dividir el numero de factura para mostrarlo en cada jtextfield
                String factura = rs.getString("factura");
                String[] partes = factura.split("-");
                factuno.setText(partes[0]); // "000"
                factdos.setText(partes[1]); // "000"
                txtfactura.setText(partes[2]); // "0000001"

                txtcodigocliente.setText(rs.getString("id_cliente"));
                txtcliente.setText(rs.getString("nombre"));
                
                int total = Integer.parseInt(rs.getString("total_venta"));
                txttotal.setText(formateador.format(total));

                cargar_tabla_anular();

                txtcodigo.setEnabled(false);
                operacion = 2;
                btngrabar.setEnabled(true);
                btngrabar.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "No existe el codigo de ventas ingresado!");
                txtcodigo.selectAll();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para cargar tabla con detalles de la compra a anular
    private void cargar_tabla_anular() {

        try {
            String codigo = txtcodigo.getText();
            cursor = (DefaultTableModel) tablaventa.getModel();
            rs = con.Listar("SELECT dt.cod_producto, p.p_descrip, dt.det_precio_unit, dt.det_cantidad, dt.cod_deposito "
                    + "FROM det_venta dt, producto p WHERE dt.cod_producto = p.cod_producto AND dt.cod_venta = " + codigo + ";");
            String[] fila = new String[5];
            while (rs.next()) {
                fila[0] = rs.getString("cod_producto");
                fila[1] = rs.getString("p_descrip");
                fila[2] = rs.getString("det_precio_unit");
                fila[3] = rs.getString("det_cantidad");
                fila[4] = rs.getString("cod_deposito");
                cursor.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para verificar la existencia de un producto en el deposito seleccionado
    private void verificar_existencia() {
        try {
            String codigoprod = txtcodigoproducto.getText().trim();
            String produc = txtproducto.getText().trim();
            int cantidad = Integer.parseInt(txtcantidad.getText().trim());
            String depo = combodeposito.getSelectedItem().toString();

            String consulta = "SELECT cantidad FROM stock WHERE cod_deposito = (SELECT SPLIT_PART('" + depo + "','-',1)::integer) "
                    + "AND cod_producto = " + codigoprod;

            rs = con.Listar(consulta);

            if (rs.next()) {
                int cant = rs.getInt("cantidad");
                if (cant < cantidad) {
                    System.out.println("No hay stock suficiente!!!!");
                    JOptionPane.showMessageDialog(this, "Solo dispone de " + cant + " '" + produc + "' en el deposito '" + depo + "'!!!");
                    txtcantidad.selectAll();
                    //btnmas.requestFocus();
                } else {
                    cargar_tabla();
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el producto '" + produc + "' en el depósito seleccionado.");
                btnmas.requestFocus();
                txtcodigoproducto.setText("");
                txtproducto.setText("");
                txtprecio.setText("");
                txtcantidad.setText("");
                txtcantidad.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al consultar el stock.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Cantidad o código de producto inválido.");
        }
    }

    // Metodo imprimir Factura
    private void imprimir(String a) {

        try {
            rs = con.Listar(a);
            Map parameters = new HashMap();
            parameters.put("", new String(""));
            JasperReport jr = null;

            // Cargamos el documento
            URL url = getClass().getClassLoader().getResource("reportes/factura.jasper");
            jr = (JasperReport) JRLoader.loadObject(url);

            JasperPrint masterPrint = null;
            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
            masterPrint = JasperFillManager.fillReport(jr, parameters, jrRS);

            // Generar ventana para mostrar el documento
            JasperViewer ventana = new JasperViewer(masterPrint, false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);
            ventana.setSize(1000, 680);
            ventana.setLocationRelativeTo(null);
        } catch (JRException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void txtcodigoproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoproductoActionPerformed

    }//GEN-LAST:event_txtcodigoproductoActionPerformed

    private void txtclienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclienteKeyPressed

    private void txtfacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfacturaKeyPressed

    }//GEN-LAST:event_txtfacturaKeyPressed

    private void txtprecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioKeyPressed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyPressed

    }//GEN-LAST:event_txtusuarioKeyPressed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed

        txtcliente.setEnabled(false);
        combodeposito.setEnabled(true);
        combodeposito.requestFocus();

    }//GEN-LAST:event_txtclienteActionPerformed

    private void txtclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclienteKeyTyped

        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo puede ingresar letras");
            txtcliente.requestFocus();
        }

    }//GEN-LAST:event_txtclienteKeyTyped

    private void combodepositoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combodepositoKeyTyped

        //combodeposito.setEnabled(false);

    }//GEN-LAST:event_combodepositoKeyTyped

    private void combodepositoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combodepositoMouseClicked

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

        /*txtprecio.setEnabled(false);
        txtcantidad.setEnabled(true);
        txtcantidad.requestFocus();*/

    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfacturaActionPerformed

        /* String factura = txtfactura.getText().trim();
        if (factura.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero de factura!");
            txtfactura.requestFocus();
        } else {
            txtfactura.setEnabled(false);
            combodeposito.setEnabled(true);
            combodeposito.requestFocus();
        }*/

    }//GEN-LAST:event_txtfacturaActionPerformed

    private void tablaventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaventaMouseClicked

    }//GEN-LAST:event_tablaventaMouseClicked

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

    private void txtcodigoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoclienteActionPerformed

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
                verificar_existencia();
                //cargar_tabla();
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
        JOptionPane.showMessageDialog(this, "Para empezar elija un depósito!");
        combodeposito.setEnabled(true);
        combodeposito.requestFocus();
        //txtcodigocliente.setEnabled(true);

    }//GEN-LAST:event_btnagregarActionPerformed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed

        guardar();
        btncancelar.doClick();

    }//GEN-LAST:event_btngrabarActionPerformed

    private void btngrabarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btngrabarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btngrabar.doClick();
        }

    }//GEN-LAST:event_btngrabarKeyPressed

    private void btngrabarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btngrabarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btngrabarKeyTyped

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed

        limpiar_campos();
        limpiar_tabla();
        desa_inicio();
        total = 0;

    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int mensaje = JOptionPane.showConfirmDialog(this, "Desea salir?", "Atención", JOptionPane.YES_NO_OPTION); // Mensaje al presionar el boton salir
        if (mensaje == JOptionPane.YES_OPTION) {
            dispose();
        }

    }//GEN-LAST:event_btnSalirActionPerformed

    private void combodepositoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combodepositoKeyPressed

        JOptionPane.showMessageDialog(this, "Pulse un ENTER para seleccionar un producto");
        generar_factura();
        combodeposito.setEnabled(false);
        btnmas.setEnabled(true);
        btnmas.requestFocus();
        txtcodigocliente.setEnabled(true);
        btnregistrarcliente.setEnabled(true);

    }//GEN-LAST:event_combodepositoKeyPressed

    private void txtcodigoclienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoclienteKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JTextField[] tfParam = new JTextField[2];
            tfParam[0] = txtcodigocliente;
            tfParam[1] = txtcliente;

            VentanaBuscar buscarproveedor = new VentanaBuscar("SELECT id_cliente, CONCAT(cli_nombre, ' ', cli_apellido) AS nombre, ci_ruc FROM clientes WHERE ci_ruc LIKE ",
                    new String[]{"ID", "Nombre", "Documento",}, 3, tfParam);
            buscarproveedor.setTitle("Buscar Cliente");
            buscarproveedor.setVisible(true);

            //txtcodigocliente.setEnabled(false);
            //generar_factura();
            btngrabar.setEnabled(true);
            btngrabar.requestFocus();
        }

    }//GEN-LAST:event_txtcodigoclienteKeyPressed

    private void txtcodigoproductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoproductoKeyPressed

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
                    rs = con.Listar("SELECT * FROM venta WHERE cod_venta = " + codigo
                            + "AND estado = 'anulado'");
                    boolean encontro = rs.next();
                    if (encontro == true) {
                        JOptionPane.showMessageDialog(this, "La venta con el codigo ingresado ya ha sido anulada!");
                        btncancelar.doClick();
                    } else {
                        accion_anular();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_txtcodigoKeyPressed

    private void btnmasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnmasKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnmas.doClick();
        }

    }//GEN-LAST:event_btnmasKeyPressed

    private void factunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factunoActionPerformed

    private void factunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_factunoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_factunoKeyPressed

    private void factdosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factdosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factdosActionPerformed

    private void factdosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_factdosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_factdosKeyPressed

    private void btnregistrarclienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnregistrarclienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnregistrarclienteKeyPressed

    private void btnregistrarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarclienteActionPerformed

        //new clientes(this, true).setVisible(true);
        Frame frame = JOptionPane.getFrameForComponent(this);
        new clientes(frame, true).setVisible(true);

    }//GEN-LAST:event_btnregistrarclienteActionPerformed

    private void btnmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasActionPerformed

        JTextField[] tfParam = new JTextField[4];
        tfParam[0] = txtcodigoproducto;
        tfParam[1] = txtproducto;
        tfParam[3] = txtprecio;

        VentanaBuscar buscarproducto = new VentanaBuscar("SELECT cod_producto, p_descrip, precio, ROUND(precio * 1.25) AS precio FROM producto WHERE p_descrip ILIKE ",
                new String[]{"Codigo", "Producto", "Precio de Compra", "Precio de Venta",}, 4, tfParam);
        buscarproducto.setTitle("Buscar Producto");
        buscarproducto.setVisible(true);

        txtcodigoproducto.setEnabled(false);
        txtproducto.setEnabled(false);
        txtprecio.setEnabled(false);
        txtcantidad.setEnabled(true);
        txtcantidad.requestFocus();

    }//GEN-LAST:event_btnmasActionPerformed

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
            java.util.logging.Logger.getLogger(ventas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventas.class
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
                ventas dialog = new ventas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnanular;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btngrabar;
    private javax.swing.JButton btnmas;
    private javax.swing.JButton btnregistrarcliente;
    private javax.swing.JComboBox<String> combodeposito;
    private org.edisoncor.gui.textField.TextFieldRectBackground factdos;
    private org.edisoncor.gui.textField.TextFieldRectBackground factuno;
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
    private javax.swing.JTable tablaventa;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcantidad;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcliente;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcodigo;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcodigocliente;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcodigoproducto;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtfactura;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtfecha;
    private org.edisoncor.gui.textField.TextFieldRectBackground txthora;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtprecio;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtproducto;
    private javax.swing.JTextField txttotal;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtusuario;
    // End of variables declaration//GEN-END:variables
}
