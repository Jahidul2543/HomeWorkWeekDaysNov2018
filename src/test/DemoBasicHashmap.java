package test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

public class DemoBasicHashmap extends ConnectDB {

    static HashMap<String,Boolean> hmap = new HashMap<>();

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

        hmap.put("Arnob", false);
        hmap.put("Sheikh", true);
        hmap.put("Ope", false);
        hmap.put("Ghani", true);

        System.out.println(hmap.get("Arnob"));
        System.out.println(hmap.get("Ope"));


ConnectDB con = new ConnectDB();
con.connectToMySql();

con.createTableFromStringToMySql("aaa", "aaaa");

    }
}
