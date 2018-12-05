package javatomsql;
import java.sql.*;
import java.util.ArrayList;


public class Main {

    static ArrayList name = new ArrayList();

    public static void getConnection() throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";
//        choose the query that you wish to execute
        String query = "select * from students ";
        // Load and Register Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establish Connection
        Connection connection = DriverManager.getConnection(url,"root","rootuser");
        //Create Statement
        Statement statement = connection.createStatement();
        // Execute Query
        ResultSet resultSet = statement.executeQuery(query);
//           Loop trough all record
        while (resultSet.next()){

            name.add(resultSet.getString("id")+" "+resultSet.getString("name")+" "+resultSet.getString("grade")
                    +" "+resultSet.getString("salary"));
        }

        //Close
        statement.close();
        connection.close();

    }



    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        getConnection();
        System.out.println(name);
    }

}