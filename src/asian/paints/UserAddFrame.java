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
    static JFrame userAddFrameManager=new JFrame();
    
    static JTextField empIDForAddUser=new JTextField("Employee ID");
    static JTextField EmpNameForAddUser=new JTextField("Employee name");
    static JTextField empAddressForAddUser=new JTextField("Employee address");
    static JTextField empTPNoForAddUser=new JTextField("Employee TP no.");
    static JTextField empPositionForAddUser=new JTextField("Position");
    static JTextField empUserNameForAddUser=new JTextField("Employee user name");
    static JTextField empPaawordForAddUser=new JTextField("Employee passwoerd");
    
    static Exit xFUA=new Exit();
     
    static JButton backFUAUF=new JButton("Back");
    static JButton addUser=new JButton("Add user");
    
private Connection con = null;
private Statement stmt = null;
private ResultSet rs = null;

   
  UserAddFrame(){
    
    
    userAddFrameManager.add(empIDForAddUser);
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
   userAddFrameManager.add(backFUAUF);
   backFUAUF.setBounds(50,450,95,30);
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
    String sQLForADD="insert into employeeDetails (emp_id,emp_name,emp_address,emp_tp_no,emp_possition,emp_userName,emp_password)"
            + "values('"+lastOfuserId+"','"+EmpNameForAddUserString+"','"+empAddressForAddUserString+"','"+empTPNoForAddUserInt+"','"+empPositionForAddUserString+"','"+empUserNameForAddUserString+"','"+empPaawordForAddUserString+"')";
   
    new DBManager().addDataToDB(sQLForADD);
            
    userAddFrameManager.dispose();
    new UserActionSelectionFrame();
    JOptionPane.showMessageDialog(UserActionSelectionFrame.userActionSelectionFrame,"Data has been successfully added");  
   
    
            }
    });
   
}
}