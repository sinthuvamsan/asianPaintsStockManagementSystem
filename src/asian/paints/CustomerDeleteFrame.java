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
public class CustomerDeleteFrame {
    static JFrame customerDeleteFrameManager=new JFrame();
    static JTextField cusIDForDelete=new JTextField("Customer ID");
    
    static Exit xFCD=new Exit();
    
    static JButton backFCDF=new JButton("Back");  
    static JButton deleteCustomer=new JButton("Delete");
    
    CustomerDeleteFrame(){  
    customerDeleteFrameManager.add(cusIDForDelete);
    cusIDForDelete.setBounds(130,100,100, 40);
    customerDeleteFrameManager.add(deleteCustomer);
    deleteCustomer.setBounds(250,150,100, 40);
    customerDeleteFrameManager.add(backFCDF);
    backFCDF.setBounds(50,400,95,30);
    customerDeleteFrameManager.add(xFCD.exit);
    xFCD.exit.setBounds(250,400,95,30);
    
    customerDeleteFrameManager.setSize(500,500);  
    customerDeleteFrameManager.setLayout(null);  
    customerDeleteFrameManager.setVisible(true); 
    }
}
