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
public class PaintViewFrame {
      JFrame frame1;
 JTable table;

 String[] columnNames = {"Product no.", "model name", "Colour", "Unit price", "Stock quantity"};
 String sql;

    public void showPaintTableData()
{

frame1 = new JFrame("Paint result");
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
int pID=0;
    String nameModel="";
    String colourPaint="";
    float unitPrice=0;
    int stockQuantity=0;
try
{ 
Connection con = new DBManager().getConnection();
String sql = "select * from paintDetails";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
int i =0;
while(rs.next())
{
pID = rs.getInt("paint_product_no");
nameModel = rs.getString("paint_model_name");
colourPaint = rs.getString("paint_colour");
unitPrice=Float.parseFloat(rs.getString("paint_unit_price"));
stockQuantity=rs.getInt("paint_stock_quantity");
    
model.addRow(new Object[]{pID, nameModel, colourPaint, unitPrice, stockQuantity});
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
    
    public void showPaintTableData(boolean userSearch,String idOrNameForPaintSearch)
{

frame1 = new JFrame("Paint search result");
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
int pID=0;
    String nameModel="";
    String colourPaint="";
    float unitPrice=0;
    int stockQuantity=0;
try
{ 
Connection con = new DBManager().getConnection();
if(userSearch==true){
sql = "select * from paintDetails where paint_product_no = "+idOrNameForPaintSearch;}
else {sql = "select * from paintDetails where paint_model_name LIKE '%"+ idOrNameForPaintSearch + "%'";}
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
//Statement stmt=con.createStatement();  ResultSet rs=stmt.executeQuery("select * from employeedetails where emp_name = "+idOrNameForUserSearch);    
int i =0;
while(rs.next())
{
pID = rs.getInt("paint_product_no");
nameModel = rs.getString("paint_model_name");
colourPaint = rs.getString("paint_colour");
unitPrice=Float.parseFloat(rs.getString("paint_unit_price"));
stockQuantity=rs.getInt("paint_stock_quantity");
    
model.addRow(new Object[]{pID, nameModel, colourPaint, unitPrice, stockQuantity});
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
