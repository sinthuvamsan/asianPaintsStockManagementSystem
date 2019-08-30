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
public class CustomerUpdateIDCollectionFrame {
        static JFrame customerUpdateIDCollectionFrameManager=new JFrame();
     static JFrame customerUpdateIDCollectionFrameCashier=new JFrame();
     
    static JTextField userToBeUpdated=new JTextField("Employee ID");
    
    static JButton searchUserToBeUpdated=new JButton("Update this user");
    static JButton backFCUSFM=new JButton("Back");
    static JButton backFCUSFC=new JButton("Back");
    
     static Exit xFCUSF=new Exit();
     
    public void UpdateIDCollectionFrameManager(){
        
   customerUpdateIDCollectionFrameManager.add(userToBeUpdated);
    userToBeUpdated.setBounds(130,50,100, 40);
    customerUpdateIDCollectionFrameManager.add(searchUserToBeUpdated);
    searchUserToBeUpdated.setBounds(130,100,100, 40);
    
   customerUpdateIDCollectionFrameManager.add(backFCUSFM);
   backFCUSFM.setBounds(50,150,95,30);
   customerUpdateIDCollectionFrameManager.add(xFCUSF.exit);
   xFCUSF.exit.setBounds(250,150,95,30);
   
    customerUpdateIDCollectionFrameManager.setSize(500,500);  
    customerUpdateIDCollectionFrameManager.setLayout(null);  
    customerUpdateIDCollectionFrameManager.setVisible(true); 
    }
    public void UpdateIDCollectionFrameCashier(){
        
   customerUpdateIDCollectionFrameCashier.add(userToBeUpdated);
    userToBeUpdated.setBounds(130,50,100, 40);
    customerUpdateIDCollectionFrameCashier.add(searchUserToBeUpdated);
    searchUserToBeUpdated.setBounds(130,100,100, 40);
    
   customerUpdateIDCollectionFrameCashier.add(backFCUSFC);
   backFCUSFC.setBounds(50,150,95,30);
   customerUpdateIDCollectionFrameCashier.add(xFCUSF.exit);
   xFCUSF.exit.setBounds(250,150,95,30);
   
    customerUpdateIDCollectionFrameCashier.setSize(500,500);  
    customerUpdateIDCollectionFrameCashier.setLayout(null);  
    customerUpdateIDCollectionFrameCashier.setVisible(true); 
    }
}
