//Practica 11.12
package clase11;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

public class MarcoMenu extends javax.swing.JFrame {
    
    private final Color valoresColores[] = 
                  {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
    private final JRadioButtonMenuItem elementosColores[]; //Elemetos del menú colores
    private final JRadioButtonMenuItem fuentes[]; //Elemetos del menú fuentes
    private final JCheckBoxMenuItem elementosEstilos[]; //Elemetos del menú estilos
    private final ButtonGroup fuentesButtonGroup; // Administra elementos del menú fuentes
    private final ButtonGroup coloresButtonGroup; // Administra elementos del menú colores
    private int estilo; // Se utliza para crear el estilo para la fuente
    
    
    
    public MarcoMenu() {
        initComponents();
        //Arreglo que enlista la cadena colores
        String colores[] = {"Negro", "Azul", "Rojo", "Verde"};

        //Crea los elementos de menú de los botones de opción para los colores
        elementosColores = new JRadioButtonMenuItem[colores.length];
        coloresButtonGroup = new ButtonGroup(); //Administra los colores
        ManejadorElementos manejadorElementos = new ManejadorElementos(); //Manejador para colores

        //Crea los elementos de menú del botón de opción color
        for (int cuenta = 0; cuenta < colores.length; cuenta++) {
            elementosColores[cuenta] = new JRadioButtonMenuItem(colores[cuenta]); //crea elemento
            mColor.add(elementosColores[cuenta]); //Agrega elemento al menú color
            coloresButtonGroup.add(elementosColores[cuenta]); //Lo agrega al grupo
            elementosColores[cuenta].addActionListener(manejadorElementos);
        }
        elementosColores[0].setSelected(true);//Selecciona el primer elemeto de color
        //Arreglo que enlista los nombres de las fuentes
        String nombresFuentes[] = {"Serif", "Monospaced", "SansSerif"};

        //Crea elementos de menú de botones de opción para los nombres de las fuentes
        fuentes = new JRadioButtonMenuItem[nombresFuentes.length];
        fuentesButtonGroup = new ButtonGroup(); //Administra los nombres de las fuentes

        //Crea los elementos de menú de botones de opción de fuente
        for (int cuenta = 0; cuenta < fuentes.length; cuenta++) {
            fuentes[cuenta] = new JRadioButtonMenuItem(nombresFuentes[cuenta]);
            mFuente.add(fuentes[cuenta]); //agrega fuente al menú fuente
            fuentesButtonGroup.add(fuentes[cuenta]); //agrega al grupo de botones
            fuentes[cuenta].addActionListener(manejadorElementos); //agrega el manejador
        }
        fuentes[0].setSelected(true); //Selecciona el primer elemento del menú Fuente
        mFuente.addSeparator();
        
        String nombresEstilos[] = {"Negrita", "Cursiva"}; //Nombres de los estilos
        elementosEstilos = new JCheckBoxMenuItem[nombresEstilos.length];
        ManejadorEstilos manejadorEstilos = new ManejadorEstilos(); //Manejador de estilos
        
        for (int cuenta = 0; cuenta < nombresEstilos.length; cuenta++) {
            elementosEstilos[cuenta] = new JCheckBoxMenuItem(nombresEstilos[cuenta]); //Para el estilo
            mFuente.add(elementosEstilos[cuenta]); //Agrega al menú fuente
            elementosEstilos[cuenta].addItemListener(manejadorEstilos);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPanel = new javax.swing.JPanel();
        lEtiqueta = new javax.swing.JLabel();
        mbMenu = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        miAcerca = new javax.swing.JMenuItem();
        miSalir = new javax.swing.JMenuItem();
        mFormato = new javax.swing.JMenu();
        mColor = new javax.swing.JMenu();
        s1 = new javax.swing.JPopupMenu.Separator();
        mFuente = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lEtiqueta.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        lEtiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lEtiqueta.setText("Texto de Ejemplo");

        javax.swing.GroupLayout pPanelLayout = new javax.swing.GroupLayout(pPanel);
        pPanel.setLayout(pPanelLayout);
        pPanelLayout.setHorizontalGroup(
            pPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pPanelLayout.setVerticalGroup(
            pPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        mArchivo.setText("Archivo");

        miAcerca.setMnemonic('c');
        miAcerca.setText("Acerca de...");
        miAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercaActionPerformed(evt);
            }
        });
        mArchivo.add(miAcerca);

        miSalir.setMnemonic('s');
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mArchivo.add(miSalir);

        mbMenu.add(mArchivo);

        mFormato.setMnemonic('f');
        mFormato.setText("Formato");

        mColor.setMnemonic('c');
        mColor.setText("Color");
        mFormato.add(mColor);
        mFormato.add(s1);

        mFuente.setMnemonic('u');
        mFuente.setText("Fuente");
        mFormato.add(mFuente);

        mbMenu.add(mFormato);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercaActionPerformed
        //Muestra cuadro de dilogo de mensaje cuando el usuario selecciona Acerca de...
        JOptionPane.showMessageDialog(MarcoMenu.this, "Este es un ejemplo\ndel uso de menus", "Acerca de", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_miAcercaActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        // Sale de la aplicación
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lEtiqueta;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mColor;
    private javax.swing.JMenu mFormato;
    private javax.swing.JMenu mFuente;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miAcerca;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JPanel pPanel;
    private javax.swing.JPopupMenu.Separator s1;
    // End of variables declaration//GEN-END:variables
    
    //Clase interna para menajar los eventos de acción de los elementos de menú
    private class ManejadorElementos implements ActionListener {
        //procesa las selecciones de color y fuente
        @Override
        public void actionPerformed(ActionEvent evento) {
            //Procesa la sección del color
            for (int cuenta = 0; cuenta < elementosColores.length; cuenta++) {
                if (elementosColores[cuenta].isSelected()) {
                    lEtiqueta.setForeground(valoresColores[cuenta]);
                    break;
                }
            }
            //Procesa la selección de fuente
            for (int cuenta = 0; cuenta < fuentes.length; cuenta++) {
                if (evento.getSource() == fuentes[cuenta]) {
                    lEtiqueta.setFont(new Font(fuentes[cuenta].getText(), estilo, 48));
                    break;
                }
            }
        }
    }
    private class ManejadorEstilos implements ItemListener {
        //Procesa las selecciones de estilo de las fuentes
        @Override
        public void itemStateChanged(ItemEvent e) {
            estilo = 0; //Inicializa el estilo

            //Comprueba la selección de negrita
            if (elementosColores[0].isSelected()) {
                estilo += Font.BOLD; //Agrega negrita al estilo
            }
            if (elementosColores[1].isSelected()) {
                estilo += Font.ITALIC; //Agrega negrita al estilo
            }
            lEtiqueta.setFont(new Font(lEtiqueta.getFont().getName(), estilo, 72));
        }
    }
}
