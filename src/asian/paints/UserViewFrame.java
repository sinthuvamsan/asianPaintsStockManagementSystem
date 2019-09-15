/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asian.paints;

import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author User
 */
public class UserViewFrame {
     JFrame frame1;
 JTable table;

 String[] columnNames = {"User ID", "Name", "Address", "User T.P no.", "Position", "User name", "Password"};
 String sql;

    public void showUserTableData()
{

frame1 = new JFrame("User result");
frame1.setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);
frame1.setLayout(new BorderLayout()); 

DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(columnNames);
table = new JTable();
table.setModel(model); 
table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
table.setFillsViewportHeight(true);
JScrollPane scroll = new JScrollPane(table);
scroll.setHorizontalScrollBarPolicy(
JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scroll.setVerticalScrollBarPolicy(
JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
int UID=0;
    String nameUser="";
    String addressUser="";
    int tPUser=0;
    String positionUser="";
    String userNametext="";
    String passwordUser="";
try
{ 
Connection con = new DBManager().getConnection();
String sql = "select * from EmployeeDetails";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
int i =0;
while(rs.next())
{
UID = rs.getInt("emp_ID");
nameUser = rs.getString("emp_name");
addressUser = rs.getString("emp_address");
tPUser=rs.getInt("emp_tp_no");
positionUser=rs.getString("emp_possition");
    userNametext=rs.getString("emp_userName");
    passwordUser=rs.getString("emp_password");
    
    
    
model.addRow(new Object[]{UID, nameUser, addressUser, tPUser, positionUser,userNametext,passwordUser});
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
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
frame1.add(scroll);
frame1.setVisible(true);
frame1.setSize(400,300);
    
}
    
    public void showUserTableData(boolean userSearch,String idOrNameForUserSearch)
{

frame1 = new JFrame("User search result");
frame1.setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);
frame1.setLayout(new BorderLayout()); 

DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(columnNames);

table = new JTable();
table.setModel(model); 
table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
table.setFillsViewportHeight(true);
JScrollPane scroll = new JScrollPane(table);
scroll.setHorizontalScrollBarPolicy(
JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scroll.setVerticalScrollBarPolicy(
JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
int UID=0;
    String nameUser="";
    String addressUser="";
    int tPUser=0;
    String positionUser="";
    String userNametext="";
    String passwordUser="";
try
{ 
Connection con = new DBManager().getConnection();
if(userSearch==true){
sql = "select * from employeedetails where emp_ID = "+idOrNameForUserSearch;}
else {sql = "select * from employeedetails where emp_name LIKE '%"+ idOrNameForUserSearch + "%'";}
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
//Statement stmt=con.createStatement();  ResultSet rs=stmt.executeQuery("select * from employeedetails where emp_name = "+idOrNameForUserSearch);    
int i =0;
while(rs.next())
{
UID = rs.getInt("emp_ID");
nameUser = rs.getString("emp_name");
addressUser = rs.getString("emp_address");
tPUser=rs.getInt("emp_tp_no");
positionUser=rs.getString("emp_possition");
    userNametext=rs.getString("emp_userName");
    passwordUser=rs.getString("emp_password");
    
model.addRow(new Object[]{UID, nameUser, addressUser, tPUser, positionUser,userNametext,passwordUser});
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
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
frame1.add(scroll);
frame1.setVisible(true);
frame1.setSize(400,300);
    
}
}
