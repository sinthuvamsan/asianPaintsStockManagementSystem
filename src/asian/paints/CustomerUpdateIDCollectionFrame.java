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
         JFrame customerUpdateIDCollectionFrameManager=new JFrame("Update customer");
      JFrame customerUpdateIDCollectionFrameCashier=new JFrame("Update customer");
     
     JTextField userToBeUpdated=new JTextField("Customer ID");
    
     JButton searchUserToBeUpdated=new JButton("Update");
     JButton backFCUSF=new JButton("Back");
    
     static Exit xFCUSF=new Exit();
     
    public void UpdateIDCollectionFrameManager(){
        
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
        new CustomerActionSelectionFrame().managersCustomerFrame();
    }  
    });
    
     searchUserToBeUpdated.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerUpdateIDCollectionFrameManager.dispose();
       new CustomerUpdateFrame().managersCustomerUpdateFrame(Integer.parseInt(userToBeUpdated.getText()));
    }  
    });
    }
    public void UpdateIDCollectionFrameCashier(){
        
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
        new CustomerActionSelectionFrame().cashierCustomerFrame();
    }  
    });
    
     searchUserToBeUpdated.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerUpdateIDCollectionFrameCashier.dispose();
       new CustomerUpdateFrame().cashierCustomerUpdateFrame(Integer.parseInt(userToBeUpdated.getText()));
    }  
    });
    }
}
