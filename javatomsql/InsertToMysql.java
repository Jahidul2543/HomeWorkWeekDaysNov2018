package javatomsql;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;


public class InsertToMysql {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";
        // Load and Register Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establish Connection
        Connection connection = DriverManager.getConnection(url,"root","rootuser");
        //Create Statement
        Statement statement = connection.createStatement();

        String sql = "Insert into students (name,grade,salary) values (?,?,?)";
                            //PrepareStament
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1,"Bobo");
        ps.setString(2,"C");
        ps.setString(3,"40000");

        ps.execute();





        connection.close();
    }
}
