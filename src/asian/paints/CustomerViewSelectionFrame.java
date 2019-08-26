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
    static  JFrame customerViewSelectionFrameManager=new JFrame();
    static JFrame customerViewSelectionFrameCahsier=new JFrame();
    
    static JTextField dataForSearchCustomer=new JTextField("Search by");
    
    static Exit xFCVS=new Exit();
    
    static JLabel labelForSearchCustomer=new JLabel("Search by:"); 
    
    static String searchCustomerBy[]={"Cus ID","Name"};        
    static JComboBox customerSearchByCB=new JComboBox(searchCustomerBy); 
    
    static JButton backFCVSF=new JButton("Back");
    static JButton viewAllCustomer=new JButton("View all");
    static JButton viewCustomerBy=new JButton("Search");
    
    public static void managersCustomerViewSelectionFrame(){
    customerViewSelectionFrameManager.add(viewAllCustomer);
    viewAllCustomer.setBounds(130,100,100, 40);
    customerViewSelectionFrameManager.add(labelForSearchCustomer);
    labelForSearchCustomer.setBounds(50,150, 150,30);
    customerViewSelectionFrameManager.add(customerSearchByCB);
    customerSearchByCB.setBounds(130,150,90,20); 
    customerViewSelectionFrameManager.add(dataForSearchCustomer);
    dataForSearchCustomer.setBounds(130,200,100, 40);
    customerViewSelectionFrameManager.add(viewCustomerBy);
    viewCustomerBy.setBounds(130,250,100, 40);
    customerViewSelectionFrameManager.add(backFCVSF);
    backFCVSF.setBounds(50,300,95,30);
    customerViewSelectionFrameManager.add(xFCVS.exit);
    xFCVS.exit.setBounds(250,300,95,30);
    
   customerViewSelectionFrameManager.setSize(500,500);  
    customerViewSelectionFrameManager.setLayout(null);  
    customerViewSelectionFrameManager.setVisible(true); 
    }
     
    public static void cashiresCustomerViewSelectionFrame(){
    customerViewSelectionFrameCahsier.add(viewAllCustomer);
    viewAllCustomer.setBounds(130,100,100, 40);
    customerViewSelectionFrameCahsier.add(labelForSearchCustomer);
    labelForSearchCustomer.setBounds(50,150, 150,30);
    customerViewSelectionFrameCahsier.add(customerSearchByCB);
    customerSearchByCB.setBounds(130,150,90,20); 
    customerViewSelectionFrameCahsier.add(dataForSearchCustomer);
    dataForSearchCustomer.setBounds(130,200,100, 40);
    customerViewSelectionFrameCahsier.add(viewCustomerBy);
    viewCustomerBy.setBounds(130,250,100, 40);
    customerViewSelectionFrameCahsier.add(backFCVSF);
    backFCVSF.setBounds(50,300,95,30);
    customerViewSelectionFrameCahsier.add(xFCVS.exit);
    xFCVS.exit.setBounds(250,300,95,30);
    
   customerViewSelectionFrameCahsier.setSize(500,500);  
    customerViewSelectionFrameCahsier.setLayout(null);  
    customerViewSelectionFrameCahsier.setVisible(true); 
    }
}
