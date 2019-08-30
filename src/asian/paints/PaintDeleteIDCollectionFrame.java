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
public class PaintDeleteIDCollectionFrame {
        static JFrame paintDeleteIDCollectionFrameManager=new JFrame();
    static JFrame paintDeleteIDCollectionFrameStockKeeper=new JFrame();
    
    static JTextField paintProductNoForDelete=new JTextField("Paint product no.");
    
    static Exit xFPDICF=new Exit();
    
    static JButton backFPDICFM=new JButton("Back");  
    static JButton backFPDICFC=new JButton("Back"); 
    static JButton deletePaint=new JButton("Delete");
    
    public static void managerPaintDeleteFrame(){  
    
    
    paintDeleteIDCollectionFrameManager.add(paintProductNoForDelete);
    paintProductNoForDelete.setBounds(130,100,100, 40);
    paintDeleteIDCollectionFrameManager.add(deletePaint);
    deletePaint.setBounds(250,150,100, 40);
    paintDeleteIDCollectionFrameManager.add(backFPDICFM);
    backFPDICFM.setBounds(50,400,95,30);
    paintDeleteIDCollectionFrameManager.add(xFPDICF.exit);
    xFPDICF.exit.setBounds(250,400,95,30);
    
    paintDeleteIDCollectionFrameManager.setSize(500,500);  
    paintDeleteIDCollectionFrameManager.setLayout(null);  
    paintDeleteIDCollectionFrameManager.setVisible(true); 
    }
    
    public static void stockKeeperPaintDeleteFrame(){  
    
    
    paintDeleteIDCollectionFrameStockKeeper.add(paintProductNoForDelete);
    paintProductNoForDelete.setBounds(130,100,100, 40);
    paintDeleteIDCollectionFrameStockKeeper.add(deletePaint);
    deletePaint.setBounds(250,150,100, 40);
    paintDeleteIDCollectionFrameStockKeeper.add(backFPDICFC);
    backFPDICFC.setBounds(50,400,95,30);
    paintDeleteIDCollectionFrameStockKeeper.add(xFPDICF.exit);
    xFPDICF.exit.setBounds(250,400,95,30);
    
    paintDeleteIDCollectionFrameStockKeeper.setSize(500,500);  
    paintDeleteIDCollectionFrameStockKeeper.setLayout(null);  
    paintDeleteIDCollectionFrameStockKeeper.setVisible(true); 
    }
}
