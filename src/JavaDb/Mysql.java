package JavaDb;

import java.sql.*;

public class Mysql {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";
        String username = "luckyziad12";
        String password = "Allah1212";

            Class.forName ("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true","luckyziad12","Allah1212");
            System.out.println("connected");

        Statement stmt=connection.createStatement();
        ResultSet rst=stmt.executeQuery("select * from cars");
        rst.next();
        String name= rst.getString("name");




    }
}
