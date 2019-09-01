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
public class CustomerDeleteFrame {
    static JFrame customerDeleteFrameManager=new JFrame();
    
    JTextArea customerDetailsForDeleteUser=new JTextArea();
    JScrollPane scrollCD = new JScrollPane(customerDetailsForDeleteUser);
    
    static Exit xFCD=new Exit();
    
    static JButton backFCDF=new JButton("Back");  
    static JButton deleteCustomer=new JButton("Delete");
    
    String sQLToDeleteCustomer="";
          
    CustomerDeleteFrame(int customerToBeDeleted){  
    customerDeleteFrameManager.add(scrollCD);       
    scrollCD.setBounds(20, 20, 300, 300);
    customerDeleteFrameManager.add(deleteCustomer);
    deleteCustomer.setBounds(250,350,100, 40);
    customerDeleteFrameManager.add(backFCDF);
    backFCDF.setBounds(50,400,95,30);
    customerDeleteFrameManager.add(xFCD.exit);
    xFCD.exit.setBounds(250,400,95,30);
    
    customerDeleteFrameManager.setSize(500,500);  
    customerDeleteFrameManager.setLayout(null);  
    customerDeleteFrameManager.setVisible(true); 
    
    backFCDF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerDeleteFrameManager.dispose();
          new CustomerDeleteIDCollectionFrame();
    }  
    });
    
       deleteCustomer.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        new DBManager().dBManipulator(sQLToDeleteCustomer);
        customerDeleteFrameManager.dispose();
           new UserActionSelectionFrame();
           JOptionPane.showMessageDialog(UserActionSelectionFrame.userActionSelectionFrame,"User deleted successfully"); 
    }  
    });
       
    int cID=0;
    String cN="";
    String cA="";
    int tPCus=0;
    float cT=0;
    
    try
{ 
Connection con = DBManager.getConnection();

String sql = "select * from employeedetails where emp_ID = "+customerToBeDeleted;
 sQLToDeleteCustomer="DELETE FROM employeeDetails WHERE emp_id="+customerToBeDeleted;
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
//Statement stmt=con.createStatement();  ResultSet rs=stmt.executeQuery("select * from employeedetails where emp_name = "+idOrNameForUserSearch);    
int i =0;
if(rs.next())
{
cID = rs.getInt("cus_ID");
cN = rs.getString("cus_name");
cA = rs.getString("cus_address");
tPCus=rs.getInt("cus_tp_no");
cT=rs.getFloat("emp_possition");
    
String detailsOfUserToBeDeleted="Customer ID: "+cID+"\n"+"Customer name: "+cN+"\n"+"Customer address: "+cA+"\n"+"Customer T.P No.: "+tPCus+"\n"+"Customer total: "+cT;

customerDetailsForDeleteUser.setText(detailsOfUserToBeDeleted);
i++; 
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",
JOptionPane.ERROR_MESSAGE);
}
else
{
 JOptionPane.showMessageDialog(customerDeleteFrameManager,i+" Records found to be deleted"); 
}

}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
}
    }
}
