import java.sql.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class JDBCPRACTICE {



    public static void toConnect() throws ClassNotFoundException, SQLException  {


        String [] names = new String[]{"Maya","jana","ruslan","sql","Janu","Zahid","Albom"};

        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establish Connection
        Connection connection = DriverManager.getConnection(url, "root", "rootuser");
        //Create Statement
        Statement statement = connection.createStatement();


        for (int i = 0; i <names.length ; i++) {


            String sql = "Insert into stones (id,name) values (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,i+1);
            preparedStatement.setString(2,names[i]);
            preparedStatement.executeUpdate();

            preparedStatement.close();

        }

        statement.close();

    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        toConnect();
    }

}
