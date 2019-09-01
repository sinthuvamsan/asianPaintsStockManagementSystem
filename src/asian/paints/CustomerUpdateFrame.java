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
public class CustomerUpdateFrame {
      static JFrame customerUpdateFrameManager=new JFrame();
    static JFrame customerUpdateFrameCahier=new JFrame();
    
    static JTextField cusIDForAddOrUpdate=new JTextField("Customer ID");
    static JTextField cusNameForAddOrUpdate=new JTextField("Customer name");
    static JTextField cusAddressForAddOrUpdate=new JTextField("Customer address");
    static JTextField cusTPNoForAddOrUpdate=new JTextField("Customer TP number");
    static JTextField cusTotalForAddOrUpdate=new JTextField("Customer total");
    
    static Exit xFCU=new Exit();
     
    static JButton backFCUF=new JButton("Back");
    static JButton updateCustomer=new JButton("Update customer");
   
   public static void managersCustomerUpdateFrame(){
    customerUpdateFrameManager.add(cusIDForAddOrUpdate);
    cusIDForAddOrUpdate.setBounds(130,100,100, 40);
    customerUpdateFrameManager.add(cusNameForAddOrUpdate);
    cusNameForAddOrUpdate.setBounds(130,150,100, 40);
    customerUpdateFrameManager.add(cusAddressForAddOrUpdate);
    cusAddressForAddOrUpdate.setBounds(130,200,100, 40);
    customerUpdateFrameManager.add(cusTPNoForAddOrUpdate);
    cusTPNoForAddOrUpdate.setBounds(130,250,100, 40);
    customerUpdateFrameManager.add(cusTotalForAddOrUpdate);
    cusTotalForAddOrUpdate.setBounds(130,300,100, 40);   
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
         CustomerUpdateIDCollectionFrame.UpdateIDCollectionFrameManager();
    }  
    });
   }
    //public void stockKeeperCustomerAddAndUpdateFrame(){}
   
    public static void cashierCustomerAddAndUpdateFrame(){
    customerUpdateFrameCahier.add(cusIDForAddOrUpdate);
    cusIDForAddOrUpdate.setBounds(130,100,100, 40);
    customerUpdateFrameCahier.add(cusNameForAddOrUpdate);
    cusNameForAddOrUpdate.setBounds(130,150,100, 40);
    customerUpdateFrameCahier.add(cusAddressForAddOrUpdate);
    cusAddressForAddOrUpdate.setBounds(130,200,100, 40);
    customerUpdateFrameCahier.add(cusTPNoForAddOrUpdate);
    cusTPNoForAddOrUpdate.setBounds(130,250,100, 40);
    customerUpdateFrameCahier.add(cusTotalForAddOrUpdate);
    cusTotalForAddOrUpdate.setBounds(130,300,100, 40);
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
         CustomerUpdateIDCollectionFrame.UpdateIDCollectionFrameCashier();
    }  
    });
    }
}
