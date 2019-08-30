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
public class SalesAddFrame {
    
    static JFrame salesAddFrameCahier=new JFrame();
    
    static JTextField salesNoForAddSales=new JTextField("Sales no.");
    static JTextField paintSalesQuantityForAddSales=new JTextField("Sales quantity");
    static JTextField paintProductNoForAddSales=new JTextField("Product no.");
    static JTextField cusIDForAddSales=new JTextField("Customer ID");
    
    static Exit xFSA=new Exit();
     
    static JButton backFSAF=new JButton("Back");
    static JButton addSales=new JButton("Add sales");
    static JButton updateSales=new JButton("Update sales");
   
  
    //public void stockKeeperCustomerAddAndUpdateFrame(){}
   
    SalesAddFrame(){
    
        
    salesAddFrameCahier.add(salesNoForAddSales);
    salesNoForAddSales.setBounds(130,100,100, 40);
    salesAddFrameCahier.add(paintSalesQuantityForAddSales);
    paintSalesQuantityForAddSales.setBounds(130,150,100, 40);
    salesAddFrameCahier.add(paintProductNoForAddSales);
    paintProductNoForAddSales.setBounds(130,200,100, 40);
    salesAddFrameCahier.add(cusIDForAddSales);
    cusIDForAddSales.setBounds(130,250,100, 40);  
    salesAddFrameCahier.add(addSales);
    addSales.setBounds(50,300,100, 40);
    salesAddFrameCahier.add(backFSAF);
    backFSAF.setBounds(50,350,95,30);
    salesAddFrameCahier.add(xFSA.exit);
    xFSA.exit.setBounds(250,350,95,30);
    
    salesAddFrameCahier.setSize(500,500);  
    salesAddFrameCahier.setLayout(null);  
    salesAddFrameCahier.setVisible(true);  
    }
}
