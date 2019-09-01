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
         JFrame paintDeleteIDCollectionFrameManager;
     JFrame paintDeleteIDCollectionFrameStockKeeper;
    
     JTextField paintProductNoForDelete=new JTextField("Paint product no.");
    
    static Exit xFPDICF=new Exit();
      
     JButton backFPDICF=new JButton("Back"); 
     JButton searchPaintToBeDeleted=new JButton("Delete");
    
    public void managerPaintDeleteFrame(){  
    paintDeleteIDCollectionFrameManager=new JFrame();
    
    paintDeleteIDCollectionFrameManager.add(paintProductNoForDelete);
    paintProductNoForDelete.setBounds(130,100,100, 40);
    paintDeleteIDCollectionFrameManager.add(searchPaintToBeDeleted);
    searchPaintToBeDeleted.setBounds(250,150,100, 40);
    paintDeleteIDCollectionFrameManager.add(backFPDICF);
    backFPDICF.setBounds(50,400,95,30);
    paintDeleteIDCollectionFrameManager.add(xFPDICF.exit);
    xFPDICF.exit.setBounds(250,400,95,30);
    
    paintDeleteIDCollectionFrameManager.setSize(500,500);  
    paintDeleteIDCollectionFrameManager.setLayout(null);  
    paintDeleteIDCollectionFrameManager.setVisible(true); 
    
    backFPDICF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintDeleteIDCollectionFrameManager.dispose();
          new PaintActionSelectionFrame().managersPaintFrame();
    }  
    });
    
    searchPaintToBeDeleted.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
         paintDeleteIDCollectionFrameManager.dispose();
       new PaintDeleteFrame(Integer.parseInt(paintProductNoForDelete.getText()),true);
      
    }  
    });
    }
    
    public void stockKeeperPaintDeleteFrame(){  
    
    paintDeleteIDCollectionFrameStockKeeper=new JFrame();
    
    paintDeleteIDCollectionFrameStockKeeper.add(paintProductNoForDelete);
    paintProductNoForDelete.setBounds(130,100,100, 40);
    paintDeleteIDCollectionFrameStockKeeper.add(searchPaintToBeDeleted);
    searchPaintToBeDeleted.setBounds(250,150,100, 40);
    paintDeleteIDCollectionFrameStockKeeper.add(backFPDICF);
    backFPDICF.setBounds(50,400,95,30);
    paintDeleteIDCollectionFrameStockKeeper.add(xFPDICF.exit);
    xFPDICF.exit.setBounds(250,400,95,30);
    
    paintDeleteIDCollectionFrameStockKeeper.setSize(500,500);  
    paintDeleteIDCollectionFrameStockKeeper.setLayout(null);  
    paintDeleteIDCollectionFrameStockKeeper.setVisible(true); 
    
    backFPDICF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintDeleteIDCollectionFrameStockKeeper.dispose();
          new PaintActionSelectionFrame().stockKeeperPaintFrame();
    }  
    });
    
    searchPaintToBeDeleted.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
         paintDeleteIDCollectionFrameStockKeeper.dispose();
       new PaintDeleteFrame(Integer.parseInt(paintProductNoForDelete.getText()),false);
      
    }  
    });
    }
}
