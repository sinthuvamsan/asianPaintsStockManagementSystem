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
public class PaintAddFrame {
     JFrame paintAddFrameManager=new JFrame();
     JFrame paintAddFrameStockKeeper=new JFrame();
    
     JTextField paintProductNoForAdd=new JTextField("Paint product no.");
     JTextField paintModelNameForAdd=new JTextField("Paint model name");
     JTextField paintColourForAdd=new JTextField("Paint colour");
     JTextField paintUnitPriceForAdd=new JTextField("Paint unit price");
     JTextField paintStockQuantityForAdd=new JTextField("Paint stock quantity");
    
    static Exit xFPA=new Exit();
     
     JButton backFPAF=new JButton("Back");
     JButton addPaint=new JButton("Add paint");
   
    
    public void managerPaintAddFrame(){
    
    
    paintAddFrameManager.add(paintProductNoForAdd);
    paintProductNoForAdd.setBounds(130,100,100, 40);
    paintAddFrameManager.add(paintModelNameForAdd);
    paintModelNameForAdd.setBounds(130,150,100, 40);
    paintAddFrameManager.add(paintColourForAdd);
    paintColourForAdd.setBounds(130,200,100, 40);
    paintAddFrameManager.add(paintUnitPriceForAdd);
    paintUnitPriceForAdd.setBounds(130,250,100, 40);
    paintAddFrameManager.add(paintStockQuantityForAdd);
    paintStockQuantityForAdd.setBounds(130,300,100, 40); 
        paintAddFrameManager.add(addPaint);
    addPaint.setBounds(50,350,100, 40);
   paintAddFrameManager.add(backFPAF);
   backFPAF.setBounds(50,400,95,30);
   paintAddFrameManager.add(xFPA.exit);
   xFPA.exit.setBounds(250,400,95,30);
   
   paintAddFrameManager.setSize(500,500);  
    paintAddFrameManager.setLayout(null);  
    paintAddFrameManager.setVisible(true);  
    
    backFPAF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintAddFrameManager.dispose();
           PaintActionSelectionFrame.managersPaintFrame();
    }  
    });
    
    addPaint.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       
    int paintProductNoForAddInt=Integer.parseInt(paintProductNoForAdd.getText());
    String paintModelNameForAddString=paintModelNameForAdd.getText();
    String paintColourForAddString=paintColourForAdd.getText();
    float paintUnitPriceForAddFloat=Float.parseFloat(paintUnitPriceForAdd.getText());
    int paintStockQuantityForAddInt=Integer.parseInt(paintStockQuantityForAdd.getText());

    String sQLForAddPaintM="insert into paintdetails (paint_product_no,paint_model_name,paint_colour,paint_unit_price,paint_stock_quantity)"
            + "values('"+paintProductNoForAddInt+"','"+paintModelNameForAddString+"','"+paintColourForAddString+"','"+paintUnitPriceForAddFloat+"','"+paintStockQuantityForAddInt+"')";
   
    new DBManager().dBManipulator(sQLForAddPaintM);
            
    paintAddFrameManager.dispose();
    new PaintActionSelectionFrame();
    PaintActionSelectionFrame.managersPaintFrame();
    JOptionPane.showMessageDialog(PaintActionSelectionFrame.paintActionSelectionFrameManager,"Data has been successfully added");  
            }
    });
    }
    
    public void stockKeeperPaintAddFrame(){
    
    
    paintAddFrameStockKeeper.add(paintProductNoForAdd);
    paintProductNoForAdd.setBounds(130,100,100, 40);
    paintAddFrameStockKeeper.add(paintModelNameForAdd);
    paintModelNameForAdd.setBounds(130,150,100, 40);
    paintAddFrameStockKeeper.add(paintColourForAdd);
    paintColourForAdd.setBounds(130,200,100, 40);
    paintAddFrameStockKeeper.add(paintUnitPriceForAdd);
    paintUnitPriceForAdd.setBounds(130,250,100, 40);
    paintAddFrameStockKeeper.add(paintStockQuantityForAdd);
    paintStockQuantityForAdd.setBounds(130,300,100, 40);   
    paintAddFrameStockKeeper.add(addPaint);
    addPaint.setBounds(50,350,100, 40);
   paintAddFrameStockKeeper.add(backFPAF);
   backFPAF.setBounds(50,400,95,30);
   paintAddFrameStockKeeper.add(xFPA.exit);
   xFPA.exit.setBounds(250,400,95,30);
   
   paintAddFrameStockKeeper.setSize(500,500);  
    paintAddFrameStockKeeper.setLayout(null);  
    paintAddFrameStockKeeper.setVisible(true);  
    
     backFPAF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintAddFrameStockKeeper.dispose();
           PaintActionSelectionFrame.stockKeeperPaintFrame();
    }  
    });
     
     addPaint.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       
    int paintProductNoForAddInt=Integer.parseInt(paintProductNoForAdd.getText());
    String paintModelNameForAddString=paintModelNameForAdd.getText();
    String paintColourForAddString=paintColourForAdd.getText();
    float paintUnitPriceForAddFloat=Float.parseFloat(paintUnitPriceForAdd.getText());
    int paintStockQuantityForAddInt=Integer.parseInt(paintStockQuantityForAdd.getText());

    String sQLForAddPaintSK="insert into paintdetails (paint_product_no,paint_model_name,paint_colour,paint_unit_price,paint_stock_quantity)"
            + "values('"+paintProductNoForAddInt+"','"+paintModelNameForAddString+"','"+paintColourForAddString+"','"+paintUnitPriceForAddFloat+"','"+paintStockQuantityForAddInt+"')";
   
    new DBManager().dBManipulator(sQLForAddPaintSK);
            
    paintAddFrameStockKeeper.dispose();
    new PaintActionSelectionFrame();
    PaintActionSelectionFrame.stockKeeperPaintFrame();
    JOptionPane.showMessageDialog(PaintActionSelectionFrame.paintActionSelectionFrameStockKeeper,"Data has been successfully added");  
   
    
            }
    });
    }
}
