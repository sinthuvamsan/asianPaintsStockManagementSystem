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
public class PaintUpdateIDCollectionFrame {
     static JFrame paintUpdateIDCollectionFrameManager=new JFrame();
    static JFrame paintUpdateIDCollectionFrameStockKeeper=new JFrame();
    
    static JTextField paintProductNoForUpdate=new JTextField("Paint product no.");
   
    
    static Exit xFPUICF=new Exit();
     
    static JButton backFPUICFM=new JButton("Back");
    static JButton backFPUICFSK=new JButton("Back");
    static JButton updatePaint=new JButton("Add paint");
   
    
    public static void managerPaintAddFrame(){
    
    
    paintUpdateIDCollectionFrameManager.add(paintProductNoForUpdate);
    paintProductNoForUpdate.setBounds(130,100,100, 40);   
     paintUpdateIDCollectionFrameManager.add(updatePaint);
    updatePaint.setBounds(50,350,100, 40);
   paintUpdateIDCollectionFrameManager.add(backFPUICFM);
   backFPUICFM.setBounds(50,400,95,30);
   paintUpdateIDCollectionFrameManager.add(xFPUICF.exit);
   xFPUICF.exit.setBounds(250,400,95,30);
   
   paintUpdateIDCollectionFrameManager.setSize(500,500);  
    paintUpdateIDCollectionFrameManager.setLayout(null);  
    paintUpdateIDCollectionFrameManager.setVisible(true);  
    }
    
    public static void stockKeeperPaintAddFrame(){
    
    
    paintUpdateIDCollectionFrameStockKeeper.add(paintProductNoForUpdate);
    paintProductNoForUpdate.setBounds(130,100,100, 40); 
    paintUpdateIDCollectionFrameStockKeeper.add(updatePaint);
    updatePaint.setBounds(50,350,100, 40);
   paintUpdateIDCollectionFrameStockKeeper.add(backFPUICFSK);
   backFPUICFSK.setBounds(50,400,95,30);
   paintUpdateIDCollectionFrameStockKeeper.add(xFPUICF.exit);
   xFPUICF.exit.setBounds(250,400,95,30);
   
   paintUpdateIDCollectionFrameStockKeeper.setSize(500,500);  
    paintUpdateIDCollectionFrameStockKeeper.setLayout(null);  
    paintUpdateIDCollectionFrameStockKeeper.setVisible(true);  
    }
}
