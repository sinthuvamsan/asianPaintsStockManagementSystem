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
public class UserDeleteFrame {
    static JFrame userDeleteFrameManager=new JFrame();
    static JTextField userIDForDelete=new JTextField("User ID");
    
    static Exit xFSD=new Exit();
    static Exit xFSDC=new Exit();
    
    static JButton backFUDCF=new JButton("Back"); 
    static JButton backFUDF=new JButton("Back");  
    static JButton deleteUser=new JButton("Delete");
    static JButton confirmdeleteUser=new JButton("Delete");
    
    static JFrame userDeleteConfirmFrameManager=new JFrame();
    
    static JTextArea empDetailsForDeleteUser=new JTextArea();
    
    static JTextField empIDForDeleteUser=new JTextField("Employee ID");
    static JTextField EmpNameForDeleteUser=new JTextField("Employee name");
    static JTextField empAddressForDeleteUser=new JTextField("Employee address");
    static JTextField empTPNoForDeleteUser=new JTextField("Employee TP no.");
    static JTextField empPositionForDeleteUser=new JTextField("Position");
    static JTextField empUserNameForDeleteUser=new JTextField("Employee user name");
    static JTextField empPaawordForDeleteUser=new JTextField("Employee passwoerd");
    
    static Exit xFUD=new Exit();
     
    static JButton backFUDAF=new JButton("Back");
    static JButton confirmDeleteUser=new JButton("Add user");
    
   
    
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
    
     deleteUser.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        int UID=0;
    String nameUser="";
    String addressUser="";
    int tPUser=0;
    String positionUser="";
    String userNametext="";
    String passwordUser="";
    try
{ 
Connection con = DBManager.getConnection();
int userToBeDeleted=Integer.parseInt(userIDForDelete.getText());
String sql = "select * from employeedetails where emp_ID = "+userToBeDeleted;
 String sQLToDeleteUser="DELETE FROM employeeDetails WHERE emp_id="+userToBeDeleted;
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
//Statement stmt=con.createStatement();  ResultSet rs=stmt.executeQuery("select * from employeedetails where emp_name = "+idOrNameForUserSearch);    
int i =0;
if(rs.next())
{
UID = rs.getInt("emp_ID");
nameUser = rs.getString("emp_name");
addressUser = rs.getString("emp_address");
tPUser=rs.getInt("emp_tp_no");
positionUser=rs.getString("emp_possition");
    userNametext=rs.getString("emp_userName");
    passwordUser=rs.getString("emp_password");
    
String detailsOfUserToBeDeleted="User ID: "+UID+"\n"+"User name: "+nameUser+"\n"+"User address: "+addressUser+"\n"+"User T.P No.: "+tPUser+"\n"+"User position: "+positionUser+"\n"+"User name: "+userNametext+"\n"+"User password: "+passwordUser;
empDetailsForDeleteUser.setText(detailsOfUserToBeDeleted);
i++; 
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",
JOptionPane.ERROR_MESSAGE);
}
if(i ==1)
{
System.out.println(i+" Record Found");
}
else
{
System.out.println(i+" Records Found");
}

JScrollPane scroll = new JScrollPane(empDetailsForDeleteUser);
userDeleteConfirmFrameManager.add(scroll);       
scroll.setBounds(20, 20, 300, 300);

userDeleteConfirmFrameManager.add(confirmdeleteUser);
confirmdeleteUser.setBounds(150,350,95,30);
userDeleteConfirmFrameManager.add(backFUDF);
backFUDF.setBounds(50,400,95,30);
userDeleteConfirmFrameManager.add(xFSDC.exit);
xFSDC.exit.setBounds(250,400,95,30);
        
userDeleteConfirmFrameManager.setSize(500,500);  
    userDeleteConfirmFrameManager.setLayout(null);  
    userDeleteConfirmFrameManager.setVisible(true); 
confirmdeleteUser.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        new DBManager().deleteDataFromDB(sQLToDeleteUser);
        userDeleteConfirmFrameManager.dispose();
           new UserActionSelectionFrame();
    }  
    });

}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
        
          
    }  
    });
    }
}
