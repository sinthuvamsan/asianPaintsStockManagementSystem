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
public class SalesDeleteIDCollectionFrame {
    static JFrame salesDeleteIDCollectionFrameManager=new JFrame();
    
    static JTextField saleToBeDeleted=new JTextField("Customer ID");
    
    static JButton searchSalesToBeDeleted=new JButton("Delete");
    static JButton backFSDSF=new JButton("Back");
    
     static Exit xFSDSF=new Exit();
     
    SalesDeleteIDCollectionFrame(){
        
   salesDeleteIDCollectionFrameManager.add(saleToBeDeleted);
    saleToBeDeleted.setBounds(130,50,100, 40);
    salesDeleteIDCollectionFrameManager.add(searchSalesToBeDeleted);
    searchSalesToBeDeleted.setBounds(130,100,100, 40);
    
   salesDeleteIDCollectionFrameManager.add(backFSDSF);
   backFSDSF.setBounds(50,150,95,30);
   salesDeleteIDCollectionFrameManager.add(xFSDSF.exit);
   xFSDSF.exit.setBounds(250,150,95,30);
   
    salesDeleteIDCollectionFrameManager.setSize(500,500);  
    salesDeleteIDCollectionFrameManager.setLayout(null);  
    salesDeleteIDCollectionFrameManager.setVisible(true); 
    
     backFSDSF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        salesDeleteIDCollectionFrameManager.dispose();
        
          new SalesActionSelectionFrame().managersSalesFrame();
    }  
    });
     
     searchSalesToBeDeleted.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
         salesDeleteIDCollectionFrameManager.dispose();
       new SalesDeleteFrame(Integer.parseInt(saleToBeDeleted.getText()));
      
    }  
    });
    }
}
