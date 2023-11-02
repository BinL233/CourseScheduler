
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaileying
 */
public class SemesterQueries {
    public static ArrayList<String> getSemesterList(){
        Connection connect = DatabaseConnection.getConnect();
        ArrayList<String> semester = new ArrayList<String>();
        try {
            PreparedStatement getSemesterList = connect.prepareStatement("SELECT SEMESTER FROM APP.SEMESTER ORDER BY SEMESTER");
            ResultSet resultSet = getSemesterList.executeQuery();
            
            while(resultSet.next()) {
                semester.add(resultSet.getString(1));
            }
        }
        
        catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return semester;
    }
}
