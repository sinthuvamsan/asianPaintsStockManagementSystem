/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asian.paints;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author User
 */
public class DBManager {
static String driverName = "com.mysql.jdbc.Driver";
static String url = "jdbc:mysql://localhost:3306/asianPaints";
static String userName = "root";
static String password = "root";
static Connection con;
static Statement stmt = null;
static int lastId ;


public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, userName, password);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }

  
 public static int lastID(String sQL, String columenName){
        
        try{
    Connection conForLastID = getConnection();
        Statement stForLastID = conForLastID.createStatement();
        
 // String query = ("SELECT * FROM javaGetDataDemo ORDER BY x_Id DESC LIMIT 1;");
ResultSet rs = stForLastID.executeQuery(sQL);
int recordCount=0;
if (rs.next())
{
  lastId = rs.getInt(columenName);
  conForLastID.close();
  recordCount++;
  return lastId;
}else
{
return recordCount;
}
    
    }
    catch(Exception ex){ JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);}
        return lastId;
    }
 
public static void dBManipulator(String sQLToManipulate){
    con = DBManager.getConnection();
    try{
stmt = con.createStatement();
stmt.executeUpdate(sQLToManipulate);
    
    }
    catch(SQLException ex){JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);}

    }


/* 
public static boolean showDataFromDB(String sQLToviewAll){ con = DBManager.getConnection();
     String[] arr= {"Error"};
try{
stmt = con.createStatement();
ResultSet rs =stmt.executeQuery(sQLToviewAll);


     ResultSetMetaData rsmd = rs.getMetaData();
     int numberOfColumns = rsmd.getColumnCount();

       
    if(rs.next()){
   for( int i = 1;i<=numberOfColumns;i++){
         
       arr[i-1]=rs.getString(i); 
   }
   return true;
   
    }
}
    catch(SQLException ex){JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);}
return false;
    }

public static void showDataFromDB(int iD){}
*/
}
