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
public class UserActionSelectionFrame{
    JFrame userActionSelectionFrame ; //creating Username Password frame and initializing it
     JButton AddUser=new JButton("Add user");  //creating and initilizing button
     JButton updateUser=new JButton("Update user");  //creating and initilizing button
     JButton deleteUser=new JButton("Delete user");  //creating and initilizing button
     JButton viewUsers=new JButton("View users");  //creating and initilizing button
     JButton backFU=new JButton("Back");  //creating and initilizing button
     Exit xFU=new Exit();
   
    UserActionSelectionFrame(){
       userActionSelectionFrame  = new JFrame("Asian paints users");
    userActionSelectionFrame.add(AddUser);
    AddUser.setBounds(130,100,100, 40);
    userActionSelectionFrame.add(updateUser);
    updateUser.setBounds(130,150,100, 40);
    userActionSelectionFrame.add(deleteUser);
    deleteUser.setBounds(130,200,100, 40);
    userActionSelectionFrame.add(viewUsers);
    viewUsers.setBounds(130,250,100, 40);
    userActionSelectionFrame.add(backFU);
    backFU.setBounds(50,300,100, 40);
    userActionSelectionFrame.add(xFU.exit);
    xFU.exit.setBounds(250,300,95,30);//setBounds(int x axsis, int y axsis, int width, int height)

    userActionSelectionFrame.setSize(400,500);//400 width and 500 height  
    userActionSelectionFrame.setLayout(null);//using no layout managers  
    userActionSelectionFrame.setVisible(true);//making the frame visible
    
        backFU.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       userActionSelectionFrame.dispose();
       new MainFirstFrame();
       MainFirstFrame.managersMainFrame();
    }  
    });
        
        AddUser.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       userActionSelectionFrame.dispose();
       new UserAddFrame();
       
    }  
    });
        
       updateUser.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       userActionSelectionFrame.dispose();
       new UserUpdateIDCollectionFrame();
    }  
    });     
           
       deleteUser.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       userActionSelectionFrame.dispose();
       new UserDeleteSelectionFrame();
    }  
    });     
       
       viewUsers.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       userActionSelectionFrame.dispose();
       new UserViewFrame();
    }  
    });     
       
    }
}
