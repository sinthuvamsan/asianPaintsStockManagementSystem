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
   
    static JFrame customerAddFrameCahier=new JFrame();
    
    static JTextField cusIDForAdd=new JTextField("Customer ID");
    static JTextField cusNameForAdd=new JTextField("Customer name");
    static JTextField cusAddressForAdd=new JTextField("Customer address");
    static JTextField cusTPNoForAdd=new JTextField("Customer TP number");
    static JTextField cusTotalForAdd=new JTextField("Customer total");
    
    static Exit xFCAU=new Exit();
     
    static JButton backFCAF=new JButton("Back");
    static JButton addCustomer=new JButton("Add customer");
   
   
   //public static void managersCustomerAddAndUpdateFrame(){}
    //public void stockKeeperCustomerAddAndUpdateFrame(){}
   
    public static void cashierCustomerAddFrame(){
    customerAddFrameCahier.add(cusIDForAdd);
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
          CustomerActionSelectionFrame.cashierCustomerFrame();
    }  
    });
    
    addCustomer.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        

        String query ="SELECT * FROM customerdetails ORDER BY emp_id DESC LIMIT 1;";
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
    new CustomerActionSelectionFrame();
    CustomerActionSelectionFrame.cashierCustomerFrame();
    JOptionPane.showMessageDialog(UserActionSelectionFrame.userActionSelectionFrame,"Data has been successfully added");  
   
    
            }
    });

    }
}
