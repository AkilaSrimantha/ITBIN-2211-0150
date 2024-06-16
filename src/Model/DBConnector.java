/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Akila
 */
public class DBConnector {
    
    public static Connection connect(){
    
    Connection con=null;
    
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/minidb","root","");
  
    
    }
    
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    
    
    }
    
    return con;
    
    
    }
    
}
