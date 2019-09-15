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
public class UserAddFrame{
     JFrame userAddFrameManager;
    
     JTextField empIDForAddUser=new JTextField("ID");
     JTextField EmpNameForAddUser=new JTextField("Name");
     JTextField empAddressForAddUser=new JTextField("Address");
     JTextField empTPNoForAddUser=new JTextField("TP no.");
     JTextField empPositionForAddUser=new JTextField("Position");
     JTextField empUserNameForAddUser=new JTextField("User name");
     JTextField empPaawordForAddUser=new JTextField("Passwoerd");
    
    static Exit xFUA=new Exit();
     
    
    
//private Connection con = null;
//private Statement stmt = null;
//private ResultSet rs = null;

   
  UserAddFrame(){
    userAddFrameManager=new JFrame("Add user");
     JButton backFUAF=new JButton("Back");
     JButton addUser=new JButton("Add");
     
   // userAddFrameManager.add(empIDForAddUser);
    empIDForAddUser.setBounds(130,50,100, 40);
    userAddFrameManager.add(EmpNameForAddUser);
    EmpNameForAddUser.setBounds(130,100,100, 40);
    userAddFrameManager.add(empAddressForAddUser);
    empAddressForAddUser.setBounds(130,150,100, 40);
    userAddFrameManager.add(empTPNoForAddUser);
    empTPNoForAddUser.setBounds(130,200,100, 40);   
        userAddFrameManager.add(empPositionForAddUser);
    empPositionForAddUser.setBounds(130,250,100, 40); 
        userAddFrameManager.add(empUserNameForAddUser);
    empUserNameForAddUser.setBounds(130,300,100, 40); 
        userAddFrameManager.add(empPaawordForAddUser);
    empPaawordForAddUser.setBounds(130,350,100, 40); 
   userAddFrameManager.add(addUser);
   addUser.setBounds(50,400,100, 40);
   userAddFrameManager.add(backFUAF);
   backFUAF.setBounds(50,450,95,30);
   userAddFrameManager.add(xFUA.exit);
   xFUA.exit.setBounds(250,450,95,30);
    
   userAddFrameManager.setSize(550,550);  
    userAddFrameManager.setLayout(null);  
    userAddFrameManager.setVisible(true);  
    
    addUser.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        

        String query ="SELECT * FROM employeedetails ORDER BY emp_id DESC LIMIT 1;";
        String colName="emp_id";
int lastOfuserId = DBManager.lastID(query,colName);

  lastOfuserId++;
    String EmpNameForAddUserString=EmpNameForAddUser.getText();
    String empAddressForAddUserString=empAddressForAddUser.getText();
    int empTPNoForAddUserInt=Integer.parseInt(empTPNoForAddUser.getText());
    String empPositionForAddUserString=empPositionForAddUser.getText();
    String empUserNameForAddUserString=empUserNameForAddUser.getText();
    String empPaawordForAddUserString=empPaawordForAddUser.getText();
    String sQLForAddUser="insert into employeeDetails (emp_id,emp_name,emp_address,emp_tp_no,emp_possition,emp_userName,emp_password)"
            + "values('"+lastOfuserId+"','"+EmpNameForAddUserString+"','"+empAddressForAddUserString+"','"+empTPNoForAddUserInt+"','"+empPositionForAddUserString+"','"+empUserNameForAddUserString+"','"+empPaawordForAddUserString+"')";
   
    new DBManager().dBManipulator(sQLForAddUser);
            
    userAddFrameManager.dispose();
    new UserActionSelectionFrame();
    JOptionPane.showMessageDialog(new UserActionSelectionFrame().userActionSelectionFrame,"Data has been successfully added");  
   
    
            }
    });
   
     backFUAF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       userAddFrameManager.dispose();
       new UserActionSelectionFrame();
    }  
    });
}
}