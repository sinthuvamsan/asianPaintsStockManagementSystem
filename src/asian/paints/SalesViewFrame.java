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
public class SalesViewFrame extends ViewFrame {
       JFrame frame1;
 JTable table;

 String[] columnNames = {"Sales no", "Paint sales quantity", "Paint product no.", "Customer ID"};
 String sql;

    public void showSalesTableData()
{

frame1 = new JFrame("Sales result");
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
int salesNo=0;
    int quantityOfPaintSold=0;
    int paintProductNo=0;
    int cusID=0;
    
try
{ 
Connection con = new DBManager().getConnection();
String sql = "select * from EmployeeDetails";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
int i =0;
while(rs.next())
{
salesNo=rs.getInt("sales_no");
    quantityOfPaintSold=rs.getInt("paint_sales_quantity");
     paintProductNo=rs.getInt("paint_product_no");
    cusID=rs.getInt("cus_id");
    
    
    
model.addRow(new Object[]{salesNo, quantityOfPaintSold, paintProductNo, cusID});
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
    
    public void showSalesTableData(boolean cusOrSales,String idOfCusOrSalesSearch)
{

frame1 = new JFrame("Sales search result");
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
int salesNo=0;
    int quantityOfPaintSold=0;
    int paintProductNo=0;
    int cusID=0;
    
try
{ 
Connection con = new DBManager().getConnection();
if(cusOrSales==true){
sql = "select * from salesDetails where cus_id = "+idOfCusOrSalesSearch;}
else {sql = "select * from salesDetails where sales_no = "+idOfCusOrSalesSearch;}
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
//Statement stmt=con.createStatement();  ResultSet rs=stmt.executeQuery("select * from employeedetails where emp_name = "+idOrNameForUserSearch);    
int i =0;
if(rs.next())
{
salesNo=rs.getInt("sales_no");
    quantityOfPaintSold=rs.getInt("paint_sales_quantity");
     paintProductNo=rs.getInt("paint_product_no");
    cusID=rs.getInt("cus_id");
    
    
    
model.addRow(new Object[]{salesNo, quantityOfPaintSold, paintProductNo, cusID});
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
