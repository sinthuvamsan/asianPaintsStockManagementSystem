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
      JFrame paintUpdateIDCollectionFrameManager=new JFrame();
     JFrame paintUpdateIDCollectionFrameStockKeeper=new JFrame();
    
     JTextField paintProductNoForUpdate=new JTextField("Paint product no.");
   
    
    static Exit xFPUICF=new Exit();
     
     JButton backFPUICF=new JButton("Back");
     JButton searchPaintToBeUpdated=new JButton("Update paint");
   
    JPanel pCheck=new JPanel();
    
    public void managerPaintupdateIDCollectionFrame(){
    
    
    paintUpdateIDCollectionFrameManager.add(paintProductNoForUpdate);
    paintProductNoForUpdate.setBounds(130,100,100, 40);   
     paintUpdateIDCollectionFrameManager.add(searchPaintToBeUpdated);
    searchPaintToBeUpdated.setBounds(50,350,100, 40);
   paintUpdateIDCollectionFrameManager.add(backFPUICF);
   backFPUICF.setBounds(50,400,95,30);
   paintUpdateIDCollectionFrameManager.add(xFPUICF.exit);
   xFPUICF.exit.setBounds(250,400,95,30);
   
   paintUpdateIDCollectionFrameManager.setSize(500,500);  
    paintUpdateIDCollectionFrameManager.setLayout(null);  
    paintUpdateIDCollectionFrameManager.setVisible(true);  
   
    backFPUICF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintUpdateIDCollectionFrameManager.dispose();
           new PaintActionSelectionFrame().managersPaintFrame();
    }  
    });
    
     searchPaintToBeUpdated.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintUpdateIDCollectionFrameManager.dispose();
       new PaintUpdateFrame(true,Integer.parseInt(paintProductNoForUpdate.getText()));
    }  
    });
    }
    
    public void stockKeeperPaintupdateIDCollectionFrame(){
    
    
    paintUpdateIDCollectionFrameStockKeeper.add(paintProductNoForUpdate);
    paintProductNoForUpdate.setBounds(130,100,100, 40); 
    paintUpdateIDCollectionFrameStockKeeper.add(searchPaintToBeUpdated);
    searchPaintToBeUpdated.setBounds(50,350,100, 40);
   paintUpdateIDCollectionFrameStockKeeper.add(backFPUICF);
   backFPUICF.setBounds(50,400,95,30);
   paintUpdateIDCollectionFrameStockKeeper.add(xFPUICF.exit);
   xFPUICF.exit.setBounds(250,400,95,30);
   
   paintUpdateIDCollectionFrameStockKeeper.setSize(500,500);  
    paintUpdateIDCollectionFrameStockKeeper.setLayout(null);  
    paintUpdateIDCollectionFrameStockKeeper.setVisible(true);  
    
    backFPUICF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintUpdateIDCollectionFrameStockKeeper.dispose();
           new PaintActionSelectionFrame().stockKeeperPaintFrame();
    }  
    });
    
     searchPaintToBeUpdated.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintUpdateIDCollectionFrameStockKeeper.dispose();
       new PaintUpdateFrame(false,Integer.parseInt(paintProductNoForUpdate.getText()));
    }  
    });
    }
}
