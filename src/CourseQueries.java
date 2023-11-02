
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
public class CourseQueries {
    
        public static ArrayList<String> getCourseSemesterList(){
        Connection connect = DatabaseConnection.getConnect();
        ArrayList<String> courseS = new ArrayList<String>();
        try {
            PreparedStatement getCourseList = connect.prepareStatement("SELECT SEMESTER FROM APP.COURSE ORDER BY COURSECODE");
            ResultSet resultSet = getCourseList.executeQuery();
            
            while(resultSet.next()) {
                courseS.add(resultSet.getString(1));
            }
        }
        
        catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return courseS;
    }
    
        public static ArrayList<String> getCourseCodeList(){
        Connection connect = DatabaseConnection.getConnect();
        ArrayList<String> courseC = new ArrayList<String>();
        try {
            PreparedStatement getCourseList = connect.prepareStatement("SELECT COURSECODE FROM APP.COURSE ORDER BY COURSECODE");
            ResultSet resultSet = getCourseList.executeQuery();
            
            while(resultSet.next()) {
                courseC.add(resultSet.getString(1));
            }
        }
        
        catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return courseC;
    }
        
        
        public static ArrayList<String> getCourseDespriptionList(){
        Connection connect = DatabaseConnection.getConnect();
        ArrayList<String> courseD = new ArrayList<String>();
        try {
            PreparedStatement getCourseList = connect.prepareStatement("SELECT DESCRIPTION FROM APP.COURSE ORDER BY COURSECODE");
            ResultSet resultSet = getCourseList.executeQuery();
            
            while(resultSet.next()) {
                courseD.add(resultSet.getString(1));
            }
        }
        
        catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return courseD;
    }
        
        public static ArrayList<Integer> getCourseSeatsList(){
        Connection connect = DatabaseConnection.getConnect();
        ArrayList<Integer> courseST = new ArrayList<Integer>();
        try {
            PreparedStatement getCourseList = connect.prepareStatement("SELECT SEATS FROM APP.COURSE ORDER BY COURSECODE");
            ResultSet resultSet = getCourseList.executeQuery();
            
            while(resultSet.next()) {
                courseST.add(resultSet.getInt(1));
            }
        }
        
        catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return courseST;
    }
    
}
