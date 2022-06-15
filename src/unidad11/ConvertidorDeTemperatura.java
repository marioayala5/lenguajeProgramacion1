package unidad11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButtonMenuItem;

public class ConvertidorDeTemperatura extends javax.swing.JFrame {

    private final JRadioButtonMenuItem elementosEntrada[];
    private final JRadioButtonMenuItem elementosSalida[];
    private final ButtonGroup buttonGroupEntrada;
    private final ButtonGroup buttonGroupSalida;

    public ConvertidorDeTemperatura() {
        initComponents();

        //agregamos los botones
        bgGrupo.add(rbCentigrado);
        bgGrupo.add(rbFahrenheit);
        bgGrupo.add(rbKelvin);

        String entrada[] = {"Centígrados", "Fahrenheit", "Kelvin"};
        elementosEntrada = new JRadioButtonMenuItem[entrada.length];
        buttonGroupEntrada = new ButtonGroup();

        for (int cuenta = 0; cuenta < entrada.length; cuenta++) {
            elementosEntrada[cuenta] = new JRadioButtonMenuItem(entrada[cuenta]);
            mEntrada.add(elementosEntrada[cuenta]);
            buttonGroupEntrada.add(elementosEntrada[cuenta]);
        }
        elementosEntrada[0].setSelected(true);

        String salida[] = {"Centígrados", "Fahrenheit", "Kelvin"};
        elementosSalida = new JRadioButtonMenuItem[salida.length];
        buttonGroupSalida = new ButtonGroup();

        for (int cuenta = 0; cuenta < salida.length; cuenta++) {
            elementosSalida[cuenta] = new JRadioButtonMenuItem(salida[cuenta]);
            mSalida.add(elementosSalida[cuenta]);
            buttonGroupSalida.add(elementosSalida[cuenta]);
        }
        elementosSalida[0].setSelected(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jpEntrada = new javax.swing.JPanel();
        rbCentigrado = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        jpSalida = new javax.swing.JPanel();
        cbSalida = new javax.swing.JComboBox<>();
        jpTemperatura = new javax.swing.JPanel();
        tfValor = new javax.swing.JTextField();
        lResultado = new javax.swing.JLabel();
        bConvertir = new javax.swing.JButton();
        mbMenu = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        mConvertidor = new javax.swing.JMenu();
        mEntrada = new javax.swing.JMenu();
        mSalida = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Convertidor"));

        jpEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Entrada"), "Entrada"));

        rbCentigrado.setText("Centígrados");

        rbFahrenheit.setText("Fahrenheit");

        rbKelvin.setText("Kelvin");

        javax.swing.GroupLayout jpEntradaLayout = new javax.swing.GroupLayout(jpEntrada);
        jpEntrada.setLayout(jpEntradaLayout);
        jpEntradaLayout.setHorizontalGroup(
            jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbCentigrado)
            .addComponent(rbFahrenheit)
            .addComponent(rbKelvin)
        );
        jpEntradaLayout.setVerticalGroup(
            jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEntradaLayout.createSequentialGroup()
                .addComponent(rbCentigrado)
                .addGap(18, 18, 18)
                .addComponent(rbFahrenheit)
                .addGap(18, 18, 18)
                .addComponent(rbKelvin)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jpSalida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Salida")), "Salida"));

        javax.swing.GroupLayout jpSalidaLayout = new javax.swing.GroupLayout(jpSalida);
        jpSalida.setLayout(jpSalidaLayout);
        jpSalidaLayout.setHorizontalGroup(
            jpSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbSalida, javax.swing.GroupLayout.Alignment.TRAILING, 0, 100, Short.MAX_VALUE)
        );
        jpSalidaLayout.setVerticalGroup(
            jpSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpTemperatura.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Salida"), "Salida"), "Temperatura"));

        bConvertir.setText("Convertir");

        javax.swing.GroupLayout jpTemperaturaLayout = new javax.swing.GroupLayout(jpTemperatura);
        jpTemperatura.setLayout(jpTemperaturaLayout);
        jpTemperaturaLayout.setHorizontalGroup(
            jpTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTemperaturaLayout.createSequentialGroup()
                .addGroup(jpTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bConvertir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(tfValor, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addComponent(lResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTemperaturaLayout.setVerticalGroup(
            jpTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTemperaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lResultado))
                .addGap(18, 18, 18)
                .addComponent(bConvertir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        mArchivo.setText("Archivo");

        miSalir.setText("Salir");
        mArchivo.add(miSalir);

        mbMenu.add(mArchivo);

        mConvertidor.setText("Convertidor");

        mEntrada.setText("Entrada");
        mConvertidor.add(mEntrada);

        mSalida.setText("Salida");
        mConvertidor.add(mSalida);

        mbMenu.add(mConvertidor);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConvertir;
    private javax.swing.ButtonGroup bgGrupo;
    private javax.swing.JComboBox<String> cbSalida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpEntrada;
    private javax.swing.JPanel jpSalida;
    private javax.swing.JPanel jpTemperatura;
    private javax.swing.JLabel lResultado;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mConvertidor;
    private javax.swing.JMenu mEntrada;
    private javax.swing.JMenu mSalida;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JRadioButton rbCentigrado;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables

//    public class Manejador implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            for (int cuenta = 0; cuenta < elementosEntrada.length; cuenta++) {
//                if (elementosEntrada[cuenta].isSelected()) {
//                    
//                }
//            }
//        }
//        
//    }
}
