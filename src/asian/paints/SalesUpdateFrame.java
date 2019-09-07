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
public class SalesUpdateFrame {
     JFrame salesUpdateFrameManager;
    
     JTextField salesNoForUpdateSales=new JTextField();
     JTextField paintSalesQuantityForUpdateSales=new JTextField();
     JTextField paintProductNoForUpdateSales=new JTextField();
     JTextField cusIDForUpdateSales=new JTextField();
     
     JLabel forSalesNoForUpdateSales=new JLabel("Sales no.");
     JLabel forPaintSalesQuantityForUpdateSales=new JLabel("Sales quantity");
     JLabel forPaintProductNoForUpdateSales=new JLabel("Paint product no.");
     JLabel forCusIDForUpdateSales=new JLabel("Customer ID");
    
    static Exit xFSU=new Exit();
     
     JButton backFSUF=new JButton("Back");
     JButton updateSales=new JButton("Update sales");
     
     int cID=0,newPaintQuantity=0;
  float cTotal=0,newPUnitPrice=0;
    boolean customerExistForUpdate=false,paintExistForUpdate=false;
    int paintSalesQuantityForUpdateSalesForCompare=0,cusIDForUpdateSalesForCompare=0,paintProductNoForUpdateSalesForCompare=0;
    int differenceInQuantity=0,differenceInCusTOtal=0;
    int oldPaintQuantity;
    float oldPUnitPrice,oldCTotal;
    
     SalesUpdateFrame(int saleIDToBeUpdated){
    salesUpdateFrameManager=new JFrame();
    
    salesUpdateFrameManager.add(forSalesNoForUpdateSales);
    forSalesNoForUpdateSales.setBounds(50,100,100, 40);
    salesUpdateFrameManager.add(forPaintSalesQuantityForUpdateSales);
    forPaintSalesQuantityForUpdateSales.setBounds(50,150,100, 40);
    salesUpdateFrameManager.add(forPaintProductNoForUpdateSales);
    forPaintProductNoForUpdateSales.setBounds(50,200,100, 40);
    salesUpdateFrameManager.add(forCusIDForUpdateSales);
    forCusIDForUpdateSales.setBounds(50,250,100, 40);   
    
    salesUpdateFrameManager.add(salesNoForUpdateSales);
    salesNoForUpdateSales.setBounds(130,100,100, 40);
    salesUpdateFrameManager.add(paintSalesQuantityForUpdateSales);
    paintSalesQuantityForUpdateSales.setBounds(130,150,100, 40);
    salesUpdateFrameManager.add(paintProductNoForUpdateSales);
    paintProductNoForUpdateSales.setBounds(130,200,100, 40);
    salesUpdateFrameManager.add(cusIDForUpdateSales);
    cusIDForUpdateSales.setBounds(130,250,100, 40);   
   salesUpdateFrameManager.add(updateSales);
   updateSales.setBounds(130,300,100, 40);
   salesUpdateFrameManager.add(backFSUF);
   backFSUF.setBounds(50,350,95,30);
   salesUpdateFrameManager.add(xFSU.exit);
   xFSU.exit.setBounds(250,350,95,30);
    
   salesUpdateFrameManager.setSize(500,500);  
    salesUpdateFrameManager.setLayout(null);  
    salesUpdateFrameManager.setVisible(true);  
   
     backFSUF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        salesUpdateFrameManager.dispose();
           new SalesUpdateIDCollectionFrame();
    }  
    });
     
      try{
     Connection con=new DBManager().getConnection();
    String sqlToViewUserToBeUpdated = "select * from salesdetails where sales_no = "+saleIDToBeUpdated;
    PreparedStatement ps = con.prepareStatement(sqlToViewUserToBeUpdated);
ResultSet rs = ps.executeQuery();
   if(rs.next()){
   salesNoForUpdateSales.setText(String.valueOf(rs.getInt("sales_no")));
   paintSalesQuantityForUpdateSales.setText(String.valueOf(rs.getInt("paint_sales_quantity")));
   paintProductNoForUpdateSales.setText(String.valueOf(rs.getInt("paint_product_no")));
   cusIDForUpdateSales.setText(String.valueOf(rs.getInt("cus_id")));
   
   cusIDForUpdateSalesForCompare=rs.getInt("cus_id");
   paintProductNoForUpdateSalesForCompare=rs.getInt("paint_product_no");
   paintSalesQuantityForUpdateSalesForCompare=rs.getInt("paint_sales_quantity");
    cusIDForUpdateSalesForCompare=rs.getInt("cus_id");
   }
   else{JOptionPane.showMessageDialog(salesUpdateFrameManager,"Wrong ID"); }
    }catch(Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);}
     
      
          try
{ 
Connection con = DBManager.getConnection();
      String queryForStockCheck ="SELECT * FROM paintDetails where paint_product_no="+paintProductNoForUpdateSalesForCompare;
      PreparedStatement ps = con.prepareStatement(queryForStockCheck);
ResultSet rs = ps.executeQuery();
     
if(rs.next())
{
oldPaintQuantity = rs.getInt("paint_stock_quantity");
oldPUnitPrice=Float.parseFloat(rs.getString("paint_unit_price"));
}
}catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
} 
          
                try
{ 
Connection con = DBManager.getConnection();
      String queryForCustomerCheck ="SELECT * FROM customerDetails where cus_id="+cusIDForUpdateSalesForCompare;
      PreparedStatement ps = con.prepareStatement(queryForCustomerCheck);
ResultSet rs = ps.executeQuery();
        
if(rs.next())
{
oldCTotal=Float.parseFloat(rs.getString("cus_total"));
}
}catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
}  
          
          
     updateSales.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      int salesNoForUpdateSalesInt=Integer.parseInt(salesNoForUpdateSales.getText());
      int paintSalesQuantityForUpdateSalesInt=Integer.parseInt(paintSalesQuantityForUpdateSales.getText());
      int paintProductNoForUpdateSalesInt=Integer.parseInt(paintProductNoForUpdateSales.getText());
      int cusIDForUpdateSalesInt=Integer.parseInt(cusIDForUpdateSales.getText());
      
        try
{ 
Connection con = DBManager.getConnection();
      String queryForCustomerCheck ="SELECT * FROM customerDetails where cus_id="+cusIDForUpdateSalesInt;
      PreparedStatement ps = con.prepareStatement(queryForCustomerCheck);
ResultSet rs = ps.executeQuery();
        
if(rs.next())
{
cTotal=Float.parseFloat(rs.getString("cus_total"));
customerExistForUpdate=true;
 
}
}catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
}
          try
{ 
Connection con = DBManager.getConnection();
      String queryForStockCheck ="SELECT * FROM paintDetails where paint_product_no="+paintProductNoForUpdateSalesInt;
      PreparedStatement ps = con.prepareStatement(queryForStockCheck);
ResultSet rs = ps.executeQuery();
     
if(rs.next())
{
newPaintQuantity = rs.getInt("paint_stock_quantity");
newPUnitPrice=Float.parseFloat(rs.getString("paint_unit_price"));
paintExistForUpdate=true;

}

}catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
} 

          if(cusIDForUpdateSalesForCompare==cusIDForUpdateSalesInt){
          oldCTotal=oldCTotal+(oldPaintQuantity*oldPUnitPrice);
          String sQLToUpdateCustomerInSales="update customerdetails set cus_total='"+oldCTotal+"' where sales_no="+cusIDForUpdateSalesInt;
      new DBManager().dBManipulator(sQLToUpdateCustomerInSales);
          }else{cTotal=cTotal+(oldPaintQuantity*oldPUnitPrice);
          String sQLToUpdateCustomerInSales="update customerdetails set cus_total='"+oldCTotal+"' where sales_no="+cusIDForUpdateSalesInt;
      new DBManager().dBManipulator(sQLToUpdateCustomerInSales);}
          
          
          
          
          
          if(customerExistForUpdate==true){
          if(paintExistForUpdate==true){
              
              if(paintProductNoForUpdateSalesForCompare==paintProductNoForUpdateSalesInt){
differenceInQuantity=paintSalesQuantityForUpdateSalesForCompare-paintSalesQuantityForUpdateSalesInt;

if(differenceInQuantity>oldPaintQuantity){
    JOptionPane.showMessageDialog(salesUpdateFrameManager,"The update is more than stock in hand");
}
else{
    oldPaintQuantity=oldPaintQuantity+differenceInQuantity;
    String sQLToUpdateOldPaintInSales="update paintdetails set paint_sales_quantity='"+oldPaintQuantity+"' where sales_no="+paintProductNoForUpdateSalesInt;
      new DBManager().dBManipulator(sQLToUpdateOldPaintInSales);
      
      if(cusIDForUpdateSalesForCompare==cusIDForUpdateSalesInt){
          oldCTotal=oldCTotal+(oldPaintQuantity*oldPUnitPrice);
          String sQLToUpdateCustomerInSales="update customerdetails set cus_total='"+oldCTotal+"' where sales_no="+cusIDForUpdateSalesInt;
      new DBManager().dBManipulator(sQLToUpdateCustomerInSales);
          }else{cTotal=cTotal+(oldPaintQuantity*oldPUnitPrice);
          String sQLToUpdateCustomerInSales="update customerdetails set cus_total='"+cTotal+"' where sales_no="+cusIDForUpdateSalesInt;
      new DBManager().dBManipulator(sQLToUpdateCustomerInSales);}
      
String sQLToUpdateSales="update salesdetails set sales_no='"+salesNoForUpdateSalesInt+"' ,paint_sales_quantity='"+paintSalesQuantityForUpdateSalesInt+"' ,paint_product_no='"+paintProductNoForUpdateSalesInt+"' ,cus_id='"+cusIDForUpdateSalesInt+"' where sales_no="+saleIDToBeUpdated;
      new DBManager().dBManipulator(sQLToUpdateSales);
}
}
              else{
            if(newPaintQuantity<paintSalesQuantityForUpdateSalesInt){ 
                JOptionPane.showMessageDialog(salesUpdateFrameManager,"The update is more than stock in hand"); 
            }
            else{ 
                newPaintQuantity=newPaintQuantity+ paintSalesQuantityForUpdateSalesInt;
       String sQLToUpdateNewPaintInSales="update paintdetails set paint_sales_quantity='"+newPaintQuantity+"' where sales_no="+paintProductNoForUpdateSalesInt;
      new DBManager().dBManipulator(sQLToUpdateNewPaintInSales);
      
      if(cusIDForUpdateSalesForCompare==cusIDForUpdateSalesInt){
          oldCTotal=oldCTotal+(newPaintQuantity*newPUnitPrice);
          String sQLToUpdateCustomerInSales="update customerdetails set cus_total='"+oldCTotal+"' where sales_no="+cusIDForUpdateSalesInt;
      new DBManager().dBManipulator(sQLToUpdateCustomerInSales);
          }else{cTotal=cTotal+(newPaintQuantity*newPUnitPrice);
          String sQLToUpdateCustomerInSales="update customerdetails set cus_total='"+cTotal+"' where sales_no="+cusIDForUpdateSalesInt;
      new DBManager().dBManipulator(sQLToUpdateCustomerInSales);}
      
      String sQLToUpdateSales="update salesdetails set sales_no='"+salesNoForUpdateSalesInt+"' ,paint_sales_quantity='"+paintSalesQuantityForUpdateSalesInt+"' ,paint_product_no='"+paintProductNoForUpdateSalesInt+"' ,cus_id='"+cusIDForUpdateSalesInt+"' where sales_no="+saleIDToBeUpdated;
      new DBManager().dBManipulator(sQLToUpdateSales);
}
          
          }
              
      
    salesUpdateFrameManager.dispose();
           new SalesActionSelectionFrame().managersSalesFrame();
             
          }else{JOptionPane.showMessageDialog(salesUpdateFrameManager,"Wrong paint ID");}
      }else{JOptionPane.showMessageDialog(salesUpdateFrameManager,"Wrong customer ID");}
    }  
    });
     
        
     }
}
