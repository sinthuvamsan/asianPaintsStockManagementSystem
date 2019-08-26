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
public class UserDeleteFrame {
    static JFrame userDeleteFrameManager=new JFrame();
    static JTextField userIDForDelete=new JTextField("User ID");
    
    static Exit xFSD=new Exit();
    
    static JButton backFUDF=new JButton("Back");  
    static JButton deleteUser=new JButton("Delete");
    
    UserDeleteFrame(){  
    userDeleteFrameManager.add(userIDForDelete);
    userIDForDelete.setBounds(130,100,100, 40);
    userDeleteFrameManager.add(deleteUser);
    deleteUser.setBounds(250,150,100, 40);
    userDeleteFrameManager.add(backFUDF);
    backFUDF.setBounds(50,400,95,30);
    userDeleteFrameManager.add(xFSD.exit);
    xFSD.exit.setBounds(250,400,95,30);
    
    userDeleteFrameManager.setSize(500,500);  
    userDeleteFrameManager.setLayout(null);  
    userDeleteFrameManager.setVisible(true); 
    }
}
