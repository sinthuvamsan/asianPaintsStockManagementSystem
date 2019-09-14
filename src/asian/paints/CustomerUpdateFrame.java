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
public class CustomerUpdateFrame {
       JFrame customerUpdateFrameManager;
     JFrame customerUpdateFrameCahier;
    
     JTextField cusIDForUpdate=new JTextField("ID");
     JTextField cusNameForUpdate=new JTextField("Name");
     JTextField cusAddressForUpdate=new JTextField("Address");
     JTextField cusTPNoForUpdate=new JTextField("TP number");
     JTextField cusTotalForUpdate=new JTextField("Total");
    
    static Exit xFCU=new Exit();
     
    JButton backFCUF=new JButton("Back");
    JButton updateCustomer=new JButton("Update");
  
   public void managersCustomerUpdateFrame(int managerCustomerUpdateID){
        customerUpdateFrameManager=new JFrame("Update customer");
        
    customerUpdateFrameManager.add(cusIDForUpdate);
    cusIDForUpdate.setBounds(130,100,100, 40);
    customerUpdateFrameManager.add(cusNameForUpdate);
    cusNameForUpdate.setBounds(130,150,100, 40);
    customerUpdateFrameManager.add(cusAddressForUpdate);
    cusAddressForUpdate.setBounds(130,200,100, 40);
    customerUpdateFrameManager.add(cusTPNoForUpdate);
    cusTPNoForUpdate.setBounds(130,250,100, 40);
    customerUpdateFrameManager.add(cusTotalForUpdate);
   cusTotalForUpdate.setBounds(130,300,100, 40);   
   customerUpdateFrameManager.add(updateCustomer);
   updateCustomer.setBounds(130,350,100, 40);
   customerUpdateFrameManager.add(backFCUF);
   backFCUF.setBounds(50,400,95,30);
   customerUpdateFrameManager.add(xFCU.exit);
   xFCU.exit.setBounds(250,400,95,30);
    
   customerUpdateFrameManager.setSize(500,500);  
    customerUpdateFrameManager.setLayout(null);  
    customerUpdateFrameManager.setVisible(true);  
   
       backFCUF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       customerUpdateFrameManager.dispose();
       CustomerUpdateIDCollectionFrame f1= new CustomerUpdateIDCollectionFrame();
         f1.UpdateIDCollectionFrameManager();
    }  
    });
    
    
    
        try{
     Connection con=new DBManager().getConnection();
    String sqlToViewUserToBeUpdated = "select * from customerDetails where cus_id = "+managerCustomerUpdateID;
    PreparedStatement ps = con.prepareStatement(sqlToViewUserToBeUpdated);
ResultSet rs = ps.executeQuery();
   if(rs.next()){
  cusIDForUpdate.setText(String.valueOf(rs.getInt("cus_ID")));
    cusNameForUpdate.setText(rs.getString("cus_name"));
     cusAddressForUpdate.setText(rs.getString("cus_address"));
     cusTPNoForUpdate.setText(String.valueOf(rs.getInt("cus_tp_no")));
     cusTotalForUpdate.setText(rs.getString("cus_total"));
   }
    }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    
   updateCustomer.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      int cusIDUpdateCustomerInt=Integer.parseInt(cusIDForUpdate.getText());
     String cusNameForUpdateCustomerString=cusNameForUpdate.getText();
      String cusAddressForUpdateCustomerString=cusAddressForUpdate.getText();
      int cusTPNoForUpdateCustomerInt=Integer.parseInt(cusTPNoForUpdate.getText());
     float  cusTotalForUpdateCustomerFloat=Float.parseFloat(cusTotalForUpdate.getText());
     
      
      String managerSQLToUpdateCustomer="update customerdetails set cus_id='"+cusIDUpdateCustomerInt+"' ,cus_name='"+cusNameForUpdateCustomerString+"' ,cus_address='"+cusAddressForUpdateCustomerString+"' ,cus_tp_no='"+cusTPNoForUpdateCustomerInt+"' ,cus_total='"+cusTotalForUpdateCustomerFloat+"'  where cus_id="+managerCustomerUpdateID;
      new DBManager().dBManipulator(managerSQLToUpdateCustomer);
    }  
    });
   }
   
    
   
    public void cashierCustomerUpdateFrame(int casierCustomerUpdateID){
        customerUpdateFrameCahier=new JFrame("Update customer");
        
    customerUpdateFrameCahier.add(cusIDForUpdate);
    cusIDForUpdate.setBounds(130,100,100, 40);
    customerUpdateFrameCahier.add(cusNameForUpdate);
    cusNameForUpdate.setBounds(130,150,100, 40);
    customerUpdateFrameCahier.add(cusAddressForUpdate);
    cusAddressForUpdate.setBounds(130,200,100, 40);
    customerUpdateFrameCahier.add(cusTPNoForUpdate);
    cusTPNoForUpdate.setBounds(130,250,100, 40);
    customerUpdateFrameCahier.add(cusTotalForUpdate);
    cusTotalForUpdate.setBounds(130,300,100, 40);
    customerUpdateFrameCahier.add(updateCustomer);
    updateCustomer.setBounds(250,350,100, 40);
    customerUpdateFrameCahier.add(backFCUF);
    backFCUF.setBounds(50,400,95,30);
    customerUpdateFrameCahier.add(xFCU.exit);
    xFCU.exit.setBounds(250,400,95,30);
    
    customerUpdateFrameCahier.setSize(500,500);  
    customerUpdateFrameCahier.setLayout(null);  
    customerUpdateFrameCahier.setVisible(true);  
    
        backFCUF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerUpdateFrameCahier.dispose();
        CustomerUpdateIDCollectionFrame f1= new CustomerUpdateIDCollectionFrame();
         f1.UpdateIDCollectionFrameCashier();
    }  
    });
        
            updateCustomer.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      int cusIDUpdateCustomerInt=Integer.parseInt(cusIDForUpdate.getText());
     String cusNameForUpdateCustomerString=cusNameForUpdate.getText();
      String cusAddressForUpdateCustomerString=cusAddressForUpdate.getText();
      int cusTPNoForUpdateCustomerInt=Integer.parseInt(cusTPNoForUpdate.getText());
     float  cusTotalForUpdateCustomerFloat=Float.parseFloat(cusTotalForUpdate.getText());
     
      
      String cashierSQLToUpdateCustomer="update customerdetails set cus_id='"+cusIDUpdateCustomerInt+"' ,cus_name='"+cusNameForUpdateCustomerString+"' ,cus_address='"+cusAddressForUpdateCustomerString+"' ,cus_tp_no='"+cusTPNoForUpdateCustomerInt+"' ,cus_total='"+cusTotalForUpdateCustomerFloat+"'  where cus_id="+casierCustomerUpdateID;
      new DBManager().dBManipulator(cashierSQLToUpdateCustomer);
    }  
    });
            
                try{
     Connection con=new DBManager().getConnection();
    String sqlToViewUserToBeUpdated = "select * from customerdetails where emp_ID = "+casierCustomerUpdateID;
    PreparedStatement ps = con.prepareStatement(sqlToViewUserToBeUpdated);
ResultSet rs = ps.executeQuery();
   if(rs.next()){
  cusIDForUpdate.setText(String.valueOf(rs.getInt("cus_id")));
    cusNameForUpdate.setText(rs.getString("cus_name"));
     cusAddressForUpdate.setText(rs.getString("cus_address"));
     cusTPNoForUpdate.setText(String.valueOf(rs.getInt("cus_tp_no")));
     cusTotalForUpdate.setText(rs.getString("cus_total"));
   }
    }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
