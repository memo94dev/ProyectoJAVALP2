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
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import prg.conectDB;

public class proveedores extends javax.swing.JDialog {

    conectDB con; // Traer la clase de conexion
    ResultSet rs; // Resultados de SQL definidos en conecDB
    javax.swing.table.DefaultTableModel cursor; // Cursor para recorrer la tabla
    int operacion = 0; // Bandera para definir la accion que se va a realizar (insert, update, delete)

    public proveedores(java.awt.Frame parent, boolean modal) {

        //super(parent, modal); // Se superpone a otras ventanas u objetos
        initComponents();
        con = new conectDB(); // Instancia de la clase de conexion
        con.conectar(); // Metodo de conexion de la clase conecDB

        cargar_tabla(); // Metodo para cargar datos de la BDD en la tabla de inicio
        desa_inicio(); // Metodo de inicio de la pantalla
        //setLocationRelativeTo(null); // Centrar ventana en la pantalla

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
        tablaproveedores = new javax.swing.JTable();
        btnlimpiar = new javax.swing.JButton();
        labelApellido = new org.edisoncor.gui.label.LabelMetric();
        txtruc = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelNombre1 = new org.edisoncor.gui.label.LabelMetric();
        txtdireccion = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelApellido1 = new org.edisoncor.gui.label.LabelMetric();
        txttelefono = new org.edisoncor.gui.textField.TextFieldRectBackground();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
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
        btnguardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnguardarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnguardarKeyTyped(evt);
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
        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
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

        tablaproveedores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tablaproveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Razón Social", "RUC", "Dirección", "Teléfono"
            }
        ));
        tablaproveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaproveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaproveedores);

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        labelApellido.setText("RUC:");
        labelApellido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtruc.setDescripcion("Ingrese el ruc");
        txtruc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrucActionPerformed(evt);
            }
        });
        txtruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrucKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrucKeyTyped(evt);
            }
        });

        labelNombre1.setText("Dirección:");
        labelNombre1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });

        labelApellido1.setText("Teléfono:");
        labelApellido1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txttelefono.setDescripcion("Ingrese el nro. tel.");
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(txtruc, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(24, 24, 24)))))
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private void desa_inicio() {

        btnguardar.setEnabled(false);
        txtcodigo.setEnabled(false);
        txtnombre.setEnabled(false);
        txtruc.setEnabled(false);
        txtdireccion.setEnabled(false);
        txttelefono.setEnabled(false);
        txtbuscar.requestFocus();

    }

    /* Metodo para inhabilitar botones y habilitar botones */
    private void desa_botones(int a) {

        switch (a) {
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
    private void generar_codigo() {

        try {
            String sql = "SELECT COALESCE (MAX(cod_proveedor),0)+1 AS cod FROM proveedor;"; // Creamos la consulta SQL.
            rs = con.Listar(sql); // Utilizamos el metodo listar.
            rs.next(); // Llamar a los siguientes resultados.
            txtcodigo.setText(rs.getString("cod")); // Enviar el resultado en el campo de codigo de nuestro formulario.
        } catch (SQLException ex) {
            Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /* Metodo para validar duplicidad de valores en la BDD */
    private boolean validar_documento() {

        try {
            String ruc = txtruc.getText().toUpperCase().trim();
            rs = con.Listar("SELECT * FROM proveedor WHERE ruc = '" + ruc + ";");
            //boolean encontro = rs.next();
            if (rs.next()) {
                String rsocial = rs.getString("razon_social");
                System.out.println(rsocial);
                JOptionPane.showMessageDialog(this, "El RUC ingresado ya ha sido registrado para el proveedor: " + rsocial);
                return true; // Documento duplicado
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; // Producto no duplicado

    }

    // Metodo para guardar nuevo registro en la BDD
    private void guardar() {

        String codigo = txtcodigo.getText().trim();
        String nombre = txtnombre.getText().toUpperCase().trim();
        String ruc = txtruc.getText().toUpperCase().trim();
        String direccion = txtdireccion.getText().toUpperCase().trim();
        String telefono = txttelefono.getText().toUpperCase().trim();
        if (operacion == 1) {
            con.insertar_datos("proveedor", "cod_proveedor, razon_social, ruc, direccion, telefono",
                    codigo + ", '"
                    + nombre + "', '"
                    + ruc + "', '"
                    + direccion + "', "
                    + telefono,
                    1);
        }
        if (operacion == 2) {
            con.actualizar_datos("proveedor",
                    "cod_proveedor = " + codigo + ", "
                    + "razon_social = '" + nombre + "', "
                    + "ruc = '" + ruc + "', "
                    + "direccion = '" + direccion + "', "
                    + "telefono = " + telefono,
                    "cod_proveedor = " + codigo, 1);
        }
    }

    // Metodo para limpiar campos
    private void limpiar_campos() {

        txtcodigo.setText("");
        txtnombre.setText("");
        txtruc.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtbuscar.setText("");

    }

    // Metodo para cargar datos en la tabla con datos de la BDD
    private void cargar_tabla() {

        try {
            cursor = (DefaultTableModel) tablaproveedores.getModel();
            String sql = "SELECT * FROM proveedor ORDER BY cod_proveedor ASC;";
            rs = con.Listar(sql);
            String[] fila = new String[5];
            while (rs.next()) {
                fila[0] = rs.getString("cod_proveedor");
                fila[1] = rs.getString("razon_social");
                fila[2] = rs.getString("ruc");
                fila[3] = rs.getString("direccion");
                fila[4] = rs.getString("telefono");
                cursor.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para limpiar valores de la tabla
    private void limpiar_tabla() {

        cursor = (DefaultTableModel) tablaproveedores.getModel();
        while (cursor.getRowCount() > 0) {
            cursor.removeRow(0);
        }

    }

    // Metodo para validar proveedor para que no se dupliquen
    private String buscar(String codigo) {

        try {
            String sql = "SELECT razon_social FROM proveedor WHERE ruc = " + codigo;
            rs = con.Listar(sql);
            if (rs.next()) {
                String ds = rs.getString("razon_social").trim();;
                System.out.println("Se encuentra el proveedor en la BDD: " + ds);
                return ds;
            }
        } catch (SQLException ex) {
            Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    // Metodo para habilitar campos dentro del metodo txtdocumento
    private void habilitarCampos() {

        //combomedida.setEnabled(false);
        btnguardar.setEnabled(true);
        btnguardar.requestFocus();

    }

    // Metodo para mostrar mensaje dentro del metodo txtdocumento
    private void mostrarErrorDocumento() {

        btncancelar.doClick();

    }

    // Metodo para buscar datos
    private void buscador() {

        try {
            cursor = (DefaultTableModel) tablaproveedores.getModel();
            String buscar = txtbuscar.getText().toUpperCase().trim();
            String sql = "SELECT * FROM proveedor WHERE razon_social ILIKE '%" + buscar + "%' OR ruc ILIKE '%" + buscar + "%' ORDER BY cod_proveedor ASC;";
            rs = con.Listar(sql);
            String[] fila = new String[5];
            while (rs.next()) {
                fila[0] = rs.getString("cod_proveedor");
                fila[1] = rs.getString("razon_social");
                fila[2] = rs.getString("ruc");
                fila[3] = rs.getString("direccion");
                fila[4] = rs.getString("telefono");
                cursor.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo imprimir Reporte
    private void imprimir() {

        try {
            String sql = "SELECT * FROM proveedor ORDER BY cod_proveedor;";
            rs = con.Listar(sql);
            Map parameters = new HashMap();
            parameters.put("", new String(""));
            JasperReport jr = null;

            // Cargamos el reporte
            URL url = getClass().getClassLoader().getResource("reportes/reporte_proveedores.jasper");
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
            Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Ver datos
    private void ver_datos() {

        int fila = tablaproveedores.getSelectedRow(); // codigo nombre tipo medida precio 
        System.out.println(fila);
        txtcodigo.setText(tablaproveedores.getValueAt(fila, 0).toString());
        txtnombre.setText(tablaproveedores.getValueAt(fila, 1).toString());
        txtruc.setText(tablaproveedores.getValueAt(fila, 2).toString());
        txtdireccion.setText(tablaproveedores.getValueAt(fila, 3).toString());
        txttelefono.setText(tablaproveedores.getValueAt(fila, 4).toString());

    }

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

        if (txtcodigo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un registro de la grilla para editar..");
            btncancelar.doClick();
        } else {
            operacion = 2;
            desa_botones(1);
            txtnombre.setEnabled(true);
            txtnombre.requestFocus();
        }

    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int mensaje = JOptionPane.showConfirmDialog(this, "Desea salir?", "Atención", JOptionPane.YES_NO_OPTION); // Mensaje al presionar el boton salir
        if (mensaje == JOptionPane.YES_OPTION) {
            //System.exit(WIDTH); // Para cerrar totalmente el sistema.
            dispose(); // Para cerrar ventanas de opciones o formularios sin parar el sistema.
        }

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        operacion = 1;
        desa_botones(1);
        generar_codigo();
        txtnombre.setEnabled(true);
        txtnombre.requestFocus();

    }//GEN-LAST:event_btnagregarActionPerformed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed

        String codigo = txtcodigo.getText().trim();
        String rsocial = txtnombre.getText().trim();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (rsocial.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete este campo!");
                txtnombre.requestFocus();
                return;
            } else {
                txtnombre.setEnabled(false);
                txtruc.setEnabled(true);
                txtruc.requestFocus();
            }
        }

    }//GEN-LAST:event_txtnombreKeyPressed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        int mensaje = JOptionPane.showConfirmDialog(this, "Deseas realizar la operacion?", "Atencion", JOptionPane.YES_NO_OPTION);
        if (mensaje == JOptionPane.YES_OPTION) {
            guardar();
            btncancelar.doClick();
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed

    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        /*operacion = 3;
        desa_botones(1);*/
        String codigo = txtcodigo.getText();
        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un registro de la grilla para eliminar!");
        } else {
            int mensaje = JOptionPane.showConfirmDialog(this, "Deseas eliminar el registro?", "Atención", JOptionPane.YES_NO_OPTION);
            if (mensaje == JOptionPane.YES_OPTION) {
                con.borrar_datos("proveedor", "cod_proveedor", codigo);
                btncancelar.doClick();
            }
        }

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

    private void txtrucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrucKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrucKeyPressed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped

        //btnbuscar.doClick(); -- Se camnbia por key pressed ya que con este metodo busca antes de grabar el caracter y lo hace impreciso
        //limpiar_tabla();
        //buscador();

    }//GEN-LAST:event_txtbuscarKeyTyped

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnbuscar.doClick();
        }

    }//GEN-LAST:event_txtbuscarKeyPressed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed

        /*txtnombre.setEnabled(false);
        txtprecio.setEnabled(true);
        txtprecio.requestFocus();*/

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

    private void txtrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrucActionPerformed

        String ruc = txtruc.getText();
        if (ruc.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el RUC del proveedor!");
        } else {
            txtruc.setEnabled(false);
            txtdireccion.setEnabled(true);
            txtdireccion.requestFocus();
        }

    }//GEN-LAST:event_txtrucActionPerformed

    private void txtrucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrucKeyTyped

        if (txtruc.getText().length() >= 9) {
            evt.consume(); // evita que se agregue más texto
            getToolkit().beep();
        }

    }//GEN-LAST:event_txtrucKeyTyped

    private void tablaproveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproveedoresMouseClicked

        ver_datos();

    }//GEN-LAST:event_tablaproveedoresMouseClicked

    private void btnguardarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnguardarKeyTyped

    }//GEN-LAST:event_btnguardarKeyTyped

    private void btnguardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnguardarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int mensaje = JOptionPane.showConfirmDialog(this, "Deseas realizar la operacion?", "Atencion", JOptionPane.YES_NO_OPTION);
            if (mensaje == JOptionPane.YES_OPTION) {
                guardar();
                btncancelar.doClick();
                /*desa_inicio();
            limpiar_campos();
            limpiar_tabla();
            cargar_tabla();
            desa_botones(2); todos estos elementos se cambian por el doClick del boton cancelar*/
            }
        }

    }//GEN-LAST:event_btnguardarKeyPressed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased

        char c = evt.getKeyChar();
        int keyCode = evt.getKeyCode();

        // Verifica si es letra o número
        boolean esLetraONumero = Character.isLetterOrDigit(c);

        // Verifica si es espacio o borrar
        boolean esEspacioOBorrar = keyCode == KeyEvent.VK_SPACE || keyCode == KeyEvent.VK_BACK_SPACE;

        if (esLetraONumero || esEspacioOBorrar) {
            limpiar_tabla();
            buscador();
        }

    }//GEN-LAST:event_txtbuscarKeyReleased

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed

        String dir = txtdireccion.getText();
        if (dir.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una dirección!");
        } else {
            txtdireccion.setEnabled(false);
            txttelefono.setEnabled(true);
            txttelefono.requestFocus();
        }

    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtdireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionKeyPressed

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed

        String tel = txttelefono.getText();
        if (tel.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un teléfono!");
        } else {
            txttelefono.setEnabled(false);
            btnguardar.setEnabled(true);
            btnguardar.requestFocus();
        }

    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped

        int k = evt.getKeyChar();
        if ((k >= 32 && k <= 45) || (k >= 58 && k <= 126)) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Solo puede ingresar numeros");
            txttelefono.requestFocus();
        }

    }//GEN-LAST:event_txttelefonoKeyTyped

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
            java.util.logging.Logger.getLogger(proveedores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proveedores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proveedores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proveedores.class
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
                proveedores dialog = new proveedores(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelApellido;
    private org.edisoncor.gui.label.LabelMetric labelApellido1;
    private org.edisoncor.gui.label.LabelMetric labelBuscar;
    private org.edisoncor.gui.label.LabelMetric labelCodigo;
    private org.edisoncor.gui.label.LabelMetric labelNombre;
    private org.edisoncor.gui.label.LabelMetric labelNombre1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private javax.swing.JTable tablaproveedores;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtbuscar;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcodigo;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtdireccion;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtnombre;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtruc;
    private org.edisoncor.gui.textField.TextFieldRectBackground txttelefono;
    // End of variables declaration//GEN-END:variables
}
