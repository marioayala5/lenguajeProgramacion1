/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MarcoBoton extends javax.swing.JFrame {

    /**
     * Creates new form MarcoBoton
     */
    public MarcoBoton() {
        initComponents();
        ManejadorBoton manejadorBoton = new ManejadorBoton();
        bBotonSimple.addActionListener(manejadorBoton);
        bBotonElegante.addActionListener(manejadorBoton);
        bEjemplo.addActionListener(manejadorBoton);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bBotonSimple = new javax.swing.JButton();
        bBotonElegante = new javax.swing.JButton();
        bEjemplo = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bBotonSimple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase11/insecto1.png"))); // NOI18N
        bBotonSimple.setText("Boton Simple");
        bBotonSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotonSimpleActionPerformed(evt);
            }
        });

        bBotonElegante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase11/insecto1.GIF"))); // NOI18N
        bBotonElegante.setText("Boton Elegante");
        bBotonElegante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/clase11/insecto2.GIF"))); // NOI18N
        bBotonElegante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotonEleganteActionPerformed(evt);
            }
        });

        bEjemplo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase11/insecto1.GIF"))); // NOI18N
        bEjemplo.setText("Boton Simple");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBotonElegante)
                    .addComponent(bBotonSimple)
                    .addComponent(bEjemplo))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bBotonSimple)
                .addGap(18, 18, 18)
                .addComponent(bBotonElegante)
                .addGap(18, 18, 18)
                .addComponent(bEjemplo)
                .addContainerGap(340, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBotonSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotonSimpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bBotonSimpleActionPerformed

    private void bBotonEleganteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotonEleganteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bBotonEleganteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBotonElegante;
    private javax.swing.JButton bBotonSimple;
    private javax.swing.JButton bEjemplo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    private class ManejadorBoton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(MarcoBoton.this, String.format("Usted oprimio: %s", e.getActionCommand()));
        }
        
    }
}
