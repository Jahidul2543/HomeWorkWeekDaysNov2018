package HomeWorkWeekDaysNov2018.revision;

import java.sql.*;
import static java.lang.Class.forName;

public class ConnectMySQL {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/emp?useSSL=false";
        String userName = "root";
        String password = "12345";
        String query = "SELECT * FROM Employees";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url,userName,password);

        Statement statement =  connection.createStatement();

        ResultSet resultSet = statement.executeQuery(query);

        while(resultSet.next()){
            String name = resultSet.getString("last");
            System.out.println(name);
        }

        
               statement.close();

        connection.close();

    }


}