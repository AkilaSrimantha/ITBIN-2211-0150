package Controller;

import Model.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Allcontroller {

    public boolean login(String username, String password) {
        try (Connection conn = DBConnector.connect();
             PreparedStatement pst = conn.prepareStatement("SELECT * FROM singin WHERE username = ? AND password = ?")) {

            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean signup(String username, String password) {
        try (Connection conn = DBConnector.connect();
             PreparedStatement pst = conn.prepareStatement("INSERT INTO singin (username, password) VALUES (?, ?)")) {

            pst.setString(1, username);
            pst.setString(2, password);
            pst.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    


public class UserController {
    private Connection conn;

    public UserController() {
        conn = DBConnector.connect();
    }

    public boolean registerUser(String name, int age, String address, int pn, String gender, String lan, String religion) {
        String sql = "INSERT INTO register(name, age, address, phone, gender, lan, religion) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, name);
            pst.setInt(2, age);
            pst.setString(3, address);
            pst.setInt(4, pn);
            pst.setString(5, gender);
            pst.setString(6, lan);
            pst.setString(7, religion);
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

}
