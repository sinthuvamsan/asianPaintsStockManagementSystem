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
public class CustomerDeleteIDCollectionFrame {
     static JFrame customerDeleteIDCollectionFrameManager=new JFrame();
    
    static JTextField customerToBeDeleted=new JTextField("Customer ID");
    
    static JButton searchCustomerToBeDeleted=new JButton("Delete");
    static JButton backFCDSF=new JButton("Back");
    
     static Exit xFCDSF=new Exit();
     
    CustomerDeleteIDCollectionFrame(){
        
   customerDeleteIDCollectionFrameManager.add(customerToBeDeleted);
    customerToBeDeleted.setBounds(130,50,100, 40);
    customerDeleteIDCollectionFrameManager.add(searchCustomerToBeDeleted);
    searchCustomerToBeDeleted.setBounds(130,100,100, 40);
    
   customerDeleteIDCollectionFrameManager.add(backFCDSF);
   backFCDSF.setBounds(50,150,95,30);
   customerDeleteIDCollectionFrameManager.add(xFCDSF.exit);
   xFCDSF.exit.setBounds(250,150,95,30);
   
    customerDeleteIDCollectionFrameManager.setSize(500,500);  
    customerDeleteIDCollectionFrameManager.setLayout(null);  
    customerDeleteIDCollectionFrameManager.setVisible(true); 
    }
}
