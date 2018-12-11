package JavaDb;

import java.sql.*;

public class JavaMysql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";
        String userName = "luckyziad12";
        String password = "Allah1212";
        String query = "select name from students ";
        String JdbcDriver= "com.mysql.cj.jdbc.Driver";
        // Load and Register Driver
        Class.forName(JdbcDriver);
        // Establish Connection
        Connection connection = DriverManager.getConnection(url, userName, password);
        //Create Statement
        Statement statement = connection.createStatement();
        // Execute Query
        ResultSet resultSet = statement.executeQuery(query);
        // Process results
        resultSet.next();
        String name = resultSet.getString("name");
        System.out.println(name);
        //Close
        statement.close();
        connection.close();

    }

}

