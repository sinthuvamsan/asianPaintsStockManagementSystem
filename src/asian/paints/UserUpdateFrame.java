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
     JFrame userUpdateFrameManager;
    
     JTextField empIDUpdateUser=new JTextField();
     JTextField empNameForUpdateUser=new JTextField();
     JTextField empAddressForUpdateUser=new JTextField();
     JTextField empTPNoForUpdateUser=new JTextField();
     JTextField empPositionForUpdateUser=new JTextField();
     JTextField empUserNameForUpdateUser=new JTextField();
     JTextField empPaawordForUpdateUser=new JTextField();
    
      JLabel forUserName=new JLabel("User name:");
     JLabel forPassword=new JLabel("Password:");
     
    static Exit xFUU=new Exit();
     
     JButton backFUAUF=new JButton("Back");
     JButton updateUser=new JButton("Update");
   
  UserUpdateFrame(int userToBeUpdated){
    
    userUpdateFrameManager=new JFrame();
    
     userUpdateFrameManager.add(forUserName);
    forUserName.setBounds(50,300,100, 40); 
        userUpdateFrameManager.add(forPassword);
    forPassword.setBounds(50,350,100, 40); 
    
    //userUpdateFrameManager.add(empIDUpdateUser);
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
      int empIDUpdateUserInt=Integer.parseInt(empIDUpdateUser.getText());
      String empNameForUpdateUserString=empNameForUpdateUser.getText();
      String empAddressForUpdateUserString=empAddressForUpdateUser.getText();
      int empTPNoForUpdateUserInt=Integer.parseInt(empTPNoForUpdateUser.getText());
      String empPositionForUpdateUserString=empPositionForUpdateUser.getText();
      String empUserNameForUpdateUserString=empUserNameForUpdateUser.getText();
      String empPaawordForUpdateUserString=empPaawordForUpdateUser.getText();
      
      String sQLToUpdateUser="update employeedetails set emp_id='"+empIDUpdateUserInt+"' ,emp_name='"+empNameForUpdateUserString+"' ,emp_address='"+empAddressForUpdateUserString+"' ,emp_tp_no='"+empTPNoForUpdateUserInt+"' ,emp_possition='"+empPositionForUpdateUserString+"' ,emp_userName='"+empUserNameForUpdateUserString+"' ,emp_password='"+empPaawordForUpdateUserString+"' where emp_id="+userToBeUpdated;
      new DBManager().dBManipulator(sQLToUpdateUser);
      
    userUpdateFrameManager.dispose();
    new MainFirstFrame().managersMainFrame();
    JOptionPane.showMessageDialog(new MainFirstFrame().mainFirstFrameManager,"User updated successfully");
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