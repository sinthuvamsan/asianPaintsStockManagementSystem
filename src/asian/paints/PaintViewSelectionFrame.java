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
public class PaintViewSelectionFrame {
     JFrame paintViewSelectionFrameManager=new JFrame();
     JFrame paintViewSelectionFrameStockKeeper=new JFrame();
     JFrame paintViewSelectionFrameCahsier=new JFrame();
     
     JTextField dataForSearchPaint=new JTextField("Search by");
    
    static Exit xFPVS=new Exit();
    
     JLabel labelForSearchPaint=new JLabel("Search by"); 
    
     String searchPaintBy[]={"Product no.","Name","Colour"};        
     JComboBox paintSearchByCB=new JComboBox(searchPaintBy); 
    
     JButton backFPVSF=new JButton("Back");
     JButton viewAllPaint=new JButton("View all");
     JButton viewPaintBy=new JButton("Search");
    
    public void managersPaintViewSelectionFrame(){
    
     
    paintViewSelectionFrameManager.add(viewAllPaint);
    viewAllPaint.setBounds(130,100,100, 40);
    paintViewSelectionFrameManager.add(labelForSearchPaint);
    labelForSearchPaint.setBounds(50,150, 150,30);
    paintViewSelectionFrameManager.add(paintSearchByCB);
    paintSearchByCB.setBounds(130,150,90,20); 
    paintViewSelectionFrameManager.add(dataForSearchPaint);
    dataForSearchPaint.setBounds(130,200,100, 40);
    paintViewSelectionFrameManager.add(viewPaintBy);
    viewPaintBy.setBounds(130,250,100, 40);
    paintViewSelectionFrameManager.add(backFPVSF);
    backFPVSF.setBounds(50,300,95,30);
    paintViewSelectionFrameManager.add(xFPVS.exit);
    xFPVS.exit.setBounds(250,300,95,30);     
    
   paintViewSelectionFrameManager.setSize(500,500);  
    paintViewSelectionFrameManager.setLayout(null);  
    paintViewSelectionFrameManager.setVisible(true); 
    
    backFPVSF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintViewSelectionFrameManager.dispose();
          new PaintActionSelectionFrame().managersPaintFrame();
    }  
    });
    
      viewPaintBy.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        String idOrName=dataForSearchPaint.getText();
        new PaintViewFrame().showPaintTableData(InputIntOrString.checkInput(idOrName),idOrName);
    }  
    });
     
        viewAllPaint.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
    new PaintViewFrame().showPaintTableData();
         
    }  
    });
    }
     
    public void stockKeeperPaintViewSelectionFrame(){
    
     
    paintViewSelectionFrameStockKeeper.add(viewAllPaint);
    viewAllPaint.setBounds(130,100,100, 40);
    paintViewSelectionFrameStockKeeper.add(labelForSearchPaint);
    labelForSearchPaint.setBounds(50,150, 150,30);
    paintViewSelectionFrameStockKeeper.add(paintSearchByCB);
    paintSearchByCB.setBounds(130, 150,90,20);
    paintViewSelectionFrameStockKeeper.add(dataForSearchPaint);
    dataForSearchPaint.setBounds(130,200,100, 40);
    paintViewSelectionFrameStockKeeper.add(viewPaintBy);
    viewPaintBy.setBounds(130,250,100, 40);
    paintViewSelectionFrameStockKeeper.add(backFPVSF);
    backFPVSF.setBounds(50,300,95,30);
    paintViewSelectionFrameStockKeeper.add(xFPVS.exit);
    xFPVS.exit.setBounds(250,300,95,30);
    
   paintViewSelectionFrameStockKeeper.setSize(500,500);  
    paintViewSelectionFrameStockKeeper.setLayout(null);  
    paintViewSelectionFrameStockKeeper.setVisible(true); 
    
    backFPVSF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintViewSelectionFrameStockKeeper.dispose();
          new PaintActionSelectionFrame().stockKeeperPaintFrame();
    }  
    });
        
          viewPaintBy.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        String idOrName=dataForSearchPaint.getText();
        new PaintViewFrame().showPaintTableData(InputIntOrString.checkInput(idOrName),idOrName);
    }  
    });
     
        viewAllPaint.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
    new PaintViewFrame().showPaintTableData();
         
    }  
    });
    }
    
    public void cashierPaintViewSelectionFrame(){
    
     
    paintViewSelectionFrameCahsier.add(viewAllPaint);
    viewAllPaint.setBounds(130,100,100, 40);
    paintViewSelectionFrameCahsier.add(labelForSearchPaint);
    labelForSearchPaint.setBounds(50,150, 150,30);
    paintViewSelectionFrameCahsier.add(paintSearchByCB);
    paintSearchByCB.setBounds(130, 150,90,20);
    paintViewSelectionFrameCahsier.add(dataForSearchPaint);
    dataForSearchPaint.setBounds(130,200,100, 40);
    paintViewSelectionFrameCahsier.add(viewPaintBy);
    viewPaintBy.setBounds(130,250,100, 40);
    paintViewSelectionFrameCahsier.add(backFPVSF);
    backFPVSF.setBounds(50,300,95,30);
    paintViewSelectionFrameCahsier.add(xFPVS.exit);
    xFPVS.exit.setBounds(250,300,95,30);
    
   paintViewSelectionFrameCahsier.setSize(500,500);  
    paintViewSelectionFrameCahsier.setLayout(null);  
    paintViewSelectionFrameCahsier.setVisible(true); 
    
    backFPVSF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintViewSelectionFrameCahsier.dispose();
          new PaintActionSelectionFrame().cashierPaintFrame();
    }  
    });
    
          viewPaintBy.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        String idOrName=dataForSearchPaint.getText();
        new PaintViewFrame().showPaintTableData(InputIntOrString.checkInput(idOrName),idOrName);
    }  
    });
     
        viewAllPaint.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
    new PaintViewFrame().showPaintTableData();
         
    }  
    });
    }
}
