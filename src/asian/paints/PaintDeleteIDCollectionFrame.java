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
    
     JTextField paintProductNoForDelete=new JTextField("Product no.");
    
    static Exit xFPDICF=new Exit();
      
     JButton backFPDICF=new JButton("Back"); 
     JButton searchPaintToBeDeleted=new JButton("Delete");
    
   PaintDeleteIDCollectionFrame(){  
    paintDeleteIDCollectionFrameManager=new JFrame("Asian paints stock delete");
    
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
       new PaintDeleteFrame(Integer.parseInt(paintProductNoForDelete.getText()));
      
    }  
    });
    }
}
