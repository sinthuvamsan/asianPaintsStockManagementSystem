/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asian.paints;

import java.sql.*;
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;
/**
 *
 * @author Sinthuvamsan
 */
public class UserPass {
    static JFrame userPass = new JFrame("Login");//creating Username Password frame and initializing it
     
    UserPass(){
   
    
    JTextField userName; //Creating text field object
    JPasswordField passWord;  
    JLabel userNameLabal,passWordLabal;
    JButton logIn=new JButton("Login");  //creating and initilizing button
    logIn.setBounds(100,200,95,30);//setBounds(int x axsis, int y axsis, int width, int height) 
    //JButton cancel=new JButton("Cancel");  creating and initilizing button
    Exit x=new Exit();
    x.exit.setBounds(250,200,95,30);//setBounds(int x axsis, int y axsis, int width, int height)
      
    userName=new JTextField("Your username"); //initilizing object username textfield
    userName.setBounds(100,100, 200,30);//setBounds(int x, int y, int width, int height)
    passWord= new JPasswordField();//initilizing object password textfield
    passWord.setBounds(100,150, 200,30);//setBounds(int x axsis, int y axsis, int width, int height)
    passWordLabal=new JLabel("Password:");    
    passWordLabal.setBounds(20,150, 80,30); 
    userNameLabal =new JLabel("Username:");    
    userNameLabal.setBounds(20,100, 80,30); 
    
    userPass.add(userNameLabal);
    userPass.add(passWordLabal);
    userPass.add(userName);
    userPass.add(passWord);
    userPass.add(logIn);
    userPass.add(x.exit);
    
    userPass.setSize(400,500);//400 width and 500 height  
    userPass.setLayout(null);//using no layout managers  
    userPass.setVisible(true);//making the frame visible
    
    logIn.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent loginEvent){
       String userNameV = userName.getText();
       String passwordV =  new String(passWord.getPassword());
            try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/asianPaints","root","root");  
//here asianPaints is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rSFUP=stmt.executeQuery("select emp_possition,emp_userName,emp_password from employeedetails");  
 boolean exist = false;
while(rSFUP.next())  {
    
    String empPFUP=rSFUP.getString("emp_possition");
String empUNFUP=rSFUP.getString("emp_userName");
String empPassFUP=rSFUP.getString("emp_password"); 
if(empUNFUP.compareTo(userNameV)==0 && empPassFUP.compareTo(passwordV)==0){
    if(empPFUP.compareTo("manager")==0){
        con.close();
        exist = true;
        userPass.dispose();
    new MainFirstFrame();
   new MainFirstFrame().managersMainFrame();
    break;
    }
    else if(empPFUP.compareTo("stock keeper")==0){
        con.close();
        exist = true;
        userPass.dispose();
    new MainFirstFrame();
    new MainFirstFrame().stockKeeperMainFrame();
    break;
    }
    else if(empPFUP.compareTo("cashier")==0){
        con.close();
        exist = true;
        userPass.dispose();
    new MainFirstFrame();
   new MainFirstFrame().cashierMainFrame();
    break;
    }
    else{
        con.close();  
    JOptionPane.showMessageDialog(userPass,"Wrong user");
    break;
    }
}

}
      if(!exist){con.close();  
    JOptionPane.showMessageDialog(userPass,"Wrong user name or password");
    
    }  

}
 
catch(Exception e){
    System.out.println();
    JOptionPane.showMessageDialog(userPass,e);
}  
 
}  
    });
    
    }
}
