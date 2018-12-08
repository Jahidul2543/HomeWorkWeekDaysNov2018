package HomeWorkWeekDaysNov2018.JDBC;
 import com.mysql.cj.xdevapi.SqlDataResult;
 import jdk.internal.org.objectweb.asm.commons.StaticInitMerger;

 import java.sql.*;



public class JDCB1 {
    /**
     * Creating database in mySQL from java application
     *
     * import package
     * registering Driver
     * making connection
     * Creating Statment object
     * Executing SQL query
     * // didnt use resultSet cause we are not retriving any data
     * // just creating table in mysql nothing bring in java application
     * // thats why didnt use result set
     * Closing resource that is statment and connection
     * using exceptional handling
     * finally is used to make sure close of connection we dont
     * rely on JVM (Garbage Collector) as it helps us in securuty and effective
     * use of resources
     *
     *  */
// JDBC driver name and database URL
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL ="jdbc:mysql://localhost/";

// Database Credentials

    static final String USER ="root";
    static final String PASSWORD = "12345";

    public static void main(String[] args) {

        Connection connection = null;
        Statement statment = null;
         try{
             //STEP 2: Register the JDBC

             Class.forName(JDBC_DRIVER);

             // STEP 3: Open a connection
             System.out.println("Opening a Connection");
             connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);

             // STEP 4: Excute a Query

             System.out.println("Creating a Database");

             statment = connection.createStatement();

             String sql ="CREATE DATABASE STUDENTS"; // SQL command for mySQL

             statment.executeUpdate(sql);

             System.out.println("DataBase Create Successfully...>>>><<<<<");

         }
         catch(SQLException se){
             // Handle errors for JDBC
             se.printStackTrace();

        }catch(Exception e){
             e.printStackTrace();

         }
         finally{
             // finally block used to close resources

             try {
                 if(statment != null )
                 statment.close();
             }catch(SQLException se2){
                 // nothing we can do
             }
             try{
                 if(connection != null );
                 connection.close();
             }catch(SQLException se3){
                 se3.printStackTrace();

             }
         }


    }


}
