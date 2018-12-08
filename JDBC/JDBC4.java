package HomeWorkWeekDaysNov2018.JDBC;
import java.sql.*;


public class JDBC4 {


    public static String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static String DB_URL = "jdbc:mysql://localhost:3306/Students?useSSL=false";

    // database Credentials

    public static String USER = "root";
    public static String PASS = "12345";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stment = null;
        try{
        //Registering Class driver
            Class.forName(DRIVER);

            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            stment = conn.createStatement();
            String  sql = "CREATE TABLE REGISTRATION(" +
                    "id int not null," +
                    "age int not null," +
                    "last varchar(255) null," +
                    "first varchar(255) null," +
                    "PRIMARY KEY (id))";

            stment.executeUpdate(sql);

        }
        catch(SQLException se)
        {   se.printStackTrace(); }
        catch(Exception e)
        {e.printStackTrace();}
        finally{
            try{
                if(stment != null)
                    stment.close();
            }catch(SQLException se){se.printStackTrace();}

            try{
                if(conn!=null);
                    conn.close();
            }catch(SQLException se){se.printStackTrace();}

        }

    }

}
