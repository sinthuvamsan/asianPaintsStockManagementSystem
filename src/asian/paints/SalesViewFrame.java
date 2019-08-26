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
public class SalesViewFrame extends ViewFrame {
    static JFrame managerSalesViewFrame = new JFrame();
    
    SalesViewFrame(){
    
    managerSalesViewFrame.add(viewPanel); 
    viewPanel.setBounds(40,40,720,600);    
    viewPanel.setBackground(Color.gray);  
        
    managerSalesViewFrame.add(backFVF);
    backFVF.setBounds(50,700,95,30);
    managerSalesViewFrame.add(xFD.exit);
    xFD.exit.setBounds(250,700,95,30);

    managerSalesViewFrame.setSize(800,800);    
    managerSalesViewFrame.setLayout(null);    
    managerSalesViewFrame.setVisible(true); 
    }
}
