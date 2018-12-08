package HomeWorkWeekDaysNov2018.JDBC;

import java.sql.*;

public class JDBC5 {
/**
 * UpDATING REGISTRATION TABLE from JAVA PROGEAM
 * Secretly :)
 */
    public static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static String DB_URL = "jdbc:mysql://localhost:3306/Students?useSSL=false";
    // database Credentials
    static final String USER = "root";
    static final String PASS = "12345";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try{
            // Registering Driver
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            stmt = conn.createStatement();
            String sql = "INSERT INTO Registration Values(" +
                    "1,5,'John', 'khan')," +
                    "(2,8,'Sam', 'Ali')," +
                    "(3,10,'Tina', 'Sani')," +
                    "(4,12,'AR', 'SAEED' )," +
                    "(5,14, 'Aisha', 'MAr')";

            stmt.executeUpdate(sql);

            System.out.println("Successfully Updated");

        }catch(SQLException se){se.printStackTrace();}
        catch(Exception e){e.printStackTrace();}
        finally{
            try{

            if (stmt!=null);
                stmt.close();
                System.out.println("Statment Close");

        }catch(SQLException se){
                se.printStackTrace();
            }
                try{
                    if(conn!= null);
                    conn.close();
                    System.out.println("Connection Closed");
                }catch(SQLException se){se.printStackTrace();}


        }


    }

}
