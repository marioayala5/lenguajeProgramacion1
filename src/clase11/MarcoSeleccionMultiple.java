package clase11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MarcoSeleccionMultiple extends javax.swing.JFrame {

    public MarcoSeleccionMultiple() {
        initComponents();
        bBotonCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //lListaCopia.setListData(lListaColores.getSelectedValues());

                List<String> lista = lListaColores.getSelectedValuesList();
                Object[] valores = new Object[lista.size()];
                int x = 0;
                for (String valor : lista) {
                    valores[x++] = valor;
                }
                lListaCopia.setListData(valores);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spListsColores = new javax.swing.JScrollPane();
        lListaColores = new javax.swing.JList();
        bBotonCopiar = new javax.swing.JButton();
        spListCopia = new javax.swing.JScrollPane();
        lListaCopia = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lListaColores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Negro", "Azul", "Cyan", "Gris oscuro", "Gris", "Verde ", "Gris claro", "Magenta", "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lListaColores.setVerifyInputWhenFocusTarget(false);
        lListaColores.setVisibleRowCount(5);
        spListsColores.setViewportView(lListaColores);

        bBotonCopiar.setText("Copiar >>>");

        lListaCopia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        lListaCopia.setVisibleRowCount(5);
        spListCopia.setViewportView(lListaCopia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spListsColores, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBotonCopiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spListCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bBotonCopiar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spListsColores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(spListCopia))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBotonCopiar;
    private javax.swing.JList lListaColores;
    private javax.swing.JList lListaCopia;
    private javax.swing.JScrollPane spListCopia;
    private javax.swing.JScrollPane spListsColores;
    // End of variables declaration//GEN-END:variables
}
