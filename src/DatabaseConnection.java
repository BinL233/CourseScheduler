
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaileying
 */
public class DatabaseConnection {
    
    private static Connection connect;    

    public static Connection getConnect() {
        if (connect == null) {

        try {
        String url = "jdbc:derby://localhost:1527/CourseSchedulerDBKaileYingkmy5261;";
        String userName = "java";
        String password = "java";
        
        connect = DriverManager.getConnection(url, userName, password);
           JOptionPane.showMessageDialog(null,"Connection Successfuly");
                } 
        catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Connection Failed " + e);
                }    
        }
        return connect;
        
    }
}
