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
    
    static JTextField empIDUpdateUser=new JTextField();
    static JTextField empNameForUpdateUser=new JTextField();
    static JTextField empAddressForUpdateUser=new JTextField();
    static JTextField empTPNoForUpdateUser=new JTextField();
    static JTextField empPositionForUpdateUser=new JTextField();
    static JTextField empUserNameForUpdateUser=new JTextField();
    static JTextField empPaawordForUpdateUser=new JTextField();
    
    static Exit xFUU=new Exit();
     
    static JButton backFUAUF=new JButton("Back");
    static JButton updateUser=new JButton("Update user");
   
  UserUpdateFrame(int userToBeUpdated){
    
    
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
    try{
     Connection con=new DBManager().getConnection();
    String sqlToViewUserToBeUpdated = "select * from employeedetails where emp_ID = "+userToBeUpdated;
    PreparedStatement ps = con.prepareStatement(sqlToViewUserToBeUpdated);
ResultSet rs = ps.executeQuery();
   if(rs.next()){
   empIDUpdateUser.setText(String.valueOf(rs.getInt("emp_ID")));
    empNameForUpdateUser.setText(rs.getString("emp_name"));
     empAddressForUpdateUser.setText(rs.getString("emp_address"));
     empTPNoForUpdateUser.setText(String.valueOf(rs.getInt("emp_tp_no")));
     empPositionForUpdateUser.setText(rs.getString("emp_possition"));
     empUserNameForUpdateUser.setText(rs.getString("emp_userName"));
     empPaawordForUpdateUser.setText(rs.getString("emp_password"));
   }
   //else{JOptionPane.showMessageDialog(userUpdateFrameManager,"Wrong ID"); }
    }catch(Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);}
    
    updateUser.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      int empIDUpdateUserInt=Integer.parseInt(empNameForUpdateUser.getText());
      String empNameForUpdateUserString=empNameForUpdateUser.getText();
      String empAddressForUpdateUserString=empNameForUpdateUser.getText();
      int empTPNoForUpdateUserInt=Integer.parseInt(empNameForUpdateUser.getText());
      String empPositionForUpdateUserString=empNameForUpdateUser.getText();
      String empUserNameForUpdateUserString=empNameForUpdateUser.getText();
      String empPaawordForUpdateUserString=empNameForUpdateUser.getText();
      
      String sQLToUpdateUser="update employeedetails set emp_id='"+empIDUpdateUserInt+"' ,emp_name='"+empNameForUpdateUserString+"' ,emp_address='"+empAddressForUpdateUserString+"' ,emp_tp_no='"+empTPNoForUpdateUserInt+"' ,emp_possition='"+empPositionForUpdateUserString+"' ,emp_userName='"+empUserNameForUpdateUserString+"' ,emp_password='"+empPaawordForUpdateUserString+"' where emp_id="+userToBeUpdated;
      new DBManager().updateDataToDB(sQLToUpdateUser);
    }  
    });
    
    backFUAUF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       userUpdateFrameManager.dispose();
       new UserUpdateIDCollectionFrame();
    }  
    });
   }
}