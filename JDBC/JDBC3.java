package HomeWorkWeekDaysNov2018.JDBC;
import java.sql.*;
import java.lang.ClassNotFoundException;

public class JDBC3 {

    static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    static final String URL ="jdbc:mysql://localhost:3306/Students?useSSL=false";

    // database credentials

    static final String USER = "root";

    static final String PASS = "12345";

    public static void main(String[] args)  {
        // Registering Driver
        Connection conn = null;
        Statement statement = null;
        try{
        Class.forName(DRIVER);
        //Making Connection
        System.out.println("Making Connection");
        conn = DriverManager.getConnection(URL, USER, PASS);
        System.out.println("Connection Make Successfully");

        statement = conn.createStatement();

        String sql = "DROP DATABASE Students"; // agent entering with message

            System.out.println("Executing Mission");
            statement.executeUpdate(sql);

            System.out.println("Dropping Dropping .....Confirmed");

            System.out.println("Closing the connection");

        }catch(SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(statement != null);
                statement.close();
                System.out.println("Statment Close....confirmed");
            }
            catch(SQLException se){se.printStackTrace();}
            try{
                if(conn != null);
                conn.close();
                System.out.println("Connection abort!!! Mission Complete");
            }catch(SQLException se){
                se.printStackTrace();

            }

        }
        System.out.println("Good bye!!!!!");
    }}
