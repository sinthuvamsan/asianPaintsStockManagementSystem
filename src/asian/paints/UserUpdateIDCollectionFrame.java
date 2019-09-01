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
public class UserUpdateIDCollectionFrame {
     JFrame userUpdateIDCollectionFrameManager;
    
    JTextField userToBeUpdated=new JTextField("User Id");
    
     JButton searchUserToBeUpdated=new JButton("Update this user");
     JButton backFUUSF=new JButton("Back");
    
     static Exit xFUUSF=new Exit();
     
    UserUpdateIDCollectionFrame(){
      userUpdateIDCollectionFrameManager=new JFrame();
      
   userUpdateIDCollectionFrameManager.add(userToBeUpdated);
    userToBeUpdated.setBounds(130,50,80,30);
    userUpdateIDCollectionFrameManager.add(searchUserToBeUpdated);
    searchUserToBeUpdated.setBounds(130,100,80,30);
    userUpdateIDCollectionFrameManager.setBackground(Color.gray); 
    
   
   userUpdateIDCollectionFrameManager.add(backFUUSF);
   backFUUSF.setBounds(50,350,95,30);
   userUpdateIDCollectionFrameManager.add(xFUUSF.exit);
   xFUUSF.exit.setBounds(250,350,95,30);
   
    userUpdateIDCollectionFrameManager.setSize(500,500);  
    userUpdateIDCollectionFrameManager.setLayout(null);  
    userUpdateIDCollectionFrameManager.setVisible(true); 
    
    backFUUSF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       userUpdateIDCollectionFrameManager.dispose();
       new UserActionSelectionFrame();
    }  
    });
    
    searchUserToBeUpdated.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        userUpdateIDCollectionFrameManager.dispose();
       new UserUpdateFrame(Integer.parseInt(userToBeUpdated.getText()));
    }  
    });
    }
    
}
