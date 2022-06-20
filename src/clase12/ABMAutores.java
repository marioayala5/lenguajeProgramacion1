package clase12;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ABMAutores extends javax.swing.JFrame {

    //Nombre del controlador del JDBC y URL de la base de datos
    static final String CONTROLADOR = "org.postgresql.Driver";
    static final String URL_DATABASE = "jdbc:postgresql://localhost:5432/libros";
    static final String USUARIO = "postgres";
    static final String CLAVE = "1236987";

    //La consulta predeterminada obtiene todos los datos de la tabla autores
    private final String CONSULTA_PREDETERMINADA = "SELECT * FROM autores order by idautor";
    private Autores autores;
    private Connection conexion;
    private Statement instruccion;

    public ABMAutores() {
        initComponents();

        try {
            //Carga la clase controlador
            Class.forName(CONTROLADOR);
            try {
                //Establece la conexion a la base de datos
                conexion = DriverManager.getConnection(URL_DATABASE, USUARIO, CLAVE);
                instruccion = conexion.createStatement();
                cargarTabla();
            } catch (SQLException ex) {
                Logger.getLogger(ABMAutores.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ABMAutores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pAutor = new javax.swing.JPanel();
        lNombrePila = new javax.swing.JLabel();
        lApellidoPaterno = new javax.swing.JLabel();
        tfNombrePila = new javax.swing.JTextField();
        tfApellidoPaterno = new javax.swing.JTextField();
        bGuardar = new javax.swing.JButton();
        spAutor = new javax.swing.JScrollPane();
        tAutor = new javax.swing.JTable();
        bModificar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        mbMenu = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        mABM = new javax.swing.JMenu();
        miGuardar = new javax.swing.JMenuItem();
        miModificar = new javax.swing.JMenuItem();
        miEliminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Datos del Autor"));

        lNombrePila.setText("Nombre Pila:");

        lApellidoPaterno.setText("Apellido Paterno:");

        tfApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfApellidoPaternoKeyPressed(evt);
            }
        });

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        spAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Autores"));

        tAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tAutorMouseClicked(evt);
            }
        });
        spAutor.setViewportView(tAutor);

        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pAutorLayout = new javax.swing.GroupLayout(pAutor);
        pAutor.setLayout(pAutorLayout);
        pAutorLayout.setHorizontalGroup(
            pAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(pAutorLayout.createSequentialGroup()
                        .addGroup(pAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pAutorLayout.createSequentialGroup()
                                .addGroup(pAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lApellidoPaterno)
                                    .addComponent(lNombrePila))
                                .addGap(18, 18, 18)
                                .addGroup(pAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNombrePila)
                                    .addComponent(tfApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                            .addGroup(pAutorLayout.createSequentialGroup()
                                .addComponent(bGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(bModificar)
                                .addGap(18, 18, 18)
                                .addComponent(bEliminar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pAutorLayout.setVerticalGroup(
            pAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombrePila)
                    .addComponent(tfNombrePila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lApellidoPaterno)
                    .addComponent(tfApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardar)
                    .addComponent(bModificar)
                    .addComponent(bEliminar))
                .addGap(18, 18, 18)
                .addComponent(spAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mArchivo.setText("Archivo");

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mArchivo.add(miSalir);

        mbMenu.add(mArchivo);

        mABM.setText("ABM");

        miGuardar.setText("Guardar");
        miGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGuardarActionPerformed(evt);
            }
        });
        mABM.add(miGuardar);

        miModificar.setText("Modificar");
        miModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarActionPerformed(evt);
            }
        });
        mABM.add(miModificar);

        miEliminar.setText("Eliminar");
        miEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarActionPerformed(evt);
            }
        });
        mABM.add(miEliminar);

        mbMenu.add(mABM);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tAutorMouseClicked
        int fila = tAutor.getSelectedRow();
        int idAutor = Integer.parseInt(String.valueOf(tAutor.getValueAt(fila, 0)));
        buscarAutor(idAutor);
    }//GEN-LAST:event_tAutorMouseClicked

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        guardarAutor();
    }//GEN-LAST:event_bGuardarActionPerformed

    private void tfApellidoPaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidoPaternoKeyPressed
        int keyChar = evt.getKeyChar();
        if (keyChar == 10) {
            guardarAutor();
        }
    }//GEN-LAST:event_tfApellidoPaternoKeyPressed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    private void miGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarActionPerformed
        guardarAutor();
    }//GEN-LAST:event_miGuardarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        int fila = tAutor.getSelectedRow();
        int idAutor = Integer.parseInt(String.valueOf(tAutor.getValueAt(fila, 0)));
        modificarAutor(idAutor);
    }//GEN-LAST:event_bModificarActionPerformed

    private void miModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarActionPerformed
        int fila = tAutor.getSelectedRow();
        int idAutor = Integer.parseInt(String.valueOf(tAutor.getValueAt(fila, 0)));
        modificarAutor(idAutor);
    }//GEN-LAST:event_miModificarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        int fila = tAutor.getSelectedRow();
        int idAutor = Integer.parseInt(String.valueOf(tAutor.getValueAt(fila, 0)));
        eliminarAutor(idAutor);
    }//GEN-LAST:event_bEliminarActionPerformed

    private void miEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarActionPerformed
        int fila = tAutor.getSelectedRow();
        int idAutor = Integer.parseInt(String.valueOf(tAutor.getValueAt(fila, 0)));
        eliminarAutor(idAutor);
    }//GEN-LAST:event_miEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bModificar;
    private javax.swing.JLabel lApellidoPaterno;
    private javax.swing.JLabel lNombrePila;
    private javax.swing.JMenu mABM;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miEliminar;
    private javax.swing.JMenuItem miGuardar;
    private javax.swing.JMenuItem miModificar;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JPanel pAutor;
    private javax.swing.JScrollPane spAutor;
    private javax.swing.JTable tAutor;
    private javax.swing.JTextField tfApellidoPaterno;
    private javax.swing.JTextField tfNombrePila;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() throws SQLException {
        ResultSet resultado = instruccion.executeQuery(CONSULTA_PREDETERMINADA);
        //crear un modelo por defecto para la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        //obtener metadato del resultSet
        ResultSetMetaData metaDato = resultado.getMetaData();
        //cantidad de columnas
        int cantidad = metaDato.getColumnCount();
        //obtener el nombre de cada columna
        for (int i = 1; i <= cantidad; i++) {
            modeloTabla.addColumn(metaDato.getColumnLabel(i));
        }
        //crear array de Object con la cantidad de columnas
        Object[] fila = new Object[cantidad];
        //recorre el resultSet
        while (resultado.next()) {
            //obtiene el valor de la columna
            for (int i = 0; i < cantidad; i++) {
                fila[i] = resultado.getObject(i + 1);
            }
            //agrega la fila al modelo
            modeloTabla.addRow(fila);
        }
        //agrega el modelo a la tabla
        tAutor.setModel(modeloTabla);
    }

    public void guardarAutor() {
        Autores a = new Autores();
        a.setNombrePila(tfNombrePila.getText());
        a.setApellidoPaterno(tfApellidoPaterno.getText());

        int respuesta;
        try {
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO autores(nombrepila, apellidopaterno) VALUES (?,?)");
            ps.setString(1, a.getNombrePila());
            ps.setString(2, a.getApellidoPaterno());
            respuesta = ps.executeUpdate();
            cargarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(ABMAutores.class.getName()).log(Level.SEVERE, null, ex);
            respuesta = ex.getErrorCode();
        }

        if (respuesta == 1) {
            JOptionPane.showMessageDialog(rootPane, "Registro del autor exitoso", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            tfNombrePila.setText(null);
            tfApellidoPaterno.setText(null);
            tfNombrePila.grabFocus();
        }
    }

    public void modificarAutor(int idAutor) {
        Autores a = new Autores();
        a.setNombrePila(tfNombrePila.getText());
        a.setApellidoPaterno(tfApellidoPaterno.getText());
        a.setIdAutor(idAutor);

        int rp;
        try {
            PreparedStatement ps = conexion.prepareStatement("UPDATE public.autores SET nombrepila=?, apellidopaterno=? WHERE idautor=?;");
            ps.setString(1, a.getNombrePila());
            ps.setString(2, a.getApellidoPaterno());
            ps.setInt(3, a.getIdAutor());
            rp = ps.executeUpdate();
            cargarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(ABMAutores.class.getName()).log(Level.SEVERE, null, ex);
            rp = ex.getErrorCode();
        }

        if (rp == 1) {
            JOptionPane.showMessageDialog(rootPane, "Los datos del autor fueron modificados exitosamente", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            tfNombrePila.setText(null);
            tfApellidoPaterno.setText(null);
            tfNombrePila.grabFocus();
        }
    }

    public void eliminarAutor(int idAutor) {
        Autores a = new Autores();
        a.setIdAutor(idAutor);

        int rp;
        try {
            PreparedStatement ps = conexion.prepareStatement("DELETE FROM public.autores WHERE idautor =?");
            ps.setInt(1, a.getIdAutor());
            rp = ps.executeUpdate();
            cargarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(ABMAutores.class.getName()).log(Level.SEVERE, null, ex);
            rp = ex.getErrorCode();
        }

        if (rp == 1) {
            JOptionPane.showMessageDialog(rootPane, "El usuario fue borrado de manera exitosa", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            tfNombrePila.setText(null);
            tfApellidoPaterno.setText(null);
            tfNombrePila.grabFocus();
        }
    }

    private void buscarAutor(int idAutor) {
        try {
            PreparedStatement ps = conexion.prepareStatement("SELECT * FROM autores WHERE idautor= ?");
            ps.setInt(1, idAutor);
            ResultSet rs = ps.executeQuery();
            autores = new Autores();
            if (rs.next()) {
                autores.setIdAutor(rs.getInt("idautor"));
                autores.setNombrePila(rs.getString("nombrepila"));
                autores.setApellidoPaterno(rs.getString("apellidopaterno"));
                tfNombrePila.setText(autores.getNombrePila());
                tfApellidoPaterno.setText(autores.getApellidoPaterno());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ABMAutores.class.getName()).log(Level.SEVERE, null, ex);
            autores = null;
        }
    }
}
