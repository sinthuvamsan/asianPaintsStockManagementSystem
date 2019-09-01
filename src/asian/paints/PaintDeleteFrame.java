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
public class PaintDeleteFrame {
     JFrame paintDeleteFrameManager=new JFrame();
     JFrame paintDeleteFrameStockKeeper=new JFrame();
    
    JTextArea paintDetailsForDeleteUser=new JTextArea();
     JScrollPane scrollPD = new JScrollPane(paintDetailsForDeleteUser);
    
     JTextField paintProductNoForDelete=new JTextField("Paint product no.");
    
    static Exit xFPD=new Exit();
    
     JButton backFPDF=new JButton("Back");  
     JButton confirmDeletePaint=new JButton("Delete");
    
    String sQLToDeletePaint="Error";
    
    PaintDeleteFrame(int paintToBeDeleted,boolean IsUserManagerPM){
        int pPN=paintToBeDeleted;
    String pMN="";
    String pC="";
    float pUP=0;
    int pSQ=0;
    
    try
{ 
Connection con = DBManager.getConnection();

String sql = "select * from employeedetails where emp_ID = "+paintToBeDeleted;
 String sQLToDeletePaint="DELETE FROM employeeDetails WHERE emp_id="+paintToBeDeleted;
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
//Statement stmt=con.createStatement();  ResultSet rs=stmt.executeQuery("select * from employeedetails where emp_name = "+idOrNameForUserSearch);    
int i =0;
if(rs.next())
{
pPN = rs.getInt("paint_product_no");
pMN = rs.getString("paint_model_name");
pC = rs.getString("paint_colour");
pUP=rs.getFloat("paint_unit_price");
pSQ = rs.getInt("paint_quantity");
    
 String detailsOfUserToBeDeleted="Paint product No.: "+pPN+"\n"+"Paint model name: "+pMN+"\n"+"Paint colour: "+pC+"\n"+"Paint unit price: "+pUP+"\n"+"Paint quantity: "+pSQ;
 
 paintDetailsForDeleteUser.setText(detailsOfUserToBeDeleted);
i++; 
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",
JOptionPane.ERROR_MESSAGE);
}

else
{
    if(IsUserManagerPM==true){
 JOptionPane.showMessageDialog(paintDeleteFrameManager,i+" Records found to be deleted"); 
    }else{
    JOptionPane.showMessageDialog(paintDeleteFrameStockKeeper,i+" Records found to be deleted"); 
    }
}

}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
}
   if(IsUserManagerPM==true){
   paintDeleteFrameManager.add(scrollPD);       
    scrollPD.setBounds(20, 20, 300, 300);
    paintDeleteFrameManager.add(confirmDeletePaint);
    confirmDeletePaint.setBounds(250,350,100, 40);
    paintDeleteFrameManager.add(backFPDF);
    backFPDF.setBounds(50,400,95,30);
    paintDeleteFrameManager.add(xFPD.exit);
    xFPD.exit.setBounds(250,400,95,30);
    
    paintDeleteFrameManager.setSize(500,500);  
    paintDeleteFrameManager.setLayout(null);  
    paintDeleteFrameManager.setVisible(true); 
   
     backFPDF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintDeleteFrameManager.dispose();
          new PaintDeleteIDCollectionFrame().managerPaintDeleteFrame();
    }  
    });
    
    confirmDeletePaint.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        new DBManager().dBManipulator(sQLToDeletePaint);
        paintDeleteFrameManager.dispose();
           new UserActionSelectionFrame();
           JOptionPane.showMessageDialog(new UserActionSelectionFrame().userActionSelectionFrame,"Paint deleted successfully"); 
    }  
    });
   }else{
    paintDeleteFrameStockKeeper.add(scrollPD);       
    scrollPD.setBounds(20, 20, 300, 300);
    paintDeleteFrameStockKeeper.add(confirmDeletePaint);
    confirmDeletePaint.setBounds(250,350,100, 40);
    paintDeleteFrameStockKeeper.add(backFPDF);
    backFPDF.setBounds(50,400,95,30);
    paintDeleteFrameStockKeeper.add(xFPD.exit);
    xFPD.exit.setBounds(250,400,95,30);
    
    paintDeleteFrameStockKeeper.setSize(500,500);  
    paintDeleteFrameStockKeeper.setLayout(null);  
    paintDeleteFrameStockKeeper.setVisible(true); 
    
     backFPDF.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        paintDeleteFrameStockKeeper.dispose();
          new PaintDeleteIDCollectionFrame().stockKeeperPaintDeleteFrame();
    }  
    });
    
    confirmDeletePaint.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        new DBManager().dBManipulator(sQLToDeletePaint);
        paintDeleteFrameStockKeeper.dispose();
           new UserActionSelectionFrame();
           JOptionPane.showMessageDialog(new UserActionSelectionFrame().userActionSelectionFrame,"Paint deleted successfully"); 
    }  
    });
   }
    }
    
}
