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
public class CustomerActionSelectionFrame{
     
     JButton addCustomer=new JButton("Add customer");  //creating and initilizing button
     JButton updateCustomer=new JButton("Update customer");  //creating and initilizing button
     JButton deleteCustomer=new JButton("Delete customer");  //creating and initilizing button
     JButton viewCustomer=new JButton("View customer");  //creating and initilizing button
     JButton backFC=new JButton("Back");  //creating and initilizing button
    
    static Exit xFC=new Exit();
   
    
    public void managersCustomerFrame(){
    JFrame customerActionSelectionFrameManager = new JFrame("Asian paints customer");//creating Username Password frame and initializing it
        
    customerActionSelectionFrameManager.add(updateCustomer);
    updateCustomer.setBounds(130,100,100, 40);
    customerActionSelectionFrameManager.add(deleteCustomer);
    deleteCustomer.setBounds(130,150,100, 40);
    customerActionSelectionFrameManager.add(viewCustomer);
    viewCustomer.setBounds(130,200,100, 40);
    customerActionSelectionFrameManager.add(backFC);
    backFC.setBounds(50,250,100, 40);
    customerActionSelectionFrameManager.add(xFC.exit);
    xFC.exit.setBounds(250,250,95,30);//setBounds(int x axsis, int y axsis, int width, int height)
    
    customerActionSelectionFrameManager.setSize(400,500);//400 width and 500 height  
    customerActionSelectionFrameManager.setLayout(null);//using no layout managers  
    customerActionSelectionFrameManager.setVisible(true);//making the frame visible
    
    updateCustomer.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerActionSelectionFrameManager.dispose();
           
         new CustomerUpdateIDCollectionFrame().UpdateIDCollectionFrameManager();
    }  
    });
    
        deleteCustomer.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerActionSelectionFrameManager.dispose();
           new CustomerDeleteIDCollectionFrame();
    }  
    });
        
                viewCustomer.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerActionSelectionFrameManager.dispose();
           
           CustomerViewSelectionFrame.managersCustomerViewSelectionFrame();
    }  
    });
                
                 backFC.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerActionSelectionFrameManager.dispose();
       new MainFirstFrame().managersMainFrame();
    }  
    });
    }
    
    //public void stockKeeperCustomerFrame(){}
    
    public void cashierCustomerFrame(){
    JFrame customerActionSelectionFrameCashier = new JFrame("Asian paints customer");//creating Username Password frame and initializing it
       
        customerActionSelectionFrameCashier.add(addCustomer);
    addCustomer.setBounds(130,100,100, 40);
    customerActionSelectionFrameCashier.add(updateCustomer);
    updateCustomer.setBounds(130,150,100, 40);
    customerActionSelectionFrameCashier.add(viewCustomer);
    viewCustomer.setBounds(130,200,100, 40);
    customerActionSelectionFrameCashier.add(backFC);
    backFC.setBounds(50,250,100, 40);
    customerActionSelectionFrameCashier.add(xFC.exit);
    xFC.exit.setBounds(250,250,95,30);//setBounds(int x axsis, int y axsis, int width, int height)
    
    customerActionSelectionFrameCashier.setSize(400,500);//400 width and 500 height  
    customerActionSelectionFrameCashier.setLayout(null);//using no layout managers  
    customerActionSelectionFrameCashier.setVisible(true);//making the frame visible
    
     addCustomer.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerActionSelectionFrameCashier.dispose();
           
          new CustomerAddFrame();
    }  
    });
     
      updateCustomer.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerActionSelectionFrameCashier.dispose();
           
          new CustomerUpdateIDCollectionFrame().UpdateIDCollectionFrameCashier();
    }  
    });
      
            viewCustomer.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerActionSelectionFrameCashier.dispose();
           
          CustomerViewSelectionFrame.cashiresCustomerViewSelectionFrame();
    }  
    });
            
             backFC.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        customerActionSelectionFrameCashier.dispose();
      
       new MainFirstFrame().cashierMainFrame();
    }  
    });
    }
}
