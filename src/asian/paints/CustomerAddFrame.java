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
 * @author Sinthuvamsan
 */
public class CustomerAddFrame {
   
    static JFrame customerAddAndUpdateFrameCahier=new JFrame();
    
    static JTextField cusIDForAddOrUpdate=new JTextField("Customer ID");
    static JTextField cusNameForAddOrUpdate=new JTextField("Customer name");
    static JTextField cusAddressForAddOrUpdate=new JTextField("Customer address");
    static JTextField cusTPNoForAddOrUpdate=new JTextField("Customer TP number");
    static JTextField cusTotalForAddOrUpdate=new JTextField("Customer total");
    
    static Exit xFCAU=new Exit();
     
    static JButton backFCAUF=new JButton("Back");
    static JButton addCustomer=new JButton("Add customer");
   
   
   //public static void managersCustomerAddAndUpdateFrame(){}
    //public void stockKeeperCustomerAddAndUpdateFrame(){}
   
    public static void cashierCustomerAddAndUpdateFrame(){
    customerAddAndUpdateFrameCahier.add(cusIDForAddOrUpdate);
    cusIDForAddOrUpdate.setBounds(130,100,100, 40);
    customerAddAndUpdateFrameCahier.add(cusNameForAddOrUpdate);
    cusNameForAddOrUpdate.setBounds(130,150,100, 40);
    customerAddAndUpdateFrameCahier.add(cusAddressForAddOrUpdate);
    cusAddressForAddOrUpdate.setBounds(130,200,100, 40);
    customerAddAndUpdateFrameCahier.add(cusTPNoForAddOrUpdate);
    cusTPNoForAddOrUpdate.setBounds(130,250,100, 40);
    customerAddAndUpdateFrameCahier.add(cusTotalForAddOrUpdate);
    cusTotalForAddOrUpdate.setBounds(130,300,100, 40);   
    customerAddAndUpdateFrameCahier.add(addCustomer);
    addCustomer.setBounds(50,350,100, 40);
    customerAddAndUpdateFrameCahier.add(backFCAUF);
    backFCAUF.setBounds(50,400,95,30);
    customerAddAndUpdateFrameCahier.add(xFCAU.exit);
    xFCAU.exit.setBounds(250,400,95,30);
    
    customerAddAndUpdateFrameCahier.setSize(500,500);  
    customerAddAndUpdateFrameCahier.setLayout(null);  
    customerAddAndUpdateFrameCahier.setVisible(true);  
    }
}
