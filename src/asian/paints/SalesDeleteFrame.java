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
public class SalesDeleteFrame {
    static JFrame salesDeleteFrameManager=new JFrame();
    
     JTextArea salesDetailsForDeleteUser=new JTextArea();
     JScrollPane scrollSD = new JScrollPane(salesDetailsForDeleteUser);
    
    static Exit xFSD=new Exit();
    
    static JButton backFSDF=new JButton("Back");  
    static JButton confirmDeleteSales=new JButton("Delete");
    
     String sQLToDeleteUser="Error";
     
    SalesDeleteFrame(int salesIDToBeDeleted){
       
        salesDeleteFrameManager.add(scrollSD);       
scrollSD.setBounds(20, 20, 300, 300);
    salesDeleteFrameManager.add(confirmDeleteSales);
    confirmDeleteSales.setBounds(250,350,100, 40);
    salesDeleteFrameManager.add(backFSDF);
    backFSDF.setBounds(50,400,95,30);
    salesDeleteFrameManager.add(xFSD.exit);
    xFSD.exit.setBounds(250,400,95,30);
    
    salesDeleteFrameManager.setSize(500,500);  
    salesDeleteFrameManager.setLayout(null);  
    salesDeleteFrameManager.setVisible(true); 
    
            int sID=salesIDToBeDeleted;
   int pSQ=0;
   int pPN=0;
    int cID=0;
    
    try
{ 
Connection con = DBManager.getConnection();

String sql = "select * from employeedetails where emp_ID = "+salesIDToBeDeleted;
 sQLToDeleteUser="DELETE FROM employeeDetails WHERE emp_id="+salesIDToBeDeleted;
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
//Statement stmt=con.createStatement();  ResultSet rs=stmt.executeQuery("select * from employeedetails where emp_name = "+idOrNameForUserSearch);    
int i =0;
if(rs.next())
{
sID = rs.getInt("sales_no");
pSQ=rs.getInt("paint_sales_quantity");
pPN=rs.getInt("paint_product_no");
cID=rs.getInt("cus_id");
    
String detailsOfUserToBeDeleted="Sales No.: "+sID+"\n"+"Paint sales quantity: "+pSQ+"\n"+"Paint product No.: "+pPN+"\n"+"Customer ID: "+cID;

salesDetailsForDeleteUser.setText(detailsOfUserToBeDeleted);
i++; 
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",
JOptionPane.ERROR_MESSAGE);
}
else
{
    JOptionPane.showMessageDialog(salesDeleteFrameManager,i+" Records found to be deleted"); 
}

}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
}
    confirmDeleteSales.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        new DBManager().dBManipulator(sQLToDeleteUser);
        salesDeleteFrameManager.dispose();
           new SalesActionSelectionFrame().managersSalesFrame();
    }  
    });
    
    backFSDF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        salesDeleteFrameManager.dispose();
           new SalesDeleteIDCollectionFrame();
    }  
    });
    }
}
