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
public class PaintUpdateFrame {
     JFrame paintUpdateFrameManager;
     JFrame paintUpdateFrameStockKeeper;
    
     JTextField paintProductNoForUpdate=new JTextField("Product no.");
     JTextField paintModelNameForUpdate=new JTextField("Model name");
     JTextField paintColourForUpdate=new JTextField("Color");
     JTextField paintUnitPriceForUpdate=new JTextField("Unit price");
     JTextField paintStockQuantityForUpdate=new JTextField("Stock quantity");
    
    static Exit xFPU=new Exit();

     JButton backFPUF=new JButton("Back");
     JButton updatePaint=new JButton("Update");
   
    PaintUpdateFrame(boolean isUserManager,int paintToBeUpdated){
     updatePaint.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      int paintIDUpdatePaintInt=Integer.parseInt(paintProductNoForUpdate.getText());
     String paintNameForUpdatePaintString=paintModelNameForUpdate.getText();
      String paintColourForUpdatePaintString=paintColourForUpdate.getText();
      float paintUnitPriceForUpdatePaintInt=Float.parseFloat(paintUnitPriceForUpdate.getText());
      int paintStockQuantityForUpdatePaintInt=Integer.parseInt(paintStockQuantityForUpdate.getText());
    
      String sQLToUpdatePaint="update paintdetails set paint_product_no='"+paintIDUpdatePaintInt+"' ,paint_model_name='"+paintNameForUpdatePaintString+"' ,paint_colour='"+paintColourForUpdatePaintString+"' ,paint_unit_price='"+paintUnitPriceForUpdatePaintInt+"' ,paint_stock_quantity='"+paintStockQuantityForUpdatePaintInt+"'  where paint_product_no="+paintToBeUpdated;
      new DBManager().dBManipulator(sQLToUpdatePaint);
    }  
    });
     
     if(isUserManager==true){
         paintUpdateFrameManager=new JFrame("Update paint");
         
         paintUpdateFrameManager.add(paintProductNoForUpdate);
    paintProductNoForUpdate.setBounds(130,100,100, 40);
    paintUpdateFrameManager.add(paintModelNameForUpdate);
    paintModelNameForUpdate.setBounds(130,150,100, 40);
    paintUpdateFrameManager.add(paintColourForUpdate);
    paintColourForUpdate.setBounds(130,200,100, 40);
    paintUpdateFrameManager.add(paintUnitPriceForUpdate);
    paintUnitPriceForUpdate.setBounds(130,250,100, 40);
    paintUpdateFrameManager.add(paintStockQuantityForUpdate);
    paintStockQuantityForUpdate.setBounds(130,300,100, 40);   
     paintUpdateFrameManager.add(updatePaint);
    updatePaint.setBounds(50,350,100, 40);
   paintUpdateFrameManager.add(backFPUF);
   backFPUF.setBounds(50,400,95,30);
   paintUpdateFrameManager.add(xFPU.exit);
   xFPU.exit.setBounds(250,400,95,30);
   
   paintUpdateFrameManager.setSize(500,500);  
    paintUpdateFrameManager.setLayout(null);  
    paintUpdateFrameManager.setVisible(true);  
    
    backFPUF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintUpdateFrameManager.dispose();
          new PaintUpdateIDCollectionFrame().managerPaintupdateIDCollectionFrame();
    }  
    });
     }
     else{
         paintUpdateFrameStockKeeper=new JFrame("Update paint");
    
    paintUpdateFrameStockKeeper.add(paintProductNoForUpdate);
    paintProductNoForUpdate.setBounds(130,100,100, 40);
    paintUpdateFrameStockKeeper.add(paintModelNameForUpdate);
    paintModelNameForUpdate.setBounds(130,150,100, 40);
    paintUpdateFrameStockKeeper.add(paintColourForUpdate);
    paintColourForUpdate.setBounds(130,200,100, 40);
    paintUpdateFrameStockKeeper.add(paintUnitPriceForUpdate);
    paintUnitPriceForUpdate.setBounds(130,250,100, 40);
    paintUpdateFrameStockKeeper.add(paintStockQuantityForUpdate);
    paintStockQuantityForUpdate.setBounds(130,300,100, 40);   
    paintUpdateFrameStockKeeper.add(updatePaint);
    updatePaint.setBounds(50,350,100, 40);
   paintUpdateFrameStockKeeper.add(backFPUF);
   backFPUF.setBounds(50,400,95,30);
   paintUpdateFrameStockKeeper.add(xFPU.exit);
   xFPU.exit.setBounds(250,400,95,30);
   
   paintUpdateFrameStockKeeper.setSize(500,500);  
    paintUpdateFrameStockKeeper.setLayout(null);  
    paintUpdateFrameStockKeeper.setVisible(true);  
    
    backFPUF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintUpdateFrameManager.dispose();
          new PaintUpdateIDCollectionFrame().stockKeeperPaintupdateIDCollectionFrame();
    }  
    });
    
     try{
     Connection con=new DBManager().getConnection();
    String sqlToViewUserToBeUpdated = "select * from paintdetails where paint_product_no = "+paintToBeUpdated;
    PreparedStatement ps = con.prepareStatement(sqlToViewUserToBeUpdated);
ResultSet rs = ps.executeQuery();
   if(rs.next()){
   paintProductNoForUpdate.setText(String.valueOf(rs.getInt("paint_product_no")));
    paintModelNameForUpdate.setText(rs.getString("paint_model_name"));
     paintColourForUpdate.setText(rs.getString("paint_colour"));
     paintUnitPriceForUpdate.setText(String.valueOf(rs.getFloat("paint_unit_price")));
     paintStockQuantityForUpdate.setText(String.valueOf(rs.getInt("paint_stock_quantity")));
     
   }
   //else{JOptionPane.showMessageDialog(userUpdateFrameManager,"Wrong ID"); }
    }catch(Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);}
     }
    }
 
}
