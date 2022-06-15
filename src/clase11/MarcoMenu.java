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

    private final Color valoresColores[] = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
    private final JRadioButtonMenuItem elementoColores[]; //elementos del menu colores
    private final JRadioButtonMenuItem fuentes[]; //elementos del menu fuentes
    private final JCheckBoxMenuItem elementosEstilos[]; //elementos del menu estilos
    private final ButtonGroup fuentesButtonGroup; //administra elementos del menu fuentes
    private final ButtonGroup coloresButtonGroup; //administra elementos del menu colores
    private int estilo; //se utiliza para crear el estilo para la fuente

    public MarcoMenu() {
        initComponents();
        String colores[] = {"Negro", "Azul", "Rojo", "Verde"};
        elementoColores = new JRadioButtonMenuItem[colores.length];
        coloresButtonGroup = new ButtonGroup();

        ManejadorElementos manejadorElementos = new ManejadorElementos();

        for (int cuenta = 0; cuenta < colores.length; cuenta++) {
            elementoColores[cuenta] = new JRadioButtonMenuItem(colores[cuenta]);
            mColor.add(elementoColores[cuenta]);
            coloresButtonGroup.add(elementoColores[cuenta]);
            elementoColores[cuenta].addActionListener(manejadorElementos);
        }
        elementoColores[0].setSelected(true);
        
        //Arreglo de enlista los nombres de las fuentes
        String nombresFuentes [] = {"Serif", "Monospaced", "SansSerif"};
        
        //Crea los elementos de menu de botones de opcion para los nombres de las fuentes
        fuentes = new JRadioButtonMenuItem[nombresFuentes.length];
        fuentesButtonGroup = new ButtonGroup();
        
        //Crea elementos de menu de botones de opcion de Fuente
        for (int cuenta = 0; cuenta < fuentes.length; cuenta++) {
            fuentes[cuenta] = new JRadioButtonMenuItem(nombresFuentes[cuenta]);
            mFuente.add(fuentes[cuenta]);
            fuentesButtonGroup.add(fuentes[cuenta]);
            fuentes[cuenta].addActionListener(manejadorElementos);
        }
        fuentes[0].setSelected(true);
        mFuente.addSeparator();
        
        String nombresEstilos [] = {"Negrita", "Cursiva"}; //nombres de los estilos
        elementosEstilos = new JCheckBoxMenuItem[nombresEstilos.length];
        ManejadorEstilos manejadorEstilos = new ManejadorEstilos(); //manejador de estilos
        
        for (int cuenta = 0; cuenta < nombresEstilos.length; cuenta++) {
            elementosEstilos[cuenta] = new JCheckBoxMenuItem(nombresEstilos[cuenta]);
            mFuente.add(elementosEstilos[cuenta]);
            elementosEstilos[cuenta].addItemListener(manejadorEstilos);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        pPanel = new javax.swing.JPanel();
        Etiqueta = new javax.swing.JLabel();
        mbMenu = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        miAcerca = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miSalir = new javax.swing.JMenuItem();
        mFormato = new javax.swing.JMenu();
        mColor = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mFuente = new javax.swing.JMenu();

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem4.setText("jMenuItem4");

        jMenu5.setText("jMenu5");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Etiqueta.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Etiqueta.setText("Texto de ejemplo");

        javax.swing.GroupLayout pPanelLayout = new javax.swing.GroupLayout(pPanel);
        pPanel.setLayout(pPanelLayout);
        pPanelLayout.setHorizontalGroup(
            pPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Etiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        pPanelLayout.setVerticalGroup(
            pPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        mArchivo.setText("Archivo");

        miAcerca.setText("Archivo");
        miAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercaActionPerformed(evt);
            }
        });
        mArchivo.add(miAcerca);
        mArchivo.add(jSeparator1);

        miSalir.setMnemonic('s');
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mArchivo.add(miSalir);

        mbMenu.add(mArchivo);

        mFormato.setText("Herramientas");

        mColor.setText("Color");

        jMenuItem3.setText("jMenuItem3");
        mColor.add(jMenuItem3);

        mFormato.add(mColor);
        mFormato.add(jSeparator2);

        mFuente.setText("Fuente");
        mFormato.add(mFuente);

        mbMenu.add(mFormato);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercaActionPerformed
        JOptionPane.showMessageDialog(MarcoMenu.this, 
                "Este es un ejemplo\ndel uso de menus","Acerca de", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_miAcercaActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Etiqueta;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mColor;
    private javax.swing.JMenu mFormato;
    private javax.swing.JMenu mFuente;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miAcerca;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JPanel pPanel;
    // End of variables declaration//GEN-END:variables

    public class ManejadorElementos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int cuenta = 0; cuenta < elementoColores.length; cuenta++) {
                if (elementoColores[cuenta].isSelected()) {
                    Etiqueta.setForeground(valoresColores[cuenta]);
                    break;
                }
            }

            for (int cuenta = 0; cuenta < fuentes.length; cuenta++) {
                if (e.getSource() == fuentes[cuenta]) {
                    Etiqueta.setFont(new Font(fuentes[cuenta].getText(), estilo, 48));
                    break;
                }
            }
        }
    }

    public class ManejadorEstilos implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            estilo = 0;
            if (elementosEstilos[0].isSelected()) {
                estilo += Font.BOLD;
            }
            if (elementosEstilos[1].isSelected()) {
                estilo += Font.ITALIC;
            }
            Etiqueta.setFont(new Font(Etiqueta.getFont().getName(),estilo,72));
        }
    }
}
