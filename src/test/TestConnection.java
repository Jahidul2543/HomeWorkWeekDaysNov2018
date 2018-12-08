package test;

import java.sql.*;

public class TestConnection {

    public static void main(String[] args) throws Exception,SQLException {

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true", "root","a0704");
///Statement s = con.
//ResultSet rs =s.executeQuery("select * from MySecond");

    // while (rs.next()) {
    //     System.out.println(rs.getString(0));
   //  }
///String str = "ewlidmewoidfme3fdoiernf";
       // System.out.println(str.toUpperCase());
        //System.out.println(str.charAt(2));
    }
}
