import java.sql.*;

public class RetrieveFromMySQL {

    static private String USERNAME = "root";
    static private String PASSWORD = "rootuser";
    static private String URL = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true";

    public static void main(String[] args) {

        try {
            //            Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connect
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            //Create Statemnt
            Statement statement = connection.createStatement();
            //Write query
            String sql = "Select * from students";
            //Create Result
            ResultSet resultSet = statement.executeQuery(sql);
            //            Loop trough
            while (resultSet.next()){
                System.out.println(resultSet.getString("name")+" "+resultSet.getString("grade") +" "
                + resultSet.getString("salary"));
            }

            statement.close();
            connection.close();



        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
