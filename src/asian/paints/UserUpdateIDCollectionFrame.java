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
    static JFrame userUpdateIDCollectionFrameManager=new JFrame();
    
    JTextField userToBeUpdated=new JTextField();
    
    static JButton searchUserToBeUpdated=new JButton("Update this user");
    static JButton backFUUSF=new JButton("Back");
    
     static Exit xFUUSF=new Exit();
     
    UserUpdateIDCollectionFrame(){
        
   userUpdateIDCollectionFrameManager.add(userToBeUpdated);
    userToBeUpdated.setBounds(130,50,100, 40);
    userUpdateIDCollectionFrameManager.add(searchUserToBeUpdated);
    searchUserToBeUpdated.setBounds(130,100,100, 40);
    
   userUpdateIDCollectionFrameManager.add(backFUUSF);
   backFUUSF.setBounds(50,150,95,30);
   userUpdateIDCollectionFrameManager.add(xFUUSF.exit);
   xFUUSF.exit.setBounds(250,150,95,30);
   
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
