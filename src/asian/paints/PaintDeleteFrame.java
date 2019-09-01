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
public class PaintDeleteFrame {
    static JFrame paintDeleteFrameManager=new JFrame();
    static JFrame paintDeleteFrameStockKeeper=new JFrame();
    
    static JTextField paintProductNoForDelete=new JTextField("Paint product no.");
    
    static Exit xFPD=new Exit();
    
    static JButton backFPDF=new JButton("Back");  
    static JButton deletePaint=new JButton("Delete");
    
    public static void managerPaintDeleteFrame(){  
    
    
    paintDeleteFrameManager.add(paintProductNoForDelete);
    paintProductNoForDelete.setBounds(130,100,100, 40);
    paintDeleteFrameManager.add(deletePaint);
    deletePaint.setBounds(250,150,100, 40);
    paintDeleteFrameManager.add(backFPDF);
    backFPDF.setBounds(50,400,95,30);
    paintDeleteFrameManager.add(xFPD.exit);
    xFPD.exit.setBounds(250,400,95,30);
    
    paintDeleteFrameManager.setSize(500,500);  
    paintDeleteFrameManager.setLayout(null);  
    paintDeleteFrameManager.setVisible(true); 
   
     backFPDF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintDeleteFrameManager.dispose();
           PaintDeleteIDCollectionFrame.managerPaintDeleteFrame();
    }  
    });
    }
    
    public static void stockKeeperPaintDeleteFrame(){  
    
    
    paintDeleteFrameStockKeeper.add(paintProductNoForDelete);
    paintProductNoForDelete.setBounds(130,100,100, 40);
    paintDeleteFrameStockKeeper.add(deletePaint);
    deletePaint.setBounds(250,150,100, 40);
    paintDeleteFrameStockKeeper.add(backFPDF);
    backFPDF.setBounds(50,400,95,30);
    paintDeleteFrameStockKeeper.add(xFPD.exit);
    xFPD.exit.setBounds(250,400,95,30);
    
    paintDeleteFrameStockKeeper.setSize(500,500);  
    paintDeleteFrameStockKeeper.setLayout(null);  
    paintDeleteFrameStockKeeper.setVisible(true); 
    
     backFPDF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintDeleteFrameStockKeeper.dispose();
           PaintDeleteIDCollectionFrame.stockKeeperPaintDeleteFrame();
    }  
    });
    }
}
