import java.sql.*;

public class PrepareStatement {

    static private String USERNAME = "root";
    static private String PASSWORD = "rootuser";
    static private String URL = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";

    public static void main(String[] args) {

        try {
            //            Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connect
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            String sql = "Insert into students (name,grade,salary) values (?,?,?)";

            //Create PrepareStaetemnt
            PreparedStatement preparedStatement = connection.prepareStatement(sql);



            preparedStatement.setString(1,"Nirvana");
            preparedStatement.setString(2,"A");
            preparedStatement.setString(3,"2220000");

            int i = preparedStatement.executeUpdate();
            System.out.println(i + " Affected rows");

            preparedStatement.execute();
            connection.close();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
