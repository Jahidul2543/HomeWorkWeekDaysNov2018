import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class JDBC {

static private String USERNAME = "root";
static private String PASSWORD = "rootuser";
static private String URL = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

            Statement statement = connection.createStatement();

            String sql = "Insert into students (name,grade,salary) values ('Zabit','A','150000')";

            int i = statement.executeUpdate(sql);

            System.out.println(i+" Affected rows");

            statement.close();



        } catch (SQLException e) {
            System.out.println("connection issue password,url,username");
        } catch (ClassNotFoundException e) {
            System.out.println("Jar file wasn't detected");
        }


    }
}
