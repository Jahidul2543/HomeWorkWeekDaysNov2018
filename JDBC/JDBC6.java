package HomeWorkWeekDaysNov2018.JDBC;


import java.sql.*;

public class JDBC6 {
    /**
     * Target is to Extract data. two agents will enter mysql
     * statment and resultSet. statement will perform task on  database and handover to
     * resultSet which brings back to java application to perform further action
     * lets do it
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
            String sql = "SELECT id, age,last,first FROM Registration";
            System.out.println("Successfully Executing");

            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("Handed over to Resultset");
            System.out.println();
            System.out.println();
            System.out.println("Now Message is fom ResultSet");

            System.out.println("     "+"Id"+" "+ "age"+" "+ "first"+ "last");
            while(rs.next()){

                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String last = rs.getString("last");
                String first= rs.getString("first");

                System.out.println("Row: "+id+" "+ " "+age+" "+ first+" "+ last);

            }

            rs.close();

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
