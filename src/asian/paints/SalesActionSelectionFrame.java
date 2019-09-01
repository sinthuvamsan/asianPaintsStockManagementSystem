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
public class SalesActionSelectionFrame{
    static JFrame salesActionSelectionFrameManager = new JFrame("Asian paints sales");//creating Username Password frame and initializing it
    static JFrame salesActionSelectionFrameCashier = new JFrame("Asian paints sales");//creating Username Password frame and initializing it
    
    static JButton addSale=new JButton("Add sale");  //creating and initilizing button
    static JButton updateSale=new JButton("Update sale");  //creating and initilizing button
    static JButton deleteSale=new JButton("Delete sale");  //creating and initilizing button
    static JButton viewSales=new JButton("View sales");  //creating and initilizing button 
    static JButton backFS=new JButton("Back");  //creating and initilizing button
    static Exit xFS=new Exit();

    
    public static void managersSalesFrame(){
    
    salesActionSelectionFrameManager.add(updateSale);
    updateSale.setBounds(130,100,100, 40);
    salesActionSelectionFrameManager.add(deleteSale);
    deleteSale.setBounds(130,150,100, 40);
    salesActionSelectionFrameManager.add(viewSales);
    viewSales.setBounds(130,200,100, 40);
    salesActionSelectionFrameManager.add(backFS);
    backFS.setBounds(50,250,100, 40);
    salesActionSelectionFrameManager.add(xFS.exit);
    xFS.exit.setBounds(250,250,95,30);//setBounds(int x axsis, int y axsis, int width, int height)
    
    salesActionSelectionFrameManager.setSize(400,500);//400 width and 500 height  
    salesActionSelectionFrameManager.setLayout(null);//using no layout managers  
    salesActionSelectionFrameManager.setVisible(true);//making the frame visible
    
    updateSale.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        salesActionSelectionFrameManager.dispose();
           new SalesUpdateIDCollectionFrame();
    }  
    });
    
        deleteSale.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        salesActionSelectionFrameManager.dispose();
           new SalesDeleteIDCollectionFrame();
    }  
    });
      
            viewSales.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        salesActionSelectionFrameManager.dispose();
           new SalesViewSelectionFrame();
    }  
    });
            
             backFS.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        salesActionSelectionFrameManager.dispose();
       MainFirstFrame.managersMainFrame();
    }  
    });
    }
    
   // public void stockKeeperSalesFrame(){}
    
    public static void cashierSalesFrame(){
    
    salesActionSelectionFrameCashier.add(addSale);
    addSale.setBounds(130,100,100, 40);
    salesActionSelectionFrameCashier.add(backFS);
    backFS.setBounds(50,150,100, 40);
    salesActionSelectionFrameCashier.add(xFS.exit);
    xFS.exit.setBounds(250,150,95,30);//setBounds(int x axsis, int y axsis, int width, int height)
    
    salesActionSelectionFrameCashier.setSize(400,500);//400 width and 500 height  
    salesActionSelectionFrameCashier.setLayout(null);//using no layout managers  
    salesActionSelectionFrameCashier.setVisible(true);//making the frame visible
    
        addSale.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        salesActionSelectionFrameCashier.dispose();
           new SalesAddFrame();
    }  
    });
    
    backFS.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        salesActionSelectionFrameCashier.dispose();
       MainFirstFrame.cashierMainFrame();
    }  
    });
}
}
