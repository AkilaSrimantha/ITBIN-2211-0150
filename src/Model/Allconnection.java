
package Model;



import Model.DBConnector;
import java.sql.ResultSet;
import java.sql.Statement;

public class Allconnection {
 Statement stmt;
 ResultSet rs;
public ResultSet searchLogin(String usName) {
 try {
 stmt = (Statement) DBConnector.connect();
 String name = usName;
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM login where username='" 
+ name + "'");
 } catch (Exception e) {
 e.printStackTrace();
 }
 return rs;
 }
}
