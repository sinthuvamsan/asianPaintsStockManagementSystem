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
 * @author Sinthuvamsan
 */
public class CustomerAddFrame {
   
     JFrame customerAddFrameCahier;
    
     JTextField cusIDForAdd=new JTextField("ID");
     JTextField cusNameForAdd=new JTextField("Name");
     JTextField cusAddressForAdd=new JTextField("Address");
     JTextField cusTPNoForAdd=new JTextField("TP number");
     JTextField cusTotalForAdd=new JTextField("Total");
    
    static Exit xFCAU=new Exit();
     
     JButton backFCAF=new JButton("Back");
     JButton addCustomer=new JButton("Add");
   
   
   //public static void managersCustomerAddAndUpdateFrame(){}
    //public void stockKeeperCustomerAddAndUpdateFrame(){}
   
    CustomerAddFrame(){
        customerAddFrameCahier=new JFrame("Add customer");
        
    //customerAddFrameCahier.add(cusIDForAdd);
    cusIDForAdd.setBounds(130,100,100, 40);
    customerAddFrameCahier.add(cusNameForAdd);
    cusNameForAdd.setBounds(130,150,100, 40);
    customerAddFrameCahier.add(cusAddressForAdd);
    cusAddressForAdd.setBounds(130,200,100, 40);
    customerAddFrameCahier.add(cusTPNoForAdd);
    cusTPNoForAdd.setBounds(130,250,100, 40);
    customerAddFrameCahier.add(cusTotalForAdd);
    cusTotalForAdd.setBounds(130,300,100, 40);   
    customerAddFrameCahier.add(addCustomer);
    addCustomer.setBounds(50,350,100, 40);
    customerAddFrameCahier.add(backFCAF);
    backFCAF.setBounds(50,400,95,30);
    customerAddFrameCahier.add(xFCAU.exit);
    xFCAU.exit.setBounds(250,400,95,30);
    
    customerAddFrameCahier.setSize(500,500);  
    customerAddFrameCahier.setLayout(null);  
    customerAddFrameCahier.setVisible(true);  
   
    backFCAF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerAddFrameCahier.dispose();
         new CustomerActionSelectionFrame().cashierCustomerFrame();
    }  
    });
    
    addCustomer.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        

        String query ="SELECT * FROM customerdetails ORDER BY cus_id DESC LIMIT 1;";
        String colName="cus_id";
int lastOfCusId = DBManager.lastID(query,colName);

  lastOfCusId++;
    String cusNameForAddString=cusNameForAdd.getText();
    String cusAddressForAddString=cusAddressForAdd.getText();
    int cusTPNoForAddInt=Integer.parseInt(cusTPNoForAdd.getText());
    float cusTotalForAddFloat=Float.parseFloat(cusTotalForAdd.getText());
    
    String sQLForAddCus="insert into customerdetails (cus_id,cus_name,cus_address,cus_tp_no,cus_total)"
            + "values('"+lastOfCusId+"','"+cusNameForAddString+"','"+cusAddressForAddString+"','"+cusTPNoForAddInt+"','"+cusTotalForAddFloat+"')";
   
    new DBManager().dBManipulator(sQLForAddCus);
            
    customerAddFrameCahier.dispose();
    new CustomerActionSelectionFrame().cashierCustomerFrame();
    JOptionPane.showMessageDialog(new CustomerActionSelectionFrame().customerActionSelectionFrameCashier,"Data has been successfully added");  
   
    
            }
    });

    }
}
