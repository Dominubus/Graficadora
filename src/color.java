
import java.awt.BorderLayout;
import java.awt.Color;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class color extends javax.swing.JPanel implements ChangeListener {

    protected JColorChooser tcc;
    protected Color colorElejido;
    public color() {
        super(new BorderLayout());
        JPanel bannerPanel = new JPanel(new BorderLayout());        
        //Set up color chooser for setting text color
        tcc = new JColorChooser();
        AbstractColorChooserPanel[] pnl = tcc.getChooserPanels();
        tcc.removeChooserPanel(pnl[0]);
        tcc.removeChooserPanel(pnl[1]);
        tcc.removeChooserPanel(pnl[3]);
        tcc.removeChooserPanel(pnl[4]);
        try{
            AbstractColorChooserPanel cp = pnl[2];
            Field f = cp.getClass().getDeclaredField("panel");
            f.setAccessible(true);
            Object colorPanel = f.get(cp);
            Field f2 = colorPanel.getClass().getDeclaredField("spinners");
            f2.setAccessible(true);
            Object spinners = f2.get(colorPanel);
            Object transpSlispinner = Array.get(spinners, 3);      
            Field f3 = transpSlispinner.getClass().getDeclaredField("slider");
            f3.setAccessible(true);
            JSlider slider = (JSlider) f3.get(transpSlispinner);
            slider.setEnabled(false);
            slider.setVisible(false);
            Field f4 = transpSlispinner.getClass().getDeclaredField("spinner");
            f4.setAccessible(true);
            JSpinner spinner = (JSpinner) f4.get(transpSlispinner);
            spinner.setEnabled(false);
            spinner.setVisible(false);
            Field f5 = transpSlispinner.getClass().getDeclaredField("label");
            f5.setAccessible(true);
            JLabel label = (JLabel) f5.get(transpSlispinner);
            label.setVisible(false);
        }catch(Exception e){
            
        }
        tcc.setPreviewPanel(new JPanel());
        /*AbstractColorChooserPanel[] panels = tcc.getChooserPanels();
                for (AbstractColorChooserPanel accp : panels) {
                    if (accp.getDisplayName().equals("HSL")) {
                        JOptionPane.showMessageDialog(null, accp);
                    }
                }
        */
        tcc.getSelectionModel().addChangeListener(this);
        tcc.setBorder(BorderFactory.createTitledBorder(
                                             "HSL"));

        add(bannerPanel, BorderLayout.CENTER);
        add(tcc, BorderLayout.PAGE_END);
    }
    public void stateChanged(ChangeEvent e) {
        Color colorElejido = tcc.getColor();        
    }  
    public Color getColor(){
        return colorElejido;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
