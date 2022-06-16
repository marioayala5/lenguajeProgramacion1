package unidad11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertidordeTemperatura extends javax.swing.JFrame {

    protected Double salida;
    protected String salidaString;

    public ConvertidordeTemperatura() {
        initComponents();

        Manejador manejador = new Manejador();
        btConvertir.addActionListener(manejador);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jp1 = new javax.swing.JPanel();
        jp2 = new javax.swing.JPanel();
        rbCentigrado = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        jp3 = new javax.swing.JPanel();
        cbSalida = new javax.swing.JComboBox<>();
        jp4 = new javax.swing.JPanel();
        tfTexto = new javax.swing.JTextField();
        lResultado = new javax.swing.JLabel();
        btConvertir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        mConvertidor = new javax.swing.JMenu();
        mEntrada = new javax.swing.JMenu();
        bmiCentigrados = new javax.swing.JRadioButtonMenuItem();
        bmiFahrenheit = new javax.swing.JRadioButtonMenuItem();
        bmiKelvin = new javax.swing.JRadioButtonMenuItem();
        mSalida = new javax.swing.JMenu();
        bmiCentigradosSalida = new javax.swing.JRadioButtonMenuItem();
        bmiFahrenheitSalida = new javax.swing.JRadioButtonMenuItem();
        bmikelvinSalida = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp1.setBorder(javax.swing.BorderFactory.createTitledBorder("Convertidor "));

        jp2.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada"));

        buttonGroup1.add(rbCentigrado);
        rbCentigrado.setText("Centígrados");

        buttonGroup1.add(rbFahrenheit);
        rbFahrenheit.setText("Fahrenheit");

        buttonGroup1.add(rbKelvin);
        rbKelvin.setText("Kelvin");

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbFahrenheit)
            .addComponent(rbKelvin)
            .addComponent(rbCentigrado)
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbCentigrado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFahrenheit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbKelvin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp3.setBorder(javax.swing.BorderFactory.createTitledBorder("Salida"));

        cbSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centígrados", "Fahrenheit", "Kelvin" }));

        javax.swing.GroupLayout jp3Layout = new javax.swing.GroupLayout(jp3);
        jp3.setLayout(jp3Layout);
        jp3Layout.setHorizontalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3Layout.createSequentialGroup()
                .addComponent(cbSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jp3Layout.setVerticalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(cbSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp4.setBorder(javax.swing.BorderFactory.createTitledBorder("Temperatura"));

        tfTexto.setText("0");

        lResultado.setText("Resultado");

        btConvertir.setText("Convertir");

        javax.swing.GroupLayout jp4Layout = new javax.swing.GroupLayout(jp4);
        jp4.setLayout(jp4Layout);
        jp4Layout.setHorizontalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp4Layout.createSequentialGroup()
                        .addComponent(tfTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lResultado))
                    .addComponent(btConvertir))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jp4Layout.setVerticalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConvertir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jp3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jp2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        mArchivo.setMnemonic('a');
        mArchivo.setText("Archivo");

        miSalir.setMnemonic('s');
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mArchivo.add(miSalir);

        jMenuBar1.add(mArchivo);

        mConvertidor.setMnemonic('c');
        mConvertidor.setText("Convertidor");
        mConvertidor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mConvertidorStateChanged(evt);
            }
        });

        mEntrada.setText("Entrada");

        buttonGroup2.add(bmiCentigrados);
        bmiCentigrados.setSelected(true);
        bmiCentigrados.setText("Centígrados");
        mEntrada.add(bmiCentigrados);

        buttonGroup2.add(bmiFahrenheit);
        bmiFahrenheit.setText("Fahrenheit");
        mEntrada.add(bmiFahrenheit);

        buttonGroup2.add(bmiKelvin);
        bmiKelvin.setText("Kelvin");
        mEntrada.add(bmiKelvin);

        mConvertidor.add(mEntrada);

        mSalida.setText("Salida");

        buttonGroup3.add(bmiCentigradosSalida);
        bmiCentigradosSalida.setSelected(true);
        bmiCentigradosSalida.setText("Centígrados");
        mSalida.add(bmiCentigradosSalida);

        buttonGroup3.add(bmiFahrenheitSalida);
        bmiFahrenheitSalida.setText("Fahrenheit");
        mSalida.add(bmiFahrenheitSalida);

        buttonGroup3.add(bmikelvinSalida);
        bmikelvinSalida.setText("Kelvin");
        mSalida.add(bmikelvinSalida);

        mConvertidor.add(mSalida);

        jMenuBar1.add(mConvertidor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mConvertidorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mConvertidorStateChanged
        if (rbCentigrado.isSelected() && cbSalida.getSelectedItem() == "Fahrenheit") {
            bmiCentigrados.setSelected(true);
            bmiFahrenheitSalida.setSelected(true);
        } else if (rbCentigrado.isSelected() && cbSalida.getSelectedItem() == "Kelvin") {
            bmiCentigrados.setSelected(true);
            bmikelvinSalida.setSelected(true);
        } else if (rbFahrenheit.isSelected() && "Centígrados" == cbSalida.getSelectedItem()) {
            bmiFahrenheit.setSelected(true);
            bmiCentigradosSalida.setSelected(true);
        } else if (rbFahrenheit.isSelected() && cbSalida.getSelectedItem() == "Kelvin") {
            bmiFahrenheit.setSelected(true);
            bmikelvinSalida.setSelected(true);
        } else if (rbKelvin.isSelected() && cbSalida.getSelectedItem() == "Centígrados") {
            bmiKelvin.setSelected(true);
            bmiCentigradosSalida.setSelected(true);
        } else if (rbKelvin.isSelected() && cbSalida.getSelectedItem() == "Fahrenheit") {
            bmiKelvin.setSelected(true);
            bmiFahrenheitSalida.setSelected(true);
        }
    }//GEN-LAST:event_mConvertidorStateChanged

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

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
            java.util.logging.Logger.getLogger(ConvertidordeTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvertidordeTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvertidordeTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertidordeTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConvertidordeTemperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem bmiCentigrados;
    private javax.swing.JRadioButtonMenuItem bmiCentigradosSalida;
    private javax.swing.JRadioButtonMenuItem bmiFahrenheit;
    private javax.swing.JRadioButtonMenuItem bmiFahrenheitSalida;
    private javax.swing.JRadioButtonMenuItem bmiKelvin;
    private javax.swing.JRadioButtonMenuItem bmikelvinSalida;
    private javax.swing.JButton btConvertir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbSalida;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JPanel jp4;
    private javax.swing.JLabel lResultado;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mConvertidor;
    private javax.swing.JMenu mEntrada;
    private javax.swing.JMenu mSalida;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JRadioButton rbCentigrado;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JTextField tfTexto;
    // End of variables declaration//GEN-END:variables

    public class Manejador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            salida = Double.parseDouble(tfTexto.getText());

            if (rbCentigrado.isSelected() && cbSalida.getSelectedItem() == "Kelvin") {
                salida = salida + 273.15;
                salidaString = String.valueOf(salida) + " K";
            } else if (rbFahrenheit.isSelected() && cbSalida.getSelectedItem() == "Centígrados") {
                salida = (salida - 32) * 5 / 9;
                salidaString = String.valueOf(salida) + " °C";
            } else if (rbKelvin.isSelected() && cbSalida.getSelectedItem() == "Fahrenheit") {
                salida = (salida - 273.15) * 9 / 5 + 32;
                salidaString = String.valueOf(salida) + " F";
            } else if (rbCentigrado.isSelected() && cbSalida.getSelectedItem() == "Fahrenheit") {
                salida = (salida * 9 / 5) + 32;
                salidaString = String.valueOf(salida) + " F";
            } else if (rbKelvin.isSelected() && cbSalida.getSelectedItem() == "Centígrados") {
                salida = salida - 273.15;
                salidaString = String.valueOf(salida) + " °C";
            } else if (rbFahrenheit.isSelected() && cbSalida.getSelectedItem() == "Kelvin") {
                salida = (salida - 32) * 5 / 9 + 273.15;
                salidaString = String.valueOf(salida) + " K";
            }
            lResultado.setText(salidaString);
        }
    }
}
