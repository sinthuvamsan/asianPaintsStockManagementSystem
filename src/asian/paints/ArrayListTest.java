/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asian.paints;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;  
import java.util.*;  
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ArrayListTest extends AbstractTableModel {
    
     JFrame frame1;
 JTable table;

 String[] columnNames = {"Customer ID", "Name", "Address", "User T.P no.", "Customer total"};
 String sql;
 
   Connection con=new DBManager().getConnection();
   
   //ArrayListTest(String query){
       ArrayListTest(){
   frame1 = new JFrame("Result");
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
   
try{
   Statement st = con.createStatement();
//ResultSet rs = st.executeQuery(query);
ResultSet rs = st.executeQuery("select * from employeedetails");
ResultSetMetaData rsmd = rs.getMetaData();

int columnsNumber = rsmd.getColumnCount();
rs.last();
int rowNumber=rs.getRow();

//ArrayList<ArrayList<String> > list = new ArrayList<ArrayList<String> >(rowNumber);

//ArrayList<String>[] al = new ArrayList[rowNumber]; 
String[] al = new String[rowNumber];

while(rs.next()){
    for(int r=0;r<rowNumber;r++){ 
       
    for(int i=1;i<=columnsNumber;i++){


    }model.addRow(new Object[]{UID, nameCustomer, addressCustomer, tPCustomer, totalCustomer});//this might be the line that need fix i couldn't find anything on iinternet
}
}

}catch(Exception e){JOptionPane.showMessageDialog(frame1,e); }
   
frame1.add(scroll);
frame1.setVisible(true);
frame1.setSize(400,300);
   }
}
