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
public class SalesAddFrame {
    
     JFrame salesAddFrameCahier;
    
     JTextField salesNoForAddSales=new JTextField("Sales no.");
     JTextField paintSalesQuantityForAddSales=new JTextField("Sales quantity");
     JTextField paintProductNoForAddSales=new JTextField("Product no.");
     JTextField cusIDForAddSales=new JTextField("Customer ID");
    
    static Exit xFSA=new Exit();
     
     JButton backFSAF=new JButton("Back");
     JButton addSales=new JButton("Add sales");
   
  int cID=0,paintQuantity=0;
  float cTotal=0,pUnitPrice=0;
  boolean customerExistForSales=false,paintExistForSales=false;
    //public void stockKeeperCustomerAddAndUpdateFrame(){}
   
    SalesAddFrame(){
    salesAddFrameCahier=new JFrame();
        
    salesAddFrameCahier.add(salesNoForAddSales);
    salesNoForAddSales.setBounds(130,100,100, 40);
    salesAddFrameCahier.add(paintSalesQuantityForAddSales);
    paintSalesQuantityForAddSales.setBounds(130,150,100, 40);
    salesAddFrameCahier.add(paintProductNoForAddSales);
    paintProductNoForAddSales.setBounds(130,200,100, 40);
    salesAddFrameCahier.add(cusIDForAddSales);
    cusIDForAddSales.setBounds(130,250,100, 40);  
    salesAddFrameCahier.add(addSales);
    addSales.setBounds(50,300,100, 40);
    salesAddFrameCahier.add(backFSAF);
    backFSAF.setBounds(50,350,95,30);
    salesAddFrameCahier.add(xFSA.exit);
    xFSA.exit.setBounds(250,350,95,30);
    
    salesAddFrameCahier.setSize(500,500);  
    salesAddFrameCahier.setLayout(null);  
    salesAddFrameCahier.setVisible(true);  
    
    backFSAF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        salesAddFrameCahier.dispose();
         
           new SalesActionSelectionFrame().cashierSalesFrame();
    }  
    });
    
    addSales.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        

        String query ="SELECT * FROM salesdetails ORDER BY emp_id DESC LIMIT 1;";
        String colName="sales_no";
int lastOfSalesId = DBManager.lastID(query,colName);

  lastOfSalesId++;
  
   int paintSalesQuantityForAddSalesInt=Integer.parseInt(paintSalesQuantityForAddSales.getText());
    int paintProductNoForAddSalesInt=Integer.parseInt(paintProductNoForAddSales.getText());
     int cusIDForAddSalesInt=Integer.parseInt(cusIDForAddSales.getText());
     
       try
{ 
Connection con = DBManager.getConnection();
      String queryForCustomerCheck ="SELECT * FROM customerDetails where cus_id="+cusIDForAddSalesInt;
      PreparedStatement ps = con.prepareStatement(queryForCustomerCheck);
ResultSet rs = ps.executeQuery();
        
if(rs.next())
{
cTotal=Float.parseFloat(rs.getString("cus_total"));
customerExistForSales=true;
 
}
}catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
}
          try
{ 
Connection con = DBManager.getConnection();
      String queryForStockCheck ="SELECT * FROM paintDetails where paint_product_no="+paintProductNoForAddSalesInt;
      PreparedStatement ps = con.prepareStatement(queryForStockCheck);
ResultSet rs = ps.executeQuery();
     
if(rs.next())
{
paintQuantity = rs.getInt("paint_stock_quantity");
pUnitPrice=Float.parseFloat(rs.getString("paint_unit_price"));
paintExistForSales=true;

}

}catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
} 
       
     if(customerExistForSales==true){
         if(paintExistForSales==true){
           if(paintQuantity<paintSalesQuantityForAddSalesInt){
   cTotal=cTotal+(paintSalesQuantityForAddSalesInt*pUnitPrice);
   paintQuantity=paintQuantity-paintSalesQuantityForAddSalesInt;
    String sQLForAddSales="insert into salesdetails (sales_no,paint_sales_quantity,paint_product_no,cus_id)"
            + "values('"+lastOfSalesId+"','"+paintSalesQuantityForAddSalesInt+"','"+paintProductNoForAddSalesInt+"','"+cusIDForAddSalesInt+"')";
   new DBManager().dBManipulator(sQLForAddSales);
   
     String sQLToUpdateCustomerInSales="update customerdetails set cus_total='"+cTotal+"' where sales_no="+cusIDForAddSalesInt;
      new DBManager().dBManipulator(sQLToUpdateCustomerInSales);
      
       String sQLToUpdatePaintInSales="update paintdetails set paint_sales_quantity='"+paintQuantity+"' where sales_no="+paintProductNoForAddSalesInt;
      new DBManager().dBManipulator(sQLToUpdatePaintInSales);
   
    salesAddFrameCahier.dispose();
    new SalesActionSelectionFrame().cashierSalesFrame();
    JOptionPane.showMessageDialog(new SalesActionSelectionFrame().salesActionSelectionFrameCashier,"Data has been successfully added");  
           }else{JOptionPane.showMessageDialog(salesAddFrameCahier,"That sales amount is mothan we have in stock");}
         }else{JOptionPane.showMessageDialog(salesAddFrameCahier,"Wrong paint ID");}
     }else{
     JOptionPane.showMessageDialog(salesAddFrameCahier,"Wrong customer ID");
     }
     
       
    }
    });
    }
           
}
