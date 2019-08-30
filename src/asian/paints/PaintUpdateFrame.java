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
public class PaintUpdateFrame {
    static JFrame paintUpdateFrameManager=new JFrame();
    static JFrame paintUpdateFrameStockKeeper=new JFrame();
    
    static JTextField paintProductNoForUpdate=new JTextField("Paint product no.");
    static JTextField paintModelNameForUpdate=new JTextField("Paint model name");
    static JTextField paintColourForUpdate=new JTextField("Paint colour");
    static JTextField paintUnitPriceForUpdate=new JTextField("Paint unit price");
    static JTextField paintStockQuantityForUpdate=new JTextField("Paint stock quantity");
    
    static Exit xFPU=new Exit();
     
    static JButton backFPUFM=new JButton("Back");
    static JButton backFPUFSK=new JButton("Back");
    static JButton updatePaint=new JButton("Add paint");
   
    
    public static void managerPaintAddFrame(){
    
    
    paintUpdateFrameManager.add(paintProductNoForUpdate);
    paintProductNoForUpdate.setBounds(130,100,100, 40);
    paintUpdateFrameManager.add(paintModelNameForUpdate);
    paintModelNameForUpdate.setBounds(130,150,100, 40);
    paintUpdateFrameManager.add(paintColourForUpdate);
    paintColourForUpdate.setBounds(130,200,100, 40);
    paintUpdateFrameManager.add(paintUnitPriceForUpdate);
    paintUnitPriceForUpdate.setBounds(130,250,100, 40);
    paintUpdateFrameManager.add(paintStockQuantityForUpdate);
    paintStockQuantityForUpdate.setBounds(130,300,100, 40);   
     paintUpdateFrameManager.add(updatePaint);
    updatePaint.setBounds(50,350,100, 40);
   paintUpdateFrameManager.add(backFPUFM);
   backFPUFM.setBounds(50,400,95,30);
   paintUpdateFrameManager.add(xFPU.exit);
   xFPU.exit.setBounds(250,400,95,30);
   
   paintUpdateFrameManager.setSize(500,500);  
    paintUpdateFrameManager.setLayout(null);  
    paintUpdateFrameManager.setVisible(true);  
    }
    
    public static void stockKeeperPaintAddFrame(){
    
    
    paintUpdateFrameStockKeeper.add(paintProductNoForUpdate);
    paintProductNoForUpdate.setBounds(130,100,100, 40);
    paintUpdateFrameStockKeeper.add(paintModelNameForUpdate);
    paintModelNameForUpdate.setBounds(130,150,100, 40);
    paintUpdateFrameStockKeeper.add(paintColourForUpdate);
    paintColourForUpdate.setBounds(130,200,100, 40);
    paintUpdateFrameStockKeeper.add(paintUnitPriceForUpdate);
    paintUnitPriceForUpdate.setBounds(130,250,100, 40);
    paintUpdateFrameStockKeeper.add(paintStockQuantityForUpdate);
    paintStockQuantityForUpdate.setBounds(130,300,100, 40);   
    paintUpdateFrameStockKeeper.add(updatePaint);
    updatePaint.setBounds(50,350,100, 40);
   paintUpdateFrameStockKeeper.add(backFPUFSK);
   backFPUFSK.setBounds(50,400,95,30);
   paintUpdateFrameStockKeeper.add(xFPU.exit);
   xFPU.exit.setBounds(250,400,95,30);
   
   paintUpdateFrameStockKeeper.setSize(500,500);  
    paintUpdateFrameStockKeeper.setLayout(null);  
    paintUpdateFrameStockKeeper.setVisible(true);  
    }
}
