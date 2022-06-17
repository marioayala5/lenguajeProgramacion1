package clase12;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ABMAutores extends javax.swing.JFrame {

    //Nombre del controlador del JDBC y URL de la base de datos
    static final String CONTROLADOR = "org.postgresql.Driver";
    static final String URL_DATABASE = "jdbc:postgresql://localhost:5432/libros";
    static final String USUARIO = "postgres";
    static final String CLAVE = "123456789";

    //La consulta predeterminada obtiene todos los datos de la tabla autores
    private final String CONSULTA_PREDETERMINADA = "SELECT * FROM autores";
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
        mbMenu = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        mABM = new javax.swing.JMenu();
        miGuardar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Datos del Autor"));

        lNombrePila.setText("Nombre Pila:");

        lApellidoPaterno.setText("Apellido Paterno:");

        bGuardar.setText("Guardar");

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
                            .addComponent(bGuardar))
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
                .addComponent(bGuardar)
                .addGap(18, 18, 18)
                .addComponent(spAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mArchivo.setText("Archivo");

        miSalir.setText("Salir");
        mArchivo.add(miSalir);

        mbMenu.add(mArchivo);

        mABM.setText("ABM");

        miGuardar.setText("Guardar");
        mABM.add(miGuardar);

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
    }//GEN-LAST:event_tAutorMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGuardar;
    private javax.swing.JLabel lApellidoPaterno;
    private javax.swing.JLabel lNombrePila;
    private javax.swing.JMenu mABM;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miGuardar;
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
                fila[i] = resultado.getObject(i+1);
            }
            //agrega la fila al modelo
            modeloTabla.addRow(fila);
        }
        //agrega el modelo a la tabla
        tAutor.setModel(modeloTabla);
    }
}
