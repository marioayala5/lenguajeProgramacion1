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
public class MarcoBotonOpcion extends javax.swing.JFrame {

    private final Font tipoLetraSimple;
    private final Font tipoLetraNegrita;
    private final Font tipoLetraCursiva;
    private final Font tipoLetraNegritaCursiva;

    public MarcoBotonOpcion() {
        initComponents();

        //crear objetos de tipo de letra
        tipoLetraSimple = new Font("Serif", Font.PLAIN, 14);
        tipoLetraNegrita = new Font("Serif", Font.BOLD, 14);
        tipoLetraCursiva = new Font("Serif", Font.ITALIC, 14);
        tipoLetraNegritaCursiva = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        
        //crea la relacion logica entre los objetos JRadioButton
        bgGrupo.add(rbSimple);
        bgGrupo.add(rbNegrita);
        bgGrupo.add(rbCursiva);
        bgGrupo.add(rbNegritaCursiva);
        
        //registra eventos para los objetos JRadioButton
        rbSimple.addItemListener(new ManejadorBotonOpcion(tipoLetraSimple));
        rbNegrita.addItemListener(new ManejadorBotonOpcion(tipoLetraNegrita));
        rbCursiva.addItemListener(new ManejadorBotonOpcion(tipoLetraCursiva));
        rbNegritaCursiva.addItemListener(new ManejadorBotonOpcion(tipoLetraNegritaCursiva));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGrupo = new javax.swing.ButtonGroup();
        rbSimple = new javax.swing.JRadioButton();
        rbNegrita = new javax.swing.JRadioButton();
        tfCampoTexto = new javax.swing.JTextField();
        rbCursiva = new javax.swing.JRadioButton();
        rbNegritaCursiva = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rbSimple.setSelected(true);
        rbSimple.setText("Simple");

        rbNegrita.setText("Negrita");

        tfCampoTexto.setText("Observe como cambia el estilo de tipo de letra");

        rbCursiva.setText("Cursiva");

        rbNegritaCursiva.setText("Negrita/Cursiva");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCampoTexto)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbSimple)
                        .addGap(18, 18, 18)
                        .addComponent(rbNegrita)
                        .addGap(18, 18, 18)
                        .addComponent(rbCursiva)
                        .addGap(18, 18, 18)
                        .addComponent(rbNegritaCursiva)
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfCampoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCursiva)
                    .addComponent(rbNegrita)
                    .addComponent(rbSimple)
                    .addComponent(rbNegritaCursiva))
                .addContainerGap(234, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGrupo;
    private javax.swing.JRadioButton rbCursiva;
    private javax.swing.JRadioButton rbNegrita;
    private javax.swing.JRadioButton rbNegritaCursiva;
    private javax.swing.JRadioButton rbSimple;
    private javax.swing.JTextField tfCampoTexto;
    // End of variables declaration//GEN-END:variables

    private class ManejadorBotonOpcion implements ItemListener {

        private final Font tipoLetra; //tipo de letra asociado con este componente de escucha

        public ManejadorBotonOpcion(Font f) {
            tipoLetra = f; //establece el tipo de letra de este componente de escucha
        }

        //Maneja los eventos de botones de opcion
        @Override
        public void itemStateChanged(ItemEvent e) {
            tfCampoTexto.setFont(tipoLetra); //establece el tipo de letra de campoTexto
        } //fin de metodo itemStateChanged

    } //fin de la clase interna privada ManejadorBoton

}
