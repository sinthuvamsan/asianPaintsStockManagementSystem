/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asian.paints;

import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;
import java.io.*; 
import java.sql.*;


/**
 *
 * @author User
 */
public class UserViewSelectionFrame {
    static JFrame userViewSelectionFrameManager=new JFrame();
    
    static JTextField dataForSearchUser=new JTextField("Search for");
    
    static Exit xFUVS=new Exit();
    
    static JLabel labelForSearchUser=new JLabel("Search by ID or name:"); 
    
    static String searchUserBy[]={"Emp ID","Name"};        
    
    
    static JButton backFUVSF=new JButton("Back");
    static JButton viewAllUsers=new JButton("View all");
    static JButton viewUserBy=new JButton("Search");
    
  static Connection con;
    
    UserViewSelectionFrame(){
    
     
    userViewSelectionFrameManager.add(viewAllUsers);
    viewAllUsers.setBounds(130,100,100, 40);
    userViewSelectionFrameManager.add(labelForSearchUser);
    labelForSearchUser.setBounds(50,150, 150,30);
    userViewSelectionFrameManager.add(dataForSearchUser);
    dataForSearchUser.setBounds(180,150,100, 40);
    userViewSelectionFrameManager.add(viewUserBy);
    viewUserBy.setBounds(130,200,100, 40);
    userViewSelectionFrameManager.add(backFUVSF);
    backFUVSF.setBounds(50,250,95,30);
    userViewSelectionFrameManager.add(xFUVS.exit);
    xFUVS.exit.setBounds(250,250,95,30);
    
   userViewSelectionFrameManager.setSize(500,500);  
    userViewSelectionFrameManager.setLayout(null);  
    userViewSelectionFrameManager.setVisible(true); 
    
    viewUserBy.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        String idOrName=dataForSearchUser.getText();
        UserViewFrame uSF=new UserViewFrame();
        uSF.showTableData(InputIntOrString.checkInput(idOrName),idOrName);
    }  
    });
     
        viewAllUsers.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       /* JFrame fToViewUser=new JFrame();
       String sql = "select * from EmployeeDetails";
       new DBManager().showDataFromDB(sql);
JTextArea tVU=new JTextArea();
tVU.setText("emp_ID"+" "+"emp_name"+" "+"emp_address"+" "+"emp_tp_no"+" "+"emp_possition"+" "+"emp_userName"+" "+"emp_password");
try{
//String arr=new DBManager().showDataFromDB(sql);
//while(new DBManager().showDataFromDB(sql)==true){}

}catch(Exception ex){System.out.println(ex);}



//for(int i = 1;i<=1;i++){tVU.append(arr[i]);}
JScrollPane scroll = new JScrollPane(tVU); 
fToViewUser.add(scroll); 
scroll.setBounds(10,30, 300,300); 
  fToViewUser.setSize(500,500); 
    fToViewUser.setLayout(null);  
    fToViewUser.setVisible(true); */

    UserViewFrame.showTableData();
         
    }  
    });
        
        
    }
}
