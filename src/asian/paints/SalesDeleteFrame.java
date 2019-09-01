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
public class SalesDeleteFrame {
    static JFrame salesDeleteFrameManager=new JFrame();
    static JTextField salesIDForDelete=new JTextField("Sales ID");
    
    static Exit xFSD=new Exit();
    
    static JButton backFSDF=new JButton("Back");  
    static JButton deleteSales=new JButton("Delete");
    
    SalesDeleteFrame(){  
    salesDeleteFrameManager.add(salesIDForDelete);
    salesIDForDelete.setBounds(130,100,100, 40);
    salesDeleteFrameManager.add(deleteSales);
    deleteSales.setBounds(250,150,100, 40);
    salesDeleteFrameManager.add(backFSDF);
    backFSDF.setBounds(50,400,95,30);
    salesDeleteFrameManager.add(xFSD.exit);
    xFSD.exit.setBounds(250,400,95,30);
    
    salesDeleteFrameManager.setSize(500,500);  
    salesDeleteFrameManager.setLayout(null);  
    salesDeleteFrameManager.setVisible(true); 
    
    backFSDF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        salesDeleteFrameManager.dispose();
           new SalesDeleteIDCollectionFrame();
    }  
    });
    }
}
