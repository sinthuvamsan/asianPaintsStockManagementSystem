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
public class PaintActionSelectionFrame{
     JFrame paintActionSelectionFrameManager = new JFrame("Asian paints stock");//creating Username Password frame and initializing it
     JFrame paintActionSelectionFrameStockKeeper = new JFrame("Asian paints stock");//creating Username Password frame and initializing it
     JFrame paintActionSelectionFrameCashier = new JFrame("Asian paints stock");//creating Username Password frame and initializing it
    
     JButton addStock=new JButton("Add");  //creating and initilizing button
     JButton updateStocks=new JButton("Update");  //creating and initilizing button
     JButton deleteStock=new JButton("Delete");  //creating and initilizing button
     JButton viewStocks=new JButton("View");  //creating and initilizing button
     JButton backFP=new JButton("Back");  //creating and initilizing button
     
    static Exit xFP=new Exit();
    
    public void managersPaintFrame(){
    
    paintActionSelectionFrameManager.add(updateStocks);
    updateStocks.setBounds(130,100,100, 40);
    paintActionSelectionFrameManager.add(deleteStock);
    deleteStock.setBounds(130,150,100, 40);
    paintActionSelectionFrameManager.add(viewStocks);
    viewStocks.setBounds(130,200,100, 40);
    paintActionSelectionFrameManager.add(backFP);
    backFP.setBounds(50,250,100, 40);
    paintActionSelectionFrameManager.add(xFP.exit);
    xFP.exit.setBounds(250,250,95,30);//setBounds(int x axsis, int y axsis, int width, int height)
    
    paintActionSelectionFrameManager.setSize(400,500);//400 width and 500 height  
    paintActionSelectionFrameManager.setLayout(null);//using no layout managers  
    paintActionSelectionFrameManager.setVisible(true);//making the frame visible
    
    updateStocks.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameManager.dispose();
           new PaintUpdateIDCollectionFrame();
          new PaintUpdateIDCollectionFrame().managerPaintupdateIDCollectionFrame();
    }  
    });
    
        deleteStock.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameManager.dispose();
           
          new PaintDeleteIDCollectionFrame();
    }  
    });
        
                viewStocks.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameManager.dispose();
          
          new PaintViewSelectionFrame().managersPaintViewSelectionFrame();
    }  
    });
                
      backFP.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameManager.dispose();
      
      new MainFirstFrame().managersMainFrame();
    }  
    });
    }
    public void stockKeeperPaintFrame(){
    
    paintActionSelectionFrameStockKeeper.add(addStock);
    addStock.setBounds(130,100,100, 40);
    paintActionSelectionFrameStockKeeper.add(updateStocks);
    updateStocks.setBounds(130,150,100, 40);
    paintActionSelectionFrameStockKeeper.add(viewStocks);
    viewStocks.setBounds(130,200,100, 40);
    paintActionSelectionFrameStockKeeper.add(backFP);
    backFP.setBounds(50,250,100, 40);
    paintActionSelectionFrameStockKeeper.add(xFP.exit);
    xFP.exit.setBounds(250,250,95,30);//setBounds(int x axsis, int y axsis, int width, int height)
    
    paintActionSelectionFrameStockKeeper.setSize(400,500);//400 width and 500 height  
    paintActionSelectionFrameStockKeeper.setLayout(null);//using no layout managers  
    paintActionSelectionFrameStockKeeper.setVisible(true);//making the frame visible
    
    addStock.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameStockKeeper.dispose();
       
         new PaintAddFrame().stockKeeperPaintAddFrame();
    }  
    });
    
    updateStocks.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameStockKeeper.dispose();
          
          new PaintUpdateIDCollectionFrame().stockKeeperPaintupdateIDCollectionFrame();
    }  
    });
    
        
                viewStocks.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameStockKeeper.dispose();
         
           new PaintViewSelectionFrame().stockKeeperPaintViewSelectionFrame();
    }  
    });
                
      backFP.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameStockKeeper.dispose();
   
      new MainFirstFrame().stockKeeperMainFrame();
    }  
    });
    }
    public void cashierPaintFrame(){
    
    paintActionSelectionFrameCashier.add(viewStocks);
    viewStocks.setBounds(130,100,100, 40);
    paintActionSelectionFrameCashier.add(backFP);
    backFP.setBounds(50,250,100, 40);
    paintActionSelectionFrameCashier.add(xFP.exit);
    xFP.exit.setBounds(250,250,95,30);//setBounds(int x axsis, int y axsis, int width, int height)
    
    paintActionSelectionFrameCashier.setSize(400,500);//400 width and 500 height  
    paintActionSelectionFrameCashier.setLayout(null);//using no layout managers  
    paintActionSelectionFrameCashier.setVisible(true);//making the frame visible
    
                viewStocks.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameCashier.dispose();
     
          new PaintViewSelectionFrame().cashierPaintViewSelectionFrame();
    }  
    });
    
    backFP.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameCashier.dispose();
     
      new MainFirstFrame().cashierMainFrame();
    }  
    });
    }
}
