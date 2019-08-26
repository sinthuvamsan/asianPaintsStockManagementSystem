/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asian.paints;

import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;

/**
 *
 * @author User
 */
public class PaintViewFrame extends ViewFrame {
    static JFrame managerPaintViewFrame = new JFrame();
    static JFrame stockKeeperPaintViewFrame = new JFrame();
    static JFrame cashierPaintViewFrame = new JFrame();
    
    public static void paintViewFrameManager(){
    
    
    managerPaintViewFrame.add(viewPanel);
    viewPanel.setBounds(40,40,720,600);    
    viewPanel.setBackground(Color.gray);  
        
    managerPaintViewFrame.add(backFVF);
    backFVF.setBounds(50,700,95,30);
    managerPaintViewFrame.add(xFD.exit);
    xFD.exit.setBounds(250,700,95,30);
    
          
        
    managerPaintViewFrame.setSize(800,800);    
    managerPaintViewFrame.setLayout(null);    
    managerPaintViewFrame.setVisible(true); 
    }
    
    public static void paintViewFrameStockKeeper(){
    
    
    stockKeeperPaintViewFrame.add(viewPanel);  
    viewPanel.setBounds(40,40,720,600);    
    viewPanel.setBackground(Color.gray);  
        
    stockKeeperPaintViewFrame.add(backFVF);
    backFVF.setBounds(50,700,95,30);
    stockKeeperPaintViewFrame.add(xFD.exit);
    xFD.exit.setBounds(250,700,95,30);
    
        
        
    stockKeeperPaintViewFrame.setSize(800,800);    
    stockKeeperPaintViewFrame.setLayout(null);    
    stockKeeperPaintViewFrame.setVisible(true); 
    }
    
    public static void paintViewFrameCashier(){
    
    
    cashierPaintViewFrame.add(viewPanel); 
    viewPanel.setBounds(40,40,720,600);    
    viewPanel.setBackground(Color.gray);  
        
    cashierPaintViewFrame.add(backFVF);
    backFVF.setBounds(50,700,95,30);
    cashierPaintViewFrame.add(xFD.exit);
    xFD.exit.setBounds(250,700,95,30);
    
        
        
    cashierPaintViewFrame.setSize(800,800);    
    cashierPaintViewFrame.setLayout(null);    
    cashierPaintViewFrame.setVisible(true); 
    }
}
