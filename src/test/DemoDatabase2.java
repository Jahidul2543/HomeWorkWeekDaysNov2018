package test;
import java.sql.*;
import java.util.List;

import static java.lang.Class.forName;

public class DemoDatabase2 {




    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //useSSL=false&allowPublicKeyRetrieval=true

        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";//user your own
        String userName = "root";
        String password = "a0704";
        String query = "select name from students ";
        //Load and Register Drivers
        forName("com.mysql.cj.jdbc.Driver");//use your own
        //Establish Connection
        Connection connection = DriverManager.getConnection(url, userName, password);
        //Create Statement
        Statement statement = connection.createStatement();
        //Execute Query
        ResultSet resultSet = statement.executeQuery(query);
        //Process results
        resultSet.next();
        String name = resultSet.getString("name");
        System.out.println(name);
        //Close
        statement.close();
        connection.close();




    }
    public static void connectDb() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";//user your own
        String userName = "root";
        String password = "a0704";
        String query = "select name from students ";
        //Load and Register Drivers
        forName("com.mysql.cj.jdbc.Driver");//use your own
        //Establish Connection
        Connection connection = DriverManager.getConnection(url, userName, password);
    }

public static void statementDb() throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";
        String userName ="root";
        String password ="a0704";
        String query ="select grade from students";
    Class<?> aClass = forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url,userName,password);
}


}





