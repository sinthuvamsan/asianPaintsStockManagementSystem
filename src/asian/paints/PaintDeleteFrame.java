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
     JFrame paintDeleteFrameManager=new JFrame("Asian paints stock delete");
    
    JTextArea paintDetailsForDeleteUser=new JTextArea();
     JScrollPane scrollPD = new JScrollPane(paintDetailsForDeleteUser);
    
     JTextField paintProductNoForDelete=new JTextField("Product no.");
    
    static Exit xFPD=new Exit();
    
     JButton backFPDF=new JButton("Back");  
     JButton confirmDeletePaint=new JButton("Delete");
    
    String sQLToDeletePaint="Error";
    
    PaintDeleteFrame(int paintToBeDeleted){
        int pPN=paintToBeDeleted;
    String pMN="";
    String pC="";
    float pUP=0;
    int pSQ=0;
    
    try
{ 
Connection con = DBManager.getConnection();

String sql = "select * from paintDetails where paint_product_no = "+paintToBeDeleted;
  sQLToDeletePaint="DELETE FROM paintDetails WHERE paint_product_no="+paintToBeDeleted;
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
pSQ = rs.getInt("paint_stock_quantity");
    
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
          new PaintDeleteIDCollectionFrame();
    }  
    });
    
    confirmDeletePaint.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        new DBManager().dBManipulator(sQLToDeletePaint);
        paintDeleteFrameManager.dispose();
           new PaintActionSelectionFrame().managersPaintFrame();
           JOptionPane.showMessageDialog(new UserActionSelectionFrame().userActionSelectionFrame,"Paint deleted successfully"); 
    }  
    });
 JOptionPane.showMessageDialog(paintDeleteFrameManager,i+" Records found to be deleted"); 
   
}

}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
}
  
   
   
   }
}
    

