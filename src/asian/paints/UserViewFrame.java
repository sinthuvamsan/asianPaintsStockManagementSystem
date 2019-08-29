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
public class UserViewFrame extends ViewFrame {
    static JFrame managerUserViewFrame = new JFrame();
    static JTable table;
    String[] columnNames = {"User ID", "Name", "Address", "User T.P no.", "Position", "User name", "Password"};
    
   UserViewFrame(){
    
    
      JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        

        JScrollPane tableContainer = new JScrollPane(table);

        panel.add(tableContainer, BorderLayout.CENTER);
        managerUserViewFrame.getContentPane().add(panel);

        managerUserViewFrame.pack();
        
   
    
    /*TextArea area=new TextArea();  
        area.setBounds(10,30, 300,300); 
        managerUserViewFrame.add(area); */ 
    
    
    
JScrollPane scroll = new JScrollPane(table);
scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
   
        
    managerUserViewFrame.add(backFVF);
    backFVF.setBounds(50,700,95,30);
    managerUserViewFrame.add(xFD.exit);
    xFD.exit.setBounds(250,700,95,30);
   
 
    
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(columnNames);
    table = new JTable();
    table.setModel(model);
    table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    table.setFillsViewportHeight(true);
    
        managerUserViewFrame.add(scroll);
    managerUserViewFrame.setSize(800,800);    
    managerUserViewFrame.setLayout(null);    
    managerUserViewFrame.setVisible(true);
    
    int UID=0;
    String nameUser="";
    String addressUser="";
    int tPUser=0;
    String positionUser="";
    String userName="";
    String passwordUser="";
    try
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/asianPaints","root","root");
String sql = "select * from EmployeeDetails ";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
int i =0;
if(rs.next())
{
UID = rs.getInt("emp_ID");
nameUser = rs.getString("emp_name");
addressUser = rs.getString("emp_address");
addressUser=rs.getString("emp_possition");
 tPUser=rs.getInt("emp_tp_no");
    userName=rs.getString("emp_userName");
    passwordUser=rs.getString("emp_password");
    
    //area.setText(rs.getString(2));
    
model.addRow(new Object[]{UID, nameUser, addressUser, addressUser,tPUser,userName,passwordUser});
i++; 
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",
JOptionPane.ERROR_MESSAGE);
}
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
    }
}
