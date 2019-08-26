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
public class UserAddAndUpdateFrame {
    static JFrame userAddAndUpdateFrameManager=new JFrame();
    
    static JTextField empIDForAddOrUpdateSales=new JTextField("Employee ID");
    static JTextField EmpNameForAddOrUpdateSales=new JTextField("Employee name");
    static JTextField empAddressForAddOrUpdateSales=new JTextField("Employee address");
    static JTextField empTPNoForAddOrUpdateSales=new JTextField("Employee TP no.");
    static JTextField empPositionForAddOrUpdateSales=new JTextField("Position");
    static JTextField empUserNameForAddOrUpdateSales=new JTextField("Employee user name");
    static JTextField empPaawordForAddOrUpdateSales=new JTextField("Employee passwoerd");
    
    static Exit xFUAU=new Exit();
     
    static JButton backFUAUF=new JButton("Back");
    static JButton addUser=new JButton("Add user");
    static JButton updateUser=new JButton("Update user");
   
  UserAddAndUpdateFrame(){
    
    
    userAddAndUpdateFrameManager.add(empIDForAddOrUpdateSales);
    empIDForAddOrUpdateSales.setBounds(130,50,100, 40);
    userAddAndUpdateFrameManager.add(EmpNameForAddOrUpdateSales);
    EmpNameForAddOrUpdateSales.setBounds(130,100,100, 40);
    userAddAndUpdateFrameManager.add(empAddressForAddOrUpdateSales);
    empAddressForAddOrUpdateSales.setBounds(130,150,100, 40);
    userAddAndUpdateFrameManager.add(empTPNoForAddOrUpdateSales);
    empTPNoForAddOrUpdateSales.setBounds(130,200,100, 40);   
        userAddAndUpdateFrameManager.add(empPositionForAddOrUpdateSales);
    empPositionForAddOrUpdateSales.setBounds(130,250,100, 40); 
        userAddAndUpdateFrameManager.add(empUserNameForAddOrUpdateSales);
    empUserNameForAddOrUpdateSales.setBounds(130,300,100, 40); 
        userAddAndUpdateFrameManager.add(empPaawordForAddOrUpdateSales);
    empPaawordForAddOrUpdateSales.setBounds(130,350,100, 40); 
   userAddAndUpdateFrameManager.add(addUser);
   addUser.setBounds(50,400,100, 40);
   userAddAndUpdateFrameManager.add(updateUser);
   updateUser.setBounds(250,400,100, 40);
   userAddAndUpdateFrameManager.add(backFUAUF);
   backFUAUF.setBounds(50,450,95,30);
   userAddAndUpdateFrameManager.add(xFUAU.exit);
   xFUAU.exit.setBounds(250,450,95,30);
    
   userAddAndUpdateFrameManager.setSize(550,550);  
    userAddAndUpdateFrameManager.setLayout(null);  
    userAddAndUpdateFrameManager.setVisible(true);  
   }
}
