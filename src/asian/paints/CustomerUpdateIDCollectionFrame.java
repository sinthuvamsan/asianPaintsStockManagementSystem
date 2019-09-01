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
    static JButton backFCUSF=new JButton("Back");
    
     static Exit xFCUSF=new Exit();
     
    public static void UpdateIDCollectionFrameManager(){
        
   customerUpdateIDCollectionFrameManager.add(userToBeUpdated);
    userToBeUpdated.setBounds(130,50,100, 40);
    customerUpdateIDCollectionFrameManager.add(searchUserToBeUpdated);
    searchUserToBeUpdated.setBounds(130,100,100, 40);
    
   customerUpdateIDCollectionFrameManager.add(backFCUSF);
   backFCUSF.setBounds(50,150,95,30);
   customerUpdateIDCollectionFrameManager.add(xFCUSF.exit);
   xFCUSF.exit.setBounds(250,150,95,30);
   
    customerUpdateIDCollectionFrameManager.setSize(500,500);  
    customerUpdateIDCollectionFrameManager.setLayout(null);  
    customerUpdateIDCollectionFrameManager.setVisible(true); 
    
    backFCUSF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerUpdateIDCollectionFrameManager.dispose();
         CustomerActionSelectionFrame.managersCustomerFrame();
    }  
    });
    }
    public static void UpdateIDCollectionFrameCashier(){
        
   customerUpdateIDCollectionFrameCashier.add(userToBeUpdated);
    userToBeUpdated.setBounds(130,50,100, 40);
    customerUpdateIDCollectionFrameCashier.add(searchUserToBeUpdated);
    searchUserToBeUpdated.setBounds(130,100,100, 40);
    
   customerUpdateIDCollectionFrameCashier.add(backFCUSF);
   backFCUSF.setBounds(50,150,95,30);
   customerUpdateIDCollectionFrameCashier.add(xFCUSF.exit);
   xFCUSF.exit.setBounds(250,150,95,30);
   
    customerUpdateIDCollectionFrameCashier.setSize(500,500);  
    customerUpdateIDCollectionFrameCashier.setLayout(null);  
    customerUpdateIDCollectionFrameCashier.setVisible(true); 
    
    backFCUSF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerUpdateIDCollectionFrameCashier.dispose();
         CustomerActionSelectionFrame.cashierCustomerFrame();
    }  
    });
    }
}
