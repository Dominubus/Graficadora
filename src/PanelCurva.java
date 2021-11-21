
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class PanelCurva extends javax.swing.JPanel{
     private ArrayList<Punto> pixeles;
    
    public PanelCurva(ArrayList<Punto> p) {        
        this.pixeles = p;
        initComponents();
    }
    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        pixeles.forEach(punto -> g.drawLine(punto.getX(), punto.getY(), punto.getX(), punto.getY()));
   
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
    }// </editor-fold>          
}
