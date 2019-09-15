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
public class CustomerViewSelectionFrame {
      JFrame customerViewSelectionFrameManager=new JFrame("View customer");
     JFrame customerViewSelectionFrameCahsier=new JFrame("View customer");
    
     JTextField dataForSearchCustomer=new JTextField("Search by");
    
    static Exit xFCVS=new Exit(); 
     
    
     JButton backFCVSF=new JButton("Back");
     JButton viewAllCustomer=new JButton("View all");
     JButton viewCustomerBy=new JButton("Search");
    
    public void managersCustomerViewSelectionFrame(){
    customerViewSelectionFrameManager.add(viewAllCustomer);
    viewAllCustomer.setBounds(130,100,100, 40);
    customerViewSelectionFrameManager.add(dataForSearchCustomer);
    dataForSearchCustomer.setBounds(130,150,100, 40);
    customerViewSelectionFrameManager.add(viewCustomerBy);
    viewCustomerBy.setBounds(130,200,100, 40);
    customerViewSelectionFrameManager.add(backFCVSF);
    backFCVSF.setBounds(50,250,95,30);
    customerViewSelectionFrameManager.add(xFCVS.exit);
    xFCVS.exit.setBounds(250,250,95,30);
    
   customerViewSelectionFrameManager.setSize(500,500);  
    customerViewSelectionFrameManager.setLayout(null);  
    customerViewSelectionFrameManager.setVisible(true); 
    
    backFCVSF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerViewSelectionFrameManager.dispose();
        new CustomerActionSelectionFrame().managersCustomerFrame();
    }  
    });
    
    viewCustomerBy.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        String idOrName=dataForSearchCustomer.getText();
        
        new CustomerViewFrame().showCustomerTableData(InputIntOrString.checkInput(idOrName),idOrName);
    }  
    });
     
        viewAllCustomer.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
    new CustomerViewFrame().showCustomerTableData();
         
    }  
    });
    }
     
    public void cashiresCustomerViewSelectionFrame(){
    customerViewSelectionFrameCahsier.add(viewAllCustomer);
    viewAllCustomer.setBounds(130,100,100, 40); 
    customerViewSelectionFrameCahsier.add(dataForSearchCustomer);
    dataForSearchCustomer.setBounds(130,150,100, 40);
    customerViewSelectionFrameCahsier.add(viewCustomerBy);
    viewCustomerBy.setBounds(130,200,100, 40);
    customerViewSelectionFrameCahsier.add(backFCVSF);
    backFCVSF.setBounds(50,250,95,30);
    customerViewSelectionFrameCahsier.add(xFCVS.exit);
    xFCVS.exit.setBounds(250,250,95,30);
    
   customerViewSelectionFrameCahsier.setSize(500,500);  
    customerViewSelectionFrameCahsier.setLayout(null);  
    customerViewSelectionFrameCahsier.setVisible(true); 
    
    backFCVSF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerViewSelectionFrameCahsier.dispose();
        new CustomerActionSelectionFrame().cashierCustomerFrame();
    }  
    });
    
    viewCustomerBy.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        String idOrName=dataForSearchCustomer.getText();
        new CustomerViewFrame().showCustomerTableData(InputIntOrString.checkInput(idOrName),idOrName);
    }  
    });
     
        viewAllCustomer.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
    new CustomerViewFrame().showCustomerTableData();
         
    }  
    });
    }
}
