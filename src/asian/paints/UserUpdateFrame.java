/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asian.paints;

import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author User
 */
public class UserUpdateFrame {
    static JFrame userUpdateFrameManager=new JFrame();
    
    static JTextField empIDUpdateUser=new JTextField("Employee ID");
    static JTextField empNameForUpdateUser=new JTextField("Employee name");
    static JTextField empAddressForUpdateUser=new JTextField("Employee address");
    static JTextField empTPNoForUpdateUser=new JTextField("Employee TP no.");
    static JTextField empPositionForUpdateUser=new JTextField("Position");
    static JTextField empUserNameForUpdateUser=new JTextField("Employee user name");
    static JTextField empPaawordForUpdateUser=new JTextField("Employee passwoerd");
    
    static Exit xFUU=new Exit();
     
    static JButton backFUAUF=new JButton("Back");
    static JButton updateUser=new JButton("Update user");
   
  UserUpdateFrame(){
    
    
    userUpdateFrameManager.add(empIDUpdateUser);
    empIDUpdateUser.setBounds(130,50,100, 40);
    userUpdateFrameManager.add(empNameForUpdateUser);
    empNameForUpdateUser.setBounds(130,100,100, 40);
    userUpdateFrameManager.add(empAddressForUpdateUser);
    empAddressForUpdateUser.setBounds(130,150,100, 40);
    userUpdateFrameManager.add(empTPNoForUpdateUser);
    empTPNoForUpdateUser.setBounds(130,200,100, 40);   
        userUpdateFrameManager.add(empPositionForUpdateUser);
    empPositionForUpdateUser.setBounds(130,250,100, 40); 
        userUpdateFrameManager.add(empUserNameForUpdateUser);
    empUserNameForUpdateUser.setBounds(130,300,100, 40); 
        userUpdateFrameManager.add(empPaawordForUpdateUser);
    empPaawordForUpdateUser.setBounds(130,350,100, 40); 
   userUpdateFrameManager.add(updateUser);
   updateUser.setBounds(250,400,100, 40);
   userUpdateFrameManager.add(backFUAUF);
   backFUAUF.setBounds(50,450,95,30);
   userUpdateFrameManager.add(xFUU.exit);
   xFUU.exit.setBounds(250,450,95,30);
    
   userUpdateFrameManager.setSize(550,550);  
    userUpdateFrameManager.setLayout(null);  
    userUpdateFrameManager.setVisible(true);  
    
    updateUser.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      Connection con=new DBManager().getConnection();
      String empNameForUpdateUserString=empNameForUpdateUser.getText();
      String sQLToUpdate="update employeedetails set emp_name='"+empNameForUpdateUserString+"' where emp_id=3";
      new DBManager().updateDataToDB(sQLToUpdate);
    }  
    });
   }
}
//"update login set firstname='"+firstname+"' ,lastname='"+lastname+"' ,username='"+username+"' ,password='"+password+"' ,address='"+address+"' ,number='"+number+"' ,gender='"+gender+"' ,roll='"+roll+"' where firstname  LIKE '%"+ idOrNameForUserSearch + "%'"