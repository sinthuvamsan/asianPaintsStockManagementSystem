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
public class UserViewSelectionFrame {
    static JFrame userViewSelectionFrameManager=new JFrame();
    
    static JTextField dataForSearchUser=new JTextField("Search by");
    
    static Exit xFUVS=new Exit();
    
    static JLabel labelForSearchUser=new JLabel("Search by:"); 
    
    static String searchUserBy[]={"Emp ID","Name"};        
    static JComboBox userSearchByCB=new JComboBox(searchUserBy); 
    
    static JButton backFUVSF=new JButton("Back");
    static JButton viewAllUsers=new JButton("View all");
    static JButton viewUserBy=new JButton("Search");
    
    UserViewSelectionFrame(){
    
     
    userViewSelectionFrameManager.add(viewAllUsers);
    viewAllUsers.setBounds(130,100,100, 40);
    userViewSelectionFrameManager.add(labelForSearchUser);
    labelForSearchUser.setBounds(50,150, 150,30);
    userViewSelectionFrameManager.add(userSearchByCB);
    userSearchByCB.setBounds(130,150,90,20); 
    userViewSelectionFrameManager.add(dataForSearchUser);
    dataForSearchUser.setBounds(130,200,100, 40);
    userViewSelectionFrameManager.add(viewUserBy);
    viewUserBy.setBounds(130,250,100, 40);
    userViewSelectionFrameManager.add(backFUVSF);
    backFUVSF.setBounds(50,300,95,30);
    userViewSelectionFrameManager.add(xFUVS.exit);
    xFUVS.exit.setBounds(250,300,95,30);
    
   userViewSelectionFrameManager.setSize(500,500);  
    userViewSelectionFrameManager.setLayout(null);  
    userViewSelectionFrameManager.setVisible(true); 
    }
     
}
