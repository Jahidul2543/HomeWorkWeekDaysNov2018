import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Jdbc {
   static  ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";
        String JdbcDriver = "com.mysql.cj.jdbc.Driver";
        String username = "luckyziad12";
        String password = "Allah1212";

        //Register the driver
        Class.forName(JdbcDriver);

        //Create a connection

        Connection connection = DriverManager.getConnection(url, username, password);

        //create a statement

        Statement statement = connection.createStatement();



        for (int i = 0; i <10 ; i++) {
            PreparedStatement preparedStatement = connection.prepareStatement("Insert into cars (name) values ('?')");

            preparedStatement.executeUpdate();

        }

        //close the connection
        statement.close();
        connection.close();

    }

}


