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
}else if(recordCount <1)
{
return recordCount;
}
    
    }
    catch(Exception ex){ JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);}
        return lastId;
    }
 
public static void addDataToDB(String sQLTOAdd){
    con = DBManager.getConnection();
    try{
stmt = con.createStatement();
stmt.executeUpdate(sQLTOAdd);
    
    }
    catch(SQLException ex){JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);}

    }

public static void deleteDataFromDB(int ToDelete){

    
}

public static String[] showDataFromDB(String sQLToviewAll){ con = DBManager.getConnection();
     String[] arr= {"Error"};
try{
stmt = con.createStatement();
ResultSet rs =stmt.executeQuery(sQLToviewAll);
int i = 0;

     ResultSetMetaData rsmd = rs.getMetaData();
     int numberOfColumns = rsmd.getColumnCount();

       
    while(rs.next()){
   for( i = 1;i<=numberOfColumns;i++){
         for(int a = 0;a<numberOfColumns;a++){
       arr[a]=rs.getString(i); }
   }
   return arr;
   
    }
}
    catch(SQLException ex){JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);}
return arr;
    }

public static void showDataFromDB(int iD){}
}
