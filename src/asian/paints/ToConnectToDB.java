/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asian.paints;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ToConnectToDB {
    String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/asianPaints";
String userName = "root";
String password = "root";
  public void  connectToDB(){
        try{
    Class.forName(driverName); 
Connection con = DriverManager.getConnection(url, userName, password);
String sql = "select * from EmployeeDetails";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
}catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
}
}