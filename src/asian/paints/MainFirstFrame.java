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
     JFrame mainFirstFrameManager;//creating Username Password frame and initializing it
     JFrame mainFirstFrameStockKeeper;//creating Username Password frame and initializing it
     JFrame mainFirstFrameCashier;//creating Username Password frame and initializing it
    
     JButton userOptions=new JButton("User");  //creating and initilizing button
     JButton stocksOptions=new JButton("Stocks");  //creating and initilizing button
     JButton salesOptions=new JButton("Sales");  //creating and initilizing button
     JButton customersOptions=new JButton("Customers");  //creating and initilizing button
     JButton signOut=new JButton("Signout");  //creating and initilizing button
    static Exit xFM=new Exit();
    
    public void managersMainFrame(){
        mainFirstFrameManager = new JFrame("Asian paints");
        
        mainFirstFrameManager.add(signOut);
    signOut.setBounds(0,0,100, 40);
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
          new PaintActionSelectionFrame().managersPaintFrame();
    }  
    });  
    
    salesOptions.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        mainFirstFrameManager.dispose();
            new SalesActionSelectionFrame().managersSalesFrame();
    }  
    });  
    
    customersOptions.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        mainFirstFrameManager.dispose();
            new CustomerActionSelectionFrame().managersCustomerFrame();
    }  
    });  
    signOut.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        mainFirstFrameManager.dispose();
          new UserPass();
    }  
    });
    }
    public void stockKeeperMainFrame(){
        mainFirstFrameStockKeeper = new JFrame("Asian paints");
        
         mainFirstFrameStockKeeper.add(signOut);
    signOut.setBounds(0,0,100, 40);
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
          new PaintActionSelectionFrame().stockKeeperPaintFrame();
    }  
    });  
    signOut.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        mainFirstFrameStockKeeper.dispose();
          new UserPass();
    }  
    });
    }
    public void cashierMainFrame(){
        mainFirstFrameCashier = new JFrame("Asian paints");
        
           mainFirstFrameCashier.add(signOut);
    signOut.setBounds(0,0,100, 40);
        
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
         new PaintActionSelectionFrame().cashierPaintFrame();
    }  
    });
     
       salesOptions.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        mainFirstFrameCashier.dispose(); 
            new SalesActionSelectionFrame().cashierSalesFrame();
    }  
    });  
    
    customersOptions.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        mainFirstFrameCashier.dispose(); 
           new CustomerActionSelectionFrame().cashierCustomerFrame();
    }  
    });
    signOut.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        mainFirstFrameCashier.dispose();
          new UserPass();
    }  
    });
    }
     
}
