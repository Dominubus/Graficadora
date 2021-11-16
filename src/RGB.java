
import java.awt.Color;




public class RGB extends javax.swing.JFrame {

    
    public RGB() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HSL = new javax.swing.JButton();
        terminar2 = new javax.swing.JButton();
        rojo = new javax.swing.JLabel();
        verde = new javax.swing.JLabel();
        azul = new javax.swing.JLabel();
        sliderRojo = new javax.swing.JSlider();
        sliderVerde = new javax.swing.JSlider();
        sliderAzul = new javax.swing.JSlider();
        txtCampo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HSL.setText("HSL");
        HSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HSLActionPerformed(evt);
            }
        });

        terminar2.setText("Terminar");
        terminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminar2ActionPerformed(evt);
            }
        });

        rojo.setText("ROJO");

        verde.setText("VERDE");

        azul.setText("AZUL");

        sliderRojo.setMajorTickSpacing(50);
        sliderRojo.setMaximum(255);
        sliderRojo.setPaintLabels(true);
        sliderRojo.setPaintTicks(true);
        sliderRojo.setValue(0);
        sliderRojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderRojoStateChanged(evt);
            }
        });

        sliderVerde.setMajorTickSpacing(50);
        sliderVerde.setMaximum(255);
        sliderVerde.setPaintLabels(true);
        sliderVerde.setPaintTicks(true);
        sliderVerde.setValue(0);
        sliderVerde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderVerdeStateChanged(evt);
            }
        });

        sliderAzul.setMajorTickSpacing(50);
        sliderAzul.setMaximum(255);
        sliderAzul.setPaintLabels(true);
        sliderAzul.setPaintTicks(true);
        sliderAzul.setValue(0);
        sliderAzul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAzulStateChanged(evt);
            }
        });

        javax.swing.GroupLayout txtCampoLayout = new javax.swing.GroupLayout(txtCampo);
        txtCampo.setLayout(txtCampoLayout);
        txtCampoLayout.setHorizontalGroup(
            txtCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        txtCampoLayout.setVerticalGroup(
            txtCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(HSL, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(terminar2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sliderAzul, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                            .addComponent(sliderVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sliderRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verde, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(azul, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rojo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sliderRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(verde)
                        .addGap(18, 18, 18)
                        .addComponent(sliderVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(azul)
                        .addGap(29, 29, 29)
                        .addComponent(sliderAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(terminar2)
                    .addComponent(HSL))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSLActionPerformed
        new HSL().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HSLActionPerformed

    private void terminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminar2ActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_terminar2ActionPerformed

    private void sliderRojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderRojoStateChanged
        cambiarColor();
        rojo.setText("ROJO (R = " + sliderRojo.getValue() + " )");
    }//GEN-LAST:event_sliderRojoStateChanged

    private void sliderVerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderVerdeStateChanged
        cambiarColor();
        verde.setText("VERDE (R = " + sliderVerde.getValue() + " )");
    }//GEN-LAST:event_sliderVerdeStateChanged

    private void sliderAzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAzulStateChanged
        cambiarColor();
        azul.setText("AZUL (R = " + sliderAzul.getValue() + " )");
    }//GEN-LAST:event_sliderAzulStateChanged

    
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
            java.util.logging.Logger.getLogger(RGB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RGB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RGB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RGB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RGB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HSL;
    private javax.swing.JLabel azul;
    private javax.swing.JLabel rojo;
    private javax.swing.JSlider sliderAzul;
    private javax.swing.JSlider sliderRojo;
    private javax.swing.JSlider sliderVerde;
    private javax.swing.JButton terminar2;
    private javax.swing.JPanel txtCampo;
    private javax.swing.JLabel verde;
    // End of variables declaration//GEN-END:variables

    private void cambiarColor() {
        int R,G,B;
        R = sliderRojo.getValue();
        G = sliderVerde.getValue();
        B = sliderAzul.getValue();
        txtCampo.setBackground(new Color(R,G,B));
    }
}
