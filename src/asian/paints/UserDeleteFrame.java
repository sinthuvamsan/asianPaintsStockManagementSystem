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
     JFrame userDeleteConfirmFrameManager;
    
    JTextArea empDetailsForDeleteUser=new JTextArea();
    
    static Exit xFUD=new Exit();
     
     JButton backFUDAF=new JButton("Back");
     JButton confirmDeleteUser=new JButton("Delete user");
    
    JScrollPane scrollUD = new JScrollPane(empDetailsForDeleteUser);
    
    String sQLToDeleteUser="Error";
            
    UserDeleteFrame(int userIDToBeDeleted){
        userDeleteConfirmFrameManager=new JFrame();
userDeleteConfirmFrameManager.add(scrollUD);       
scrollUD.setBounds(20, 20, 300, 300);

userDeleteConfirmFrameManager.add(confirmDeleteUser);
confirmDeleteUser.setBounds(150,350,95,30);
userDeleteConfirmFrameManager.add(backFUDAF);
backFUDAF.setBounds(50,400,95,30);
userDeleteConfirmFrameManager.add(xFUD.exit);
xFUD.exit.setBounds(250,400,95,30);
        
userDeleteConfirmFrameManager.setSize(500,500);  
    userDeleteConfirmFrameManager.setLayout(null);  
    userDeleteConfirmFrameManager.setVisible(true); 
 
        int uID=userIDToBeDeleted;
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
 sQLToDeleteUser="DELETE FROM employeeDetails WHERE emp_id="+userIDToBeDeleted;
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
//Statement stmt=con.createStatement();  ResultSet rs=stmt.executeQuery("select * from employeedetails where emp_name = "+idOrNameForUserSearch);    
int i =0;
if(rs.next())
{
uID = rs.getInt("emp_ID");
nameUser = rs.getString("emp_name");
addressUser = rs.getString("emp_address");
tPUser=rs.getInt("emp_tp_no");
positionUser=rs.getString("emp_possition");
    userNametext=rs.getString("emp_userName");
    passwordUser=rs.getString("emp_password");
    
String detailsOfUserToBeDeleted="User ID: "+uID+"\n"+"User name: "+nameUser+"\n"+"User address: "+addressUser+"\n"+"User T.P No.: "+tPUser+"\n"+"User position: "+positionUser+"\n"+"User name: "+userNametext+"\n"+"User password: "+passwordUser;

empDetailsForDeleteUser.setText(detailsOfUserToBeDeleted);
i++; 
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",
JOptionPane.ERROR_MESSAGE);
}
else
{
 JOptionPane.showMessageDialog(userDeleteConfirmFrameManager,i+" Records found to be deleted"); 
}

}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
}
        
          confirmDeleteUser.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        new DBManager().dBManipulator(sQLToDeleteUser);
        userDeleteConfirmFrameManager.dispose();
          new UserActionSelectionFrame();
           JOptionPane.showMessageDialog(new UserActionSelectionFrame().userActionSelectionFrame,"User deleted successfully"); 
    }  
    });

     
     backFUDAF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       userDeleteConfirmFrameManager.dispose();
       new UserDeleteSelectionFrame();
    }  
    });
    }
}
