package HomeWorkWeekDaysNov2018.JDBC;
import com.sun.javafx.scene.control.behavior.PasswordFieldBehavior;
import general.UserIn;

import java.sql.*;
public class JDBC2 {
    /**
     * Simple program to make connection only
     * Not passing any Statement or resultSet
     * Simpley Opening and closing connection
     * touching only Student database
     */

    //JDBC driverName and URL
    static final String DRIVER ="com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/Students?useSSL=false";

    //Databe Credentials
    static final String USER = "root";
    static final String PASS = "12345";

    public static void main(String[] args) {

        Connection conn = null;
        try{
            // Registering JDBC driver
            Class.forName(DRIVER);
            // Open a connection
            System.out.println("Opening a Connection");
            conn = DriverManager.getConnection(URL, USER, PASS);
        }
        catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
            if(conn != null);
            conn.close();
                System.out.println("Closing Connection");}
            catch(SQLException se){
                se.printStackTrace();
            }}}}
