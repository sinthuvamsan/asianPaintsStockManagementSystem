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
    static JFrame userDeleteConfirmFrameManager=new JFrame();
    
    static JTextField userIDForDelete=new JTextField("User ID");
    
    static Exit xFSD=new Exit();
    static Exit xFSDC=new Exit();
    
    static JButton backFUDCF=new JButton("Back"); 
    static JButton backFUDF=new JButton("Back");  
    static JButton confirmdeleteUser=new JButton("Delete");
    
    static JTextArea empDetailsForDeleteUser=new JTextArea();;
    
    static Exit xFUD=new Exit();
     
    static JButton backFUDAF=new JButton("Back");
    static JButton confirmDeleteUser=new JButton("Add user");
    
   
    
    UserDeleteFrame(int userIDToBeDeleted){
        
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
 
        int UID=userIDToBeDeleted;
    String nameUser="";
    String addressUser="";
    int tPUser=0;
    String positionUser="";
    String userNametext="";
    String passwordUser="";
    try
{ 
Connection con = DBManager.getConnection();

String sql = "select * from employeedetails where emp_ID = "+userIDToBeDeleted;
 String sQLToDeleteUser="DELETE FROM employeeDetails WHERE emp_id="+userIDToBeDeleted;
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
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
}
        
          
     
     backFUDAF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       userDeleteConfirmFrameManager.dispose();
       new UserDeleteSelectionFrame();
    }  
    });
    }
}
