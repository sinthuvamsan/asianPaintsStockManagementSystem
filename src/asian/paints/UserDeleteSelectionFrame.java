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
public class UserDeleteSelectionFrame {
    static JFrame userDeleteIDCollectionFrameManager=new JFrame();
    
    static JTextField userToBeDeleted=new JTextField("Employee ID");
    
    static JButton searchUserToBeDeleted=new JButton("Delete");
    static JButton backFUDSF=new JButton("Back");
    
     static Exit xFUDSF=new Exit();
     
    UserDeleteSelectionFrame(){
        
   userDeleteIDCollectionFrameManager.add(userToBeDeleted);
    userToBeDeleted.setBounds(130,50,100, 40);
    userDeleteIDCollectionFrameManager.add(searchUserToBeDeleted);
    searchUserToBeDeleted.setBounds(130,100,100, 40);
    
   userDeleteIDCollectionFrameManager.add(backFUDSF);
   backFUDSF.setBounds(50,150,95,30);
   userDeleteIDCollectionFrameManager.add(xFUDSF.exit);
   xFUDSF.exit.setBounds(250,150,95,30);
   
    userDeleteIDCollectionFrameManager.setSize(500,500);  
    userDeleteIDCollectionFrameManager.setLayout(null);  
    userDeleteIDCollectionFrameManager.setVisible(true); 
    
    backFUDSF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       userDeleteIDCollectionFrameManager.dispose();
       new UserActionSelectionFrame();
    }  
    });
    
    searchUserToBeDeleted.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
         userDeleteIDCollectionFrameManager.dispose();
       new UserDeleteFrame(Integer.parseInt(userToBeDeleted.getText()));
      
    }  
    });
    }
}
