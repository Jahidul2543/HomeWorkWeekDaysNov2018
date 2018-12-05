package datastructure;

import java.sql.*;

public class ConnectMySql {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";
        String userName = "root";
        String password = "Glass22es";
        String query = "select name from students";
        //Load and Register Drivers
        Class.forName("com.mysql.cj.jdbc.Driver");//use your own
        //Establish connection
        Connection connection = DriverManager.getConnection(url, userName, password);
        //Create statement
        Statement statement =  connection.createStatement();
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
}
