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
    static JFrame paintActionSelectionFrameManager = new JFrame("Asian paints stock");//creating Username Password frame and initializing it
    static JFrame paintActionSelectionFrameStockKeeper = new JFrame("Asian paints stock");//creating Username Password frame and initializing it
    static JFrame paintActionSelectionFrameCashier = new JFrame("Asian paints stock");//creating Username Password frame and initializing it
    
    static JButton addStock=new JButton("Add stock");  //creating and initilizing button
    static JButton updateStocks=new JButton("Update stock");  //creating and initilizing button
    static JButton deleteStock=new JButton("Delete stock");  //creating and initilizing button
    static JButton viewStocks=new JButton("View stocks");  //creating and initilizing button
    static JButton backFP=new JButton("Back");  //creating and initilizing button
    static Exit xFP=new Exit();
    
    public static void managersPaintFrame(){
    
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
          PaintUpdateIDCollectionFrame.managerPaintAddFrame();
    }  
    });
    
        deleteStock.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameManager.dispose();
           new PaintDeleteIDCollectionFrame();
           PaintDeleteIDCollectionFrame.managerPaintDeleteFrame();
    }  
    });
        
                viewStocks.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameManager.dispose();
           new PaintViewSelectionFrame();
           PaintViewSelectionFrame.managersPaintViewSelectionFrame();
    }  
    });
                
      backFP.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameManager.dispose();
       new MainFirstFrame();
       MainFirstFrame.managersMainFrame();
    }  
    });
    }
    public static void stockKeeperPaintFrame(){
    
    paintActionSelectionFrameStockKeeper.add(addStock);
    addStock.setBounds(130,100,100, 40);
    paintActionSelectionFrameStockKeeper.add(updateStocks);
    updateStocks.setBounds(130,150,100, 40);
    paintActionSelectionFrameStockKeeper.add(deleteStock);
    deleteStock.setBounds(130,200,100, 40);
    paintActionSelectionFrameStockKeeper.add(viewStocks);
    viewStocks.setBounds(130,250,100, 40);
    paintActionSelectionFrameStockKeeper.add(backFP);
    backFP.setBounds(50,300,100, 40);
    paintActionSelectionFrameStockKeeper.add(xFP.exit);
    xFP.exit.setBounds(250,300,95,30);//setBounds(int x axsis, int y axsis, int width, int height)
    
    paintActionSelectionFrameStockKeeper.setSize(400,500);//400 width and 500 height  
    paintActionSelectionFrameStockKeeper.setLayout(null);//using no layout managers  
    paintActionSelectionFrameStockKeeper.setVisible(true);//making the frame visible
    
    addStock.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameStockKeeper.dispose();
           new PaintAddFrame();
          PaintAddFrame.stockKeeperPaintAddFrame();
    }  
    });
    
    updateStocks.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameStockKeeper.dispose();
           new PaintUpdateIDCollectionFrame();
          PaintUpdateIDCollectionFrame.stockKeeperPaintAddFrame();
    }  
    });
    
        deleteStock.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameStockKeeper.dispose();
           new PaintDeleteIDCollectionFrame();
           PaintDeleteIDCollectionFrame.stockKeeperPaintDeleteFrame();
    }  
    });
        
                viewStocks.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameStockKeeper.dispose();
           new PaintViewSelectionFrame();
           PaintViewSelectionFrame.stockKeeperPaintViewSelectionFrame();
    }  
    });
                
      backFP.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameStockKeeper.dispose();
       new MainFirstFrame();
       MainFirstFrame.stockKeeperMainFrame();
    }  
    });
    }
    public static void cashierPaintFrame(){
    
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
           new PaintViewSelectionFrame();
           PaintViewSelectionFrame.cashierPaintViewSelectionFrame();
    }  
    });
    
    backFP.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintActionSelectionFrameCashier.dispose();
       new MainFirstFrame();
       MainFirstFrame.cashierMainFrame();
    }  
    });
    }
}
