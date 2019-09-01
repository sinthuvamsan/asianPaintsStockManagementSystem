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
public class MainFirstFrame{
    static JFrame mainFirstFrameManager = new JFrame("Asian paints");//creating Username Password frame and initializing it
    static JFrame mainFirstFrameStockKeeper = new JFrame("Asian paints");//creating Username Password frame and initializing it
    static JFrame mainFirstFrameCashier = new JFrame("Asian paints");//creating Username Password frame and initializing it
    
    static JButton userOptions=new JButton("User options");  //creating and initilizing button
    static JButton stocksOptions=new JButton("Stocks options");  //creating and initilizing button
    static JButton salesOptions=new JButton("Sales options");  //creating and initilizing button
    static JButton customersOptions=new JButton("Customers options");  //creating and initilizing button
    static Exit xFM=new Exit();
    
    public static void managersMainFrame(){
    mainFirstFrameManager.add(userOptions);
    userOptions.setBounds(130,100,100, 40);
    mainFirstFrameManager.add(stocksOptions);
    stocksOptions.setBounds(130,150,100, 40);
    mainFirstFrameManager.add(salesOptions);
    salesOptions.setBounds(130,200,100, 40);
    mainFirstFrameManager.add(customersOptions);
    customersOptions.setBounds(130,250,100, 40);
    mainFirstFrameManager.add(xFM.exit);
    xFM.exit.setBounds(250,300,95,30);//setBounds(int x axsis, int y axsis, int width, int height)
    
    mainFirstFrameManager.setSize(400,500);//400 width and 500 height  
    mainFirstFrameManager.setLayout(null);//using no layout managers  
    mainFirstFrameManager.setVisible(true);//making the frame visible
    
    userOptions.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        mainFirstFrameManager.dispose();
        new UserActionSelectionFrame();  
    }  
    });  
    
    stocksOptions.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
        mainFirstFrameManager.dispose();
          new PaintActionSelectionFrame();
          new PaintActionSelectionFrame().managersPaintFrame();
    }  
    });  
    
    salesOptions.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        mainFirstFrameManager.dispose();
            new SalesActionSelectionFrame();  
            new SalesActionSelectionFrame().managersSalesFrame();
    }  
    });  
    
    customersOptions.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        mainFirstFrameManager.dispose();
            new CustomerActionSelectionFrame(); 
            new CustomerActionSelectionFrame().managersCustomerFrame();
    }  
    });  
    }
    public static void stockKeeperMainFrame(){
    mainFirstFrameStockKeeper.add(stocksOptions);
    stocksOptions.setBounds(130,100,100, 40);
    mainFirstFrameStockKeeper.add(xFM.exit);
    xFM.exit.setBounds(250,150,95,30);//setBounds(int x axsis, int y axsis, int width, int height)
    
    mainFirstFrameStockKeeper.setSize(400,500);//400 width and 500 height  
    mainFirstFrameStockKeeper.setLayout(null);//using no layout managers  
    mainFirstFrameStockKeeper.setVisible(true);//making the frame visible
    
    stocksOptions.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        mainFirstFrameStockKeeper.dispose();
           new PaintActionSelectionFrame();
          new PaintActionSelectionFrame().stockKeeperPaintFrame();
    }  
    });  
    }
    public static void cashierMainFrame(){
    mainFirstFrameCashier.add(stocksOptions);
    stocksOptions.setBounds(130,100,100, 40);
    mainFirstFrameCashier.add(salesOptions);
    salesOptions.setBounds(130,150,100, 40);
    mainFirstFrameCashier.add(customersOptions);
    customersOptions.setBounds(130,200,100, 40);
    mainFirstFrameCashier.add(xFM.exit);
    xFM.exit.setBounds(250,250,95,30);//setBounds(int x axsis, int y axsis, int width, int height)
    
    mainFirstFrameCashier.setSize(400,500);//400 width and 500 height  
    mainFirstFrameCashier.setLayout(null);//using no layout managers  
    mainFirstFrameCashier.setVisible(true);//making the frame visible
    
     stocksOptions.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        mainFirstFrameCashier.dispose();
           new PaintActionSelectionFrame();
         new PaintActionSelectionFrame().cashierPaintFrame();
    }  
    });
     
       salesOptions.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        mainFirstFrameCashier.dispose();
            new SalesActionSelectionFrame();  
            new SalesActionSelectionFrame().cashierSalesFrame();
    }  
    });  
    
    customersOptions.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        mainFirstFrameCashier.dispose();
            new CustomerActionSelectionFrame(); 
           new CustomerActionSelectionFrame().cashierCustomerFrame();
    }  
    });
    
    }
     
}
