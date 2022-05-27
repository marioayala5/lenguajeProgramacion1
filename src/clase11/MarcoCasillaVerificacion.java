/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Usuario
 */
public class MarcoCasillaVerificacion extends javax.swing.JFrame {

    /**
     * Creates new form MarcoCasillaVerificacion
     */
    public MarcoCasillaVerificacion() {
        initComponents();
        ManejadorCheckBox manejadorCheckBox = new ManejadorCheckBox();
        cbCursiva.addItemListener(manejadorCheckBox);
        cbNegrita.addItemListener(manejadorCheckBox);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        tfCampoTexto = new javax.swing.JTextField();
        cbNegrita = new javax.swing.JCheckBox();
        cbCursiva = new javax.swing.JCheckBox();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfCampoTexto.setText("Observe como cambia el estilo de tipo de letra");
        tfCampoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCampoTextoActionPerformed(evt);
            }
        });

        cbNegrita.setText("Negrita");

        cbCursiva.setText("Cursiva");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCampoTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbNegrita)
                        .addGap(18, 18, 18)
                        .addComponent(cbCursiva)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfCampoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNegrita)
                    .addComponent(cbCursiva))
                .addContainerGap(234, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCampoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCampoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCampoTextoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbCursiva;
    private javax.swing.JCheckBox cbNegrita;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JTextField tfCampoTexto;
    // End of variables declaration//GEN-END:variables

    private class ManejadorCheckBox implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            Font tipoLetra = null;
            
            if (cbNegrita.isSelected() && cbCursiva.isSelected()) {
                tipoLetra = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if (cbNegrita.isSelected()){
                tipoLetra = new Font("Serif", Font.BOLD, 14);
            } else if (cbCursiva.isSelected()) {
                tipoLetra = new Font("Serif", Font.ITALIC, 14);
            } else {
                tipoLetra = new Font("Serif", Font.PLAIN, 14);
            }
            tfCampoTexto.setFont(tipoLetra);
        }
        
    }
}