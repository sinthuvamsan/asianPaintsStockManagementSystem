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
public class SalesUpdateFrame {
    static JFrame salesUpdateFrameManager=new JFrame();
    
    static JTextField salesNoForUpdateSales=new JTextField("Sales no.");
    static JTextField paintSalesQuantityForUpdateSales=new JTextField("Sales quantity");
    static JTextField paintProductNoForUpdateSales=new JTextField("Product no.");
    static JTextField cusIDForUpdateSales=new JTextField("Customer ID");
    
    static Exit xFSU=new Exit();
     
    static JButton backFSUF=new JButton("Back");
    static JButton updateSales=new JButton("Update sales");
   
     SalesUpdateFrame(){
    
    
    salesUpdateFrameManager.add(salesNoForUpdateSales);
    salesNoForUpdateSales.setBounds(130,100,100, 40);
    salesUpdateFrameManager.add(paintSalesQuantityForUpdateSales);
    paintSalesQuantityForUpdateSales.setBounds(130,150,100, 40);
    salesUpdateFrameManager.add(paintProductNoForUpdateSales);
    paintProductNoForUpdateSales.setBounds(130,200,100, 40);
    salesUpdateFrameManager.add(cusIDForUpdateSales);
    cusIDForUpdateSales.setBounds(130,250,100, 40);   
   salesUpdateFrameManager.add(updateSales);
   updateSales.setBounds(130,300,100, 40);
   salesUpdateFrameManager.add(backFSUF);
   backFSUF.setBounds(50,350,95,30);
   salesUpdateFrameManager.add(xFSU.exit);
   xFSU.exit.setBounds(250,350,95,30);
    
   salesUpdateFrameManager.setSize(500,500);  
    salesUpdateFrameManager.setLayout(null);  
    salesUpdateFrameManager.setVisible(true);  
   }
}
