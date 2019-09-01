/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asian.paints;

import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;

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
     
   
    String sQLForAddSales="insert into salesdetails (sales_no,paint_sales_quantity,paint_product_no,cus_id)"
            + "values('"+lastOfSalesId+"','"+paintSalesQuantityForAddSalesInt+"','"+paintProductNoForAddSalesInt+"','"+cusIDForAddSalesInt+"')";
   
    new DBManager().dBManipulator(sQLForAddSales);
            
    salesAddFrameCahier.dispose();
    new SalesActionSelectionFrame().cashierSalesFrame();
    JOptionPane.showMessageDialog(new SalesActionSelectionFrame().salesActionSelectionFrameCashier,"Data has been successfully added");  
     }
    });
    }
}
