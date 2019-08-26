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
public class SalesAddAndUpdateFrame {
    static JFrame salesUpdateFrameManager=new JFrame();
    static JFrame salesAddFrameCahier=new JFrame();
    
    static JTextField salesNoForAddOrUpdateSales=new JTextField("Sales no.");
    static JTextField paintSalesQuantityForAddOrUpdateSales=new JTextField("Sales quantity");
    static JTextField paintProductNoForAddOrUpdateSales=new JTextField("Product no.");
    static JTextField cusIDForAddOrUpdateSales=new JTextField("Customer ID");
    
    static Exit xFSAU=new Exit();
     
    static JButton backFSAUF=new JButton("Back");
    static JButton addSales=new JButton("Add sales");
    static JButton updateSales=new JButton("Update sales");
   
   public static void managersSalesUpdateFrame(){
    
    
    salesUpdateFrameManager.add(salesNoForAddOrUpdateSales);
    salesNoForAddOrUpdateSales.setBounds(130,100,100, 40);
    salesUpdateFrameManager.add(paintSalesQuantityForAddOrUpdateSales);
    paintSalesQuantityForAddOrUpdateSales.setBounds(130,150,100, 40);
    salesUpdateFrameManager.add(paintProductNoForAddOrUpdateSales);
    paintProductNoForAddOrUpdateSales.setBounds(130,200,100, 40);
    salesUpdateFrameManager.add(cusIDForAddOrUpdateSales);
    cusIDForAddOrUpdateSales.setBounds(130,250,100, 40);   
   salesUpdateFrameManager.add(updateSales);
   updateSales.setBounds(130,300,100, 40);
   salesUpdateFrameManager.add(backFSAUF);
   backFSAUF.setBounds(50,350,95,30);
   salesUpdateFrameManager.add(xFSAU.exit);
   xFSAU.exit.setBounds(250,350,95,30);
    
   salesUpdateFrameManager.setSize(500,500);  
    salesUpdateFrameManager.setLayout(null);  
    salesUpdateFrameManager.setVisible(true);  
   }
    //public void stockKeeperCustomerAddAndUpdateFrame(){}
   
    public static void cashierSalesAddFrame(){
    
        
    salesAddFrameCahier.add(salesNoForAddOrUpdateSales);
    salesNoForAddOrUpdateSales.setBounds(130,100,100, 40);
    salesAddFrameCahier.add(paintSalesQuantityForAddOrUpdateSales);
    paintSalesQuantityForAddOrUpdateSales.setBounds(130,150,100, 40);
    salesAddFrameCahier.add(paintProductNoForAddOrUpdateSales);
    paintProductNoForAddOrUpdateSales.setBounds(130,200,100, 40);
    salesAddFrameCahier.add(cusIDForAddOrUpdateSales);
    cusIDForAddOrUpdateSales.setBounds(130,250,100, 40);  
    salesAddFrameCahier.add(addSales);
    addSales.setBounds(50,300,100, 40);
    salesAddFrameCahier.add(backFSAUF);
    backFSAUF.setBounds(50,350,95,30);
    salesAddFrameCahier.add(xFSAU.exit);
    xFSAU.exit.setBounds(250,350,95,30);
    
    salesAddFrameCahier.setSize(500,500);  
    salesAddFrameCahier.setLayout(null);  
    salesAddFrameCahier.setVisible(true);  
    }
}
