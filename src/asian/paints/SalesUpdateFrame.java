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
     
     updateSales.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      int salesNoForUpdateSalesInt=Integer.parseInt(salesNoForUpdateSales.getText());
      int paintSalesQuantityForUpdateSalesInt=Integer.parseInt(paintSalesQuantityForUpdateSales.getText());
      int paintProductNoForUpdateSalesInt=Integer.parseInt(paintProductNoForUpdateSales.getText());
      int cusIDForUpdateSalesInt=Integer.parseInt(cusIDForUpdateSales.getText());
      
      String sQLToUpdateUser="update salesdetails set sales_no='"+salesNoForUpdateSalesInt+"' ,paint_sales_quantity='"+paintSalesQuantityForUpdateSalesInt+"' ,paint_product_no='"+paintProductNoForUpdateSalesInt+"' ,cus_id='"+cusIDForUpdateSalesInt+"' where sales_no="+saleIDToBeUpdated;
      new DBManager().dBManipulator(sQLToUpdateUser);
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
   
    
   }
   //else{JOptionPane.showMessageDialog(userUpdateFrameManager,"Wrong ID"); }
    }catch(Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);}
     }
}
