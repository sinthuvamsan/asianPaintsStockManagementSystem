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
    static JFrame salesDeleteFrameManager=new JFrame("Delete sales");
    
     JTextArea salesDetailsForDeleteUser=new JTextArea();
     JScrollPane scrollSD = new JScrollPane(salesDetailsForDeleteUser);
    
    static Exit xFSD=new Exit();
    
     JButton backFSDF=new JButton("Back");  
     JButton confirmDeleteSales=new JButton("Delete");
    
      int paintQuantity=0;
  float cTotal=0,pUnitPrice=0;
    int pPN=0;
    int cID=0;
      int pSalesQ=0;
  
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
 
 
    
    try
{ 
Connection con = DBManager.getConnection();

String sql = "select * from salesDetails where sales_no = "+salesIDToBeDeleted;
 sQLToDeleteUser="DELETE FROM salesDetails WHERE sales_no="+salesIDToBeDeleted;
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
//Statement stmt=con.createStatement();  ResultSet rs=stmt.executeQuery("select * from employeedetails where emp_name = "+idOrNameForUserSearch);    
int i =0;
if(rs.next())
{
sID = rs.getInt("sales_no");
pSalesQ=rs.getInt("paint_sales_quantity");
pPN=rs.getInt("paint_product_no");
cID=rs.getInt("cus_id");
    
String detailsOfSalesToBeDeleted="Sales No.: "+sID+"\n"+"Paint sales quantity: "+pSalesQ+"\n"+"Paint product No.: "+pPN+"\n"+"Customer ID: "+cID;

salesDetailsForDeleteUser.setText(detailsOfSalesToBeDeleted);
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
           
         try
{ 
Connection con = DBManager.getConnection();
      String queryForCustomerCheck ="SELECT * FROM customerDetails where cus_id="+cID;
      PreparedStatement ps = con.prepareStatement(queryForCustomerCheck);
ResultSet rs = ps.executeQuery();
        
if(rs.next())
{
cTotal=Float.parseFloat(rs.getString("cus_total"));
 
}
}catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
}
          try
{ 
Connection con = DBManager.getConnection();
      String queryForStockCheck ="SELECT * FROM paintDetails where paint_product_no="+pPN;
      PreparedStatement ps = con.prepareStatement(queryForStockCheck);
ResultSet rs = ps.executeQuery();
     
if(rs.next())
{
paintQuantity = rs.getInt("paint_stock_quantity");
pUnitPrice=Float.parseFloat(rs.getString("paint_unit_price"));

}

}catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
} 
          
          cTotal=cTotal-(pSalesQ*pUnitPrice);
          paintQuantity=paintQuantity+pSalesQ;
          
       String sQLToUpdateCustomerOnDeleteSales="update customerdetails set cus_total='"+cTotal+"' where cus_id="+cID;
      new DBManager().dBManipulator(sQLToUpdateCustomerOnDeleteSales);
      
       String sQLToUpdatePaintOnDeleteSales="update paintdetails set paint_stock_quantity='"+paintQuantity+"' where paint_product_no="+pPN;
      new DBManager().dBManipulator(sQLToUpdatePaintOnDeleteSales);
        
      new DBManager().dBManipulator(sQLToDeleteUser);
        salesDeleteFrameManager.dispose();
           new SalesActionSelectionFrame().managersSalesFrame();
           JOptionPane.showMessageDialog(new SalesActionSelectionFrame().salesActionSelectionFrameManager,"Sales successfully deleted");
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
