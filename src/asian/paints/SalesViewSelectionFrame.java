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
public class SalesViewSelectionFrame {
    static JFrame salesViewSelectionFrameManager=new JFrame();
     
    static JTextField dataForSearchSales=new JTextField("Search by");
    
    static Exit xFSVS=new Exit();
    
    static JLabel labelForSearchSales=new JLabel("Search by:"); 
    
    static String searchSalesBy[]={"Cus ID","Name"};        
    static JComboBox salesSearchByCB=new JComboBox(searchSalesBy); 
    
    static JButton backFSVSF=new JButton("Back");
    static JButton viewAllSales=new JButton("View all");
    static JButton viewSalesBy=new JButton("Search");
    
    SalesViewSelectionFrame(){
    
     
    salesViewSelectionFrameManager.add(viewAllSales);
    viewAllSales.setBounds(130,100,100, 40);
    salesViewSelectionFrameManager.add(labelForSearchSales);
    labelForSearchSales.setBounds(50,150, 150,30);
    salesViewSelectionFrameManager.add(salesSearchByCB);
    salesSearchByCB.setBounds(130,150,90,20); 
    salesViewSelectionFrameManager.add(dataForSearchSales);
    dataForSearchSales.setBounds(130,200,100, 40);
    salesViewSelectionFrameManager.add(viewSalesBy);
    viewSalesBy.setBounds(130,250,100, 40);
    salesViewSelectionFrameManager.add(backFSVSF);
    backFSVSF.setBounds(50,300,95,30);
    salesViewSelectionFrameManager.add(xFSVS.exit);
    xFSVS.exit.setBounds(250,300,95,30);
    
   salesViewSelectionFrameManager.setSize(500,500);  
    salesViewSelectionFrameManager.setLayout(null);  
    salesViewSelectionFrameManager.setVisible(true); 
    
    backFSVSF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        salesViewSelectionFrameManager.dispose();
           SalesActionSelectionFrame.managersSalesFrame();
    }  
    });
    }
     
}