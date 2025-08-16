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

public class clientes extends javax.swing.JDialog {
    
    conectDB con; // Traer la clase de conexion
    ResultSet rs; // Resultados de SQL definidos en conecDB
    javax.swing.table.DefaultTableModel cursor; // Cursor para recorrer la tabla
    int operacion = 0; // Bandera para definir la accion que se va a realizar (insert, update, delete)

    public clientes(java.awt.Frame parent, boolean modal) {
        
        //super(parent, modal); // Se superpone a otras ventanas u objetos
        initComponents();
        con = new conectDB(); // Instancia de la clase de conexion
        con.conectar(); // Metodo de conexion de la clase conecDB
        
        cargar_tabla(); // Metodo para cargar datos de la BDD en la tabla de inicio
        desa_inicio(); // Metodo de inicio de la pantalla
        llenar_combo("1");
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
        labelCodigo = new org.edisoncor.gui.label.LabelMetric();
        labelNombre = new org.edisoncor.gui.label.LabelMetric();
        txtnombre = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtcodigo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtbuscar = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelBuscar = new org.edisoncor.gui.label.LabelMetric();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacliente = new javax.swing.JTable();
        btnlimpiar = new javax.swing.JButton();
        labelApellido = new org.edisoncor.gui.label.LabelMetric();
        txtapellido = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtdireccion = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelCiudad = new org.edisoncor.gui.label.LabelMetric();
        labelTelefono = new org.edisoncor.gui.label.LabelMetric();
        txttelefono = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelDireccion = new org.edisoncor.gui.label.LabelMetric();
        combociudad = new javax.swing.JComboBox<>();
        labelDocumento = new org.edisoncor.gui.label.LabelMetric();
        txtdocumento = new org.edisoncor.gui.textField.TextFieldRectBackground();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(970, 598));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        labelCodigo.setText("Código: ");
        labelCodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelNombre.setText("Nombre:");
        labelNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtnombre.setDescripcion("Ingrese el nombre");
        txtnombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtcodigo.setDescripcion("Cód.");
        txtcodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        txtbuscar.setDescripcion("Ingrese un valor");
        txtbuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        labelBuscar.setText("Buscar");
        labelBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        tablacliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tablacliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Documento", "Nombre", "Apellido", "Dirección", "Teléfono"
            }
        ));
        tablacliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablacliente);

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        labelApellido.setText("Apellido:");
        labelApellido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtapellido.setDescripcion("Ingrese el apellido");
        txtapellido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        txtdireccion.setDescripcion("Ingrese la dirección");
        txtdireccion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdireccionKeyPressed(evt);
            }
        });

        labelCiudad.setText("Ciudad:");
        labelCiudad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelTelefono.setText("Teléfono:");
        labelTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txttelefono.setDescripcion("Ingrese el teléfono");
        txttelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        labelDireccion.setText("Dirección:");
        labelDireccion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        combociudad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        combociudad.setForeground(new java.awt.Color(102, 102, 102));
        combociudad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combociudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combociudadMouseClicked(evt);
            }
        });
        combociudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                combociudadKeyTyped(evt);
            }
        });

        labelDocumento.setText("Doc.: ");
        labelDocumento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtdocumento.setDescripcion("CI o RUC");
        txtdocumento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdocumentoActionPerformed(evt);
            }
        });
        txtdocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdocumentoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtdocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combociudad, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(labelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combociudad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        panelCurves1.add(jPanel1, java.awt.BorderLayout.CENTER);

        panelNice1.add(panelCurves1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
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
        txtdocumento.setEnabled(false);
        txtnombre.setEnabled(false);
        txtapellido.setEnabled(false);
        txtdireccion.setEnabled(false);
        txttelefono.setEnabled(false);
        combociudad.setEnabled(false);
        txtbuscar.requestFocus();
        
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
    
    /* Metodo para realizar consulta de los codigos existentes y devolver el siguiente codigo de producto a utilizar */
    private void generar_codigo(){
        
        try {
            String sql = "SELECT COALESCE (MAX(id_cliente),0)+1 AS cod FROM clientes;"; // Creamos la consulta SQL.
            rs = con.Listar(sql); // Utilizamos el metodo listar.
            rs.next(); // Llamar a los siguientes resultados.
            txtcodigo.setText(rs.getString("cod")); // Enviar el resultado en el campo de codigo de nuestro formulario.
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /* Metodo para validar duplicidad de valores en la BDD */
    private void validar_descripcion(){
        
        try {
            String descripcion = txtnombre.getText().toUpperCase();
            rs = con.Listar("SELECT * FROM deposito WHERE descrip = '" + descripcion + "'");
            boolean encontro = rs.next();
            if (encontro == true){
                JOptionPane.showMessageDialog(this, "La descripción del deposito '" + descripcion 
                        + "' ya se encuentra registrada.");
                txtnombre.setEnabled(true);
            }else{
                btnguardar.setEnabled(true);
                btnguardar.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // Metodo para guardar nuevo registro en la BDD
    private void guardar() {

        String codigo = txtcodigo.getText().trim();
        String nombre = txtnombre.getText().toUpperCase().trim();
        String documento = txtdocumento.getText().trim();
        String apellido = txtapellido.getText().toUpperCase().trim();
        String direccion = txtdireccion.getText().toUpperCase().trim();
        String telefono = txttelefono.getText().trim();
        String ciudad = (String) combociudad.getSelectedItem();
        if (operacion == 1) {
            con.insertar_datos("clientes", "id_cliente, ci_ruc, cli_nombre, cli_apellido, cli_direccion, cli_telefono, cod_ciudad",
                codigo + ", '"
               + documento + "', '"
               + nombre + "', '"
               + apellido + "', '"
               + direccion + "', '"
               + telefono + "', "
               + "(SELECT SPLIT_PART('" + ciudad + "','-',1)::integer)",
                1);
        }

    }
    
    // Metodo para limpiar campos
    private void limpiar_campos(){
        
        txtcodigo.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtdocumento.setText("");
        txtbuscar.setText("");
        
    }
    
    // Metodo para cargar datos en la tabla con datos de la BDD
    private void cargar_tabla(){
        
        try {
            cursor = (DefaultTableModel) tablacliente.getModel();
            String sql = "SELECT * FROM clientes ORDER BY id_cliente ASC;";
            rs = con.Listar(sql);
            String[] fila = new String[6];
            while(rs.next()){
                fila[0] = rs.getString("id_cliente");
                fila[1] = rs.getString("ci_ruc");
                fila[2] = rs.getString("cli_nombre");
                fila[3] = rs.getString("cli_apellido");
                fila[4] = rs.getString("cli_direccion");
                fila[5] = rs.getString("cli_telefono");
                cursor.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // Metodo para cargar combobox
    private void llenar_combo(String orden){
        
        try {
            String sql = "SELECT CONCAT (cod_ciudad, '-', descrip_ciudad) AS ciudad FROM ciudad ORDER BY cod_ciudad = " + orden + "ASC;";
            rs = con.Listar(sql);
            if (rs.isBeforeFirst()){
                while (rs.next()){
                    combociudad.addItem(rs.getString("ciudad"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // Metodo para limpiar valores de la tabla
    private void limpiar_tabla(){
        
        cursor = (DefaultTableModel) tablacliente.getModel();
        while (cursor.getRowCount() > 0){
            cursor.removeRow(0);
        }
        
    }
    
    // Metodo para buscar
    private boolean buscar(){
        
        try {
            String codigo = txtcodigo.getText();
            String sql = "SELECT descrip as descripcion FROM deposito WHERE cod_deposito = " + codigo;
            System.out.println(sql);
            rs = con.Listar(sql);
            //rs.next();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "El codigo ingresado no existe");
                return false;
            } else {
                //rs.next();
                String resultado = rs.getString("descripcion");
                System.out.println(resultado);
                txtnombre.setText(resultado);
                return true;
                //txtdescripcion.setText(rs.getString("descripcion"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    // Metodo para buscar datos
    private void buscador(){
        
        try {
            cursor = (DefaultTableModel) tablacliente.getModel();
            String buscar = txtbuscar.getText().toUpperCase().trim();
            String sql = "SELECT * FROM clientes WHERE ci_ruc LIKE '%" + buscar + "%' OR cli_nombre ILIKE '%" + buscar + "%' ORDER BY id_cliente;";
            rs = con.Listar(sql);
            String[] fila = new String[6];
            while(rs.next()){
                fila[0] = rs.getString("id_cliente");
                fila[1] = rs.getString("ci_ruc");
                fila[2] = rs.getString("cli_nombre");
                fila[3] = rs.getString("cli_apellido");
                fila[4] = rs.getString("cli_direccion");
                fila[5] = rs.getString("cli_telefono");
                cursor.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // Metodo imprimir Reporte
    private void imprimir(){
        
        try {
            String sql = "SELECT * FROM deposito ORDER BY cod_deposito ASC";
            rs = con.Listar(sql);
            Map parameters = new HashMap();
            parameters.put("", new String(""));
            JasperReport jr = null;
            
            // Cargamos el reporte
            URL url = getClass().getClassLoader().getResource("reportes/reporte_deposito.jasper");
            jr = (JasperReport) JRLoader.loadObject(url);
            
            JasperPrint masterPrint = null;
            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
            masterPrint = JasperFillManager.fillReport(jr, parameters, jrRS);
            
            // Generar ventana para mostrar el reporte
            JasperViewer ventana = new JasperViewer(masterPrint, false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
       
        operacion = 2;
        desa_botones(1);
        JOptionPane.showMessageDialog(this, "Ingresa un codigo para el deposito a editar");
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
        
        operacion = 1;
        desa_botones(1);
        generar_codigo();
        txtdocumento.setEnabled(true);
        txtdocumento.requestFocus();
        
    }//GEN-LAST:event_btnagregarActionPerformed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed

        /*
        } else if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            String nombre = txtnombre.getText().trim();
            if (nombre.equals("") || nombre.equals(" ")) {
                JOptionPane.showMessageDialog(this, "Ingrese algun valor");
                txtnombre.requestFocus();
            } else {
                txtapellido.setEnabled(true);
                txtapellido.requestFocus();
            }
        }*/

    }//GEN-LAST:event_txtnombreKeyPressed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        
        int mensaje = JOptionPane.showConfirmDialog(this, "Deseas realizar la operacion?", "Atencion", JOptionPane.YES_NO_OPTION);
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
        
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        
        operacion = 3;
        desa_botones(1);
        JOptionPane.showMessageDialog(this, "Ingresa el numero del deposito a eliminar!");
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

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        
        txtbuscar.setText("");
        txtbuscar.requestFocus();
        limpiar_tabla();
        cargar_tabla();
        
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void txtapellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoKeyPressed

    private void txtdireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER){
            String direccion = txtdireccion.getText().trim();
            if (direccion.equals("")){
                JOptionPane.showMessageDialog(this, "Ingrese una direccion");
                txtdireccion.requestFocus();
            }
        }
    }//GEN-LAST:event_txtdireccionKeyPressed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txtdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdocumentoActionPerformed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        // Se utiliza keypressed
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnbuscar.doClick();
        }

    }//GEN-LAST:event_txtbuscarKeyPressed

    private void txtdocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdocumentoKeyPressed
        
        String doc = txtdocumento.getText();
        if (evt.getKeyCode() == 10){
            if (doc.equals("")){
                JOptionPane.showMessageDialog(this, "Complete este campo!");
                txtdocumento.requestFocus();
            }else{
                txtnombre.setEnabled(true);
                txtnombre.requestFocus();
                txtdocumento.setEnabled(false);
            }
        }
        
    }//GEN-LAST:event_txtdocumentoKeyPressed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        
        txtnombre.setEnabled(false);
        txtapellido.setEnabled(true);
        txtapellido.requestFocus();
        
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo puede ingresar letras");
            txtnombre.requestFocus();
        }
        
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        
        txtapellido.setEnabled(false);
        combociudad.setEnabled(true);
        combociudad.requestFocus();
        
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped

        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo puede ingresar letras");
            txtapellido.requestFocus();
        }

    }//GEN-LAST:event_txtapellidoKeyTyped

    private void combociudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combociudadKeyTyped
        
        combociudad.setEnabled(false);
        txtdireccion.setEnabled(true);
        txtdireccion.requestFocus();
        
    }//GEN-LAST:event_combociudadKeyTyped

    private void combociudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combociudadMouseClicked
        
        combociudad.setEnabled(false);
        txtdireccion.setEnabled(true);
        txtdireccion.requestFocus();
        
    }//GEN-LAST:event_combociudadMouseClicked

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        
        int k = evt.getKeyChar();
        if ((k >= 32 && k <= 45) || (k >= 58 && k <= 126)){
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Solo puede ingresar numeros");
            txttelefono.requestFocus();
        }
        
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        
        txttelefono.setEnabled(false);
        btnguardar.setEnabled(true);
        btnguardar.requestFocus();
        
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        
        txtdireccion.setEnabled(false);
        txttelefono.setEnabled(true);
        txttelefono.requestFocus();
        
    }//GEN-LAST:event_txtdireccionActionPerformed

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
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                clientes dialog = new clientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JComboBox<String> combociudad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelApellido;
    private org.edisoncor.gui.label.LabelMetric labelBuscar;
    private org.edisoncor.gui.label.LabelMetric labelCiudad;
    private org.edisoncor.gui.label.LabelMetric labelCodigo;
    private org.edisoncor.gui.label.LabelMetric labelDireccion;
    private org.edisoncor.gui.label.LabelMetric labelDocumento;
    private org.edisoncor.gui.label.LabelMetric labelNombre;
    private org.edisoncor.gui.label.LabelMetric labelTelefono;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private javax.swing.JTable tablacliente;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtapellido;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtbuscar;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcodigo;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtdireccion;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtdocumento;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtnombre;
    private org.edisoncor.gui.textField.TextFieldRectBackground txttelefono;
    // End of variables declaration//GEN-END:variables
}
