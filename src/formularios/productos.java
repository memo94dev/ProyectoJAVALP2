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

public class productos extends javax.swing.JDialog {

    conectDB con; // Traer la clase de conexion
    ResultSet rs; // Resultados de SQL definidos en conecDB
    javax.swing.table.DefaultTableModel cursor; // Cursor para recorrer la tabla
    int operacion = 0; // Bandera para definir la accion que se va a realizar (insert, update, delete)

    public productos(java.awt.Frame parent, boolean modal) {

        //super(parent, modal); // Se superpone a otras ventanas u objetos
        initComponents();
        con = new conectDB(); // Instancia de la clase de conexion
        con.conectar(); // Metodo de conexion de la clase conecDB

        cargar_tabla(); // Metodo para cargar datos de la BDD en la tabla de inicio
        desa_inicio(); // Metodo de inicio de la pantalla
        llenar_combo("1");
        llenar_combo_medida("1");
        //setLocationRelativeTo(null); // Centrar ventana en la pantalla, lo pongo al final, en el metodo main

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
        tablaproductos = new javax.swing.JTable();
        btnlimpiar = new javax.swing.JButton();
        labelApellido = new org.edisoncor.gui.label.LabelMetric();
        txtprecio = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelCiudad = new org.edisoncor.gui.label.LabelMetric();
        combotipo = new javax.swing.JComboBox<>();
        labelCiudad1 = new org.edisoncor.gui.label.LabelMetric();
        combomedida = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
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

        tablaproductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tablaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Tipo Producto", "Medida", "Precio"
            }
        ));
        tablaproductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaproductos);

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        labelApellido.setText("Precio:");
        labelApellido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtprecio.setDescripcion("Ingrese el precio");
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

        labelCiudad.setText("Tipo Prod.:");
        labelCiudad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        combotipo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        combotipo.setForeground(new java.awt.Color(102, 102, 102));
        combotipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combotipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combotipoMouseClicked(evt);
            }
        });
        combotipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotipoActionPerformed(evt);
            }
        });
        combotipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                combotipoKeyTyped(evt);
            }
        });

        labelCiudad1.setText("Medida:");
        labelCiudad1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        combomedida.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        combomedida.setForeground(new java.awt.Color(102, 102, 102));
        combomedida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combomedida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combomedidaMouseClicked(evt);
            }
        });
        combomedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomedidaActionPerformed(evt);
            }
        });
        combomedida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combomedidaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                combomedidaKeyTyped(evt);
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
                                    .addComponent(txtprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(87, 87, 87))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelCiudad1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combomedida, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelCiudad1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combomedida, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        txtprecio.setEnabled(false);
        combomedida.setEnabled(false);
        combotipo.setEnabled(false);
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
            String sql = "SELECT COALESCE (MAX(cod_producto),0)+1 AS cod FROM producto;"; // Creamos la consulta SQL.
            rs = con.Listar(sql); // Utilizamos el metodo listar.
            rs.next(); // Llamar a los siguientes resultados.
            txtcodigo.setText(rs.getString("cod")); // Enviar el resultado en el campo de codigo de nuestro formulario.
        } catch (SQLException ex) {
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /* Metodo para validar duplicidad de valores en la BDD */
    private boolean validar_documento() {

        try {
            String descrip = txtnombre.getText().toUpperCase().trim();
            String medida = (String) combomedida.getSelectedItem();
            String tipo = (String) combotipo.getSelectedItem();
            rs = con.Listar("SELECT * FROM producto WHERE p_descrip = '" + descrip + "' AND cod_tipo_prod = (SELECT SPLIT_PART('"
                    + tipo + "','-',1)::integer) AND id_u_medida = (SELECT SPLIT_PART('" + medida + "','-',1)::integer);");
            //boolean encontro = rs.next();
            if (rs.next()) {
                String codigo = rs.getString("cod_producto");
                System.out.println(codigo);
                JOptionPane.showMessageDialog(this, "El producto ingresado ya ha sido registrado con el codigo: " + codigo);
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
        String descripcion = txtnombre.getText().toUpperCase().trim();
        String precio = txtprecio.getText().toUpperCase().trim();
        String medida = (String) combomedida.getSelectedItem();
        String tipo = (String) combotipo.getSelectedItem();
        if (operacion == 1) {
            con.insertar_datos("producto", "cod_producto, cod_tipo_prod, id_u_medida, p_descrip, precio",
                    codigo + ", "
                    + "(SELECT SPLIT_PART('" + tipo + "','-',1)::integer), "
                    + "(SELECT SPLIT_PART('" + medida + "','-',1)::integer), '"
                    + descripcion + "', "
                    + precio,
                    1);
        }
        if (operacion == 2) {
            con.actualizar_datos("producto",
                    "cod_producto = " + codigo
                    + ", cod_tipo_prod = (SELECT SPLIT_PART('" + tipo + "','-',1)::integer)"
                    + ", id_u_medida = (SELECT SPLIT_PART('" + medida + "','-',1)::integer)"
                    + ", p_descrip = '" + descripcion
                    + "', precio = " + precio,
                    "cod_producto = " + codigo, 1);
        }
    }

    // Metodo para limpiar campos
    private void limpiar_campos() {

        txtcodigo.setText("");
        txtnombre.setText("");
        txtprecio.setText("");
        txtbuscar.setText("");

    }

    // Metodo para cargar datos en la tabla con datos de la BDD
    private void cargar_tabla() {

        try {
            cursor = (DefaultTableModel) tablaproductos.getModel();
            String sql = "SELECT p.cod_producto, CONCAT(p.cod_tipo_prod, '- ', t.t_p_descrip) AS tipo_producto, CONCAT(p.id_u_medida, '- ', u.u_descrip) AS medida, p.p_descrip, p.precio "
                    + "FROM producto p "
                    + "JOIN tipo_producto t ON p.cod_tipo_prod = t.cod_tipo_prod "
                    + "JOIN u_medida u ON p.id_u_medida = u.id_u_medida "
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
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para cargar combobox
    private void llenar_combo(String orden) {

        try {
            String sql = "SELECT CONCAT(cod_tipo_prod, '- ' , t_p_descrip) AS tipo FROM tipo_producto ORDER BY cod_tipo_prod ASC;";
            rs = con.Listar(sql);
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    combotipo.addItem(rs.getString("tipo"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void llenar_combo_medida(String orden) {

        try {
            String sql = "SELECT CONCAT(id_u_medida, '- ' , u_descrip) AS medida FROM u_medida ORDER BY id_u_medida ASC;";
            rs = con.Listar(sql);
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    combomedida.addItem(rs.getString("medida"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para limpiar valores de la tabla
    private void limpiar_tabla() {

        cursor = (DefaultTableModel) tablaproductos.getModel();
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
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    // Metodo para habilitar campos dentro del metodo txtdocumento
    private void habilitarCampos() {

        combomedida.setEnabled(false);
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
            cursor = (DefaultTableModel) tablaproductos.getModel();
            String buscar = txtbuscar.getText().toUpperCase().trim();
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
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Ver datos
    private void ver_datos() {

        int fila = tablaproductos.getSelectedRow(); // codigo nombre tipo medida precio 
        System.out.println(fila);
        txtcodigo.setText(tablaproductos.getValueAt(fila, 0).toString());
        txtnombre.setText(tablaproductos.getValueAt(fila, 1).toString());
        txtprecio.setText(tablaproductos.getValueAt(fila, 4).toString());
        combotipo.setSelectedItem(tablaproductos.getValueAt(fila, 2).toString());
        combomedida.setSelectedItem(tablaproductos.getValueAt(fila, 3).toString());

        /*String codigo = tablaproductos.getValueAt(fila, 0).toString();
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
                    combotipo.setSelectedItem(rs.getString("ciudad"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }*/
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
        String descripcion = txtnombre.getText().trim();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete este campo!");
                txtnombre.requestFocus();
                return;
            } else {
                txtnombre.setEnabled(false);
                txtprecio.setEnabled(true);
                txtprecio.requestFocus();
            }

            /*if (operacion == 1) {
                System.out.println("La operacion es insertar " + operacion);
                // Modo guardar: validar si el documento ya existe
                if (!validar_documento()) {
                    System.out.println("Entra a habilitar campos, retorna false ");
                    habilitarCampos();
                } else {
                    System.out.println("Entra a habilitar campos, retorna true ");
                    mostrarErrorDocumento();
                }
            } else {
                // Modo edición
                System.out.println("La operacion es editar " + operacion);
                String documentoActual = buscar(codigo);
                if (documentoActual == null) {
                    JOptionPane.showMessageDialog(this, "El código ingresado no existe");
                    txtcodigo.requestFocus();
                    return;
                }

                if (descripcion.equals(documentoActual)) {
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
            }*/
        }

    }//GEN-LAST:event_txtnombreKeyPressed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

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

    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed

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
                con.borrar_datos("producto", "cod_producto", codigo);
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

    private void txtprecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioKeyPressed

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

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed

        String precio = txtprecio.getText();
        if (precio.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el precio del producto!");
        } else {
            txtprecio.setEnabled(false);
            combotipo.setEnabled(true);
            combotipo.requestFocus();
        }

    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped

        int k = evt.getKeyChar();
        if ((k >= 32 && k <= 45) || (k >= 58 && k <= 126)) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Solo puede ingresar numeros sin punto decimal!");
            txtprecio.requestFocus();
        }

    }//GEN-LAST:event_txtprecioKeyTyped

    private void combotipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combotipoKeyTyped

        combotipo.setEnabled(false);
        combomedida.setEnabled(true);
        combomedida.requestFocus();

    }//GEN-LAST:event_combotipoKeyTyped

    private void combotipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combotipoMouseClicked

        /*combotipo.setEnabled(false);
        txtdireccion.setEnabled(true);
        txtdireccion.requestFocus();*/

    }//GEN-LAST:event_combotipoMouseClicked

    private void tablaproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproductosMouseClicked

        ver_datos();

    }//GEN-LAST:event_tablaproductosMouseClicked

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

    private void combomedidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combomedidaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_combomedidaMouseClicked

    private void combomedidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combomedidaKeyTyped

        combomedida.setEnabled(false);
        btnguardar.setEnabled(true);
        btnguardar.requestFocus();

    }//GEN-LAST:event_combomedidaKeyTyped

    private void combotipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotipoActionPerformed

        //combomedida.setEnabled(false);
        //combomedida.setEnabled(true);
        //combotipo.requestFocus();

    }//GEN-LAST:event_combotipoActionPerformed

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

    private void combomedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combomedidaActionPerformed

    private void combomedidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combomedidaKeyPressed

        String codigo = txtcodigo.getText().trim();
        String descripcion = txtnombre.getText().trim();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            /* if (descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete este campo!");
                txtnombre.requestFocus();
                return;
            }*/

            if (operacion == 1) {
                System.out.println("La operacion es insertar " + operacion);
                // Modo guardar: validar si el documento ya existe
                if (!validar_documento()) {
                    System.out.println("Entra a habilitar campos, retorna false ");
                    habilitarCampos();
                } else {
                    System.out.println("Entra a mostrar error, retorna true ");
                    mostrarErrorDocumento();
                }
            } else {
                // Modo edición
                System.out.println("La operacion es editar " + operacion);
                String documentoActual = buscar(codigo);
                if (documentoActual == null) {
                    JOptionPane.showMessageDialog(this, "El código ingresado no existe");
                    txtcodigo.requestFocus();
                    return;
                }

                if (descripcion.equals(documentoActual)) {
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

    }//GEN-LAST:event_combomedidaKeyPressed

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
            java.util.logging.Logger.getLogger(productos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                productos dialog = new productos(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> combomedida;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelApellido;
    private org.edisoncor.gui.label.LabelMetric labelBuscar;
    private org.edisoncor.gui.label.LabelMetric labelCiudad;
    private org.edisoncor.gui.label.LabelMetric labelCiudad1;
    private org.edisoncor.gui.label.LabelMetric labelCodigo;
    private org.edisoncor.gui.label.LabelMetric labelNombre;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private javax.swing.JTable tablaproductos;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtbuscar;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtcodigo;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtnombre;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtprecio;
    // End of variables declaration//GEN-END:variables
}
