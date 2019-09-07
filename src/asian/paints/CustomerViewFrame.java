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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class CustomerViewFrame extends ViewFrame {
     JFrame frame1;
 JTable table;

 String[] columnNames = {"Customer ID", "Name", "Address", "User T.P no.", "Customer total"};
 String sql;

    public void showCustomerTableData()
{

frame1 = new JFrame("Customer result");
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
    String nameCustomer="";
    String addressCustomer="";
    int tPCustomer=0;
   float totalCustomer=0;
try
{ 
Connection con = new DBManager().getConnection();
String sql = "select * from customerDetails";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
int i =0;
while(rs.next())
{
UID = rs.getInt("cus_ID");
nameCustomer = rs.getString("cus_name");
addressCustomer = rs.getString("cus_address");
tPCustomer=rs.getInt("cus_tp_no");
totalCustomer=Float.parseFloat(rs.getString("cus_total"));
    
    
    
    
model.addRow(new Object[]{UID, nameCustomer, addressCustomer, tPCustomer, totalCustomer});
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
    
    public void showCustomerTableData(boolean userSearch,String idOrNameForCustomerSearch)
{

frame1 = new JFrame("Customer search result");
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
    String nameCustomer="";
    String addressCustomer="";
    int tPCustomer=0;
    float totalCustomer=0;
try
{ 
Connection con = new DBManager().getConnection();
if(userSearch==true){
sql = "select * from customerDetails where cus_ID = "+idOrNameForCustomerSearch;}
else {sql = "select * from customerDetails where cus_name LIKE '%"+ idOrNameForCustomerSearch + "%'";}
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
//Statement stmt=con.createStatement();  ResultSet rs=stmt.executeQuery("select * from employeedetails where emp_name = "+idOrNameForUserSearch);    
int i =0;
if(rs.next())
{
UID = rs.getInt("cus_ID");
nameCustomer = rs.getString("cus_name");
addressCustomer = rs.getString("cus_address");
tPCustomer=rs.getInt("cus_tp_no");
totalCustomer=Float.parseFloat(rs.getString("cus_total"));
    
model.addRow(new Object[]{UID, nameCustomer, addressCustomer, tPCustomer, totalCustomer});
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
