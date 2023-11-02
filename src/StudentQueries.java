
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
public class StudentQueries {
    public static ArrayList<String> getStudentIDList(){
        Connection connect = DatabaseConnection.getConnect();
        ArrayList<String> studentID = new ArrayList<String>();
        try {
            PreparedStatement getStudentIDList = connect.prepareStatement("SELECT STUDENTID FROM APP.STUDENT ORDER BY STUDENTID");
            ResultSet resultSet = getStudentIDList.executeQuery();
            
            while(resultSet.next()) {
                studentID.add(resultSet.getString(1));
            }
        }
        
        catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return studentID;
    }
    
    
    public static ArrayList<String> getStudentFList(){
        Connection connect = DatabaseConnection.getConnect();
        ArrayList<String> studentF = new ArrayList<String>();
        try {
            PreparedStatement getStudentIDList = connect.prepareStatement("SELECT FIRSTNAME FROM APP.STUDENT ORDER BY STUDENTID");
            ResultSet resultSet = getStudentIDList.executeQuery();
            
            while(resultSet.next()) {
                studentF.add(resultSet.getString(1));
            }
        }
        
        catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return studentF;
    }
    
    public static ArrayList<String> getStudentLList(){
        Connection connect = DatabaseConnection.getConnect();
        ArrayList<String> studentL = new ArrayList<String>();
        try {
            PreparedStatement getStudentLList = connect.prepareStatement("SELECT LASTNAME FROM APP.STUDENT ORDER BY STUDENTID");
            ResultSet resultSet = getStudentLList.executeQuery();
            
            while(resultSet.next()) {
                studentL.add(resultSet.getString(1));
            }
        }
        
        catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return studentL;
    }
}
