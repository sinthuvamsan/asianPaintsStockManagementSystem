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
public class SalesUpdateIDCollectionFrame {
        static JFrame salesUpdateIDCollectionFrameManager=new JFrame();
     
    static JTextField salesToBeUpdated=new JTextField("Employee ID");
    
    static JButton searchSalesToBeUpdated=new JButton("Update this user");
    static JButton backFSUSFM=new JButton("Back");
    
     static Exit xFCUSF=new Exit();
     
    SalesUpdateIDCollectionFrame(){
        
   salesUpdateIDCollectionFrameManager.add(salesToBeUpdated);
    salesToBeUpdated.setBounds(130,50,100, 40);
    salesUpdateIDCollectionFrameManager.add(searchSalesToBeUpdated);
    searchSalesToBeUpdated.setBounds(130,100,100, 40);
    
   salesUpdateIDCollectionFrameManager.add(backFSUSFM);
   backFSUSFM.setBounds(50,150,95,30);
   salesUpdateIDCollectionFrameManager.add(xFCUSF.exit);
   xFCUSF.exit.setBounds(250,150,95,30);
   
    salesUpdateIDCollectionFrameManager.setSize(500,500);  
    salesUpdateIDCollectionFrameManager.setLayout(null);  
    salesUpdateIDCollectionFrameManager.setVisible(true); 
    }
}
