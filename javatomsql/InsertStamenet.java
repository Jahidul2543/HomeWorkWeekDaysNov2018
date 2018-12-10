package javatomsql;

import java.sql.*;

public class InsertStamenet{


    public static void toConnect() throws ClassNotFoundException, SQLException  {

        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establish Connection
        Connection connection = DriverManager.getConnection(url, "root", "rootuser");
        //Create Statement
        Statement statement = connection.createStatement();
        //         Create query
        String sql = "Insert into students (name,grade,salary) values ('Vova','A-','224242')";
        //   Execute query
        statement.executeUpdate(sql);
        // close Statment
        statement.close();

    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        toConnect();

    }

}
