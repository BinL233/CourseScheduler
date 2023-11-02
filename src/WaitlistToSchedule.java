
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaileying
 */
public class WaitlistToSchedule {
    public void WtoS(){
        Connection connect = DatabaseConnection.getConnect();
        try {
            PreparedStatement addSemester = connect.prepareStatement("UPDATE APP.SCHEDULE SET ");
            addSemester.executeUpdate();

                    }
            
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
                }        
    }
}
