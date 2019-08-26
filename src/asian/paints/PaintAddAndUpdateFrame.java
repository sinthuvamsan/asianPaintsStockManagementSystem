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
public class PaintAddAndUpdateFrame {
    static JFrame paintAddAndUpdateFrameManager=new JFrame();
    static JFrame paintAddAndUpdateFrameStockKeeper=new JFrame();
    
    static JTextField paintProductNoForAddOrUpdate=new JTextField("Paint product no.");
    static JTextField paintModelNameForAddOrUpdate=new JTextField("Paint model name");
    static JTextField paintColourForAddOrUpdate=new JTextField("Paint colour");
    static JTextField paintUnitPriceForAddOrUpdate=new JTextField("Paint unit price");
    static JTextField paintStockQuantityForAddOrUpdate=new JTextField("Paint stock quantity");
    
    static Exit xFPAU=new Exit();
     
    static JButton backFPAUF=new JButton("Back");
    static JButton addPaint=new JButton("Add paint");
    static JButton updatePaint=new JButton("Update paint");
    
    public static void managerPaintAddAndUpdateFrame(){
    
    
    paintAddAndUpdateFrameManager.add(paintProductNoForAddOrUpdate);
    paintProductNoForAddOrUpdate.setBounds(130,100,100, 40);
    paintAddAndUpdateFrameManager.add(paintModelNameForAddOrUpdate);
    paintModelNameForAddOrUpdate.setBounds(130,150,100, 40);
    paintAddAndUpdateFrameManager.add(paintColourForAddOrUpdate);
    paintColourForAddOrUpdate.setBounds(130,200,100, 40);
    paintAddAndUpdateFrameManager.add(paintUnitPriceForAddOrUpdate);
    paintUnitPriceForAddOrUpdate.setBounds(130,250,100, 40);
    paintAddAndUpdateFrameManager.add(paintStockQuantityForAddOrUpdate);
    paintStockQuantityForAddOrUpdate.setBounds(130,300,100, 40);   
   paintAddAndUpdateFrameManager.add(updatePaint);
   updatePaint.setBounds(130,350,100, 40);
   paintAddAndUpdateFrameManager.add(backFPAUF);
   backFPAUF.setBounds(50,400,95,30);
   paintAddAndUpdateFrameManager.add(xFPAU.exit);
   xFPAU.exit.setBounds(250,400,95,30);
   
   paintAddAndUpdateFrameManager.setSize(500,500);  
    paintAddAndUpdateFrameManager.setLayout(null);  
    paintAddAndUpdateFrameManager.setVisible(true);  
    }
    
    public static void stockKeeperPaintAddAndUpdateFrame(){
    
    
    paintAddAndUpdateFrameStockKeeper.add(paintProductNoForAddOrUpdate);
    paintProductNoForAddOrUpdate.setBounds(130,100,100, 40);
    paintAddAndUpdateFrameStockKeeper.add(paintModelNameForAddOrUpdate);
    paintModelNameForAddOrUpdate.setBounds(130,150,100, 40);
    paintAddAndUpdateFrameStockKeeper.add(paintColourForAddOrUpdate);
    paintColourForAddOrUpdate.setBounds(130,200,100, 40);
    paintAddAndUpdateFrameStockKeeper.add(paintUnitPriceForAddOrUpdate);
    paintUnitPriceForAddOrUpdate.setBounds(130,250,100, 40);
    paintAddAndUpdateFrameStockKeeper.add(paintStockQuantityForAddOrUpdate);
    paintStockQuantityForAddOrUpdate.setBounds(130,300,100, 40);   
    paintAddAndUpdateFrameStockKeeper.add(addPaint);
    addPaint.setBounds(50,350,100, 40);
    paintAddAndUpdateFrameStockKeeper.add(updatePaint);
    updatePaint.setBounds(250,350,100, 40);
   paintAddAndUpdateFrameStockKeeper.add(backFPAUF);
   backFPAUF.setBounds(50,400,95,30);
   paintAddAndUpdateFrameStockKeeper.add(xFPAU.exit);
   xFPAU.exit.setBounds(250,400,95,30);
   
   paintAddAndUpdateFrameStockKeeper.setSize(500,500);  
    paintAddAndUpdateFrameStockKeeper.setLayout(null);  
    paintAddAndUpdateFrameStockKeeper.setVisible(true);  
    }
}
