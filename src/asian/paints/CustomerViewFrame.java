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
public class CustomerViewFrame extends ViewFrame {
    static JFrame managerCustomerViewFrame = new JFrame();
    static JFrame cashierCustomerViewFrame = new JFrame();
    
    public static void customerViewFrameManager(){
    
    
    managerCustomerViewFrame.add(viewPanel); 
    viewPanel.setBounds(40,40,720,600);    
    viewPanel.setBackground(Color.gray);  
        
    managerCustomerViewFrame.add(backFVF);
    backFVF.setBounds(50,700,95,30);
    managerCustomerViewFrame.add(xFD.exit);
    xFD.exit.setBounds(250,700,95,30);

    managerCustomerViewFrame.setSize(800,800);    
    managerCustomerViewFrame.setLayout(null);    
    managerCustomerViewFrame.setVisible(true); 
    }
    
    public static void customerViewFrameCashier(){
    cashierCustomerViewFrame.add(viewPanel);
    viewPanel.setBounds(40,40,720,600);    
    viewPanel.setBackground(Color.gray);  
        
    cashierCustomerViewFrame.add(backFVF);
    backFVF.setBounds(50,700,95,30);
    cashierCustomerViewFrame.add(xFD.exit);
    xFD.exit.setBounds(250,700,95,30);
   
    cashierCustomerViewFrame.setSize(800,800);    
    cashierCustomerViewFrame.setLayout(null);    
    cashierCustomerViewFrame.setVisible(true); 
    }
}
